package com.estockMarket.stockService.command.api.events;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.axonframework.eventhandling.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.estockMarket.stockService.data.Stock;
import com.estockMarket.stockService.data.StockRepository;



@Component
public class StockEventsHandler {
	private static final Logger logger = LoggerFactory.getLogger(StockEventsHandler.class);
	@Autowired
	private StockRepository stockRepository;

	@EventHandler
	public void create(StockCreatedEvent stockCreatedEvent) {
logger.info("Inside event handler");
		Stock stock = Stock.builder()

				.companyCode(stockCreatedEvent.getCompanyCode()).stockPrice(stockCreatedEvent.getStockPrice())
//				.startDateTime(LocalDateTime.parse(LocalDateTime.now().toString(), DateTimeFormatter.ISO_DATE_TIME))
//				.endDateTime(LocalDateTime.parse(
//						LocalDateTime.now().plusHours(stockCreatedEvent.getNumberOfHours()).toString(),
//						DateTimeFormatter.ISO_DATE_TIME))
				.date(LocalDate.parse(LocalDate.now().toString(), DateTimeFormatter.ISO_DATE))
				.time(LocalTime.parse(LocalTime.now().toString(), DateTimeFormatter.ISO_TIME))
				.build();
		

		stockRepository.save(stock);
		
		logger.info("Saved the stock with company code:" + stock.getCompanyCode());
	}

	@EventHandler
	public void delete(StockDeletedEvent stockDeletedEvent) {
		stockRepository.deleteByCompanyCode(stockDeletedEvent.getCompanyCode());
		logger.info("Deleted the stock with company code:" + stockDeletedEvent.getCompanyCode());
	}

}

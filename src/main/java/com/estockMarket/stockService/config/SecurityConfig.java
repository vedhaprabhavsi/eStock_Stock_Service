package com.estockMarket.stockService.config;
//package com.stockService.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
////import com.stockService.filter.ReqFilter;
//
//@Configuration
////@EnableWebSecurity
////@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
////	@Autowired
////	private ReqFilter filter;
//	
//	@Bean
//	public WebMvcConfigurer getCorsConfiguration() {
//		return new WebMvcConfigurer(
//				) {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				// TODO Auto-generated method stub
////				WebMvcConfigurer.super.addCorsMappings(registry);
//				registry.addMapping("/**")
//						.allowedOrigins("*")
//						.allowedMethods("*")
//						.allowedHeaders("*");
//			}
//		};
//		
//	}
//
////	@Override
////	public void configure(HttpSecurity http) throws Exception {
////
////		http.csrf().disable().authorizeRequests().antMatchers("/api/v1.0/market/stock/add").authenticated() // Block
////																													// this
////				.antMatchers("/**").permitAll() // Allow this for all
////				.antMatchers(HttpMethod.OPTIONS)
////				   .permitAll()
////				.anyRequest().authenticated().and().oauth2Login();
////
////		http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
////	}
//
//}

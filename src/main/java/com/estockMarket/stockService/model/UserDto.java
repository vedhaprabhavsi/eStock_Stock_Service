package com.estockMarket.stockService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class UserDto {
	private String sub;
	private String name;
	private String given_name;
	private String family_name;
	private String picture;
	private String email;
	private boolean email_verified;
	private String locale;
}

package com.xworkz.lamdbdaapp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class RegisterDTO {
	@NonNull
	private String name;
	@NonNull
	private long number;
	@NonNull
	private long adharCard;

}

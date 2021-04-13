package com.xworkz.lamdbdaapp.dto;

import com.xworkz.lamdbdaapp.enumm.FinanceType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class FinanceDTO {

	@NonNull
	private String bankName;
	@NonNull
	private int rateOfInterset;
	@NonNull
	private FinanceType financeType;
	@NonNull
	private String owner;

}

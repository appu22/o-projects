package com.xworkz.lamdbdaapp.Tester;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.lamdbdaapp.dto.FinanceDTO;
import com.xworkz.lamdbdaapp.enumm.FinanceType;

import lombok.NonNull;

public class FinanceTester {

	public static void main(String[] args) {

		FinanceDTO dto = new FinanceDTO("Kotak Bank", 10, FinanceType.BIKE, "santu");
		FinanceDTO dto1 = new FinanceDTO("dhani Bank", 12, FinanceType.EDUCATION, "Dahani");
		FinanceDTO dto2 = new FinanceDTO("Muthooth finanace", 9, FinanceType.PERSONAL, "Mr.Vijay");
		FinanceDTO dto3 = new FinanceDTO("Kotak Bank", 13, FinanceType.CAR, "Kiran");
		FinanceDTO dto4 = new FinanceDTO("India", 8, FinanceType.EDUCATION, "Mr.Ubed");
		FinanceDTO dto5 = new FinanceDTO("Syandicate Bank", 15, FinanceType.PERSONAL, "Guru");
		FinanceDTO dto6 = new FinanceDTO("HDFC Bank", 18, FinanceType.HOME, "Anand");

		List<FinanceDTO> list = new ArrayList<FinanceDTO>();

		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		list.add(dto6);

		System.out.println("Education Loan List : ");
		List<@NonNull String> collect = list.stream().filter((q) -> q.getFinanceType().equals(FinanceType.EDUCATION))
				.map(w -> w.getBankName()).collect(Collectors.toList());

		collect.forEach(d -> System.out.println(d));

	}

}

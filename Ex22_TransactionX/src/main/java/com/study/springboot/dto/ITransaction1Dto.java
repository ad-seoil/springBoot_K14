package com.study.springboot.dto;

import lombok.Data;

public interface ITransaction1Dto {

	@Data
	public class Transaction1Dto {
		private String consumerId;
		private int amount;
	}
}

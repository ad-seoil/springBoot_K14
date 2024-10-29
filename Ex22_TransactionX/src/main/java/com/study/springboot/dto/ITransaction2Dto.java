package com.study.springboot.dto;

import lombok.Data;

public interface ITransaction2Dto {

	@Data
	public class Transaction2Dto {
		private String consumerId;
		private int amount;
	}
}

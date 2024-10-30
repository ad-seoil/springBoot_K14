package com.study.springboot.dto;

import lombok.Data;

public interface ITransaction3Dto {

	@Data
	public class Transaction3Dto {
		private String consumerId;
		private int amount;
	}
}

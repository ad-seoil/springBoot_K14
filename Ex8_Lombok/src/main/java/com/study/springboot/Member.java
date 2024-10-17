package com.study.springboot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
//@ToString
//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	private String id;
	private String name;
}

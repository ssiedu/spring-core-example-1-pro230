package com.ssi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
	private int code;
	private String name;
	private int fees;
	private int duration;
}

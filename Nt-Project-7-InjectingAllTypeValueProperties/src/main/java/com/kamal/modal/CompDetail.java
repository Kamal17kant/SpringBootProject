package com.kamal.modal;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component("comp")
@Data
public class CompDetail {
	private String title;
	private String location;
	private String size;
}

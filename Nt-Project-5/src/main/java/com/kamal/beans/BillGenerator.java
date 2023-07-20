package com.kamal.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component("bill")
public class BillGenerator {
	@Value("#{info.dhosaPrice + info.idlyPrice +info.samverPrice}")
	private int total;
	@Value("Paradise")
	private String restoName;
	@Autowired
	private ItemInfo items;

	@Override
	public String toString() {
		return "BillGenerator [total=" + total + ", restoName=" + restoName + ", items=" + items + "]";
	}

}

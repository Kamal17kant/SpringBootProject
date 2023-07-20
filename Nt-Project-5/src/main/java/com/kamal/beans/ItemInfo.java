package com.kamal.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("info")
@PropertySource("com\\kaml\\commons\\commons.properties")
public class ItemInfo {
	@Value("${dhosa.price}")
	public int dhosaPrice;
	@Value("${idly.price}")
	public int idlyPrice;
	@Value("${samver.price}")
	public int samverPrice;

	@Override
	public String toString() {
		return "ItemInfo [dhosaPrice=" + dhosaPrice + ", idlyPrice=" + idlyPrice + ", samverPrice=" + samverPrice + "]";
	}

}

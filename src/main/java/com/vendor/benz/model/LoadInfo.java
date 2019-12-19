package com.vendor.benz.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoadInfo {
	
	private String loadNumber;
	private String carrier;
	private List<String> tags;
	private List<StopInfo> stops;

}

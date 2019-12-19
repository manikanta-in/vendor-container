package com.vendor.benz.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Pallet {

	private String billOfLading;
	private List<Part> part;
}

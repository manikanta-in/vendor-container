package com.vendor.benz.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StopInfo {
	
	private String stopType;
	private String stopReferenceId;
	private String externalAddressId;
	private String name;
	private String addressLine1;
	private String city;
	private String state;
	private String country;
	private String postalCode;
	private String earliestAppointmentTime;
	private String latestAppointmentTime;
	private String timezoneOffset;
	private String latitude;
	private String longitude;
	private Customer customer;
	private List<Pallet> pallets;
	
}

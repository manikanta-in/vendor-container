package com.vendor.benz.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoadRequest {
	
	private LoadInfo load;
	private ContainerInfo containerInfo;
	private TracingInfo trackingInfo;

}

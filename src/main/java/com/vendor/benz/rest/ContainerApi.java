package com.vendor.benz.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vendor.benz.client.VendorContainerClient;
import com.vendor.benz.model.LoadInfo;
import com.vendor.benz.model.LoadRequest;
import com.vendor.benz.model.LoadResponse;

@RestController
@RequestMapping("/api/container")
public class ContainerApi {
	
	@Autowired
	private VendorContainerClient vendorContainerClient;
	
	/**
	 * 
	 * @return
	 */
	@GetMapping
	public LoadResponse loadAll() {
		LoadRequest body=new LoadRequest();
		LoadInfo load =new LoadInfo();
		body.setLoad(load);
		return vendorContainerClient.loadContainer(body).getBody();
	}
	
}

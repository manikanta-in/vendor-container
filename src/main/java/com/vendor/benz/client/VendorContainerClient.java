package com.vendor.benz.client;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.vendor.benz.model.LoadRequest;
import com.vendor.benz.model.LoadResponse;

@Configuration
public class VendorContainerClient {


	@Value("${kites.trackingapi.base.url}")
	private String baseUrl;

	@Autowired
	RestTemplate restTemplate;

	/**
	 * 
	 * @param body
	 * @return
	 */
	public ResponseEntity<LoadResponse> loadContainer(LoadRequest body) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<LoadRequest> entity = new HttpEntity<>(body,headers);
		return restTemplate.exchange(baseUrl, HttpMethod.POST, entity, LoadResponse.class);
	}

}

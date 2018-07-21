package com.vit.springbootstarter.hello;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vit.springbootstarter.model.ServiceDetails;
 
@RestController
@RequestMapping("/api")
public class RestWebController {
 
	List<ServiceDetails> cust = new ArrayList<ServiceDetails>();
 
 
	@PostMapping(value = "/process")
	public ServiceDetails postCustomer(@RequestBody ServiceDetails serviceDetail) {
	
		return serviceDetail;
	}
}
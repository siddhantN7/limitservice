package siddhant.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import siddhant.microservices.limitsservice.configuration.Configuration;
import siddhant.microservices.limitsservice.entity.Limits;

@RestController
public class LimitsController {

	@Autowired
	private Configuration config;
	
	@GetMapping("api/limits")
	public Limits retriveLimits()
	{
		return new Limits(config.getMinimum(),config.getMaximum());
	}
}

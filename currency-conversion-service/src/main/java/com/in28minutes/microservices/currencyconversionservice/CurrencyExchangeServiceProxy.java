package com.in28minutes.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.in28minutes.microservices.currencyconversionservice.bean.CurrencyConversionBean;

//once configure ribbon for load balancing, no need to keep url in feign
//@FeignClient(name="currency-exchange-service", url="localhost:8000")
//@FeignClient(name="currency-exchange-service")
//use zuul proxy gateway to call
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy {
	//before zuul
	//@GetMapping("/currency-exchange/from/{from}/to/{to}")
	//after zuul
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}

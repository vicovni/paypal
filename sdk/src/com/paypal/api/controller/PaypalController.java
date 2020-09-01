package com.paypal.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.CaptureIntentExamples.ICaptureOrder;
import com.paypal.CaptureIntentExamples.ICreateOrder;
import com.paypal.http.serializer.Json;
import com.paypal.orders.Order;

import java.io.IOException;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@SpringBootApplication
@ComponentScan({"com.paypal.CaptureIntentExamples"})
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("api/paypal/order")
public class PaypalController {
	
	@Autowired
	ICreateOrder createOrder;
	@Autowired
	ICaptureOrder captureOrder;
	
	@PostMapping(value="create")
	public String createOrder() throws IOException {
		//Order order = new CreateOrder().createOrder(true).result();
		//return new JSONObject(new Json().serialize(order)).toString(4);
		return new JSONObject(new Json().serialize(createOrder.createOrder(true).result())).toString(4);
	}
	
	@PostMapping(path="/{orderId}/capture")
	public String captureOrder(@PathVariable("orderId")String orderId) throws IOException {
		//Order order = new CaptureOrder().captureOrder(orderId, true).result();
		//return new JSONObject(new Json().serialize(order)).toString(4);
		return new JSONObject(new Json().serialize(captureOrder.captureOrder(orderId, true).result())).toString(4);
	}
	

}

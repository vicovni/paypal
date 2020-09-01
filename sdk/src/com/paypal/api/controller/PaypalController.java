package com.paypal.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.CaptureIntentExamples.CaptureOrder;
import com.paypal.CaptureIntentExamples.CreateOrder;
import com.paypal.http.serializer.Json;
import com.paypal.orders.Order;

import java.io.IOException;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("api/paypal/order")
public class PaypalController {
	
	@PostMapping(value="create")
	public String createOrder() throws IOException {
		Order order = new CreateOrder().createOrder(true).result();
		return new JSONObject(new Json().serialize(order)).toString(4);
	}
	
	@PostMapping(path="/{orderId}/capture")
	public String captureOrder(@PathVariable("orderId")String orderId) throws IOException {
		Order order = new CaptureOrder().captureOrder(orderId, true).result();
		return new JSONObject(new Json().serialize(order)).toString(4);
	}
	

}

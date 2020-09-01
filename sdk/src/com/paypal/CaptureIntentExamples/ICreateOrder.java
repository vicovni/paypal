package com.paypal.CaptureIntentExamples;

import java.io.IOException;

import com.paypal.http.HttpResponse;
import com.paypal.orders.Order;

public interface ICreateOrder {

	/**
	 * Method to create order
	 *
	 * @param debug true = print response data
	 * @return HttpResponse<Order> response received from API
	 * @throws IOException Exceptions from API if any
	 */
	HttpResponse<Order> createOrder(boolean debug) throws IOException;

}
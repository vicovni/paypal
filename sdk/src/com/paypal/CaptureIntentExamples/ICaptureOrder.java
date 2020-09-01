package com.paypal.CaptureIntentExamples;

import java.io.IOException;

import com.paypal.http.HttpResponse;
import com.paypal.orders.Order;
import com.paypal.orders.OrderRequest;


public interface ICaptureOrder {

	/**
	 * Creating empty body for capture request. We can set the payment source if
	 * required.
	 *
	 * @return OrderRequest request with empty body
	 */
	OrderRequest buildRequestBody();

	/**
	 * Method to capture order after creation. Valid approved order Id should be
	 * passed an argument to this method.
	 *
	 * @param orderId Order ID from createOrder response
	 * @param debug   true = print response data
	 * @return HttpResponse<Order> response received from API
	 * @throws IOException Exceptions from API if any
	 */
	HttpResponse<Order> captureOrder(String orderId, boolean debug) throws IOException;

}
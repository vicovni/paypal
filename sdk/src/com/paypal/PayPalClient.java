package com.paypal;

import com.paypal.core.PayPalEnvironment;
import com.paypal.core.PayPalHttpClient;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Iterator;

public class PayPalClient {

  /**
   *Set up the PayPal Java SDK environment with PayPal access credentials.  
   *This sample uses SandboxEnvironment. In production, use LiveEnvironment.
   */
  private PayPalEnvironment environment = new PayPalEnvironment.Sandbox(
    "AaiT0qJiKEdJwTXbr_4N0DfuOTFD_Yq1ohrZSQXTDxKiVUGquMXjeyJpWmUGW0aC6vi_jkUWLNFEkucO",
    "EHPu2hOT3o-KLb_lILmSIVHJ3jaovfxr6MH1f-BLq9VM89WGXyghmFUSuoGFggwbJfWJJgNqWXgNL9fG");

  /**
   *PayPal HTTP client instance with environment that has access
   *credentials context. Use to invoke PayPal APIs.
   */
  PayPalHttpClient client = new PayPalHttpClient(environment);

  /**
   *Method to get client object
   *
   *@return PayPalHttpClient client
   */
  public PayPalHttpClient client() {
    return this.client;
  }
}
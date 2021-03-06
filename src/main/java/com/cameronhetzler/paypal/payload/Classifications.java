package com.cameronhetzler.paypal.payload;

import lombok.Getter;
import lombok.ToString;

/**
 * 
 * @author Cameron Hetzler
 *
 */
@Getter
@ToString
public enum Classifications {

	EXAMPLE("EXAMPLE"), ADD_BILLINGINFO("ADD_BILLINGINFO"), ADD_SUPPORTED_SERVICE("ADD_SUPPORTED_SERVICE"),
	ADD_SERVICE_ITEM("ADD_SERVICE_ITEM"), SEND_SERVICE_INVOICES("SEND_SERVICE_INVOICES"),
	CANCEL_SERVICE_INVOICES("CANCEL_SERVICE_INVOICES"), CANCEL_SINGLE_SERVICE_INVOICE("CANCEL_SINGLE_SERVICE_INVOICE"),
	SEND_SINGLE_SERVICE_INVOICE("SEND_SINGLE_SERVICE_INVOICE"),
	SEND_SERVICE_INVOICES_FROM_TEMPLATES("SEND_SERVICE_INVOICES_FROM_TEMPLATES"),
	SEND_SERVICE_SUBSCRIPTIONS_FROM_TEMPLATES("SEND_SERVICE_SUBSCRIPTIONS_FROM_TEMPLATES"),
	CREATE_SERVICE_PRODUCT_FROM_TEMPLATES("CREATE_SERVICE_PRODUCT_FROM_TEMPLATES"),
	CREATE_SERVICE_SUBSCRIPTION_PLAN_FROM_TEMPLATES("CREATE_SERVICE_SUBSCRIPTION_PLAN_FROM_TEMPLATES"),
	CREATE_SUPPORTED_SERVICE("CREATE_SUPPORTED_SERVICE");

	private String classification;

	private Classifications(String classification) {
		this.classification = classification;
	}
}

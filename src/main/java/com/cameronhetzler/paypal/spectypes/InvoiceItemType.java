package com.cameronhetzler.paypal.spectypes;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.cameronhetzler.paypal.exceptions.ServicesException;
import com.paypal.api.payments.InvoiceItem;

public class InvoiceItemType extends TypeBase<InvoiceItem> {

	private static final String CLASSNAME = InvoiceItemType.class.getName();
	private static final Logger LOGGER = Logger.getLogger(InvoiceItemType.class);
	
	public InvoiceItemType() {
		super(new InvoiceItem());
	}
	
	public InvoiceItem load(String jsonFile) throws ServicesException {
		String methodName = "load";
		if (jsonFile == null) {
			ServicesException se = new ServicesException("Param passed in was [null].");
			LOGGER.debug(se);
			throw se;
		}		
		
		try {
			return super.load(jsonFile, InvoiceItem.class);
		} catch (IOException e) {
			ServicesException se = new ServicesException("Error thrown while loading Invoice from jsonFile: " + jsonFile, null, e);
			LOGGER.debug("Throwing Error in " + CLASSNAME + "." + methodName, se);
			throw se;
		}
	}
}

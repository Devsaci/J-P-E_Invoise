package org.devsaci.service;

import org.devsaci.entity.Invoice;

public class InvoiceService {
    private static long lastNumber=0L;
    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber));
    }
}

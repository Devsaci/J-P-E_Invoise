package org.devsaci.controller;

import org.devsaci.entity.Invoice;

import org.devsaci.service.InvoiceServiceInterface;
import org.devsaci.service.InvoiceServiceMichel;



public class InvoiceControllerMichel implements InvoiceControllerInterface{
    private InvoiceServiceInterface invoiceService;

    public void createInvoice() {
        String customerNam = "Tesla";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerNam);
        invoiceService.createInvoice(invoice);
    }
}

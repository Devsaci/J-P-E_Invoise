package org.devsaci.controller;

import org.devsaci.entity.Invoice;
import org.devsaci.service.InvoiceService;
import org.devsaci.service.InvoiceServiceMichel;

import java.util.Scanner;

public class InvoiceControllerMichel {

    public void createInvoiceUsingWebForm() {
        String customerNam = "Tesla";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerNam);
        InvoiceServiceMichel invoiceServiceMichel = new InvoiceServiceMichel();
        invoiceServiceMichel.createInvoice(invoice);
    }
}

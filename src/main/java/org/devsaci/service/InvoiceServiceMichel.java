package org.devsaci.service;

import org.devsaci.entity.Invoice;
import org.devsaci.repository.InvoiceRepository;

public class InvoiceServiceMichel {
    private static long lastNumber=112L;

private InvoiceRepository invoiceRepository=new InvoiceRepository();


    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber+"_INV"));
        invoiceRepository.create(invoice);
    }
}

package org.devsaci.service;

import org.devsaci.entity.Invoice;
import org.devsaci.repository.InvoiceRepositoryInterface;

public class InvoiceServiceMichel implements InvoiceServiceInterface{
    private static long lastNumber=112L;

private InvoiceRepositoryInterface invoiceRepository;


    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber+"_INV"));
        invoiceRepository.create(invoice);
    }
}

package org.devsaci.service;

import org.devsaci.entity.Invoice;
import org.devsaci.repository.InvoiceRepository;

public class InvoiceService {
    private static long lastNumber=0L;

private InvoiceRepository invoiceRepository=new InvoiceRepository();


    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}

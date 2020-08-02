package org.devsaci.service;

import org.devsaci.entity.Invoice;
import org.devsaci.repository.InvoiceRepository;
import org.devsaci.repository.InvoiceRepositoryMichel;

public class InvoiceServiceMichel {
    private static long lastNumber=112L;

private InvoiceRepositoryMichel invoiceRepository= new InvoiceRepositoryMichel();


    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber+"_INV"));
        invoiceRepository.create(invoice);
    }
}

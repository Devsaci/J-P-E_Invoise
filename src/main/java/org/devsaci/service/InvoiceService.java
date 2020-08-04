package org.devsaci.service;

import org.devsaci.entity.Invoice;

import org.devsaci.repository.InvoiceRepositoryInterface;

public class InvoiceService implements InvoiceServiceInterface {
    private static long lastNumber=0L;

private InvoiceRepositoryInterface invoiceRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}

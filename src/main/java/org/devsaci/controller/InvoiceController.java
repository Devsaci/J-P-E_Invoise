package org.devsaci.controller;

import org.devsaci.entity.Invoice;
import org.devsaci.service.InvoiceService;

import java.util.Scanner;

public class InvoiceController {
    public void createInvoiceUsingConsole(){
        System.out.println("What is the customer name?"  );
        Scanner sc=new Scanner(System.in);
        String customerNam=sc.nextLine();
        Invoice invoice=new Invoice();
        invoice.setCustomerName(customerNam);
        InvoiceService invoiceService=new InvoiceService();
        invoiceService.createInvoice(invoice);
    }
}

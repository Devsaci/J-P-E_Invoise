package org.devsaci.controller;

import org.devsaci.entity.Invoice;
import org.devsaci.service.InvoiceServiceInterface;


import java.util.Scanner;


public class InvoiceController implements InvoiceControllerInterface{

    private InvoiceServiceInterface  invoiceService;


    public void createInvoice(){
        System.out.println("What is the customer name?"  );
        Scanner sc=new Scanner(System.in);
        String customerNam=sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerNam);

        invoiceService.createInvoice(invoice);
    }
}

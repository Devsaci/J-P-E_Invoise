package org.devsaci;

import org.devsaci.entity.Invoice;
import org.devsaci.service.InvoiceService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        System.out.println("What is the customer name?"  );
        Scanner sc=new Scanner(System.in);
        String customerNam=sc.nextLine();
        Invoice invoice=new Invoice();
        invoice.setCustomerName(customerNam);
        InvoiceService invoiceService=new InvoiceService();
        invoiceService.createInvoice(invoice);

    }
}

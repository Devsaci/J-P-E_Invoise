package org.devsaci;

import org.devsaci.controller.InvoiceController;
import org.devsaci.controller.InvoiceControllerMichel;
import org.devsaci.entity.Invoice;
import org.devsaci.repository.InvoiceRepository;
import org.devsaci.repository.InvoiceRepositoryMichel;
import org.devsaci.service.InvoiceService;
import org.devsaci.service.InvoiceServiceMichel;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        System.out.println("Dans quelle configuration êtes-vous ?");
        Scanner sc = new Scanner(System.in);
        int configuration = sc.nextInt();

        if (configuration == 1) {
            InvoiceController invoiceController = new InvoiceController();
            InvoiceService invoiceService = new InvoiceService();
            invoiceController.setInvoiceService(invoiceService);
            InvoiceRepository invoiceRepository = new InvoiceRepository();
            invoiceService.setInvoiceRepository(invoiceRepository);
            invoiceController.createInvoice();

        } else if (configuration == 2) {
            InvoiceControllerMichel invoiceController= new InvoiceControllerMichel();
            InvoiceServiceMichel invoiceService = new InvoiceServiceMichel();
            invoiceController.setInvoiceService(invoiceService);
            InvoiceRepositoryMichel invoiceRepository=new InvoiceRepositoryMichel();
            invoiceService.setInvoiceRepository(invoiceRepository);
            invoiceController.createInvoice();
        }
    }

}


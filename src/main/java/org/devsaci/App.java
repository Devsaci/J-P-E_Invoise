package org.devsaci;

import org.devsaci.controller.InvoiceController;
import org.devsaci.controller.InvoiceControllerMichel;
import org.devsaci.entity.Invoice;
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
            invoiceController.createInvoiceUsingConsole();

        } else if (configuration == 2) {
            InvoiceControllerMichel invoiceControllerMichel = new InvoiceControllerMichel();
            invoiceControllerMichel.createInvoiceUsingWebForm();

        }
    }

}


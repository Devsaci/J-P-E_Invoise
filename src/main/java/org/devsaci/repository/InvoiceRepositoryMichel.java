package org.devsaci.repository;


import org.devsaci.entity.Invoice;

public class InvoiceRepositoryMichel {


 public void create(Invoice invoice) {
  /*[…]
        PreparedStatement pstmt=connexion.prepareStatement("INSERT INTO FACTURE (NUMBER,CUSTOMERNAME) VALUES (?,?)");
                […]
        pstmt.executeUpdate();*/

  System.out.println("Invoice added with number "+invoice.getNumber()+" for "+invoice.getCustomerName());
 }
}

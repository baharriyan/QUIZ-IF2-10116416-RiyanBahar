/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10116416.riyanbahar;

import java.util.Scanner;

/**
*Nama  : Riyan Bahar
 *Kelas : PBO2
 *NIM   : 10116416
 *Deskripsi Program : Aplikasi Kasir
 */
public class QUIZIF210116416RiyanBahar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer cus = new Customer();
        ServicePrice serP = new ServicePrice();
        Scanner nama = new Scanner(System.in);
        Scanner email = new Scanner(System.in);
        Scanner harga = new Scanner(System.in);
        Scanner member = new Scanner(System.in);

        System.out.println("===Program Kasir Rock n Roll Haircut===");
        System.out.print("Customer Name : ");
        cus.setName(nama.nextLine());
        System.out.print("Customer Email : ");
        cus.setEmail(email.nextLine());
        serP.displayService();
        serP.setPriceService(serP.getPrice(harga.nextInt()));
        System.out.print("Are you Member (yes/no) : ");
        cus.setMember(serP.checkMemberStatus(member.next()));

        System.out.println("\n#*************************************#");
        System.out.println("#**********CUSTOMER INVOICE***********#");
        System.out.println("Data Transaction : "+cus.currentTime());
        System.out.println("Service Price : Rp."+serP.getPriceService());
        System.out.println("Discount : Rp."+serP.getSale(cus.isMember(),serP.getPriceService()));
        System.out.println("Total Pay : Rp."+serP.getTotalPay(serP.getPriceService(),
                serP.getSale(cus.isMember(),serP.getPriceService())));
    }
}


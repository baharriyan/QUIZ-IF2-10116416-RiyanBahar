/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10116416.riyanbahar;

/**
 *Nama  : MIA AISYAH F
 *Kelas : PBO2
 *NIM   : 10116415  
 *Deskripsi Program : Quiz
 */
public class ServicePrice implements ServiceItem {
    private float priceService;
    private float discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }

    @Override
    public void displayService(){
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.print("Choose (1/2/3): ");
    }

    @Override
    public float getPrice(int serviceItem){
        int price = 0;
        switch(serviceItem){
            case 1: price=45000; break;
            case 2: price=55000; break;
            case 3: price=15000; break;
        }
        return price;
    }

    @Override
    public boolean checkMemberStatus(String statusMember){
        boolean member = false;
        if(statusMember.equals("yes")){
            member = true;
        }
        return member;
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice){
        float potongan = 0;
        if(isMember == true){
            potongan = 0.1f*parServicePrice;
        }
        return this.discount=potongan;
    }

    public float getTotalPay(float priceService, float discount){
        return priceService-discount;
    }

}

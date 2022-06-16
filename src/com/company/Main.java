package com.company;

import com.company.model.Bill;
import com.company.model.MemberAccount;
import com.company.model.Response;
import com.company.service.Client;
import com.company.service.MemberAccountService;

public class Main {

    public static void main(String[] args) {
        //MemberAccountService objesi yaratarak crud islemleri gerceklestiriyoruz.
        MemberAccountService memberAccountService = new MemberAccountService();

        //Crud islemlerinde bulunan create metoduyla kullanici eklendi.
        MemberAccount memberAccount = memberAccountService.create("Sefa", "Gungor", 2200, "05022589898");

        //Yeni fatura olusturuldu.
        Bill bill = new Bill();
        bill.setBillType(1);
        bill.setAmount(200);
        bill.setDate("08-09-2020");

        //Fatura Service metotları Client uzerinden cagrildi
        Client client = new Client();

        //Odeme islemi gerceklestirmek uzere Fatura objesi ve Uye objesi pay metotuna gonderildi.
        Response response = client.pay(bill, memberAccount);

        //Response'ye gore konsolo mesaj yazdirildi.
        if(response.getCode().equals(0)) {
            System.out.println("Islem basari ile gerceklesmistir..."+response.getDate());
        }else {
            System.out.println("Islem basarisizdir!!!"+response.getDate());
        }

    }
}

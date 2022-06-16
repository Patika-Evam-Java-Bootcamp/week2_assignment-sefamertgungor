package com.company.service;

import com.company.CustomException;
import com.company.model.Bill;
import com.company.model.MemberAccount;
import com.company.model.Response;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
//Fatura islemleri icin service metotları BillService sinifinda tanimlanmistir.
public class BillService {
    //Fatura odeme icin kullanilan BillService metotu.
    //Fatura ve Uye Bilgisi metot icerisinde daha sağlikli kullanilacagindan direk obje olarak alindi.
    public static Response pay(Bill bill, MemberAccount memberAccount) throws CustomException {

        if (bill.getAmount() > memberAccount.getBalance()) {

            Date now = new Date();
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

            throw new CustomException("Bakiyeniz yeterli degildir!");

        } else {

            int availableBalance = memberAccount.getBalance()-bill.getAmount();
            memberAccount.setBalance(availableBalance);

            Date now = new Date();
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

            return new Response("0", df.format(now));
        }
    }

    //Fatura sorgulama icin kullanilan BillService metotu.
    //Donus olarak Response objesi donmektedir. Metot, sorgu basarili kodu ve sorgulama tarihi donmektedir.
    public static Response questioning(int billType, String memberCode) {

        Date now = new Date();
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

        return new Response("0", df.format(now));
    }

    //Odeme iptal icin kullanilan BillService metotu.
    //Donus olarak Response objesi donmektedir. Metot, sorgu basarili kodu ve sorgulama tarihi donmektedir.
    public static Response payCancel(int billType, String memberCode) {

        Date now = new Date();
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

        return new Response("0", df.format(now));
    }



}

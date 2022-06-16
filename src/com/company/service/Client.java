package com.company.service;

import com.company.model.Response;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//BillService'i inherit edecek bir Client sinifi olusturuldu.
public class Client extends BillService{

    // BillService uzerinde bulunan questioning metoduna overloading islemi gerceklestirdik.
    public static Response questioning(int billType, String memberCode) {

        Date now = new Date();
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

        return new Response("0", df.format(now));
    }

    //Bu sinfita bulunan questioning metoduna overloading islemi gerceklestirdik.
    public static Response questioning(int billType, String memberCode, String billDate) {

        Date now = new Date();
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

        return new Response("0", df.format(now));
    }
}

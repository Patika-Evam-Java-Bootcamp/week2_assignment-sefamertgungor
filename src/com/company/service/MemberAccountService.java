package com.company.service;

import com.company.model.MemberAccount;

//MemberAccount uzerinde islem yapabilmek adina crud metotlari olusturuldu.
public class MemberAccountService {
    //Uye olusturmak icin kullanilan metot
    public static MemberAccount create(String name, String username, int balance, String phoneNumber) {

        MemberAccount memberAccount = new MemberAccount();
        memberAccount.setName(name);
        memberAccount.setSurname(username);
        memberAccount.setBalance(balance);
        memberAccount.setPhoneNumber(phoneNumber);

        System.out.println("Kullanici basarili sekilde olusturuldu...");
        return memberAccount;

    }
    //Uye bilgilerini gostermek icin kullanilan metot
    public static void read(MemberAccount memberAccount) {
        System.out.println("User Name: "+memberAccount.getName());
        System.out.println("User Surname: "+memberAccount.getSurname());
        System.out.println("User Balance: "+memberAccount.getBalance());
        System.out.println("User Phone Number: "+memberAccount.getPhoneNumber());
        System.out.println("User bilgileri gosteriliyor...");
    }
    //Uye bilgilerini guncellemek icin kullanilan metot
    public static void update() {System.out.println("Kullanici bilgileri guncellendi...");}
    //Uye bilgilerini silmek icin kullanilan metot
    public static void delete() {System.out.println("Kullanici basarili sekilde silindi...");}
}

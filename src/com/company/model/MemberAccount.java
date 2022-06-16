package com.company.model;
//Uye alanları tanimlandi. Dışarıdan yanlis sekilde erisilmemesi icin ozellikler private olarak tanımlandı. Boylelikle alanlarin kontrolu elimizde oldu.
//Alanlar icin Getter ve Setter metotlari tanimlandi
public class MemberAccount {

    private static int idCount = 0;

    private int id;
    private String name;
    private String surname;
    private String memberCode;
    private int balance;
    private String phoneNumber;


    public MemberAccount() {
        idCount++;
        this.id = idCount;
    }

    public int getIdCount() {
        return idCount;
    }

    public void setIdCount(int idCount) {
        this.idCount = idCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.memberCode = String.valueOf(id) + name.substring(0,2);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance<0) {
            System.out.println("Lutfen 0'dan buyuk bir bakiye giriniz!");
        } else {
            this.balance = balance;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

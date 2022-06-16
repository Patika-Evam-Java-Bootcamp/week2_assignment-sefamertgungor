package com.company.model;
//Fatura modeli oluşturuldu. Dışarıdan yanlı şekilde erişime kapalı olması icin alanlar private tanımlandı.
//Alanlar icin Getter and Setter metotları tanımlandı
public class Bill {

    private static int idCount = 0;

    private int id;
    private int amount;
    private String date;
    private int billType;

    public Bill() {
        idCount++;
        this.id = idCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getBillType() {
        return billType;
    }

    public void setBillType(int billType) {
        this.billType = billType;
    }
}

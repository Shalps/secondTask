package ru.netology.service;

public class CustomsService {

public static final int DUTY_RATE =100;

    public static int calculateCustoms(int price, int productWeight) {
        return  (price/100+productWeight*DUTY_RATE);
    }
}



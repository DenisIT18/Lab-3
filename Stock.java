/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stock;

/**
 *
 * @author Денис
 */
import java.util.Scanner;
class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    public static void main(String[] args) {
        Stock oracleStock = new Stock("ORCL", "Oracle Corporation");
        oracleStock.setPreviousClosingPrice(34.5);
        oracleStock.setCurrentPrice(34.35);

        System.out.println("Введите символ: " + oracleStock.symbol);
        System.out.println("Введите имя: " + oracleStock.name);
        System.out.println("Введите первоначальную цену: " + oracleStock.previousClosingPrice);
        System.out.println("Введите нынешнюю цену: " + oracleStock.currentPrice);
        System.out.println("Введите процентное соотношение: " + oracleStock.getChangePercent() + "%");
    }
}

     
    


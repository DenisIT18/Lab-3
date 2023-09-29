/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dataset;

/**
 *
 * @author Денис
 */
import java.util.Scanner;
class Dataset {
    private double sum;
    private double max;
    private int count; 
    
    public Dataset() {
        max = Double.MIN_VALUE;
        count = 0;
    }
    
    public void incrValue(double value) {
        if (value > max) {
            max = value;
        }
        count++;
    }
    
    public double getMaximum() { 
        return max;
    }
    
    public int getCount() { 
        return count;
    }
}

public class Analytics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dataset data = new Dataset(); 
        
        System.out.println("Введите числа (Q для выхода):");
        
        while (input.hasNext()) { 
            if (input.hasNextDouble()) { 
                double value = input.nextDouble();
                data.incrValue(value);
                System.out.println("Введите еще число (Q для выхода): ");
            } else {
                String userInput = input.next();
                if (userInput.equalsIgnoreCase("Q")) { 
                    break;
                } else {
                    System.out.println("Введите корректное число или Q для выхода: ");
                }
            }
        }
        
        System.out.println("Количество введенных чисел: " + data.getCount()); // Вывод количества введенных чисел
        System.out.println("Максимальное значение: " + data.getMaximum());
    }
}

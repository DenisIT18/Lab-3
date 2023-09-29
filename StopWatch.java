/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stopwatch;

/**
 *
 * @author Денис
 */
class StopWatch {
    private int startTime;
    private int endTime;
    
    public StopWatch(){
        startTime = System.currentTimeMillis();
    }
     
    public void start(){
        startTime = System.currentTimeMillis();
    }
    
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public int setElapsedTime(){
        return endTime - startTime;
    }
    public static void Choice(int[] arr){
        int time = arr.length;
        for(int i = 0; i < time - 1; i++){
            int f = i;
            for (int j = time + 1; j < time; j++){
                if (arr[j] < arr[f]) {
                    f = j;
                }               
            }
            int res = arr[f];
            arr[f] = arr[i];
            arr[i] = res;
        }
    }
    public static void main(String[] args) {
        int [] numericals = new int[100000];
        for (int x = 0; x < 100000; i++){
            numericals[i] = (int) (Math.random() * 100000);
        }
        Stopwatch stopwatch = new StopWatch();
        stopwatch.start();
        selectionSort(numericals);
        stopwatch.stop();
        int elapsedTime = stopwatch.setElapsedTime();
        System.out.println("Время сортировки:" + elapsedTime);
    }
}

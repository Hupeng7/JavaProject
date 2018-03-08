package com.company;

/**
 * @author Administrator
 * @date 2018/2/24 0024
 */
public class VarargsDemo {
    public static void main(String[] args) {
        printMax(34,3,3,2,56,4,56.5);
        printMax(new double[]{1,2,3,4});

        System.out.println("finalize test");
        Cake c1 = new Cake(1);
        Cake c2 = new Cake(2);
        Cake c3 = new Cake(3);
        Cake c4 = new Cake(4.4);

        c1=c2=c3=null;
        System.gc();
    }

    public static void printMax(double... numbers){
         if(numbers.length==0){
             System.out.println("No argument passed");
             return;
         }

         double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i]>result){
                result = numbers[i];
            }
        }
        System.out.println("The max value is "+result);
    }
}

class Cake extends Object{
    private int id;
    private double id1;
    public Cake(int id){
        this.id = id;
        System.out.println("Cake Object "+id+" is created");
    }

    public Cake(double id){
        this.id1 = id;
        System.out.println("Cake Object "+id+" is created");
    }

    @Override
    protected void finalize() throws java.lang.Throwable{
        super.finalize();
        System.out.println("Cake Object "+id+" is disposed");
    }
}
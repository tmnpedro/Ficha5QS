package org.example;

public class Ex6 {
    public double avrgDigitos(int n){
        double sum =0;
        double count = 0;
        while(n>0){
            sum+=n/10;
            n/=10;
            count++;
        }
        return sum/count;
    }
}

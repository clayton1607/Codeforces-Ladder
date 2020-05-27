import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.swing.text.StyleContext.SmallAttributeSet;

import javafx.print.PrintColor;

public class PrimeNumbers {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int test= sc.nextInt();
        int f=0;
        while(test!=0){
            int num = sc.nextInt();
            int k = sc.nextInt();
            while(k!=0){
                f=smallestDivisor(num);
                num+=f;
                // System.out.println(f+" "+ num);
                k--;
            }
            System.out.println(num);
            test--;
        }
        sc.close();
    }
    public static int  smallestDivisor(int num){
        if(num%2 == 0)
            return 2;
        if(num%3 == 0)
            return 3;
        for (int i = 5; i * i <= num; i = i + 6) 
            if (num % i == 0 || num % (i + 2) == 0) 
                return i;
        return num;
    }
}
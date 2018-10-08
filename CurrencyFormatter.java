import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        //US: $12,324.13
        //India: Rs.12,324.13
        //China: ￥12,324.13
        //France: 12 324,13 €
        Locale l = new Locale("en", "US");   
        Locale l1 = new Locale("en", "IN"); 
        Locale l2 = new Locale("zh", "CN"); 
        Locale l3 = new Locale("fr", "FR");    
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(l);
        String us=currencyFormatter.format(payment);
        NumberFormat currencyFormatter1 = NumberFormat.getCurrencyInstance(l1);
        String india=currencyFormatter1.format(payment);
        NumberFormat currencyFormatter2 = NumberFormat.getCurrencyInstance(l2);
        String china=currencyFormatter2.format(payment);
        NumberFormat currencyFormatter3 = NumberFormat.getCurrencyInstance(l3);
        String france=currencyFormatter3.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}


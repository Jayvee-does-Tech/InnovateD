package com.mycompany.studentnumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class STUdentNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your student number containing a dash: ");
        String studentNumber = scanner.nextLine();
        
        Pattern pattern = Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{3}");
        Matcher matcher = pattern.matcher(studentNumber);

        if (matcher.matches()) {
            System.out.println("Warmest of welcomes," + studentNumber + "! You bring a unique perspective to our team that can help us reach new heights.");
            System.out.println("We know we’ll turn to you when we need your abilities and ideas – the ones we choose you for.");
            
        } else {
            System.out.println("Invalid input or no dash found.");
                  
        }
    }
    
}

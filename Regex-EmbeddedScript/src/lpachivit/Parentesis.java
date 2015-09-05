/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpachivit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Luis Martinez
 */
public class Parentesis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un texto que tenga parentesis:");
        String email = sc.nextLine();
        Pattern regex = Pattern.compile("([a-z]|[A-Z]|[0-9]|\\s)*[(]([a-z]|[A-Z]|[0-9]|\\s)*[)]([a-z]|[A-Z]|[0-9]|\\s)*");
        Matcher matcher = regex.matcher(email);
        if (matcher.find())
            System.out.println("Texto valido!");
        else
            System.out.println("Texto NO valido!");
    }
    
}

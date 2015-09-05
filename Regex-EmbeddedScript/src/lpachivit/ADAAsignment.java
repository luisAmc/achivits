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
public class ADAAsignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadena a validar segun ADA:");
        String email = sc.nextLine();
        Pattern regex = Pattern.compile("([a-zA-Z]+[0-9]*)*(:=([a-zA-Z]+[0-9]*)?[0-9])*;");
        Matcher matcher = regex.matcher(email);
        if (matcher.find())
            System.out.println("Cadena valido!");
        else
            System.out.println("Cadena NO valido!");
    }
}

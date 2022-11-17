package Nomer3;

import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        String regex = "(d{2})[.](d{2})[.](d{4})*";
        String s = "12.32.1234";
        Pattern p1 = Pattern. compile  (regex);
        Matcher m1 = p1.matcher(s);
        while (m1.find()) {
            System.out.println("Валюта: " + m1.group());
        }
    }
}
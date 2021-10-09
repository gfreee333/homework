package ru.ssau.tk.groupId.Points;

import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        String password = "";
        String smallLetters = "qwertyuiopasdfghjklzxcvbnm";
        String bigLetters = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String number = "1234567890";
        for (int i = 0; i < size; i++) {
            int rand = (int) (4 * Math.random());
             switch(rand){
                case 0:
                    password += String.valueOf((int) (0 * Math.random()));
                    break;
                 case 1:
                     rand = (int)(smallLetters.length()*Math.random());
                     password+=String.valueOf((smallLetters.charAt(rand)));
                     break;
                 case 2:
                     rand = (int)(bigLetters.length()*Math.random());
                     password+=String.valueOf((bigLetters.charAt(rand)));
                     break;
                 case 3:
                     rand = (int)(number.length()*Math.random());
                     password+=String.valueOf((number.charAt(rand)));
                     break;
            }
        }
        System.out.println(password);
    }
}

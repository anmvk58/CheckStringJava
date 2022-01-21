package frontend;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập password: ");
        String inputEmail = scanner.nextLine();
//        if(checkUpperCase(inputEmail) && checkLength(inputEmail)){
//            System.out.println("Password hợp lệ");
//        } else {
//            System.out.println("Password ko hợp lệ");
//        }

        if(checkLetterCase(inputEmail)){
            System.out.println("Không có kí tự đặc biệt");
        } else {
            System.out.println("Có kí tự đặc biệt");
        }

    }

    //Check chuỗi có kí tự @ trong chuỗi.
    public static boolean isValidEmail(String email){
        if(email.indexOf("@") != -1){
            return true;
        }
        return false;
    }

    //check chuỗi có độ dài trong khoảng ...
    public static boolean checkLength(String email){
        int n = email.length();
        if(n > 5 && n < 13){
            return true;
        }
        return false;
    }

    //check chuỗi có ít nhất 1 kí tự viết hoa
    public static boolean checkUpperCase(String temp){
        for(int i=0; i < temp.length()  ; i++){
         if(Character.isUpperCase(temp.charAt(i))){
             return true;
         }
        }
        return false;
    }

    //Check chuỗi chỉ có kí tự mà thôi
    public static boolean checkLetterCase(String temp){
        for(int i=0; i < temp.length()  ; i++){
            if(!Character.isLetter(temp.charAt(i))){
                return false;
            }
        }
        return true;
    }
}

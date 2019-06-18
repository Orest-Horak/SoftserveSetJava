package Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main4 {
    public static Boolean check(float a){

    if ((a<5) &&(a>-5)){

            return true;

        }
    else
    {

        return false;
    }


    }
    public static void erorhttp(int er) {

        HTTPError error = null;

        switch (er) {
            case 400:
                error = HTTPError.BadRequest;
                break;
            case 401:
                error = HTTPError.Unauthorized;
                break;
            case 402:
                error = HTTPError.PaymentRequired;
                break;
            case 403:
                error = HTTPError.Forbidden;
                break;
            case 404:
                error = HTTPError.NotFound;
                break;
            case 405:
                error = HTTPError.MethodNotAllowed;
                break;
            default:
                System.out.println("Sorry, number is out of range!");
                break;
        }
        System.out.println(er + " Error is " + error + " error;");

    }

    public enum HTTPError {
        BadRequest, Unauthorized, PaymentRequired, Forbidden, NotFound, MethodNotAllowed
    }

    public static void main (String[] args) throws IOException {
        BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));
        //Task1
        System.out.println("Input float a");
        Float a = Float.valueOf(bf.readLine());
        System.out.println("Input float b");
        Float b = Float.valueOf(bf.readLine());
        System.out.println("Input float c");
        Float c = Float.valueOf(bf.readLine());
        if (check(a)==true){
            System.out.println("Float number is in range [-5,5]");
        }
        else { System.out.println("Float number isn't in range [-5,5]");}

        if (check(b)==true){
            System.out.println("Float number is in range [-5,5]");
        }
        else { System.out.println("Float number isn't in range [-5,5]");}
        if (check(c)==true){
            System.out.println("Float number is in range [-5,5]");
        }
        else { System.out.println("Float number isn't in range [-5,5]");}
        //task2
        Integer d= Integer.valueOf(bf.readLine());
        Integer e= Integer.valueOf(bf.readLine());
        Integer g= Integer.valueOf(bf.readLine());
        int max=Math.max( Math.max(d,e),g);

        int min=Math.min( Math.min(d,e),g);
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
        //task3
//        int err= Integer.valueOf(bf.readLine());
//        if (err==400)
//        {
//            System.out.println("Bad request");
//        }
//        else if (err==401){
//            System.out.println("Unauthorized");
//        }
//        else if (err==402){
//            System.out.println("Payment Required");
//        }
//        else if (err==403){
//            System.out.println("Forbidden");
//        }
//        else if (err==404){
//            System.out.println("Not Found");
//        }
//        else if (err==405){
//            System.out.println("Method Not Allowed");
//        }


        System.out.println("Please write number of HTTP Error in range [400;405] ");
        int er = Integer.parseInt(bf.readLine());
        erorhttp(er);
    }

}

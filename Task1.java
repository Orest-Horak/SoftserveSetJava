package Task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import  java.io.IOException;
public class Task1 {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Part1");
        System.out.println("Please enter the radius of flower bed ");
        Double r= Double.valueOf(bf.readLine());
        System.out.println("Perimeter = "+2*Math.PI*r);
        System.out.println("Area = "+2*Math.PI*Math.pow(r,2.0));

        System.out.println("Part2");
        String name;
        String address;
        System.out.println("What is your name ? ");
        name= bf.readLine();
        System.out.println("Where are you live ,"+name);
        address=bf.readLine();
        System.out.println("Name : "+name + "   Address : " +address);
        System.out.println("Part3");
        //standart units per minute
        String k1="Ukraine";
        String k2="USA";
        String k3="Italy";
        System.out.println("Enter the price of call per minute in "+k1);
      Double c1 = Double.valueOf(bf.readLine());
        System.out.println("Enter the price of call per minute in "+k2);
        Double c2 = Double.valueOf(bf.readLine());
        System.out.println("Enter the price of call per minute in "+k3);
        Double c3 = Double.valueOf(bf.readLine());
        System.out.println("-----------------------------------------");
        System.out.println("Enter the length of first call (in minutes)");
        Double t1 = Double.valueOf(bf.readLine());
        System.out.println("Enter the length of second call (in minutes)");
        Double t2 = Double.valueOf(bf.readLine());
        System.out.println("Enter the length of third call (in minutes)");
        Double t3 = Double.valueOf(bf.readLine());
        System.out.println("******************Result***************************");
        System.out.println("The price for first call in "+k1+" = "+c1*t1);
        System.out.println("The price for first call in "+k2+" = "+c2*t1);
        System.out.println("The price for first call in "+k3+" = "+c3*t1);
        System.out.println("------");
        System.out.println("The price for second call in "+k1+" = "+c1*t2);
        System.out.println("The price for second call in "+k2+" = " +c2*t2);
        System.out.println("The price for second call in "+k3+" = "+c3*t2);
        System.out.println("------");
        System.out.println("The price for third call in "+k1+" = "+c1*t3);
        System.out.println("The price for third call in "+k2+" = "+c2*t3);
        System.out.println("The price for third call in "+k3+" = "+c3*t3);
        System.out.println("---------------------------------------------------");
        System.out.println("The price for all calls in "+k1+" = " + (c1*t1+c1*t2+c1*t3));
        System.out.println("The price for all calls in "+k2+" = " + (c2*t1+c2*t2+c2*t3));
        System.out.println("The price for all calls in "+k3+" = " + (c3*t1+c3*t2+c3*t3));
        System.out.println("----------------------------------------------------");

        }
}

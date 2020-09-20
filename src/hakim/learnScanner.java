package hakim;

import java.util.Scanner;

public class learnScanner {
    public static void main(String[] args) {


        learnVariables.myMethod();



        Scanner vv= new Scanner(System.in);
        System.out.println(" how many goals jsk scored ?");
        int jsk=vv.nextInt();


        System.out.println("how many goals MCA scored ?");
        int MCA=vv.nextInt();


       if(jsk>MCA){

           System.out.println("jsk win !!");

       }

       else if (jsk<MCA){

           System.out.println("mca win !!");


       }


       else if  (jsk==MCA){

           System.out.println("no one win !");

       }















    }




}

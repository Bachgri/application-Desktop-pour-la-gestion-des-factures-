package Tests;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Solde {
    static double
    findDifference(String start_date,
                   String end_date)
    {
  
        // SimpleDateFormat converts the
        // string format to date object
        SimpleDateFormat sdf
            = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss");
        double difference_In_Hours = 0;
        // Try Block
        try {
            Date d1 = sdf.parse(start_date);
            Date d2 = sdf.parse(end_date);
            long difference_In_Time
                = d2.getTime() - d1.getTime();
            long difference_In_Seconds = (difference_In_Time/ 1000)% 60;
  
            long difference_In_Minutes= (difference_In_Time/ (1000 * 60))% 60;
  
            difference_In_Hours= (difference_In_Time)/1000/60/60;
  
            long difference_In_Years= (difference_In_Time/ (1000l * 60 * 60 * 24 * 365));
  
            long difference_In_Days= (difference_In_Time / (1000 * 60 * 60 * 24))% 365;
            
            // Print the date difference in
            // years, in days, in hours, in
            // minutes, and in seconds
            /*
            System.out.print(
                "Difference "
                + "between two dates is: ");
  
            System.out.println(
                difference_In_Years
                + " years, "
                + difference_In_Days
                + " days, "
                + difference_In_Hours
                + " hours, "
                + difference_In_Minutes
                + " minutes, "
                + difference_In_Seconds
                + " seconds");*/
        }
  
        // Catch the Exception
        catch (ParseException e) {
            e.printStackTrace();
        }
        return difference_In_Hours;
    }
    public static void main(String[] args) {
        java.util.Date dNow = new Date();
        SimpleDateFormat ft = 
        new SimpleDateFormat ("yyyy-MM-dd  HH:mm:ss");
        String en_arabe = "وليد";
        String en_fran = "وليد";
        System.out.println("" + (en_arabe.compareTo(en_fran)==0));
        ft.format(dNow);
        System.err.println(""+ ft.format(dNow));
        System.out.println("Current Date: " );
        String dateBegin = "2022-07-12 21:00:00";
        String dateEnd = ft.format(dNow);
        if(findDifference(dateBegin, dateEnd)>24)
            System.err.println(findDifference(dateBegin, dateEnd));
        else
            System.out.println(findDifference(dateBegin, dateEnd)); 
        /*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(new Date()+"" , formatter);
        System.out.println(zonedDateTime);
        /*
        double qtt = 0;
        final int tranch1 = 4, tranch2 = 6, tranch3 = 10;
        double solde = 0;
        double x = qtt;
        if(qtt==0) solde = 0;
        else{
        if( qtt<4){
            solde+=4*tranch1;
        }else if(qtt-4>20){
            solde+=(20-6)*tranch2;
        }else{
            solde+=(qtt-6)*tranch2;
        }
        if(qtt-20>0){
            solde+=(qtt-20)*tranch3;
        }
            
        }
        
        Date d = new Date();
        DecimalFormat df = new DecimalFormat("#.00");
        df.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.ENGLISH));
        System.out.println("solde = "+df.format(solde));
        System.out.println( "\n" + solde);*/
    }
}


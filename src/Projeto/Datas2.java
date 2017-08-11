package Projeto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas2 {

	private static Date date;

	public static void main(String[] args) throws ParseException  {
		
	    Calendar c = Calendar.getInstance();
	    c.set(1980,Calendar.FEBRUARY  ,12);
	     Date data=c.getTime();
	     System.out.println(data);
	     /*formatacao de Data  */ 
	    DateFormat f=DateFormat.getDateInstance();
	   System.out.println( f.format(data));
	      
	    
	     /*formatacao da hora */ 
	   f=DateFormat.getTimeInstance();
	   System.out.println( f.format(data));

	   /*formatacao de Data e  hora */ 
	   f=DateFormat.getDateTimeInstance();
	   System.out.println( f.format(data));
	   
	   DateFormat f1=DateFormat.getDateInstance(DateFormat.FULL);
	   System.out.println( f1.format(data));
	   
	   DateFormat f11=DateFormat.getDateInstance(DateFormat.LONG);
	   System.out.println( f11.format(data));
   
	   DateFormat r=DateFormat.getDateInstance(DateFormat.MEDIUM);
	   System.out.println( r.format(data));
	    
	   DateFormat w=DateFormat.getDateInstance(DateFormat.SHORT);
	   System.out.println( w.format(data));
	   
	   
     //   Date data2=f.parse("12/02/1980");
	   // System.out.println(data2);
	   /* simpleDateFormat*/
	    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyy");  
		   System.out.println( sdf.format(data));
		   System.out.println( sdf.parse("10/10/2010"));
	    
	    
	    
	    
	    
	   
       
       
       
	}

}


package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DHL;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

public class FlipkartFactory {
    //static  factory method having logic to create Flipkart object having  the given Courier object
	  public   static   Flipkart   getInstance(String courierType) {
		   //create dependent class obj
		    Courier courier=null;
		    if(courierType.equalsIgnoreCase("dtdc"))
		    	courier=new DTDC();
		    else if(courierType.equalsIgnoreCase("bDart"))
		    	 courier=new BlueDart();
		    else if(courierType.equalsIgnoreCase("dhl"))
		    	 courier=new DHL();
		    else 
		    	throw new IllegalArgumentException("Invalid Courier Type");
		    //create target class obj
		     Flipkart fpkt=new Flipkart();
		     //assign dependent class obj to target class obj
		     fpkt.setCourier(courier);
		     
		     return fpkt;
	  }
}

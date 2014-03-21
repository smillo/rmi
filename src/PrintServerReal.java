

public class PrintServerReal implements java.io.Serializable {

 public PrintServerReal() {

 }


 public String [] getPrinterList () {
 System . out . println ("List of printers . . . ") ;
 return new String []{"p1" , "p2" , "p3"};
 }

 public synchronized boolean print ( String document , String printerName) {
 System . out . println ("printing on "+printerName+" . . . ") ;
 System . out . println (document) ;
return true ;
 }
 public void stopPrinting () {
 System . out . println ("stop print . . . ") ;
 
 }

 }

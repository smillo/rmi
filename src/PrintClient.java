import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Random;

public class PrintClient {
 public static void main( String [] args ) throws Exception {
	 try{
	 String host = (args.length<1) ? null : args[0];
	 
	 Registry reg = LocateRegistry.getRegistry(host);
	 IPrintServer server = (IPrintServer) reg.lookup("server");
	 String[] printers = server.getPrinterList();
	 for(String s: printers){
		 System.out.println(s);
	 }
	 
	 server.print(getRandomDocument(), "p");
	 
	 server.stopPrinting();
	 }
	 catch(Exception e){
		 
	 }
	 
 }

 private static String getRandomDocument() {
int numWords = ( int ) (Math.random()*100) ;
 String doc = "";
for ( int i = 0; i< numWords; i++){
doc += generateRandomWord() + " ";
 }
return doc ;
 }
private static String generateRandomWord() {
Random random = new Random() ;
 char [] word = new char [random. nextInt (8) + 3];
for ( int j = 0; j< word. length ; j++){
word[ j ] = (char) ( 'a' + random. nextInt (26)) ;
}
 return new String (word) ;
 }}

 
 
 
 
 
 /*IPrintServer server = null ;
 try {
 server = new PrintServerStub () ;

 String [] printers = server . getPrinterList () ;
 	for ( int i = 0; i< 5; i++){
 		for ( String name : printers ) {
 			System . out . println ("Printer : " + name) ;
 			if ( server . print (getRandomDocument() , name))
 				System . out . println ("document printed !") ;
 			else
 				System . out . println ("printing problems !") ;
 } }
 } finally{ server .stopPrinting();}
}*/
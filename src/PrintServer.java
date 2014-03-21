import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class PrintServer implements IPrintServer{
 public static void main( String [] args ) throws IOException {

	 PrintServer printS = new PrintServer();
	 IPrintServer stanza = (IPrintServer) UnicastRemoteObject.exportObject(printS, 0);
	 Registry reg = LocateRegistry.getRegistry();
	 reg.rebind("server", stanza);
	 System.out.println("server pronto");
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

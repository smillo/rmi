import java.rmi.RemoteException;

public interface IPrintServer extends java.rmi.Remote{
 public static final int PORT = 9999;

 public String [] getPrinterList () throws RemoteException;

 public boolean print ( String document , String printerName) throws RemoteException ;

 public void stopPrinting () throws RemoteException ;

 }

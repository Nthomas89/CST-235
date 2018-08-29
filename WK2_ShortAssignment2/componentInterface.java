package Short_Assignment_2;

import java.rmi.RemoteException;

public interface componentInterface extends javax.ejb.EJBLocalObject {

	public double getVideo_length() throws RemoteException;
	
}

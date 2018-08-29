package Short_Assignment_2;

import java.rmi.RemoteException;
public interface homeInterface extends EJBHome
{
public video_Info create() throws CreateException, RemoteException;
}
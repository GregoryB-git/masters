package androidx.work.multiprocess;

import android.os.IBinder;
import android.os.RemoteException;

public class IWorkManagerImpl$Default
  implements IWorkManagerImpl
{
  public IBinder asBinder()
  {
    return null;
  }
  
  public void cancelAllWork(IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {}
  
  public void cancelAllWorkByTag(String paramString, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {}
  
  public void cancelUniqueWork(String paramString, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {}
  
  public void cancelWorkById(String paramString, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {}
  
  public void enqueueContinuation(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {}
  
  public void enqueueWorkRequests(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {}
  
  public void queryWorkInfo(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {}
  
  public void setProgress(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {}
}

/* Location:
 * Qualified Name:     androidx.work.multiprocess.IWorkManagerImpl.Default
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
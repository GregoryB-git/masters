package androidx.work.multiprocess;

import android.os.IBinder;
import android.os.RemoteException;

public class IListenableWorkerImpl$Default
  implements IListenableWorkerImpl
{
  public IBinder asBinder()
  {
    return null;
  }
  
  public void interrupt(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {}
  
  public void startWork(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException
  {}
}

/* Location:
 * Qualified Name:     androidx.work.multiprocess.IListenableWorkerImpl.Default
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
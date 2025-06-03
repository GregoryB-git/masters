package androidx.core.app.unusedapprestrictions;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

class IUnusedAppRestrictionsBackportService$Stub$Proxy
  implements IUnusedAppRestrictionsBackportService
{
  private IBinder mRemote;
  
  public IUnusedAppRestrictionsBackportService$Stub$Proxy(IBinder paramIBinder)
  {
    mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return mRemote;
  }
  
  public String getInterfaceDescriptor()
  {
    return "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService";
  }
  
  public void isPermissionRevocationEnabledForApp(IUnusedAppRestrictionsBackportCallback paramIUnusedAppRestrictionsBackportCallback)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
      localParcel.writeStrongInterface(paramIUnusedAppRestrictionsBackportCallback);
      mRemote.transact(1, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.Proxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.core.app.unusedapprestrictions;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

class IUnusedAppRestrictionsBackportCallback$Stub$Proxy
  implements IUnusedAppRestrictionsBackportCallback
{
  private IBinder mRemote;
  
  public IUnusedAppRestrictionsBackportCallback$Stub$Proxy(IBinder paramIBinder)
  {
    mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return mRemote;
  }
  
  public String getInterfaceDescriptor()
  {
    return "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback";
  }
  
  public void onIsPermissionRevocationEnabledForAppResult(boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
      int i = 0;
      if (paramBoolean1) {
        j = 1;
      } else {
        j = 0;
      }
      localParcel.writeInt(j);
      int j = i;
      if (paramBoolean2) {
        j = 1;
      }
      localParcel.writeInt(j);
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
 * Qualified Name:     androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub.Proxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class IUnusedAppRestrictionsBackportCallback$Stub
  extends Binder
  implements IUnusedAppRestrictionsBackportCallback
{
  public static final int TRANSACTION_onIsPermissionRevocationEnabledForAppResult = 1;
  
  public IUnusedAppRestrictionsBackportCallback$Stub()
  {
    attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
  }
  
  public static IUnusedAppRestrictionsBackportCallback asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
    if ((localIInterface != null) && ((localIInterface instanceof IUnusedAppRestrictionsBackportCallback))) {
      return (IUnusedAppRestrictionsBackportCallback)localIInterface;
    }
    return new Proxy(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if ((paramInt1 >= 1) && (paramInt1 <= 16777215)) {
      paramParcel1.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
    }
    if (paramInt1 != 1598968902)
    {
      if (paramInt1 != 1) {
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      }
      paramInt1 = paramParcel1.readInt();
      boolean bool1 = false;
      boolean bool2;
      if (paramInt1 != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      onIsPermissionRevocationEnabledForAppResult(bool2, bool1);
      return true;
    }
    paramParcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
    return true;
  }
  
  public static class Proxy
    implements IUnusedAppRestrictionsBackportCallback
  {
    private IBinder mRemote;
    
    public Proxy(IBinder paramIBinder)
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
}

/* Location:
 * Qualified Name:     androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
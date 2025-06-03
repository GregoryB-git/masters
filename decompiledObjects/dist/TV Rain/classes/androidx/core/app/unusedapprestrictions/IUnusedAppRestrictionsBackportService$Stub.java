package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class IUnusedAppRestrictionsBackportService$Stub
  extends Binder
  implements IUnusedAppRestrictionsBackportService
{
  public static final int TRANSACTION_isPermissionRevocationEnabledForApp = 1;
  
  public IUnusedAppRestrictionsBackportService$Stub()
  {
    attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
  }
  
  public static IUnusedAppRestrictionsBackportService asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
    if ((localIInterface != null) && ((localIInterface instanceof IUnusedAppRestrictionsBackportService))) {
      return (IUnusedAppRestrictionsBackportService)localIInterface;
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
      paramParcel1.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
    }
    if (paramInt1 != 1598968902)
    {
      if (paramInt1 != 1) {
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      }
      isPermissionRevocationEnabledForApp(IUnusedAppRestrictionsBackportCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
      return true;
    }
    paramParcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
    return true;
  }
  
  public static class Proxy
    implements IUnusedAppRestrictionsBackportService
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
}

/* Location:
 * Qualified Name:     androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
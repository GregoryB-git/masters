package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.a.a;
import com.google.android.a.b;
import com.google.android.a.c;

public abstract interface IGetInstallReferrerService
  extends IInterface
{
  public abstract Bundle c(Bundle paramBundle)
    throws RemoteException;
  
  public static abstract class Stub
    extends b
    implements IGetInstallReferrerService
  {
    public static IGetInstallReferrerService b(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
      if ((localIInterface instanceof IGetInstallReferrerService)) {
        return (IGetInstallReferrerService)localIInterface;
      }
      return new Proxy(paramIBinder);
    }
    
    public final boolean a(int paramInt, Parcel paramParcel1, Parcel paramParcel2)
      throws RemoteException
    {
      if (paramInt == 1)
      {
        paramParcel1 = c((Bundle)c.a(paramParcel1, Bundle.CREATOR));
        paramParcel2.writeNoException();
        c.c(paramParcel2, paramParcel1);
        return true;
      }
      return false;
    }
    
    public static class Proxy
      extends a
      implements IGetInstallReferrerService
    {
      public Proxy(IBinder paramIBinder)
      {
        super();
      }
      
      public final Bundle c(Bundle paramBundle)
        throws RemoteException
      {
        Object localObject = a();
        c.b((Parcel)localObject, paramBundle);
        paramBundle = b((Parcel)localObject);
        localObject = (Bundle)c.a(paramBundle, Bundle.CREATOR);
        paramBundle.recycle();
        return (Bundle)localObject;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.finsky.externalreferrer.IGetInstallReferrerService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
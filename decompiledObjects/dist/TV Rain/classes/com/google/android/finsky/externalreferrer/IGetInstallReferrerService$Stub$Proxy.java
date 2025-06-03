package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.a.a;
import com.google.android.a.c;

public class IGetInstallReferrerService$Stub$Proxy
  extends a
  implements IGetInstallReferrerService
{
  public IGetInstallReferrerService$Stub$Proxy(IBinder paramIBinder)
  {
    super(paramIBinder);
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

/* Location:
 * Qualified Name:     com.google.android.finsky.externalreferrer.IGetInstallReferrerService.Stub.Proxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
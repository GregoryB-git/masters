package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import j6.b;
import m6.a0;

public final class j
  extends a0
{
  public final IBinder g;
  
  public j(a parama, int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    super(parama, paramInt, paramBundle);
    g = paramIBinder;
  }
  
  public final void c(b paramb)
  {
    if (a.zzc(h) != null) {
      a.zzc(h).g(paramb);
    }
    h.onConnectionFailed(paramb);
  }
  
  public final boolean d()
  {
    boolean bool1 = false;
    try
    {
      Object localObject = g;
      m6.j.i(localObject);
      localObject = ((IBinder)localObject).getInterfaceDescriptor();
      if (!h.getServiceDescriptor().equals(localObject))
      {
        localObject = a0.j.k("service descriptor mismatch: ", h.getServiceDescriptor(), " vs. ", (String)localObject);
      }
      else
      {
        localObject = h.createServiceInterface(g);
        boolean bool2 = bool1;
        if (localObject != null) {
          if (!a.zzn(h, 2, 4, (IInterface)localObject))
          {
            bool2 = bool1;
            if (!a.zzn(h, 3, 4, (IInterface)localObject)) {}
          }
          else
          {
            a.zzg(h, null);
            localObject = h;
            Bundle localBundle = ((a)localObject).getConnectionHint();
            if (a.zzb((a)localObject) != null) {
              a.zzb(h).s(localBundle);
            }
            bool2 = true;
          }
        }
        return bool2;
      }
    }
    catch (RemoteException localRemoteException)
    {
      String str = "service probably died";
      Log.w("GmsClient", str);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
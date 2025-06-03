package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

public final class i
  implements ServiceConnection
{
  public final int a;
  
  public i(a parama, int paramInt)
  {
    a = paramInt;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = b;
    if (paramIBinder == null)
    {
      a.zzk(paramComponentName, 16);
      return;
    }
    synchronized (a.zzd(paramComponentName))
    {
      a locala = b;
      paramComponentName = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      if ((paramComponentName != null) && ((paramComponentName instanceof IGmsServiceBroker))) {
        paramComponentName = (IGmsServiceBroker)paramComponentName;
      } else {
        paramComponentName = new g(paramIBinder);
      }
      a.zzh(locala, paramComponentName);
      b.zzl(0, null, a);
      return;
    }
  }
  
  public final void onServiceDisconnected(ComponentName arg1)
  {
    synchronized (a.zzd(b))
    {
      a.zzh(b, null);
      ??? = b;
      int i = a;
      ??? = zzb;
      ???.sendMessage(???.obtainMessage(6, i, 1));
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
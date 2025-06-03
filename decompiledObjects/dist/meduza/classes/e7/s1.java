package e7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzbz;

public final class s1
  implements ServiceConnection
{
  public final String a;
  
  public s1(t1 paramt1, String paramString)
  {
    a = paramString;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    if (paramIBinder == null)
    {
      b.a.zzj().r.b("Install Referrer connection returned with null binder");
      return;
    }
    try
    {
      zzbz localzzbz = zzby.zza(paramIBinder);
      if (localzzbz == null)
      {
        b.a.zzj().r.b("Install Referrer Service implementation was not found");
        return;
      }
      b.a.zzj().w.b("Install Referrer Service connected");
      paramComponentName = b.a.zzl();
      paramIBinder = new e7/v1;
      paramIBinder.<init>(this, localzzbz, this, 0);
      paramComponentName.u(paramIBinder);
      return;
    }
    catch (RuntimeException paramComponentName)
    {
      b.a.zzj().r.c("Exception occurred while calling Install Referrer API", paramComponentName);
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    b.a.zzj().w.b("Install Referrer Service disconnected");
  }
}

/* Location:
 * Qualified Name:     e7.s1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package R2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.f0;

public final class t2
  implements ServiceConnection
{
  public final String a;
  
  public t2(u2 paramu2, String paramString)
  {
    a = paramString;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    if (paramIBinder == null)
    {
      b.a.j().L().a("Install Referrer connection returned with null binder");
      return;
    }
    try
    {
      paramIBinder = f0.o(paramIBinder);
      if (paramIBinder == null)
      {
        b.a.j().L().a("Install Referrer Service implementation was not found");
        return;
      }
    }
    catch (RuntimeException paramComponentName)
    {
      break label101;
      b.a.j().K().a("Install Referrer Service connected");
      G2 localG2 = b.a.e();
      paramComponentName = new R2/w2;
      paramComponentName.<init>(this, paramIBinder, this);
      localG2.D(paramComponentName);
      return;
      label101:
      b.a.j().L().b("Exception occurred while calling Install Referrer API", paramComponentName);
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    b.a.j().K().a("Install Referrer Service disconnected");
  }
}

/* Location:
 * Qualified Name:     R2.t2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
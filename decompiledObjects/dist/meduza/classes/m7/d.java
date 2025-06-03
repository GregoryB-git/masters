package m7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

public final class d
  implements ServiceConnection
{
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    a.b.b("ServiceConnectionImpl.onServiceConnected(%s)", new Object[] { paramComponentName });
    paramComponentName = new b(this, paramIBinder);
    a.a().post(paramComponentName);
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    a.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[] { paramComponentName });
    paramComponentName = new c(this, 0);
    a.a().post(paramComponentName);
  }
}

/* Location:
 * Qualified Name:     m7.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
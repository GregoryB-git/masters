package k7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

public final class m
  implements ServiceConnection
{
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    a.b.a("ServiceConnectionImpl.onServiceConnected(%s)", new Object[] { paramComponentName });
    paramComponentName = new k(this, paramIBinder);
    a.a().post(paramComponentName);
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    a.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[] { paramComponentName });
    paramComponentName = new l(this);
    a.a().post(paramComponentName);
  }
}

/* Location:
 * Qualified Name:     k7.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
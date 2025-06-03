package ea;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import f;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import nc.e0;
import x6.b;

public final class h0$b
  implements ServiceConnection
{
  public h0$b(h0 paramh0) {}
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = f.l("Connected to SessionLifecycleService. Queue size ");
    paramComponentName.append(a.c.size());
    Log.d("SessionLifecycleClient", paramComponentName.toString());
    a.b = new Messenger(paramIBinder);
    a.getClass();
    paramComponentName = a;
    paramComponentName.getClass();
    paramIBinder = new ArrayList();
    c.drainTo(paramIBinder);
    b.g0(e0.a(a), null, new i0(paramComponentName, paramIBinder, null), 3);
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
    paramComponentName = a;
    b = null;
    paramComponentName.getClass();
  }
}

/* Location:
 * Qualified Name:     ea.h0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
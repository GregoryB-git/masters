package A2;

import D2.b;
import E2.l;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.StrictMode;
import android.os.StrictMode.VmPolicy;
import android.os.StrictMode.VmPolicy.Builder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

public final class g0
  implements ServiceConnection, k0
{
  public final Map a;
  public int b;
  public boolean c;
  public IBinder d;
  public final e0 e;
  public ComponentName f;
  
  public g0(j0 paramj0, e0 parame0)
  {
    e = parame0;
    a = new HashMap();
    b = 2;
  }
  
  public final int a()
  {
    return b;
  }
  
  public final ComponentName b()
  {
    return f;
  }
  
  public final IBinder c()
  {
    return d;
  }
  
  public final void d(ServiceConnection paramServiceConnection1, ServiceConnection paramServiceConnection2, String paramString)
  {
    a.put(paramServiceConnection1, paramServiceConnection2);
  }
  
  public final void e(String paramString, Executor paramExecutor)
  {
    b = 3;
    StrictMode.VmPolicy localVmPolicy = StrictMode.getVmPolicy();
    if (l.l()) {
      StrictMode.setVmPolicy(f0.a(new StrictMode.VmPolicy.Builder(localVmPolicy)).build());
    }
    try
    {
      j0 localj0 = g;
      boolean bool = j0.j(localj0).d(j0.h(localj0), paramString, e.c(j0.h(localj0)), this, e.a(), paramExecutor);
      c = bool;
      if (bool)
      {
        paramString = j0.i(g).obtainMessage(1, e);
        j0.i(g).sendMessageDelayed(paramString, j0.g(g));
      }
    }
    finally
    {
      break label155;
    }
    b = 2;
    try
    {
      paramString = g;
      j0.j(paramString).c(j0.h(paramString), this);
      StrictMode.setVmPolicy(localVmPolicy);
      return;
      label155:
      StrictMode.setVmPolicy(localVmPolicy);
      throw paramString;
    }
    catch (IllegalArgumentException paramString)
    {
      for (;;) {}
    }
  }
  
  public final void f(ServiceConnection paramServiceConnection, String paramString)
  {
    a.remove(paramServiceConnection);
  }
  
  public final void g(String paramString)
  {
    j0.i(g).removeMessages(1, e);
    paramString = g;
    j0.j(paramString).c(j0.h(paramString), this);
    c = false;
    b = 2;
  }
  
  public final boolean h(ServiceConnection paramServiceConnection)
  {
    return a.containsKey(paramServiceConnection);
  }
  
  public final boolean i()
  {
    return a.isEmpty();
  }
  
  public final boolean j()
  {
    return c;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (j0.k(g))
    {
      j0.i(g).removeMessages(1, e);
      d = paramIBinder;
      f = paramComponentName;
      Iterator localIterator = a.values().iterator();
      if (localIterator.hasNext()) {
        ((ServiceConnection)localIterator.next()).onServiceConnected(paramComponentName, paramIBinder);
      }
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    synchronized (j0.k(g))
    {
      j0.i(g).removeMessages(1, e);
      d = null;
      f = paramComponentName;
      Iterator localIterator = a.values().iterator();
      if (localIterator.hasNext()) {
        ((ServiceConnection)localIterator.next()).onServiceDisconnected(paramComponentName);
      }
    }
  }
}

/* Location:
 * Qualified Name:     A2.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
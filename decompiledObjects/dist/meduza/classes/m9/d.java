package m9;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import b0.f;
import g.q;
import i9.i1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p2.m0;
import w.g;

public final class d
  implements h
{
  public final Context a;
  public final ConnectivityManager b;
  public Runnable c;
  public final ArrayList d = new ArrayList();
  
  public d(Context paramContext)
  {
    boolean bool;
    if (paramContext != null) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.Z("Context must be non-null", bool, new Object[0]);
    a = paramContext;
    Object localObject = (ConnectivityManager)paramContext.getSystemService("connectivity");
    b = ((ConnectivityManager)localObject);
    Application localApplication = (Application)paramContext.getApplicationContext();
    AtomicBoolean localAtomicBoolean = new AtomicBoolean();
    localApplication.registerActivityLifecycleCallbacks(new b(this, localAtomicBoolean));
    localApplication.registerComponentCallbacks(new c(localAtomicBoolean));
    if ((Build.VERSION.SDK_INT >= 24) && (localObject != null))
    {
      paramContext = new a();
      f.i((ConnectivityManager)localObject, paramContext);
      paramContext = new g(22, this, paramContext);
    }
    else
    {
      localObject = new b();
      paramContext.registerReceiver((BroadcastReceiver)localObject, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
      paramContext = new q(18, this, localObject);
    }
    c = paramContext;
  }
  
  public final void a(i1 parami1)
  {
    synchronized (d)
    {
      d.add(parami1);
      return;
    }
  }
  
  public final boolean b()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)a.getSystemService("connectivity")).getActiveNetworkInfo();
    boolean bool;
    if ((localNetworkInfo != null) && (localNetworkInfo.isConnected())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void c(boolean paramBoolean)
  {
    synchronized (d)
    {
      Iterator localIterator = d.iterator();
      while (localIterator.hasNext())
      {
        n9.d locald = (n9.d)localIterator.next();
        h.a locala;
        if (paramBoolean) {
          locala = h.a.b;
        } else {
          locala = h.a.a;
        }
        locald.accept(locala);
      }
      return;
    }
  }
  
  public final void d()
  {
    m0.y(1, "AndroidConnectivityMonitor", "App has entered the foreground.", new Object[0]);
    if (b()) {
      c(true);
    }
  }
  
  public final void shutdown()
  {
    Runnable localRunnable = c;
    if (localRunnable != null)
    {
      localRunnable.run();
      c = null;
    }
  }
  
  public final class a
    extends ConnectivityManager.NetworkCallback
  {
    public a() {}
    
    public final void onAvailable(Network paramNetwork)
    {
      c(true);
    }
    
    public final void onLost(Network paramNetwork)
    {
      c(false);
    }
  }
  
  public final class b
    extends BroadcastReceiver
  {
    public boolean a = false;
    
    public b() {}
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      boolean bool1 = b();
      if ((b()) && (!a)) {
        paramContext = d.this;
      }
      for (boolean bool2 = true;; bool2 = false)
      {
        paramContext.c(bool2);
        break;
        if ((bool1) || (!a)) {
          break;
        }
        paramContext = d.this;
      }
      a = bool1;
    }
  }
}

/* Location:
 * Qualified Name:     m9.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package fb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.util.Log;
import eb.c;
import eb.n;
import eb.n0;
import eb.o0;
import eb.p0;
import eb.t0;
import eb.w;
import hb.g;
import java.lang.reflect.Constructor;
import java.util.concurrent.TimeUnit;
import x0.f;

public final class a
  extends w<a>
{
  public final o0<?> a;
  public Context b;
  
  static
  {
    try
    {
      Object localObject = g.class.asSubclass(p0.class);
      String str;
      try
      {
        localObject = (p0)((Class)localObject).getConstructor(new Class[0]).newInstance(new Object[0]);
        if (((p0)localObject).b()) {
          return;
        }
        Log.w("AndroidChannelBuilder", "OkHttpChannelProvider.isAvailable() returned false");
      }
      catch (Exception localException)
      {
        str = "Failed to construct OkHttpChannelProvider";
      }
      Log.w("AndroidChannelBuilder", str, localClassCastException);
    }
    catch (ClassCastException localClassCastException)
    {
      str = "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider";
    }
  }
  
  public a(o0<?> paramo0)
  {
    a = paramo0;
  }
  
  public final n0 a()
  {
    return new a(a.a(), b);
  }
  
  public final o0<?> d()
  {
    return a;
  }
  
  public static final class a
    extends n0
  {
    public final n0 b;
    public final Context c;
    public final ConnectivityManager d;
    public final Object e = new Object();
    public Runnable f;
    
    public a(n0 paramn0, Context paramContext)
    {
      b = paramn0;
      c = paramContext;
      if (paramContext != null)
      {
        d = ((ConnectivityManager)paramContext.getSystemService("connectivity"));
        try
        {
          I();
        }
        catch (SecurityException paramn0)
        {
          Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", paramn0);
        }
      }
      else
      {
        d = null;
      }
    }
    
    public final boolean C(long paramLong, TimeUnit paramTimeUnit)
    {
      return b.C(paramLong, paramTimeUnit);
    }
    
    public final void D()
    {
      b.D();
    }
    
    public final n E()
    {
      return b.E();
    }
    
    public final void F(n paramn, f paramf)
    {
      b.F(paramn, paramf);
    }
    
    public final n0 G()
    {
      synchronized (e)
      {
        Runnable localRunnable = f;
        if (localRunnable != null)
        {
          localRunnable.run();
          f = null;
        }
        return b.G();
      }
    }
    
    public final n0 H()
    {
      synchronized (e)
      {
        Runnable localRunnable = f;
        if (localRunnable != null)
        {
          localRunnable.run();
          f = null;
        }
        return b.H();
      }
    }
    
    public final void I()
    {
      final Object localObject;
      if ((Build.VERSION.SDK_INT >= 24) && (d != null))
      {
        localObject = new c();
        a0.e.g(d, (c)localObject);
        localObject = new a((c)localObject);
      }
      else
      {
        localObject = new d();
        IntentFilter localIntentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        c.registerReceiver((BroadcastReceiver)localObject, localIntentFilter);
        localObject = new b((d)localObject);
      }
      f = ((Runnable)localObject);
    }
    
    public final String b()
    {
      return b.b();
    }
    
    public final <RequestT, ResponseT> eb.e<RequestT, ResponseT> v(t0<RequestT, ResponseT> paramt0, c paramc)
    {
      return b.v(paramt0, paramc);
    }
    
    public final class a
      implements Runnable
    {
      public a(a.a.c paramc) {}
      
      public final void run()
      {
        d.unregisterNetworkCallback(localObject);
      }
    }
    
    public final class b
      implements Runnable
    {
      public b(a.a.d paramd) {}
      
      public final void run()
      {
        c.unregisterReceiver(localObject);
      }
    }
    
    public final class c
      extends ConnectivityManager.NetworkCallback
    {
      public c() {}
      
      public final void onAvailable(Network paramNetwork)
      {
        b.D();
      }
      
      public final void onBlockedStatusChanged(Network paramNetwork, boolean paramBoolean)
      {
        if (!paramBoolean) {
          b.D();
        }
      }
    }
    
    public final class d
      extends BroadcastReceiver
    {
      public boolean a = false;
      
      public d() {}
      
      public final void onReceive(Context paramContext, Intent paramIntent)
      {
        paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean bool1 = a;
        boolean bool2;
        if ((paramContext != null) && (paramContext.isConnected())) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        a = bool2;
        if ((bool2) && (!bool1)) {
          b.D();
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     fb.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
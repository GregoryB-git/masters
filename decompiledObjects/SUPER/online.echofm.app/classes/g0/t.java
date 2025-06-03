package g0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyCallback.DisplayInfoListener;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class t
{
  public static t e;
  public final Handler a = new Handler(Looper.getMainLooper());
  public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
  public final Object c = new Object();
  public int d = 0;
  
  public t(Context paramContext)
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    paramContext.registerReceiver(new d(null), localIntentFilter);
  }
  
  public static t d(Context paramContext)
  {
    try
    {
      if (e == null)
      {
        t localt = new g0/t;
        localt.<init>(paramContext);
        e = localt;
      }
    }
    finally
    {
      break label38;
    }
    paramContext = e;
    return paramContext;
    label38:
    throw paramContext;
  }
  
  public static int e(NetworkInfo paramNetworkInfo)
  {
    switch (paramNetworkInfo.getSubtype())
    {
    case 16: 
    case 19: 
    default: 
      return 6;
    case 20: 
      int i;
      if (M.a >= 29) {
        i = 9;
      } else {
        i = 0;
      }
      return i;
    case 18: 
      return 2;
    case 13: 
      return 5;
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 14: 
    case 15: 
    case 17: 
      return 4;
    }
    return 3;
  }
  
  public static int g(Context paramContext)
  {
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    int i = 0;
    if (paramContext == null) {
      return 0;
    }
    try
    {
      paramContext = paramContext.getActiveNetworkInfo();
      int j = 1;
      i = j;
      if (paramContext != null) {
        if (!paramContext.isConnected())
        {
          i = j;
        }
        else
        {
          i = paramContext.getType();
          if (i != 0) {
            if (i != 1)
            {
              if ((i != 4) && (i != 5))
              {
                if (i != 6)
                {
                  if (i != 9) {
                    return 8;
                  }
                  return 7;
                }
                return 5;
              }
            }
            else {
              return 2;
            }
          }
          return e(paramContext);
        }
      }
    }
    catch (SecurityException paramContext)
    {
      for (;;) {}
    }
    return i;
  }
  
  public int f()
  {
    synchronized (c)
    {
      int i = d;
      return i;
    }
  }
  
  public void i(c paramc)
  {
    j();
    b.add(new WeakReference(paramc));
    a.post(new s(this, paramc));
  }
  
  public final void j()
  {
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if (localWeakReference.get() == null) {
        b.remove(localWeakReference);
      }
    }
  }
  
  public final void k(int paramInt)
  {
    Iterator localIterator;
    WeakReference localWeakReference;
    synchronized (c)
    {
      if (d == paramInt) {
        return;
      }
    }
  }
  
  public static final abstract class b
  {
    public static void a(Context paramContext, t paramt)
    {
      try
      {
        TelephonyManager localTelephonyManager = (TelephonyManager)a.e((TelephonyManager)paramContext.getSystemService("phone"));
        a locala = new g0/t$b$a;
        locala.<init>(paramt);
        v.a(localTelephonyManager, u.a(paramContext), locala);
        w.a(localTelephonyManager, locala);
      }
      catch (RuntimeException paramContext)
      {
        t.c(paramt, 5);
      }
    }
    
    public static final class a
      extends TelephonyCallback
      implements TelephonyCallback.DisplayInfoListener
    {
      public final t a;
      
      public a(t paramt)
      {
        a = paramt;
      }
      
      public void onDisplayInfoChanged(TelephonyDisplayInfo paramTelephonyDisplayInfo)
      {
        int i = x.a(paramTelephonyDisplayInfo);
        int j = 5;
        if ((i != 3) && (i != 4) && (i != 5)) {
          i = 0;
        } else {
          i = 1;
        }
        paramTelephonyDisplayInfo = a;
        if (i != 0) {
          j = 10;
        }
        t.c(paramTelephonyDisplayInfo, j);
      }
    }
  }
  
  public static abstract interface c
  {
    public abstract void a(int paramInt);
  }
  
  public final class d
    extends BroadcastReceiver
  {
    public d() {}
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      int i = t.b(paramContext);
      if ((M.a >= 31) && (i == 5)) {
        t.b.a(paramContext, t.this);
      } else {
        t.c(t.this, i);
      }
    }
  }
}

/* Location:
 * Qualified Name:     g0.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
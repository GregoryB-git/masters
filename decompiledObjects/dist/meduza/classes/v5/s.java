package v5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.b;
import android.telephony.TelephonyManager;
import e0.h0;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class s
{
  public static s e;
  public final Handler a = new Handler(Looper.getMainLooper());
  public final CopyOnWriteArrayList<WeakReference<a>> b = new CopyOnWriteArrayList();
  public final Object c = new Object();
  public int d = 0;
  
  public s(Context paramContext)
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    paramContext.registerReceiver(new b(), localIntentFilter);
  }
  
  public static void a(s params, int paramInt)
  {
    synchronized (c)
    {
      if (d != paramInt)
      {
        d = paramInt;
        Iterator localIterator = b.iterator();
        while (localIterator.hasNext())
        {
          WeakReference localWeakReference = (WeakReference)localIterator.next();
          ??? = (a)localWeakReference.get();
          if (??? != null) {
            ((a)???).a(paramInt);
          } else {
            b.remove(localWeakReference);
          }
        }
      }
      return;
    }
  }
  
  public static s b(Context paramContext)
  {
    try
    {
      if (e == null)
      {
        s locals = new v5/s;
        locals.<init>(paramContext);
        e = locals;
      }
      paramContext = e;
      return paramContext;
    }
    finally {}
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt);
  }
  
  public final class b
    extends BroadcastReceiver
  {
    public b() {}
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      paramIntent = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (paramIntent != null) {}
      try
      {
        paramIntent = paramIntent.getActiveNetworkInfo();
        int i = 1;
        j = i;
        if (paramIntent == null) {
          break label249;
        }
        if (!paramIntent.isConnected())
        {
          j = i;
        }
        else
        {
          j = paramIntent.getType();
          if (j != 0)
          {
            if (j == 1) {
              break label222;
            }
            if ((j != 4) && (j != 5))
            {
              if (j == 6) {
                break label228;
              }
              if (j != 9)
              {
                j = 8;
                break label249;
              }
              j = 7;
              break label249;
            }
          }
          switch (paramIntent.getSubtype())
          {
          case 16: 
          case 19: 
          default: 
            j = 6;
            break;
          case 20: 
            if (e0.a >= 29) {
              j = 9;
            }
            break;
          case 18: 
            j = 2;
            break;
          case 13: 
            j = 5;
            break;
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
            j = 4;
            break;
          case 1: 
          case 2: 
            label222:
            label228:
            j = 3;
          }
        }
      }
      catch (SecurityException paramIntent)
      {
        int j;
        label249:
        for (;;) {}
      }
      j = 0;
      if ((e0.a >= 31) && (j == 5))
      {
        paramIntent = s.this;
        try
        {
          TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
          localTelephonyManager.getClass();
          r localr = new v5/r;
          localr.<init>(paramIntent);
          h0.h(localTelephonyManager, b.g(paramContext), localr);
          a4.r.f(localTelephonyManager, localr);
        }
        catch (RuntimeException paramContext)
        {
          s.a(paramIntent, 5);
        }
      }
      else
      {
        s.a(s.this, j);
      }
    }
  }
}

/* Location:
 * Qualified Name:     v5.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
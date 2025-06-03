package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.Collection;
import java.util.Iterator;

public final class n
{
  @SuppressLint({"StaticFieldLeak"})
  private static n a = new n();
  private Context b;
  private BroadcastReceiver c;
  private boolean d;
  private boolean e;
  private p f;
  
  public static n a()
  {
    return a;
  }
  
  private final void a(boolean paramBoolean)
  {
    if (e != paramBoolean)
    {
      e = paramBoolean;
      if (d)
      {
        e();
        p localp = f;
        if (localp != null) {
          localp.a(d());
        }
      }
    }
  }
  
  private final void e()
  {
    boolean bool = e;
    Iterator localIterator = k.a().b().iterator();
    while (localIterator.hasNext())
    {
      w localw = ((e)localIterator.next()).e();
      if (localw.d())
      {
        String str;
        if ((bool ^ true)) {
          str = "foregrounded";
        } else {
          str = "backgrounded";
        }
        r.a().a(localw.c(), "setState", new Object[] { str });
      }
    }
  }
  
  public final void a(Context paramContext)
  {
    b = paramContext.getApplicationContext();
  }
  
  public final void a(p paramp)
  {
    f = paramp;
  }
  
  public final void b()
  {
    c = new m(this);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
    localIntentFilter.addAction("android.intent.action.SCREEN_ON");
    localIntentFilter.addAction("android.intent.action.USER_PRESENT");
    b.registerReceiver(c, localIntentFilter);
    d = true;
    e();
  }
  
  public final void c()
  {
    Context localContext = b;
    if (localContext != null)
    {
      BroadcastReceiver localBroadcastReceiver = c;
      if (localBroadcastReceiver != null)
      {
        localContext.unregisterReceiver(localBroadcastReceiver);
        c = null;
      }
    }
    d = false;
    e = false;
    f = null;
  }
  
  public final boolean d()
  {
    return !e;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
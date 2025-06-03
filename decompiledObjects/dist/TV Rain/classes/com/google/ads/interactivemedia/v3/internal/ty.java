package com.google.ads.interactivemedia.v3.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

final class ty
  extends BroadcastReceiver
{
  private static ty a;
  private final Handler b = new Handler(Looper.getMainLooper());
  private final ArrayList<WeakReference<tw>> c = new ArrayList();
  
  public static ty a(Context paramContext)
  {
    try
    {
      if (a == null)
      {
        Object localObject = new com/google/ads/interactivemedia/v3/internal/ty;
        ((ty)localObject).<init>();
        a = (ty)localObject;
        localObject = new android/content/IntentFilter;
        ((IntentFilter)localObject).<init>();
        ((IntentFilter)localObject).addAction("android.net.conn.CONNECTIVITY_CHANGE");
        paramContext.registerReceiver(a, (IntentFilter)localObject);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  private final void a()
  {
    for (int i = c.size() - 1; i >= 0; i--) {
      if ((tw)((WeakReference)c.get(i)).get() == null) {
        c.remove(i);
      }
    }
  }
  
  public final void a(tw paramtw)
  {
    try
    {
      a();
      Object localObject1 = c;
      Object localObject2 = new java/lang/ref/WeakReference;
      ((WeakReference)localObject2).<init>(paramtw);
      ((ArrayList)localObject1).add(localObject2);
      localObject2 = b;
      localObject1 = new com/google/ads/interactivemedia/v3/internal/ub;
      ((ub)localObject1).<init>(this, paramtw);
      ((Handler)localObject2).post((Runnable)localObject1);
      return;
    }
    finally
    {
      paramtw = finally;
      throw paramtw;
    }
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      boolean bool = isInitialStickyBroadcast();
      if (bool) {
        return;
      }
      a();
      for (int i = 0; i < c.size(); i++)
      {
        paramContext = (tw)((WeakReference)c.get(i)).get();
        if (paramContext != null) {
          tw.a(paramContext);
        }
      }
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ty
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.firebase.messaging;

import U2.a;
import V2.j;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

public abstract class j0
{
  public static final long a = TimeUnit.MINUTES.toMillis(1L);
  public static final Object b = new Object();
  public static a c;
  
  public static void b(Context paramContext)
  {
    if (c == null)
    {
      paramContext = new a(paramContext, 1, "wake:com.google.firebase.iid.WakeLockHolder");
      c = paramContext;
      paramContext.d(true);
    }
  }
  
  public static void c(Intent paramIntent)
  {
    synchronized (b)
    {
      if ((c != null) && (d(paramIntent)))
      {
        g(paramIntent, false);
        c.c();
      }
    }
  }
  
  public static boolean d(Intent paramIntent)
  {
    return paramIntent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
  }
  
  public static void f(Context paramContext, o0 paramo0, Intent paramIntent)
  {
    synchronized (b)
    {
      b(paramContext);
      boolean bool = d(paramIntent);
      g(paramIntent, true);
      if (!bool) {
        c.a(a);
      }
    }
    paramo0 = paramo0.c(paramIntent);
    paramContext = new com/google/firebase/messaging/i0;
    paramContext.<init>(paramIntent);
    paramo0.b(paramContext);
  }
  
  public static void g(Intent paramIntent, boolean paramBoolean)
  {
    paramIntent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", paramBoolean);
  }
  
  public static ComponentName h(Context paramContext, Intent paramIntent)
  {
    boolean bool;
    synchronized (b)
    {
      b(paramContext);
      bool = d(paramIntent);
      g(paramIntent, true);
      paramContext = paramContext.startService(paramIntent);
      if (paramContext == null) {
        return null;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.j0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
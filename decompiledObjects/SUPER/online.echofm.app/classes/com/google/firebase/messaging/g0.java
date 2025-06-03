package com.google.firebase.messaging;

import V2.j;
import V2.k;
import V2.m;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t.a;

public class g0
{
  public static final long i = TimeUnit.HOURS.toSeconds(8L);
  public final Context a;
  public final K b;
  public final F c;
  public final FirebaseMessaging d;
  public final Map e = new a();
  public final ScheduledExecutorService f;
  public boolean g = false;
  public final e0 h;
  
  public g0(FirebaseMessaging paramFirebaseMessaging, K paramK, e0 parame0, F paramF, Context paramContext, ScheduledExecutorService paramScheduledExecutorService)
  {
    d = paramFirebaseMessaging;
    b = paramK;
    h = parame0;
    c = paramF;
    a = paramContext;
    f = paramScheduledExecutorService;
  }
  
  public static void c(j paramj)
  {
    try
    {
      m.b(paramj, 30L, TimeUnit.SECONDS);
      return;
    }
    catch (TimeoutException paramj) {}catch (InterruptedException paramj) {}catch (ExecutionException localExecutionException) {}
    throw new IOException("SERVICE_NOT_AVAILABLE", paramj);
    paramj = localExecutionException.getCause();
    if (!(paramj instanceof IOException))
    {
      if ((paramj instanceof RuntimeException)) {
        throw ((RuntimeException)paramj);
      }
      throw new IOException(localExecutionException);
    }
    throw ((IOException)paramj);
  }
  
  public static j f(FirebaseMessaging paramFirebaseMessaging, K paramK, F paramF, Context paramContext, ScheduledExecutorService paramScheduledExecutorService)
  {
    return m.c(paramScheduledExecutorService, new f0(paramContext, paramScheduledExecutorService, paramFirebaseMessaging, paramK, paramF));
  }
  
  public static boolean h()
  {
    boolean bool;
    if ((!Log.isLoggable("FirebaseMessaging", 3)) && ((Build.VERSION.SDK_INT != 23) || (!Log.isLoggable("FirebaseMessaging", 3)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final void b(d0 paramd0, k paramk)
  {
    String str;
    synchronized (e)
    {
      str = paramd0.e();
      if (e.containsKey(str)) {
        paramd0 = (ArrayDeque)e.get(str);
      }
    }
    paramd0 = new java/util/ArrayDeque;
    paramd0.<init>();
    e.put(str, paramd0);
    paramd0.add(paramk);
  }
  
  public final void d(String paramString)
  {
    c(c.l(d.n(), paramString));
  }
  
  public final void e(String paramString)
  {
    c(c.m(d.n(), paramString));
  }
  
  public boolean g()
  {
    boolean bool;
    if (h.c() != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean i()
  {
    try
    {
      boolean bool = g;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void k(d0 paramd0)
  {
    ArrayDeque localArrayDeque;
    k localk;
    synchronized (e)
    {
      paramd0 = paramd0.e();
      if (!e.containsKey(paramd0)) {
        return;
      }
    }
  }
  
  public boolean l(d0 paramd0)
  {
    int j;
    try
    {
      String str = paramd0.b();
      j = str.hashCode();
      if (j != 83)
      {
        if ((j != 85) || (!str.equals("U"))) {
          break label61;
        }
        j = 1;
      }
    }
    catch (IOException localIOException)
    {
      break label229;
    }
    boolean bool = localIOException.equals("S");
    if (bool) {
      j = 0;
    } else {
      label61:
      j = -1;
    }
    StringBuilder localStringBuilder;
    if (j != 0) {
      if (j != 1)
      {
        if (!h()) {
          break label227;
        }
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Unknown topic operation");
        localStringBuilder.append(paramd0);
        localStringBuilder.append(".");
        paramd0 = localStringBuilder.toString();
      }
    }
    for (;;)
    {
      Log.d("FirebaseMessaging", paramd0);
      break;
      e(paramd0.c());
      if (!h()) {
        break;
      }
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Unsubscribe from topic: ");
      localStringBuilder.append(paramd0.c());
      localStringBuilder.append(" succeeded.");
      paramd0 = localStringBuilder.toString();
      continue;
      d(paramd0.c());
      if (!h()) {
        break;
      }
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Subscribe to topic: ");
      localStringBuilder.append(paramd0.c());
      localStringBuilder.append(" succeeded.");
      paramd0 = localStringBuilder.toString();
    }
    label227:
    return true;
    label229:
    if ((!"SERVICE_NOT_AVAILABLE".equals(localStringBuilder.getMessage())) && (!"INTERNAL_SERVER_ERROR".equals(localStringBuilder.getMessage()))) {
      if (localStringBuilder.getMessage() != null) {}
    }
    for (paramd0 = "Topic operation failed without exception message. Will retry Topic operation.";; paramd0 = paramd0.toString())
    {
      Log.e("FirebaseMessaging", paramd0);
      return false;
      throw localStringBuilder;
      paramd0 = new StringBuilder();
      paramd0.append("Topic operation failed: ");
      paramd0.append(localStringBuilder.getMessage());
      paramd0.append(". Will retry Topic operation.");
    }
  }
  
  public void m(Runnable paramRunnable, long paramLong)
  {
    f.schedule(paramRunnable, paramLong, TimeUnit.SECONDS);
  }
  
  public j n(d0 paramd0)
  {
    h.a(paramd0);
    k localk = new k();
    b(paramd0, localk);
    return localk.a();
  }
  
  public void o(boolean paramBoolean)
  {
    try
    {
      g = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void p()
  {
    if (!i()) {
      t(0L);
    }
  }
  
  public void q()
  {
    if (g()) {
      p();
    }
  }
  
  public j r(String paramString)
  {
    paramString = n(d0.f(paramString));
    q();
    return paramString;
  }
  
  public boolean s()
  {
    for (;;)
    {
      try
      {
        d0 locald01 = h.c();
        if (locald01 != null) {
          break label40;
        }
        if (h()) {
          Log.d("FirebaseMessaging", "topic sync succeeded");
        }
      }
      finally
      {
        break;
      }
      return true;
      label40:
      if (!l(locald02)) {
        return false;
      }
      h.e(locald02);
      k(locald02);
    }
    throw locald02;
  }
  
  public void t(long paramLong)
  {
    long l = Math.min(Math.max(30L, 2L * paramLong), i);
    m(new h0(this, a, b, l), paramLong);
    o(true);
  }
  
  public j u(String paramString)
  {
    paramString = n(d0.g(paramString));
    q();
    return paramString;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
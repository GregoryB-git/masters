package com.google.firebase.analytics;

import A2.n;
import R2.m4;
import V2.j;
import V2.m;
import android.app.Activity;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.J0;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s4.h;
import v3.a;
import v3.b;
import v3.c;
import v3.d;

public final class FirebaseAnalytics
{
  public static volatile FirebaseAnalytics c;
  public final J0 a;
  public ExecutorService b;
  
  public FirebaseAnalytics(J0 paramJ0)
  {
    n.i(paramJ0);
    a = paramJ0;
  }
  
  @Keep
  @NonNull
  public static FirebaseAnalytics getInstance(@NonNull Context paramContext)
  {
    if (c == null)
    {
      try
      {
        if (c == null)
        {
          paramContext = J0.e(paramContext);
          FirebaseAnalytics localFirebaseAnalytics = new com/google/firebase/analytics/FirebaseAnalytics;
          localFirebaseAnalytics.<init>(paramContext);
          c = localFirebaseAnalytics;
        }
      }
      finally
      {
        break label46;
      }
      break label51;
      label46:
      throw paramContext;
    }
    label51:
    return c;
  }
  
  @Keep
  public static m4 getScionFrontendApiImplementation(Context paramContext, Bundle paramBundle)
  {
    paramContext = J0.f(paramContext, null, null, null, paramBundle);
    if (paramContext == null) {
      return null;
    }
    return new c(paramContext);
  }
  
  public final j a()
  {
    try
    {
      Object localObject = l();
      a locala = new v3/a;
      locala.<init>(this);
      localObject = m.c((Executor)localObject, locala);
      return (j)localObject;
    }
    catch (RuntimeException localRuntimeException)
    {
      a.i(5, "Failed to schedule task for getAppInstanceId", null, null, null);
      return m.d(localRuntimeException);
    }
  }
  
  public final j b()
  {
    try
    {
      ExecutorService localExecutorService = l();
      Object localObject = new v3/d;
      ((d)localObject).<init>(this);
      localObject = m.c(localExecutorService, (Callable)localObject);
      return (j)localObject;
    }
    catch (RuntimeException localRuntimeException)
    {
      a.i(5, "Failed to schedule task for getSessionId", null, null, null);
      return m.d(localRuntimeException);
    }
  }
  
  public final void c(String paramString, Bundle paramBundle)
  {
    a.t(paramString, paramBundle);
  }
  
  public final void d()
  {
    a.R();
  }
  
  public final void e(boolean paramBoolean)
  {
    a.r(Boolean.valueOf(paramBoolean));
  }
  
  public final void f(Map paramMap)
  {
    Bundle localBundle = new Bundle();
    a locala = (a)paramMap.get(b.o);
    int i;
    if (locala != null)
    {
      i = locala.ordinal();
      if (i != 0)
      {
        if (i == 1) {
          localBundle.putString("ad_storage", "denied");
        }
      }
      else {
        localBundle.putString("ad_storage", "granted");
      }
    }
    locala = (a)paramMap.get(b.p);
    if (locala != null)
    {
      i = locala.ordinal();
      if (i != 0)
      {
        if (i == 1) {
          localBundle.putString("analytics_storage", "denied");
        }
      }
      else {
        localBundle.putString("analytics_storage", "granted");
      }
    }
    locala = (a)paramMap.get(b.q);
    if (locala != null)
    {
      i = locala.ordinal();
      if (i != 0)
      {
        if (i == 1) {
          localBundle.putString("ad_user_data", "denied");
        }
      }
      else {
        localBundle.putString("ad_user_data", "granted");
      }
    }
    paramMap = (a)paramMap.get(b.r);
    if (paramMap != null)
    {
      i = paramMap.ordinal();
      if (i != 0)
      {
        if (i == 1) {
          localBundle.putString("ad_personalization", "denied");
        }
      }
      else {
        localBundle.putString("ad_personalization", "granted");
      }
    }
    a.G(localBundle);
  }
  
  public final void g(Bundle paramBundle)
  {
    a.K(paramBundle);
  }
  
  @Keep
  @NonNull
  public final String getFirebaseInstanceId()
  {
    try
    {
      try
      {
        String str = (String)m.b(h.t().a(), 30000L, TimeUnit.MILLISECONDS);
        return str;
      }
      catch (InterruptedException localInterruptedException) {}catch (ExecutionException localExecutionException) {}
      throw new IllegalStateException(localExecutionException);
    }
    catch (TimeoutException localTimeoutException)
    {
      throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
    }
    throw new IllegalStateException(localTimeoutException.getCause());
  }
  
  public final void h(long paramLong)
  {
    a.j(paramLong);
  }
  
  public final void i(String paramString)
  {
    a.L(paramString);
  }
  
  public final void j(String paramString1, String paramString2)
  {
    a.C(paramString1, paramString2);
  }
  
  public final ExecutorService l()
  {
    try
    {
      if (b == null)
      {
        b localb = new v3/b;
        TimeUnit localTimeUnit = TimeUnit.SECONDS;
        ArrayBlockingQueue localArrayBlockingQueue = new java/util/concurrent/ArrayBlockingQueue;
        localArrayBlockingQueue.<init>(100);
        localb.<init>(this, 0, 1, 30L, localTimeUnit, localArrayBlockingQueue);
        b = localb;
      }
    }
    finally
    {
      break label62;
    }
    ExecutorService localExecutorService = b;
    return localExecutorService;
    label62:
    throw localExecutorService;
  }
  
  @Deprecated
  @Keep
  public final void setCurrentScreen(@NonNull Activity paramActivity, String paramString1, String paramString2)
  {
    a.l(paramActivity, paramString1, paramString2);
  }
  
  public static enum a
  {
    static
    {
      a locala1 = new a("GRANTED", 0);
      o = locala1;
      a locala2 = new a("DENIED", 1);
      p = locala2;
      q = new a[] { locala1, locala2 };
    }
  }
  
  public static enum b
  {
    static
    {
      b localb1 = new b("AD_STORAGE", 0);
      o = localb1;
      b localb2 = new b("ANALYTICS_STORAGE", 1);
      p = localb2;
      b localb3 = new b("AD_USER_DATA", 2);
      q = localb3;
      b localb4 = new b("AD_PERSONALIZATION", 3);
      r = localb4;
      s = new b[] { localb1, localb2, localb3, localb4 };
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.analytics.FirebaseAnalytics
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
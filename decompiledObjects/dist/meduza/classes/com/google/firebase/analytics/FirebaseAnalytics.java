package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.tasks.Tasks;
import e7.j4;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m6.j;
import u7.f;
import u9.d;
import v7.b;

public final class FirebaseAnalytics
{
  public static volatile FirebaseAnalytics c;
  public final zzed a;
  public b b;
  
  public FirebaseAnalytics(zzed paramzzed)
  {
    j.i(paramzzed);
    a = paramzzed;
  }
  
  public static FirebaseAnalytics getInstance(Context paramContext)
  {
    if (c == null) {
      try
      {
        if (c == null)
        {
          zzed localzzed = zzed.zza(paramContext);
          paramContext = new com/google/firebase/analytics/FirebaseAnalytics;
          paramContext.<init>(localzzed);
          c = paramContext;
        }
      }
      finally {}
    }
    return c;
  }
  
  public static j4 getScionFrontendApiImplementation(Context paramContext, Bundle paramBundle)
  {
    paramContext = zzed.zza(paramContext, null, null, null, paramBundle);
    if (paramContext == null) {
      return null;
    }
    return new v7.c(paramContext);
  }
  
  public final void a(HashMap paramHashMap)
  {
    Bundle localBundle = new Bundle();
    a locala = (a)paramHashMap.get(b.a);
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
    locala = (a)paramHashMap.get(b.b);
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
    locala = (a)paramHashMap.get(b.c);
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
    paramHashMap = (a)paramHashMap.get(b.d);
    if (paramHashMap != null)
    {
      i = paramHashMap.ordinal();
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
    a.zzc(localBundle);
  }
  
  public final ExecutorService b()
  {
    try
    {
      if (b == null)
      {
        localb = new v7/b;
        TimeUnit localTimeUnit = TimeUnit.SECONDS;
        ArrayBlockingQueue localArrayBlockingQueue = new java/util/concurrent/ArrayBlockingQueue;
        localArrayBlockingQueue.<init>(100);
        localb.<init>(localTimeUnit, localArrayBlockingQueue);
        b = localb;
      }
      b localb = b;
      return localb;
    }
    finally {}
  }
  
  public final String getFirebaseInstanceId()
  {
    try
    {
      try
      {
        Object localObject = u9.c.m;
        localObject = (String)Tasks.await(((u9.c)f.e().c(d.class)).getId(), 30000L, TimeUnit.MILLISECONDS);
        return (String)localObject;
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
  
  @Deprecated
  public final void setCurrentScreen(Activity paramActivity, String paramString1, String paramString2)
  {
    a.zza(paramActivity, paramString1, paramString2);
  }
  
  public static enum a
  {
    static
    {
      a locala1 = new a("GRANTED", 0);
      a = locala1;
      a locala2 = new a("DENIED", 1);
      b = locala2;
      c = new a[] { locala1, locala2 };
    }
    
    public a() {}
  }
  
  public static enum b
  {
    static
    {
      b localb1 = new b("AD_STORAGE", 0);
      a = localb1;
      b localb2 = new b("ANALYTICS_STORAGE", 1);
      b = localb2;
      b localb3 = new b("AD_USER_DATA", 2);
      c = localb3;
      b localb4 = new b("AD_PERSONALIZATION", 3);
      d = localb4;
      e = new b[] { localb1, localb2, localb3, localb4 };
    }
    
    public b() {}
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.analytics.FirebaseAnalytics
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
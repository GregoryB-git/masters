package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

public final class e0
{
  public static WeakReference d;
  public final SharedPreferences a;
  public a0 b;
  public final Executor c;
  
  public e0(SharedPreferences paramSharedPreferences, Executor paramExecutor)
  {
    c = paramExecutor;
    a = paramSharedPreferences;
  }
  
  public static e0 b(Context paramContext, Executor paramExecutor)
  {
    try
    {
      localObject1 = d;
      if (localObject1 != null) {
        localObject1 = (e0)((Reference)localObject1).get();
      }
    }
    finally
    {
      break label74;
    }
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      paramContext = paramContext.getSharedPreferences("com.google.android.gms.appid", 0);
      localObject2 = new com/google/firebase/messaging/e0;
      ((e0)localObject2).<init>(paramContext, paramExecutor);
      ((e0)localObject2).d();
      paramContext = new java/lang/ref/WeakReference;
      paramContext.<init>(localObject2);
      d = paramContext;
    }
    return (e0)localObject2;
    label74:
    throw paramContext;
  }
  
  public boolean a(d0 paramd0)
  {
    try
    {
      boolean bool = b.b(paramd0.e());
      return bool;
    }
    finally
    {
      paramd0 = finally;
      throw paramd0;
    }
  }
  
  public d0 c()
  {
    try
    {
      d0 locald0 = d0.a(b.f());
      return locald0;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void d()
  {
    try
    {
      b = a0.d(a, "topic_operation_queue", ",", c);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean e(d0 paramd0)
  {
    try
    {
      boolean bool = b.g(paramd0.e());
      return bool;
    }
    finally
    {
      paramd0 = finally;
      throw paramd0;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
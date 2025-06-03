package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import t.a;

public final class b3
  implements E2
{
  public static final Map g = new a();
  public final SharedPreferences a;
  public final Runnable b;
  public final SharedPreferences.OnSharedPreferenceChangeListener c;
  public final Object d;
  public volatile Map e;
  public final List f;
  
  public b3(SharedPreferences paramSharedPreferences, Runnable paramRunnable)
  {
    e3 locale3 = new e3(this);
    c = locale3;
    d = new Object();
    f = new ArrayList();
    a = paramSharedPreferences;
    b = paramRunnable;
    paramSharedPreferences.registerOnSharedPreferenceChangeListener(locale3);
  }
  
  public static SharedPreferences a(Context paramContext, String paramString)
  {
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.allowThreadDiskReads();
    Context localContext;
    try
    {
      if (!paramString.startsWith("direct_boot:")) {
        break label51;
      }
      localContext = paramContext;
      if (z2.a()) {
        localContext = N2.a(paramContext);
      }
    }
    finally
    {
      break label64;
    }
    paramContext = localContext.getSharedPreferences(paramString.substring(12), 0);
    StrictMode.setThreadPolicy(localThreadPolicy);
    return paramContext;
    label51:
    paramContext = paramContext.getSharedPreferences(paramString, 0);
    StrictMode.setThreadPolicy(localThreadPolicy);
    return paramContext;
    label64:
    StrictMode.setThreadPolicy(localThreadPolicy);
    throw paramContext;
  }
  
  public static b3 b(Context paramContext, String paramString, Runnable paramRunnable)
  {
    if ((z2.a()) && (!paramString.startsWith("direct_boot:")) && (!z2.c(paramContext))) {
      return null;
    }
    b3 localb32;
    try
    {
      Map localMap = g;
      b3 localb31 = (b3)localMap.get(paramString);
      localb32 = localb31;
      if (localb31 == null)
      {
        localb32 = new com/google/android/gms/internal/measurement/b3;
        localb32.<init>(a(paramContext, paramString), paramRunnable);
        localMap.put(paramString, localb32);
      }
    }
    finally
    {
      break label91;
    }
    return localb32;
    label91:
    throw paramContext;
  }
  
  /* Error */
  public static void c()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 28	com/google/android/gms/internal/measurement/b3:g	Ljava/util/Map;
    //   6: invokeinterface 116 1 0
    //   11: invokeinterface 122 1 0
    //   16: astore_0
    //   17: aload_0
    //   18: invokeinterface 127 1 0
    //   23: ifeq +33 -> 56
    //   26: aload_0
    //   27: invokeinterface 131 1 0
    //   32: checkcast 2	com/google/android/gms/internal/measurement/b3
    //   35: astore_1
    //   36: aload_1
    //   37: getfield 47	com/google/android/gms/internal/measurement/b3:a	Landroid/content/SharedPreferences;
    //   40: aload_1
    //   41: getfield 38	com/google/android/gms/internal/measurement/b3:c	Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;
    //   44: invokeinterface 134 2 0
    //   49: goto -32 -> 17
    //   52: astore_0
    //   53: goto +15 -> 68
    //   56: getstatic 28	com/google/android/gms/internal/measurement/b3:g	Ljava/util/Map;
    //   59: invokeinterface 137 1 0
    //   64: ldc 2
    //   66: monitorexit
    //   67: return
    //   68: ldc 2
    //   70: monitorexit
    //   71: aload_0
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   16	11	0	localIterator	java.util.Iterator
    //   52	20	0	localObject	Object
    //   35	6	1	localb3	b3
    // Exception table:
    //   from	to	target	type
    //   3	17	52	finally
    //   17	49	52	finally
    //   56	64	52	finally
  }
  
  public final Object i(String paramString)
  {
    Object localObject1 = e;
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      Object localObject3 = d;
      try
      {
        localObject1 = e;
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject1 = StrictMode.allowThreadDiskReads();
        }
      }
      finally
      {
        try
        {
          localObject2 = a.getAll();
          e = ((Map)localObject2);
          StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)localObject1);
        }
        finally
        {
          StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)localObject1);
        }
        paramString = finally;
      }
      throw paramString;
    }
    if (localObject2 != null) {
      return ((Map)localObject2).get(paramString);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.b3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
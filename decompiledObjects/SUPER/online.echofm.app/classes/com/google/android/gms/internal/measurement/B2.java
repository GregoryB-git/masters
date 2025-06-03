package com.google.android.gms.internal.measurement;

import W2.m;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class B2
  implements E2
{
  public static final Map h = new t.a();
  public static final String[] i = { "key", "value" };
  public final ContentResolver a;
  public final Uri b;
  public final Runnable c;
  public final ContentObserver d;
  public final Object e;
  public volatile Map f;
  public final List g;
  
  public B2(ContentResolver paramContentResolver, Uri paramUri, Runnable paramRunnable)
  {
    D2 localD2 = new D2(this, null);
    d = localD2;
    e = new Object();
    g = new ArrayList();
    m.j(paramContentResolver);
    m.j(paramUri);
    a = paramContentResolver;
    b = paramUri;
    c = paramRunnable;
    paramContentResolver.registerContentObserver(paramUri, false, localD2);
  }
  
  /* Error */
  public static B2 a(ContentResolver paramContentResolver, Uri paramUri, Runnable paramRunnable)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 32	com/google/android/gms/internal/measurement/B2:h	Ljava/util/Map;
    //   6: astore_3
    //   7: aload_3
    //   8: aload_1
    //   9: invokeinterface 83 2 0
    //   14: checkcast 2	com/google/android/gms/internal/measurement/B2
    //   17: astore 4
    //   19: aload 4
    //   21: astore 5
    //   23: aload 4
    //   25: ifnonnull +33 -> 58
    //   28: new 2	com/google/android/gms/internal/measurement/B2
    //   31: astore 5
    //   33: aload 5
    //   35: aload_0
    //   36: aload_1
    //   37: aload_2
    //   38: invokespecial 85	com/google/android/gms/internal/measurement/B2:<init>	(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/Runnable;)V
    //   41: aload_3
    //   42: aload_1
    //   43: aload 5
    //   45: invokeinterface 89 3 0
    //   50: pop
    //   51: goto +7 -> 58
    //   54: astore_0
    //   55: goto +9 -> 64
    //   58: ldc 2
    //   60: monitorexit
    //   61: aload 5
    //   63: areturn
    //   64: ldc 2
    //   66: monitorexit
    //   67: aload_0
    //   68: athrow
    //   69: astore_0
    //   70: aload 4
    //   72: astore 5
    //   74: goto -16 -> 58
    //   77: astore_0
    //   78: goto -27 -> 51
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	paramContentResolver	ContentResolver
    //   0	81	1	paramUri	Uri
    //   0	81	2	paramRunnable	Runnable
    //   6	36	3	localMap	Map
    //   17	54	4	localB21	B2
    //   21	52	5	localB22	B2
    // Exception table:
    //   from	to	target	type
    //   3	19	54	finally
    //   28	41	54	finally
    //   41	51	54	finally
    //   58	61	54	finally
    //   64	67	54	finally
    //   28	41	69	java/lang/SecurityException
    //   41	51	77	java/lang/SecurityException
  }
  
  /* Error */
  public static void d()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 32	com/google/android/gms/internal/measurement/B2:h	Ljava/util/Map;
    //   6: invokeinterface 93 1 0
    //   11: invokeinterface 99 1 0
    //   16: astore_0
    //   17: aload_0
    //   18: invokeinterface 105 1 0
    //   23: ifeq +31 -> 54
    //   26: aload_0
    //   27: invokeinterface 109 1 0
    //   32: checkcast 2	com/google/android/gms/internal/measurement/B2
    //   35: astore_1
    //   36: aload_1
    //   37: getfield 65	com/google/android/gms/internal/measurement/B2:a	Landroid/content/ContentResolver;
    //   40: aload_1
    //   41: getfield 50	com/google/android/gms/internal/measurement/B2:d	Landroid/database/ContentObserver;
    //   44: invokevirtual 113	android/content/ContentResolver:unregisterContentObserver	(Landroid/database/ContentObserver;)V
    //   47: goto -30 -> 17
    //   50: astore_1
    //   51: goto +15 -> 66
    //   54: getstatic 32	com/google/android/gms/internal/measurement/B2:h	Ljava/util/Map;
    //   57: invokeinterface 116 1 0
    //   62: ldc 2
    //   64: monitorexit
    //   65: return
    //   66: ldc 2
    //   68: monitorexit
    //   69: aload_1
    //   70: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   16	11	0	localIterator	Iterator
    //   35	6	1	localB2	B2
    //   50	20	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   3	17	50	finally
    //   17	47	50	finally
    //   54	62	50	finally
  }
  
  public final Map b()
  {
    Map localMap1 = f;
    Map localMap2 = localMap1;
    if (localMap1 == null)
    {
      synchronized (e)
      {
        localMap1 = f;
        localMap2 = localMap1;
        if (localMap1 == null)
        {
          localMap2 = f();
          f = localMap2;
        }
      }
      break label55;
      throw localMap3;
    }
    label55:
    if (localMap3 != null) {
      return localMap3;
    }
    return Collections.emptyMap();
  }
  
  public final void e()
  {
    synchronized (e)
    {
      f = null;
      c.run();
      label62:
      try
      {
        Iterator localIterator = g.iterator();
        if (!localIterator.hasNext()) {
          return;
        }
      }
      finally
      {
        break label62;
        android.support.v4.media.a.a(((Iterator)localObject2).next());
        throw null;
      }
    }
  }
  
  /* Error */
  public final Map f()
  {
    // Byte code:
    //   0: invokestatic 177	android/os/StrictMode:allowThreadDiskReads	()Landroid/os/StrictMode$ThreadPolicy;
    //   3: astore_1
    //   4: new 179	com/google/android/gms/internal/measurement/A2
    //   7: astore_2
    //   8: aload_2
    //   9: aload_0
    //   10: invokespecial 182	com/google/android/gms/internal/measurement/A2:<init>	(Lcom/google/android/gms/internal/measurement/B2;)V
    //   13: aload_2
    //   14: invokestatic 187	com/google/android/gms/internal/measurement/H2:a	(Lcom/google/android/gms/internal/measurement/G2;)Ljava/lang/Object;
    //   17: checkcast 80	java/util/Map
    //   20: astore_2
    //   21: aload_1
    //   22: invokestatic 191	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   25: aload_2
    //   26: areturn
    //   27: astore_2
    //   28: goto +18 -> 46
    //   31: astore_2
    //   32: ldc -63
    //   34: ldc -61
    //   36: invokestatic 200	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   39: pop
    //   40: aload_1
    //   41: invokestatic 191	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   44: aconst_null
    //   45: areturn
    //   46: aload_1
    //   47: invokestatic 191	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   50: aload_2
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	this	B2
    //   3	44	1	localThreadPolicy	android.os.StrictMode.ThreadPolicy
    //   7	19	2	localObject1	Object
    //   27	1	2	localObject2	Object
    //   31	20	2	localSecurityException	SecurityException
    // Exception table:
    //   from	to	target	type
    //   4	21	27	finally
    //   32	40	27	finally
    //   4	21	31	java/lang/SecurityException
    //   4	21	31	android/database/sqlite/SQLiteException
    //   4	21	31	java/lang/IllegalStateException
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.B2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
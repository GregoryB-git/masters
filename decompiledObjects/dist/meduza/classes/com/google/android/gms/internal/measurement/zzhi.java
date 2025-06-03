package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r.b;

public final class zzhi
  implements zzhl
{
  private static final Map<Uri, zzhi> zza = new b();
  private static final String[] zzb = { "key", "value" };
  private final ContentResolver zzc;
  private final Uri zzd;
  private final Runnable zze;
  private final ContentObserver zzf;
  private final Object zzg;
  private volatile Map<String, String> zzh;
  private final List<zzhj> zzi;
  
  private zzhi(ContentResolver paramContentResolver, Uri paramUri, Runnable paramRunnable)
  {
    zzhk localzzhk = new zzhk(this, null);
    zzf = localzzhk;
    zzg = new Object();
    zzi = new ArrayList();
    paramContentResolver.getClass();
    paramUri.getClass();
    zzc = paramContentResolver;
    zzd = paramUri;
    zze = paramRunnable;
    paramContentResolver.registerContentObserver(paramUri, false, localzzhk);
  }
  
  /* Error */
  public static zzhi zza(ContentResolver paramContentResolver, Uri paramUri, Runnable paramRunnable)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 35	com/google/android/gms/internal/measurement/zzhi:zza	Ljava/util/Map;
    //   6: astore_3
    //   7: aload_3
    //   8: aload_1
    //   9: invokeinterface 85 2 0
    //   14: checkcast 2	com/google/android/gms/internal/measurement/zzhi
    //   17: astore 4
    //   19: aload 4
    //   21: astore 5
    //   23: aload 4
    //   25: ifnonnull +26 -> 51
    //   28: new 2	com/google/android/gms/internal/measurement/zzhi
    //   31: astore 5
    //   33: aload 5
    //   35: aload_0
    //   36: aload_1
    //   37: aload_2
    //   38: invokespecial 87	com/google/android/gms/internal/measurement/zzhi:<init>	(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/Runnable;)V
    //   41: aload_3
    //   42: aload_1
    //   43: aload 5
    //   45: invokeinterface 91 3 0
    //   50: pop
    //   51: ldc 2
    //   53: monitorexit
    //   54: aload 5
    //   56: areturn
    //   57: astore_0
    //   58: ldc 2
    //   60: monitorexit
    //   61: aload_0
    //   62: athrow
    //   63: astore_0
    //   64: aload 4
    //   66: astore 5
    //   68: goto -17 -> 51
    //   71: astore_0
    //   72: goto -21 -> 51
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	paramContentResolver	ContentResolver
    //   0	75	1	paramUri	Uri
    //   0	75	2	paramRunnable	Runnable
    //   6	36	3	localMap	Map
    //   17	48	4	localzzhi1	zzhi
    //   21	46	5	localzzhi2	zzhi
    // Exception table:
    //   from	to	target	type
    //   3	19	57	finally
    //   28	41	57	finally
    //   41	51	57	finally
    //   51	54	57	finally
    //   58	61	57	finally
    //   28	41	63	java/lang/SecurityException
    //   41	51	71	java/lang/SecurityException
  }
  
  public static void zzb()
  {
    try
    {
      Iterator localIterator = zza.values().iterator();
      while (localIterator.hasNext())
      {
        zzhi localzzhi = (zzhi)localIterator.next();
        zzc.unregisterContentObserver(zzf);
      }
      zza.clear();
      return;
    }
    finally {}
  }
  
  /* Error */
  private final Map<String, String> zze()
  {
    // Byte code:
    //   0: invokestatic 204	android/os/StrictMode:allowThreadDiskReads	()Landroid/os/StrictMode$ThreadPolicy;
    //   3: astore_1
    //   4: new 206	com/google/android/gms/internal/measurement/zzhh
    //   7: astore_2
    //   8: aload_2
    //   9: aload_0
    //   10: invokespecial 209	com/google/android/gms/internal/measurement/zzhh:<init>	(Lcom/google/android/gms/internal/measurement/zzhi;)V
    //   13: aload_2
    //   14: invokestatic 214	com/google/android/gms/internal/measurement/zzho:zza	(Lcom/google/android/gms/internal/measurement/zzhn;)Ljava/lang/Object;
    //   17: checkcast 81	java/util/Map
    //   20: astore_2
    //   21: aload_1
    //   22: invokestatic 218	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   25: aload_2
    //   26: areturn
    //   27: astore_2
    //   28: goto +31 -> 59
    //   31: astore_2
    //   32: goto +8 -> 40
    //   35: astore_2
    //   36: goto +4 -> 40
    //   39: astore_2
    //   40: ldc -126
    //   42: ldc -36
    //   44: aload_2
    //   45: invokestatic 194	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   48: pop
    //   49: invokestatic 143	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   52: astore_2
    //   53: aload_1
    //   54: invokestatic 218	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   57: aload_2
    //   58: areturn
    //   59: aload_1
    //   60: invokestatic 218	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   63: aload_2
    //   64: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	zzhi
    //   3	57	1	localThreadPolicy	android.os.StrictMode.ThreadPolicy
    //   7	19	2	localObject1	Object
    //   27	1	2	localObject2	Object
    //   31	1	2	localIllegalStateException	IllegalStateException
    //   35	1	2	localSQLiteException	android.database.sqlite.SQLiteException
    //   39	6	2	localSecurityException	SecurityException
    //   52	12	2	localMap	Map
    // Exception table:
    //   from	to	target	type
    //   4	21	27	finally
    //   40	53	27	finally
    //   4	21	31	java/lang/IllegalStateException
    //   4	21	35	android/database/sqlite/SQLiteException
    //   4	21	39	java/lang/SecurityException
  }
  
  public final Map<String, String> zza()
  {
    Map localMap1 = zzh;
    Map localMap2 = localMap1;
    if (localMap1 == null) {
      synchronized (zzg)
      {
        localMap1 = zzh;
        localMap2 = localMap1;
        if (localMap1 == null)
        {
          localMap2 = zze();
          zzh = localMap2;
        }
      }
    }
    if (localMap != null) {
      return localMap;
    }
    return Collections.emptyMap();
  }
  
  public final void zzc()
  {
    synchronized (zzg)
    {
      zzh = null;
      zze.run();
      try
      {
        Iterator localIterator = zzi.iterator();
        while (localIterator.hasNext()) {
          ((zzhj)localIterator.next()).zza();
        }
        return;
      }
      finally {}
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzhi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
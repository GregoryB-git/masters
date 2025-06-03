package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r.b;

public final class zzcg
  implements zzcl
{
  public static final String[] zza = { "key", "value" };
  private static final Map zzb = new b();
  private final ContentResolver zzc;
  private final Uri zzd;
  private final Runnable zze;
  private final ContentObserver zzf;
  private final Object zzg;
  private volatile Map zzh;
  private final List zzi;
  
  private zzcg(ContentResolver paramContentResolver, Uri paramUri, Runnable paramRunnable)
  {
    zzcf localzzcf = new zzcf(this, null);
    zzf = localzzcf;
    zzg = new Object();
    zzi = new ArrayList();
    paramContentResolver.getClass();
    paramUri.getClass();
    zzc = paramContentResolver;
    zzd = paramUri;
    zze = paramRunnable;
    paramContentResolver.registerContentObserver(paramUri, false, localzzcf);
  }
  
  /* Error */
  public static zzcg zza(ContentResolver paramContentResolver, Uri paramUri, Runnable paramRunnable)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 32	com/google/android/gms/internal/auth/zzcg:zzb	Ljava/util/Map;
    //   6: astore_3
    //   7: aload_3
    //   8: aload_1
    //   9: invokeinterface 82 2 0
    //   14: checkcast 2	com/google/android/gms/internal/auth/zzcg
    //   17: astore 4
    //   19: aload 4
    //   21: astore 5
    //   23: aload 4
    //   25: ifnonnull +26 -> 51
    //   28: new 2	com/google/android/gms/internal/auth/zzcg
    //   31: astore 5
    //   33: aload 5
    //   35: aload_0
    //   36: aload_1
    //   37: aload_2
    //   38: invokespecial 84	com/google/android/gms/internal/auth/zzcg:<init>	(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/Runnable;)V
    //   41: aload_3
    //   42: aload_1
    //   43: aload 5
    //   45: invokeinterface 88 3 0
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
    //   17	48	4	localzzcg1	zzcg
    //   21	46	5	localzzcg2	zzcg
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
  
  public static void zzd()
  {
    try
    {
      Iterator localIterator = zzb.values().iterator();
      while (localIterator.hasNext())
      {
        zzcg localzzcg = (zzcg)localIterator.next();
        zzc.unregisterContentObserver(zzf);
      }
      zzb.clear();
      return;
    }
    finally {}
  }
  
  public final void zze()
  {
    synchronized (zzg)
    {
      zzh = null;
      zzdc.zzc();
      try
      {
        ??? = zzi.iterator();
        while (((Iterator)???).hasNext()) {
          ((zzch)((Iterator)???).next()).zza();
        }
        return;
      }
      finally {}
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzcg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
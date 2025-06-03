package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build.VERSION;
import ec.i;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import rb.d;
import sb.u;
import sb.y;

public final class zzbe
{
  public zzbe()
  {
    new ConcurrentHashMap();
    zzb();
  }
  
  public static final Set zza(Context paramContext)
  {
    try
    {
      LinkedHashSet localLinkedHashSet = new java/util/LinkedHashSet;
      localLinkedHashSet.<init>();
      paramContext = paramContext.getSystemService("connectivity");
      i.c(paramContext, "null cannot be cast to non-null type android.net.ConnectivityManager");
      paramContext = (ConnectivityManager)paramContext;
      paramContext = paramContext.getNetworkCapabilities(paramContext.getActiveNetwork());
      if ((paramContext != null) && (paramContext.hasTransport(1) == true)) {
        localLinkedHashSet.add(zzqi.zzM);
      }
      if ((paramContext != null) && (paramContext.hasTransport(0) == true)) {
        localLinkedHashSet.add(zzqi.zzN);
      }
      if ((paramContext != null) && (paramContext.hasTransport(4) == true)) {
        localLinkedHashSet.add(zzqi.zzO);
      }
      if ((paramContext != null) && (paramContext.hasTransport(3) == true)) {
        localLinkedHashSet.add(zzqi.zzP);
      }
      if ((paramContext != null) && (paramContext.hasCapability(16) == true)) {
        localLinkedHashSet.add(zzqi.zzr);
      }
      return localLinkedHashSet;
    }
    catch (Exception paramContext) {}
    return u.a;
  }
  
  private static final Map zzb()
  {
    int i = 0;
    d locald1 = new d(Integer.valueOf(0), zzqi.zzb);
    d locald2 = new d(Integer.valueOf(1), zzqi.zzc);
    d locald3 = new d(Integer.valueOf(2), zzqi.zzd);
    d locald4 = new d(Integer.valueOf(3), zzqi.zze);
    d locald5 = new d(Integer.valueOf(4), zzqi.zzf);
    d locald6 = new d(Integer.valueOf(5), zzqi.zzg);
    d locald7 = new d(Integer.valueOf(6), zzqi.zzh);
    d locald8 = new d(Integer.valueOf(7), zzqi.zzi);
    d locald9 = new d(Integer.valueOf(8), zzqi.zzj);
    d locald10 = new d(Integer.valueOf(9), zzqi.zzk);
    d locald11 = new d(Integer.valueOf(10), zzqi.zzl);
    d locald12 = new d(Integer.valueOf(11), zzqi.zzm);
    d locald13 = new d(Integer.valueOf(12), zzqi.zzn);
    d locald14 = new d(Integer.valueOf(13), zzqi.zzo);
    d locald15 = new d(Integer.valueOf(14), zzqi.zzp);
    d locald16 = new d(Integer.valueOf(15), zzqi.zzq);
    LinkedHashMap localLinkedHashMap = new LinkedHashMap(y.H0(16));
    while (i < 16)
    {
      d locald17 = new d[] { locald1, locald2, locald3, locald4, locald5, locald6, locald7, locald8, locald9, locald10, locald11, locald12, locald13, locald14, locald15, locald16 }[i];
      localLinkedHashMap.put(a, b);
      i++;
    }
    i = Build.VERSION.SDK_INT;
    localLinkedHashMap.put(Integer.valueOf(17), zzqi.zzs);
    localLinkedHashMap.put(Integer.valueOf(16), zzqi.zzr);
    if (i >= 28)
    {
      localLinkedHashMap.put(Integer.valueOf(18), zzqi.zzt);
      localLinkedHashMap.put(Integer.valueOf(19), zzqi.zzu);
      localLinkedHashMap.put(Integer.valueOf(20), zzqi.zzv);
      localLinkedHashMap.put(Integer.valueOf(21), zzqi.zzw);
    }
    if (i >= 29) {
      localLinkedHashMap.put(Integer.valueOf(23), zzqi.zzy);
    }
    if (i >= 30) {
      localLinkedHashMap.put(Integer.valueOf(25), zzqi.zzA);
    }
    if (i >= 31)
    {
      localLinkedHashMap.put(Integer.valueOf(32), zzqi.zzH);
      localLinkedHashMap.put(Integer.valueOf(29), zzqi.zzE);
    }
    if (i >= 33)
    {
      localLinkedHashMap.put(Integer.valueOf(35), zzqi.zzK);
      localLinkedHashMap.put(Integer.valueOf(34), zzqi.zzJ);
      localLinkedHashMap.put(Integer.valueOf(33), zzqi.zzI);
    }
    return localLinkedHashMap;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzbe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
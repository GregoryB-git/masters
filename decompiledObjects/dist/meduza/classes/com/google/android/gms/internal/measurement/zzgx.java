package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzgx
  implements zzgy
{
  private final AtomicBoolean zza = new AtomicBoolean();
  private HashMap<String, String> zzb = null;
  private final HashMap<String, Boolean> zzc = new HashMap(16, 1.0F);
  private final HashMap<String, Integer> zzd = new HashMap(16, 1.0F);
  private final HashMap<String, Long> zze = new HashMap(16, 1.0F);
  private final HashMap<String, Float> zzf = new HashMap(16, 1.0F);
  private Object zzg = null;
  private boolean zzh = false;
  private String[] zzi = new String[0];
  private final zzhe zzj = new zzhc();
  
  public final String zza(ContentResolver paramContentResolver, String paramString1, String paramString2)
  {
    if (paramContentResolver != null)
    {
      Object localObject1;
      for (;;)
      {
        int i;
        Object localObject2;
        Object localObject3;
        try
        {
          localObject1 = zzb;
          i = 0;
          paramString2 = null;
          localObject2 = null;
          if (localObject1 == null)
          {
            zza.set(false);
            localObject1 = new java/util/HashMap;
            ((HashMap)localObject1).<init>(16, 1.0F);
            zzb = ((HashMap)localObject1);
            localObject1 = new java/lang/Object;
            localObject1.<init>();
            zzg = localObject1;
            localObject1 = zzgw.zza;
            localObject3 = new com/google/android/gms/internal/measurement/zzgz;
            ((zzgz)localObject3).<init>(this, null);
            paramContentResolver.registerContentObserver((Uri)localObject1, true, (ContentObserver)localObject3);
          }
          else if (zza.getAndSet(false))
          {
            zzb.clear();
            zzc.clear();
            zzd.clear();
            zze.clear();
            zzf.clear();
            localObject1 = new java/lang/Object;
            localObject1.<init>();
            zzg = localObject1;
            zzh = false;
          }
          localObject1 = zzg;
          if (zzb.containsKey(paramString1))
          {
            paramString1 = (String)zzb.get(paramString1);
            paramContentResolver = (ContentResolver)localObject2;
            if (paramString1 != null) {
              paramContentResolver = paramString1;
            }
            return paramContentResolver;
          }
          localObject2 = zzi;
          int j = localObject2.length;
          if (i < j) {
            if (paramString1.startsWith(localObject2[i])) {
              if (!zzh) {
                localObject3 = zzi;
              }
            }
          }
        }
        finally {}
        try
        {
          localObject2 = zzj;
          localObject1 = new com/google/android/gms/internal/measurement/zzha;
          ((zzha)localObject1).<init>();
          localObject2 = (HashMap)((zzhe)localObject2).zza(paramContentResolver, (String[])localObject3, (zzhb)localObject1);
          if (!((HashMap)localObject2).isEmpty())
          {
            paramContentResolver = ((HashMap)localObject2).keySet();
            paramContentResolver.removeAll(zzc.keySet());
            paramContentResolver.removeAll(zzd.keySet());
            paramContentResolver.removeAll(zze.keySet());
            paramContentResolver.removeAll(zzf.keySet());
          }
          if (!((HashMap)localObject2).isEmpty()) {
            if (zzb.isEmpty()) {
              zzb = ((HashMap)localObject2);
            } else {
              zzb.putAll((Map)localObject2);
            }
          }
          zzh = true;
        }
        catch (zzhd paramContentResolver)
        {
          continue;
        }
        if (zzb.containsKey(paramString1))
        {
          paramString1 = (String)zzb.get(paramString1);
          paramContentResolver = paramString2;
          if (paramString1 != null) {
            paramContentResolver = paramString1;
          }
          return paramContentResolver;
        }
        return null;
        i++;
      }
      try
      {
        paramString2 = zzj.zza(paramContentResolver, paramString1);
        paramContentResolver = paramString2;
        if (paramString2 != null)
        {
          paramContentResolver = paramString2;
          if (paramString2.equals(null)) {
            paramContentResolver = null;
          }
        }
        try
        {
          if (localObject1 == zzg) {
            zzb.put(paramString1, paramContentResolver);
          }
          if (paramContentResolver != null) {
            return paramContentResolver;
          }
          return null;
        }
        finally {}
        paramContentResolver = finally;
      }
      catch (zzhd paramContentResolver)
      {
        return null;
      }
    }
    throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
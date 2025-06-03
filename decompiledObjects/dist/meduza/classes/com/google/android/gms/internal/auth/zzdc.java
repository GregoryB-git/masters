package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zzdc
{
  private static final Object zza = new Object();
  private static volatile zzda zze;
  private static volatile boolean zzf = false;
  private static final AtomicReference zzg = new AtomicReference();
  private static final zzde zzh = new zzde(zzcu.zza);
  private static final AtomicInteger zzi = new AtomicInteger();
  public final zzcz zzb;
  public final String zzc;
  private final Object zzj;
  private volatile int zzk;
  private volatile Object zzl;
  
  public static void zzc()
  {
    zzi.incrementAndGet();
  }
  
  public static void zzd(Context paramContext)
  {
    if ((zze == null) && (paramContext != null)) {
      synchronized (zza)
      {
        if (zze == null) {
          try
          {
            Object localObject2 = zze;
            Object localObject3 = paramContext.getApplicationContext();
            if (localObject3 != null) {
              paramContext = (Context)localObject3;
            }
            if ((localObject2 == null) || (((zzda)localObject2).zza() != paramContext))
            {
              zzcg.zzd();
              zzdd.zzc();
              zzco.zze();
              localObject3 = new com/google/android/gms/internal/auth/zzct;
              ((zzct)localObject3).<init>(paramContext);
              localObject3 = zzdo.zza((zzdj)localObject3);
              localObject2 = new com/google/android/gms/internal/auth/zzcd;
              ((zzcd)localObject2).<init>(paramContext, (zzdj)localObject3);
              zze = (zzda)localObject2;
              zzi.incrementAndGet();
            }
          }
          finally {}
        }
        return;
      }
    }
  }
  
  public abstract Object zza(Object paramObject);
  
  public final Object zzb()
  {
    int i = zzi.get();
    if (zzk < i) {
      try
      {
        if (zzk < i)
        {
          zzda localzzda = zze;
          Object localObject1 = zzdh.zzc();
          Object localObject3 = null;
          Object localObject5;
          if (localzzda != null)
          {
            localObject4 = (zzdh)localzzda.zzb().zza();
            localObject1 = localObject4;
            if (((zzdh)localObject4).zzb())
            {
              localObject1 = (zzci)((zzdh)localObject4).zza();
              localObject5 = zzb;
              str = ((zzci)localObject1).zza(zza, null, zzc, zzc);
              break label110;
            }
          }
          String str = null;
          Object localObject4 = localObject1;
          label110:
          if (localzzda != null)
          {
            localObject1 = zzb.zza;
            if (localObject1 != null)
            {
              if (zzcq.zza(localzzda.zza(), (Uri)localObject1)) {
                localObject1 = zzcg.zza(localzzda.zza().getContentResolver(), zzb.zza, zzcs.zza);
              } else {
                localObject1 = null;
              }
            }
            else {
              localObject1 = zzdd.zza(localzzda.zza(), null, zzcs.zza);
            }
            if (localObject1 != null)
            {
              localObject1 = ((zzcl)localObject1).zzb(zzc);
              if (localObject1 != null)
              {
                localObject5 = zza(localObject1);
                break label210;
              }
            }
            localObject5 = null;
            label210:
            localObject1 = localObject5;
            if (localObject5 == null)
            {
              localObject1 = localObject3;
              if (!zzb.zzd)
              {
                localObject5 = zzco.zza(localzzda.zza());
                if (zzb.zzd) {
                  localObject1 = null;
                } else {
                  localObject1 = zzc;
                }
                localObject5 = ((zzco)localObject5).zzc((String)localObject1);
                localObject1 = localObject3;
                if (localObject5 != null) {
                  localObject1 = zza(localObject5);
                }
              }
              if (localObject1 == null) {
                localObject1 = zzj;
              }
            }
            if (((zzdh)localObject4).zzb()) {
              if (str == null) {
                localObject1 = zzj;
              } else {
                localObject1 = zza(str);
              }
            }
            zzl = localObject1;
            zzk = i;
          }
          else
          {
            localObject1 = new java/lang/IllegalStateException;
            ((IllegalStateException)localObject1).<init>("Must call PhenotypeFlag.init() first");
            throw ((Throwable)localObject1);
          }
        }
      }
      finally {}
    }
    return zzl;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzdc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
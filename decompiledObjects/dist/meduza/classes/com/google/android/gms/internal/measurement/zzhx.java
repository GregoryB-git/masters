package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import g;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import n7.a;
import n7.e;
import n7.h;
import n7.q;
import n7.r;
import n7.s;
import x6.b;

public abstract class zzhx<T>
{
  private static final Object zza = new Object();
  private static volatile zzie zzb;
  private static volatile boolean zzc = false;
  private static zzii zzd = new zzii(new zzhy());
  private static final AtomicInteger zze = new AtomicInteger();
  private final zzif zzf;
  private final String zzg;
  private Object zzh;
  private volatile int zzi = -1;
  private volatile T zzj;
  private final boolean zzk;
  private volatile boolean zzl;
  
  static
  {
    new AtomicReference();
  }
  
  private zzhx(zzif paramzzif, String paramString, T paramT, boolean paramBoolean)
  {
    String str = zza;
    if ((str == null) && (zzb == null)) {
      throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }
    if ((str != null) && (zzb != null)) {
      throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
    }
    zzf = paramzzif;
    zzg = paramString;
    zzh = paramT;
    zzk = paramBoolean;
    zzl = false;
  }
  
  private final T zza(zzie paramzzie)
  {
    Object localObject = zzf;
    if (!zze)
    {
      localObject = zzh;
      if ((localObject == null) || (((Boolean)((e)localObject).apply(paramzzie.zza())).booleanValue()))
      {
        localObject = zzhq.zza(paramzzie.zza());
        paramzzie = zzf;
        if (zze) {
          paramzzie = null;
        } else {
          paramzzie = zza(zzc);
        }
        paramzzie = ((zzhl)localObject).zza(paramzzie);
        if (paramzzie != null) {
          return (T)zza(paramzzie);
        }
      }
    }
    return null;
  }
  
  private final String zza(String paramString)
  {
    if ((paramString != null) && (paramString.isEmpty())) {
      return zzg;
    }
    return g.d(paramString, zzg);
  }
  
  private final T zzb(zzie paramzzie)
  {
    if (zzf.zzb != null)
    {
      if (zzhv.zza(paramzzie.zza(), zzf.zzb))
      {
        if (zzf.zzg) {
          paramzzie = zzhi.zza(paramzzie.zza().getContentResolver(), zzhu.zza(zzhu.zza(paramzzie.zza(), zzf.zzb.getLastPathSegment())), new zzhw());
        } else {
          paramzzie = zzhi.zza(paramzzie.zza().getContentResolver(), zzf.zzb, new zzhw());
        }
      }
      else {
        paramzzie = null;
      }
    }
    else {
      paramzzie = zzig.zza(paramzzie.zza(), zzf.zza, new zzhw());
    }
    if (paramzzie != null)
    {
      paramzzie = paramzzie.zza(zzb());
      if (paramzzie != null) {
        return (T)zza(paramzzie);
      }
    }
    return null;
  }
  
  public static void zzb(Context paramContext)
  {
    if ((zzb == null) && (paramContext != null)) {
      synchronized (zza)
      {
        if (zzb == null) {
          try
          {
            Object localObject2 = zzb;
            Context localContext = paramContext.getApplicationContext();
            if (localContext == null) {
              localContext = paramContext;
            }
            if ((localObject2 == null) || (((zzie)localObject2).zza() != localContext))
            {
              if (localObject2 != null)
              {
                zzhi.zzb();
                zzig.zza();
                zzhq.zza();
              }
              localObject2 = new com/google/android/gms/internal/measurement/zzhz;
              ((zzhz)localObject2).<init>(localContext);
              paramContext = (Context)localObject2;
              if (!(localObject2 instanceof s)) {
                if ((localObject2 instanceof r)) {
                  paramContext = (Context)localObject2;
                } else if ((localObject2 instanceof Serializable)) {
                  paramContext = new r((q)localObject2);
                } else {
                  paramContext = new s((q)localObject2);
                }
              }
              localObject2 = new com/google/android/gms/internal/measurement/zzhf;
              ((zzhf)localObject2).<init>(localContext, paramContext);
              zzb = (zzie)localObject2;
              zze.incrementAndGet();
            }
          }
          finally {}
        }
        return;
      }
    }
  }
  
  public static void zzc()
  {
    zze.incrementAndGet();
  }
  
  private final T zze()
  {
    return (T)zzh;
  }
  
  public final T zza()
  {
    if (!zzk) {
      b.I(zzd.zza(zzg), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
    }
    int i = zze.get();
    if (zzi < i) {
      try
      {
        if (zzi < i)
        {
          zzie localzzie = zzb;
          Object localObject1 = a.a;
          Object localObject2 = null;
          Object localObject3 = localObject2;
          if (localzzie != null)
          {
            localObject4 = (h)localzzie.zzb().get();
            localObject1 = localObject4;
            localObject3 = localObject2;
            if (((h)localObject4).b())
            {
              localObject3 = (zzhr)((h)localObject4).a();
              localObject1 = zzf;
              localObject3 = ((zzhr)localObject3).zza(zzb, zza, zzd, zzg);
              localObject1 = localObject4;
            }
          }
          boolean bool;
          if (localzzie != null) {
            bool = true;
          } else {
            bool = false;
          }
          b.I(bool, "Must call PhenotypeFlagInitializer.maybeInit() first");
          if (zzf.zzf)
          {
            localObject4 = zza(localzzie);
            if (localObject4 != null) {
              break label235;
            }
            localObject4 = zzb(localzzie);
            if (localObject4 != null) {
              break label235;
            }
          }
          else
          {
            localObject4 = zzb(localzzie);
            if (localObject4 != null) {
              break label235;
            }
            localObject4 = zza(localzzie);
            if (localObject4 != null) {
              break label235;
            }
          }
          Object localObject4 = zze();
          label235:
          if (((h)localObject1).b()) {
            if (localObject3 == null) {
              localObject4 = zze();
            } else {
              localObject4 = zza(localObject3);
            }
          }
          zzj = localObject4;
          zzi = i;
        }
      }
      finally {}
    }
    return (T)zzj;
  }
  
  public abstract T zza(Object paramObject);
  
  public final String zzb()
  {
    return zza(zzf.zzd);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzhx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
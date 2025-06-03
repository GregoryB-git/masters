package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzsy
  extends zzakg<zzsy, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzsy zzc;
  private static volatile zzalw<zzsy> zzd;
  private int zze;
  private int zzf;
  private com.google.android.gms.internal.firebase-auth-api.zzte zzg;
  private com.google.android.gms.internal.firebase-auth-api.zzaiw zzh = zzaiw.zza;
  
  static
  {
    zzsy localzzsy = new zzsy();
    zzc = localzzsy;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzsy.class, localzzsy);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzsy zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zzsy)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzsy.zza zzb()
  {
    return (zza)zzc.zzm();
  }
  
  public static zzalw<zzsy> zzf()
  {
    return (zzalw)zzc.zza(zzakg.zze.zzg, null, null);
  }
  
  public final int zza()
  {
    return zzf;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzsx.zza[(paramInt - 1)])
    {
    default: 
      throw null;
    case 6: 
      return Byte.valueOf((byte)1);
    case 5: 
      paramObject2 = zzd;
      paramObject1 = paramObject2;
      if (paramObject2 == null) {
        try
        {
          paramObject2 = zzd;
          paramObject1 = paramObject2;
          if (paramObject2 == null)
          {
            paramObject1 = new com/google/android/gms/internal/firebase_auth_api/zzakg$zza;
            ((zzakg.zza)paramObject1).<init>(zzc);
            zzd = (com.google.android.gms.internal.firebase-auth-api.zzalw)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzc;
    case 3: 
      return zzakg.zza(zzc, "\000\003\000\001\001\003\003\000\000\000\001\013\002ဉ\000\003\n", new Object[] { "zze", "zzf", "zzg", "zzh" });
    case 2: 
      return new zza(null);
    }
    return new zzsy();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzte zzd()
  {
    com.google.android.gms.internal.firebase-auth-api.zzte localzzte1 = zzg;
    com.google.android.gms.internal.firebase-auth-api.zzte localzzte2 = localzzte1;
    if (localzzte1 == null) {
      localzzte2 = zzte.zzd();
    }
    return localzzte2;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zze()
  {
    return zzh;
  }
  
  public static final class zza
    extends zzakg.zzb<zzsy, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzsy.zza zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzg();
      zzsy.zza((zzsy)zza, paramzzaiw);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzsy.zza zza(com.google.android.gms.internal.firebase-auth-api.zzte paramzzte)
    {
      zzg();
      zzsy.zza((zzsy)zza, paramzzte);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzsy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
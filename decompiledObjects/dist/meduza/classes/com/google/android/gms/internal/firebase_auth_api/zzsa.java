package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzsa
  extends zzakg<zzsa, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzsa zzc;
  private static volatile zzalw<zzsa> zzd;
  private int zze;
  private int zzf;
  private com.google.android.gms.internal.firebase-auth-api.zzaiw zzg = zzaiw.zza;
  private com.google.android.gms.internal.firebase-auth-api.zzsg zzh;
  
  static
  {
    zzsa localzzsa = new zzsa();
    zzc = localzzsa;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzsa.class, localzzsa);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzsa zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zzsa)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzsa.zza zzb()
  {
    return (zza)zzc.zzm();
  }
  
  public static zzalw<zzsa> zzf()
  {
    return (zzalw)zzc.zza(zzakg.zze.zzg, null, null);
  }
  
  public final int zza()
  {
    return zzf;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzrz.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\003\000\001\001\003\003\000\000\000\001\013\002\n\003ဉ\000", new Object[] { "zze", "zzf", "zzg", "zzh" });
    case 2: 
      return new zza(null);
    }
    return new zzsa();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzsg zzd()
  {
    com.google.android.gms.internal.firebase-auth-api.zzsg localzzsg1 = zzh;
    com.google.android.gms.internal.firebase-auth-api.zzsg localzzsg2 = localzzsg1;
    if (localzzsg1 == null) {
      localzzsg2 = zzsg.zzd();
    }
    return localzzsg2;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zze()
  {
    return zzg;
  }
  
  public static final class zza
    extends zzakg.zzb<zzsa, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzsa.zza zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzg();
      zzsa.zza((zzsa)zza, paramzzaiw);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzsa.zza zza(com.google.android.gms.internal.firebase-auth-api.zzsg paramzzsg)
    {
      zzg();
      zzsa.zza((zzsa)zza, paramzzsg);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzsa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
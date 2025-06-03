package com.google.android.gms.internal.firebase_auth_api;

public final class zzsp
  extends zzakg<zzsp, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzsp zzc;
  private static volatile zzalw<zzsp> zzd;
  private int zze;
  private int zzf;
  private com.google.android.gms.internal.firebase-auth-api.zzsv zzg;
  private com.google.android.gms.internal.firebase-auth-api.zzaiw zzh = zzaiw.zza;
  
  static
  {
    zzsp localzzsp = new zzsp();
    zzc = localzzsp;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzsp.class, localzzsp);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzsp.zza zzb()
  {
    return (zza)zzc.zzm();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzsp zzd()
  {
    return zzc;
  }
  
  public final int zza()
  {
    return zzf;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzso.zza[(paramInt - 1)])
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
    return new zzsp();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzsv zze()
  {
    com.google.android.gms.internal.firebase-auth-api.zzsv localzzsv1 = zzg;
    com.google.android.gms.internal.firebase-auth-api.zzsv localzzsv2 = localzzsv1;
    if (localzzsv1 == null) {
      localzzsv2 = zzsv.zzd();
    }
    return localzzsv2;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zzf()
  {
    return zzh;
  }
  
  public static final class zza
    extends zzakg.zzb<zzsp, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzsp.zza zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzg();
      zzsp.zza((zzsp)zza, paramzzaiw);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzsp.zza zza(com.google.android.gms.internal.firebase-auth-api.zzsv paramzzsv)
    {
      zzg();
      zzsp.zza((zzsp)zza, paramzzsv);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzsp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
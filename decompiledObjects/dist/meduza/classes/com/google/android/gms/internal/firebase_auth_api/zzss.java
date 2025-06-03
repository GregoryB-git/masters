package com.google.android.gms.internal.firebase_auth_api;

public final class zzss
  extends zzakg<zzss, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzss zzc;
  private static volatile zzalw<zzss> zzd;
  private int zze;
  private com.google.android.gms.internal.firebase-auth-api.zzsv zzf;
  private int zzg;
  
  static
  {
    zzss localzzss = new zzss();
    zzc = localzzss;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzss.class, localzzss);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzss.zza zzb()
  {
    return (zza)zzc.zzm();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzss zzd()
  {
    return zzc;
  }
  
  public final int zza()
  {
    return zzg;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzsr.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\002\000\001\001\002\002\000\000\000\001ဉ\000\002\013", new Object[] { "zze", "zzf", "zzg" });
    case 2: 
      return new zza(null);
    }
    return new zzss();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzsv zze()
  {
    com.google.android.gms.internal.firebase-auth-api.zzsv localzzsv1 = zzf;
    com.google.android.gms.internal.firebase-auth-api.zzsv localzzsv2 = localzzsv1;
    if (localzzsv1 == null) {
      localzzsv2 = zzsv.zzd();
    }
    return localzzsv2;
  }
  
  public static final class zza
    extends zzakg.zzb<zzss, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzss.zza zza(int paramInt)
    {
      zzg();
      zzss.zza((zzss)zza, paramInt);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzss.zza zza(com.google.android.gms.internal.firebase-auth-api.zzsv paramzzsv)
    {
      zzg();
      zzss.zza((zzss)zza, paramzzsv);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzss
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
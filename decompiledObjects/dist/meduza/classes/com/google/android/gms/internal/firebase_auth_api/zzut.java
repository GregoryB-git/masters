package com.google.android.gms.internal.firebase_auth_api;

public final class zzut
  extends zzakg<zzut, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzut zzc;
  private static volatile zzalw<zzut> zzd;
  private int zze;
  private int zzf;
  private com.google.android.gms.internal.firebase-auth-api.zzaiw zzg = zzaiw.zza;
  
  static
  {
    zzut localzzut = new zzut();
    zzc = localzzut;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzut.class, localzzut);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzut.zza zza()
  {
    return (zza)zzc.zzm();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzut zzc()
  {
    return zzc;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzuv.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\003\000\000\001\013\003\000\000\000\001\f\002\f\013\n", new Object[] { "zze", "zzf", "zzg" });
    case 2: 
      return new zza(null);
    }
    return new zzut();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzuw zzd()
  {
    com.google.android.gms.internal.firebase-auth-api.zzuw localzzuw1 = zzuw.zza(zze);
    com.google.android.gms.internal.firebase-auth-api.zzuw localzzuw2 = localzzuw1;
    if (localzzuw1 == null) {
      localzzuw2 = zzuw.zze;
    }
    return localzzuw2;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzvc zze()
  {
    com.google.android.gms.internal.firebase-auth-api.zzvc localzzvc1 = zzvc.zza(zzf);
    com.google.android.gms.internal.firebase-auth-api.zzvc localzzvc2 = localzzvc1;
    if (localzzvc1 == null) {
      localzzvc2 = zzvc.zzf;
    }
    return localzzvc2;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zzf()
  {
    return zzg;
  }
  
  public static final class zza
    extends zzakg.zzb<zzut, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzut.zza zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzg();
      zzut.zza((zzut)zza, paramzzaiw);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzut.zza zza(com.google.android.gms.internal.firebase-auth-api.zzuw paramzzuw)
    {
      zzg();
      zzut.zza((zzut)zza, paramzzuw);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzut.zza zza(com.google.android.gms.internal.firebase-auth-api.zzvc paramzzvc)
    {
      zzg();
      zzut.zza((zzut)zza, paramzzvc);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzut
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.firebase_auth_api;

public final class zzue
  extends zzakg<zzue, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzue zzc;
  private static volatile zzalw<zzue> zzd;
  private int zze;
  private com.google.android.gms.internal.firebase-auth-api.zzwf zzf;
  
  static
  {
    zzue localzzue = new zzue();
    zzc = localzzue;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzue.class, localzzue);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzue.zza zza()
  {
    return (zza)zzc.zzm();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzue zzc()
  {
    return zzc;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzug.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\001\000\001\002\002\001\000\000\000\002ဉ\000", new Object[] { "zze", "zzf" });
    case 2: 
      return new zza(null);
    }
    return new zzue();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzwf zzd()
  {
    com.google.android.gms.internal.firebase-auth-api.zzwf localzzwf1 = zzf;
    com.google.android.gms.internal.firebase-auth-api.zzwf localzzwf2 = localzzwf1;
    if (localzzwf1 == null) {
      localzzwf2 = zzwf.zzc();
    }
    return localzzwf2;
  }
  
  public static final class zza
    extends zzakg.zzb<zzue, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzue.zza zza(com.google.android.gms.internal.firebase-auth-api.zzwf paramzzwf)
    {
      zzg();
      zzue.zza((zzue)zza, paramzzwf);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.firebase_auth_api;

public final class zzvh
  extends zzakg<zzvh, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzvh zzc;
  private static volatile zzalw<zzvh> zzd;
  private int zze;
  private int zzf;
  
  static
  {
    zzvh localzzvh = new zzvh();
    zzc = localzzvh;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzvh.class, localzzvh);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvh.zza zzc()
  {
    return (zza)zzc.zzm();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvh zze()
  {
    return zzc;
  }
  
  public final int zza()
  {
    return zzf;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzvj.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\002\000\000\001\002\002\000\000\000\001\f\002\013", new Object[] { "zze", "zzf" });
    case 2: 
      return new zza(null);
    }
    return new zzvh();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzvc zzb()
  {
    com.google.android.gms.internal.firebase-auth-api.zzvc localzzvc1 = zzvc.zza(zze);
    com.google.android.gms.internal.firebase-auth-api.zzvc localzzvc2 = localzzvc1;
    if (localzzvc1 == null) {
      localzzvc2 = zzvc.zzf;
    }
    return localzzvc2;
  }
  
  public static final class zza
    extends zzakg.zzb<zzvh, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzvh.zza zza(int paramInt)
    {
      zzg();
      zzvh.zza((zzvh)zza, paramInt);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzvh.zza zza(com.google.android.gms.internal.firebase-auth-api.zzvc paramzzvc)
    {
      zzg();
      zzvh.zza((zzvh)zza, paramzzvc);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzvh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
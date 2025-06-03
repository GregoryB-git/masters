package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzvv
  extends zzakg<zzvv, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzvv zzc;
  private static volatile zzalw<zzvv> zzd;
  private int zze;
  private int zzf;
  private com.google.android.gms.internal.firebase-auth-api.zzvy zzg;
  private com.google.android.gms.internal.firebase-auth-api.zzaiw zzh = zzaiw.zza;
  
  static
  {
    zzvv localzzvv = new zzvv();
    zzc = localzzvv;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzvv.class, localzzvv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvv zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zzvv)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvv.zza zzb()
  {
    return (zza)zzc.zzm();
  }
  
  public static zzalw<zzvv> zzf()
  {
    return (zzalw)zzc.zza(zzakg.zze.zzg, null, null);
  }
  
  public final int zza()
  {
    return zzf;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzvu.zza[(paramInt - 1)])
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
    return new zzvv();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzvy zzd()
  {
    com.google.android.gms.internal.firebase-auth-api.zzvy localzzvy1 = zzg;
    com.google.android.gms.internal.firebase-auth-api.zzvy localzzvy2 = localzzvy1;
    if (localzzvy1 == null) {
      localzzvy2 = zzvy.zze();
    }
    return localzzvy2;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zze()
  {
    return zzh;
  }
  
  public static final class zza
    extends zzakg.zzb<zzvv, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzvv.zza zza(int paramInt)
    {
      zzg();
      zzvv.zza((zzvv)zza, 0);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzvv.zza zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzg();
      zzvv.zza((zzvv)zza, paramzzaiw);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzvv.zza zza(com.google.android.gms.internal.firebase-auth-api.zzvy paramzzvy)
    {
      zzg();
      zzvv.zza((zzvv)zza, paramzzvy);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzvv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzvb
  extends zzakg<zzvb, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzvb zzc;
  private static volatile zzalw<zzvb> zzd;
  private int zze;
  private int zzf;
  private com.google.android.gms.internal.firebase-auth-api.zzvh zzg;
  private com.google.android.gms.internal.firebase-auth-api.zzaiw zzh = zzaiw.zza;
  
  static
  {
    zzvb localzzvb = new zzvb();
    zzc = localzzvb;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzvb.class, localzzvb);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvb zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zzvb)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvb.zza zzb()
  {
    return (zza)zzc.zzm();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvb zzd()
  {
    return zzc;
  }
  
  public static zzalw<zzvb> zzg()
  {
    return (zzalw)zzc.zza(zzakg.zze.zzg, null, null);
  }
  
  public final int zza()
  {
    return zzf;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzvd.zza[(paramInt - 1)])
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
    return new zzvb();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzvh zze()
  {
    com.google.android.gms.internal.firebase-auth-api.zzvh localzzvh1 = zzg;
    com.google.android.gms.internal.firebase-auth-api.zzvh localzzvh2 = localzzvh1;
    if (localzzvh1 == null) {
      localzzvh2 = zzvh.zze();
    }
    return localzzvh2;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zzf()
  {
    return zzh;
  }
  
  public static final class zza
    extends zzakg.zzb<zzvb, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzvb.zza zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzg();
      zzvb.zza((zzvb)zza, paramzzaiw);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzvb.zza zza(com.google.android.gms.internal.firebase-auth-api.zzvh paramzzvh)
    {
      zzg();
      zzvb.zza((zzvb)zza, paramzzvh);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzvb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
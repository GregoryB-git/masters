package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaiw;
import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zztb
  extends zzakg<zztb, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zztb zzc;
  private static volatile zzalw<zztb> zzd;
  private int zze;
  private com.google.android.gms.internal.firebase-auth-api.zzte zzf;
  private int zzg;
  
  static
  {
    zztb localzztb = new zztb();
    zzc = localzztb;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zztb.class, localzztb);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zztb zza(zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zztb)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zztb.zza zzb()
  {
    return (zza)zzc.zzm();
  }
  
  public final int zza()
  {
    return zzg;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzta.zza[(paramInt - 1)])
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
    return new zztb();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzte zzd()
  {
    com.google.android.gms.internal.firebase-auth-api.zzte localzzte1 = zzf;
    com.google.android.gms.internal.firebase-auth-api.zzte localzzte2 = localzzte1;
    if (localzzte1 == null) {
      localzzte2 = zzte.zzd();
    }
    return localzzte2;
  }
  
  public static final class zza
    extends zzakg.zzb<zztb, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zztb.zza zza(int paramInt)
    {
      zzg();
      zztb.zza((zztb)zza, paramInt);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zztb.zza zza(com.google.android.gms.internal.firebase-auth-api.zzte paramzzte)
    {
      zzg();
      zztb.zza((zztb)zza, paramzzte);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zztb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaiw;
import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zztk
  extends zzakg<zztk, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zztk zzc;
  private static volatile zzalw<zztk> zzd;
  private int zze;
  private int zzf;
  
  static
  {
    zztk localzztk = new zztk();
    zzc = localzztk;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zztk.class, localzztk);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zztk zza(zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zztk)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zztk.zza zzc()
  {
    return (zza)zzc.zzm();
  }
  
  public final int zza()
  {
    return zze;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zztj.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\002\000\000\002\003\002\000\000\000\002\013\003\013", new Object[] { "zze", "zzf" });
    case 2: 
      return new zza(null);
    }
    return new zztk();
  }
  
  public final int zzb()
  {
    return zzf;
  }
  
  public static final class zza
    extends zzakg.zzb<zztk, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zztk.zza zza(int paramInt)
    {
      zzg();
      zztk.zza((zztk)zza, paramInt);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zztk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
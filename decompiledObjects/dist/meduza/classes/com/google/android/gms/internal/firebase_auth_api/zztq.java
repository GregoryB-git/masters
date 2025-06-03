package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaiw;
import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zztq
  extends zzakg<zztq, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zztq zzc;
  private static volatile zzalw<zztq> zzd;
  private int zze;
  private int zzf;
  
  static
  {
    zztq localzztq = new zztq();
    zzc = localzztq;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zztq.class, localzztq);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zztq zza(zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zztq)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zztq.zza zzc()
  {
    return (zza)zzc.zzm();
  }
  
  public final int zza()
  {
    return zze;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zztp.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\002\000\000\001\002\002\000\000\000\001\013\002\013", new Object[] { "zzf", "zze" });
    case 2: 
      return new zza(null);
    }
    return new zztq();
  }
  
  public final int zzb()
  {
    return zzf;
  }
  
  public static final class zza
    extends zzakg.zzb<zztq, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zztq.zza zza(int paramInt)
    {
      zzg();
      zztq.zza((zztq)zza, paramInt);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zztq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
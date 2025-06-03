package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaiw;
import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzwx
  extends zzakg<zzwx, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzwx zzc;
  private static volatile zzalw<zzwx> zzd;
  private int zze;
  private int zzf;
  private com.google.android.gms.internal.firebase-auth-api.zzxa zzg;
  
  static
  {
    zzwx localzzwx = new zzwx();
    zzc = localzzwx;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzwx.class, localzzwx);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwx zza(zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zzwx)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwx.zza zzb()
  {
    return (zza)zzc.zzm();
  }
  
  public static zzalw<zzwx> zze()
  {
    return (zzalw)zzc.zza(zzakg.zze.zzg, null, null);
  }
  
  public final int zza()
  {
    return zzf;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzww.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\002\000\001\001\002\002\000\000\000\001\013\002ဉ\000", new Object[] { "zze", "zzf", "zzg" });
    case 2: 
      return new zza(null);
    }
    return new zzwx();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzxa zzd()
  {
    com.google.android.gms.internal.firebase-auth-api.zzxa localzzxa1 = zzg;
    com.google.android.gms.internal.firebase-auth-api.zzxa localzzxa2 = localzzxa1;
    if (localzzxa1 == null) {
      localzzxa2 = zzxa.zzd();
    }
    return localzzxa2;
  }
  
  public static final class zza
    extends zzakg.zzb<zzwx, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzwx.zza zza(com.google.android.gms.internal.firebase-auth-api.zzxa paramzzxa)
    {
      zzg();
      zzwx.zza((zzwx)zza, paramzzxa);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzwx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaiw;
import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzxi
  extends zzakg<zzxi, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzxi zzc;
  private static volatile zzalw<zzxi> zzd;
  private int zze;
  private int zzf;
  private com.google.android.gms.internal.firebase-auth-api.zzxl zzg;
  
  static
  {
    zzxi localzzxi = new zzxi();
    zzc = localzzxi;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzxi.class, localzzxi);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzxi zza(zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zzxi)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzxi.zza zzb()
  {
    return (zza)zzc.zzm();
  }
  
  public final int zza()
  {
    return zzf;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzxk.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\002\000\001\001\003\002\000\000\000\001\013\003ဉ\000", new Object[] { "zze", "zzf", "zzg" });
    case 2: 
      return new zza(null);
    }
    return new zzxi();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzxl zzd()
  {
    com.google.android.gms.internal.firebase-auth-api.zzxl localzzxl1 = zzg;
    com.google.android.gms.internal.firebase-auth-api.zzxl localzzxl2 = localzzxl1;
    if (localzzxl1 == null) {
      localzzxl2 = zzxl.zzd();
    }
    return localzzxl2;
  }
  
  public static final class zza
    extends zzakg.zzb<zzxi, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzxi.zza zza(com.google.android.gms.internal.firebase-auth-api.zzxl paramzzxl)
    {
      zzg();
      zzxi.zza((zzxi)zza, paramzzxl);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzxi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
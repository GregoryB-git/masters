package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaiw;
import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzwr
  extends zzakg<zzwr, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzwr zzc;
  private static volatile zzalw<zzwr> zzd;
  private int zze;
  private int zzf;
  private com.google.android.gms.internal.firebase-auth-api.zzwu zzg;
  
  static
  {
    zzwr localzzwr = new zzwr();
    zzc = localzzwr;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzwr.class, localzzwr);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwr zza(zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zzwr)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwr.zza zzb()
  {
    return (zza)zzc.zzm();
  }
  
  public static zzalw<zzwr> zze()
  {
    return (zzalw)zzc.zza(zzakg.zze.zzg, null, null);
  }
  
  public final int zza()
  {
    return zzf;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzwq.zza[(paramInt - 1)])
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
    return new zzwr();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzwu zzd()
  {
    com.google.android.gms.internal.firebase-auth-api.zzwu localzzwu1 = zzg;
    com.google.android.gms.internal.firebase-auth-api.zzwu localzzwu2 = localzzwu1;
    if (localzzwu1 == null) {
      localzzwu2 = zzwu.zzc();
    }
    return localzzwu2;
  }
  
  public static final class zza
    extends zzakg.zzb<zzwr, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzwr.zza zza(com.google.android.gms.internal.firebase-auth-api.zzwu paramzzwu)
    {
      zzg();
      zzwr.zza((zzwr)zza, paramzzwu);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzwr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zztz
  extends zzakg<zztz, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zztz zzc;
  private static volatile zzalw<zztz> zzd;
  private int zze;
  private com.google.android.gms.internal.firebase-auth-api.zzaiw zzf = zzaiw.zza;
  
  static
  {
    zztz localzztz = new zztz();
    zzc = localzztz;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zztz.class, localzztz);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zztz zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zztz)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zztz.zza zzb()
  {
    return (zza)zzc.zzm();
  }
  
  public static zzalw<zztz> zze()
  {
    return (zzalw)zzc.zza(zzakg.zze.zzg, null, null);
  }
  
  public final int zza()
  {
    return zze;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzty.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\002\000\000\001\002\002\000\000\000\001\013\002\n", new Object[] { "zze", "zzf" });
    case 2: 
      return new zza(null);
    }
    return new zztz();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zzd()
  {
    return zzf;
  }
  
  public static final class zza
    extends zzakg.zzb<zztz, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zztz.zza zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzg();
      zztz.zza((zztz)zza, paramzzaiw);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zztz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
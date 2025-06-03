package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zztt
  extends zzakg<zztt, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zztt zzc;
  private static volatile zzalw<zztt> zzd;
  private int zze;
  private com.google.android.gms.internal.firebase-auth-api.zzaiw zzf = zzaiw.zza;
  
  static
  {
    zztt localzztt = new zztt();
    zzc = localzztt;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zztt.class, localzztt);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zztt zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zztt)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zztt.zza zzb()
  {
    return (zza)zzc.zzm();
  }
  
  public static zzalw<zztt> zze()
  {
    return (zzalw)zzc.zza(zzakg.zze.zzg, null, null);
  }
  
  public final int zza()
  {
    return zze;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzts.zza[(paramInt - 1)])
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
    return new zztt();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zzd()
  {
    return zzf;
  }
  
  public static final class zza
    extends zzakg.zzb<zztt, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zztt.zza zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzg();
      zztt.zza((zztt)zza, paramzzaiw);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zztt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
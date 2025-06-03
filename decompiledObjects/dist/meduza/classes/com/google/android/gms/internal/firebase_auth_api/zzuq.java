package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzuq
  extends zzakg<zzuq, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzuq zzc;
  private static volatile zzalw<zzuq> zzd;
  private int zze;
  private int zzf;
  private com.google.android.gms.internal.firebase-auth-api.zzuk zzg;
  private com.google.android.gms.internal.firebase-auth-api.zzaiw zzh;
  private com.google.android.gms.internal.firebase-auth-api.zzaiw zzi;
  
  static
  {
    zzuq localzzuq = new zzuq();
    zzc = localzzuq;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzuq.class, localzzuq);
  }
  
  private zzuq()
  {
    com.google.android.gms.internal.firebase-auth-api.zzaiw localzzaiw = zzaiw.zza;
    zzh = localzzaiw;
    zzi = localzzaiw;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzuq zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zzuq)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzuq.zza zzc()
  {
    return (zza)zzc.zzm();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzuq zze()
  {
    return zzc;
  }
  
  public static zzalw<zzuq> zzh()
  {
    return (zzalw)zzc.zza(zzakg.zze.zzg, null, null);
  }
  
  public final int zza()
  {
    return zzf;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzus.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\004\000\001\001\004\004\000\000\000\001\013\002ဉ\000\003\n\004\n", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
    case 2: 
      return new zza(null);
    }
    return new zzuq();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzuk zzb()
  {
    com.google.android.gms.internal.firebase-auth-api.zzuk localzzuk1 = zzg;
    com.google.android.gms.internal.firebase-auth-api.zzuk localzzuk2 = localzzuk1;
    if (localzzuk1 == null) {
      localzzuk2 = zzuk.zze();
    }
    return localzzuk2;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zzf()
  {
    return zzh;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zzg()
  {
    return zzi;
  }
  
  public static final class zza
    extends zzakg.zzb<zzuq, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzuq.zza zza(int paramInt)
    {
      zzg();
      zzuq.zza((zzuq)zza, 0);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzuq.zza zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzg();
      zzuq.zza((zzuq)zza, paramzzaiw);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzuq.zza zza(com.google.android.gms.internal.firebase-auth-api.zzuk paramzzuk)
    {
      zzg();
      zzuq.zza((zzuq)zza, paramzzuk);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzuq.zza zzb(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzg();
      zzuq.zzb((zzuq)zza, paramzzaiw);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzuq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
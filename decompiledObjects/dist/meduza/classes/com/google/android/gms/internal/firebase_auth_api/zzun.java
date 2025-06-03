package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzun
  extends zzakg<zzun, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzun zzc;
  private static volatile zzalw<zzun> zzd;
  private int zze;
  private int zzf;
  private com.google.android.gms.internal.firebase-auth-api.zzuq zzg;
  private com.google.android.gms.internal.firebase-auth-api.zzaiw zzh = zzaiw.zza;
  
  static
  {
    zzun localzzun = new zzun();
    zzc = localzzun;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzun.class, localzzun);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzun zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zzun)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzun.zza zzb()
  {
    return (zza)zzc.zzm();
  }
  
  public static zzalw<zzun> zzf()
  {
    return (zzalw)zzc.zza(zzakg.zze.zzg, null, null);
  }
  
  public final int zza()
  {
    return zzf;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzup.zza[(paramInt - 1)])
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
    return new zzun();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzuq zzd()
  {
    com.google.android.gms.internal.firebase-auth-api.zzuq localzzuq1 = zzg;
    com.google.android.gms.internal.firebase-auth-api.zzuq localzzuq2 = localzzuq1;
    if (localzzuq1 == null) {
      localzzuq2 = zzuq.zze();
    }
    return localzzuq2;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zze()
  {
    return zzh;
  }
  
  public static final class zza
    extends zzakg.zzb<zzun, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzun.zza zza(int paramInt)
    {
      zzg();
      zzun.zza((zzun)zza, 0);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzun.zza zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzg();
      zzun.zza((zzun)zza, paramzzaiw);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzun.zza zza(com.google.android.gms.internal.firebase-auth-api.zzuq paramzzuq)
    {
      zzg();
      zzun.zza((zzun)zza, paramzzuq);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzun
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
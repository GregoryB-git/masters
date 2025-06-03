package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzwf
  extends zzakg<zzwf, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzwf zzc;
  private static volatile zzalw<zzwf> zzd;
  private String zze = "";
  private com.google.android.gms.internal.firebase-auth-api.zzaiw zzf = zzaiw.zza;
  private int zzg;
  
  static
  {
    zzwf localzzwf = new zzwf();
    zzc = localzzwf;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzwf.class, localzzwf);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwf.zza zza()
  {
    return (zza)zzc.zzm();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwf.zza zza(com.google.android.gms.internal.firebase-auth-api.zzwf paramzzwf)
  {
    return (zza)zzc.zzm().zza(paramzzwf);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwf zza(byte[] paramArrayOfByte, zzajv paramzzajv)
  {
    return (zzwf)zzakg.zza(zzc, paramArrayOfByte, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwf zzc()
  {
    return zzc;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzwe.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\003\000\000\001\003\003\000\000\000\001Ȉ\002\n\003\f", new Object[] { "zze", "zzf", "zzg" });
    case 2: 
      return new zza(null);
    }
    return new zzwf();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzxd zzd()
  {
    com.google.android.gms.internal.firebase-auth-api.zzxd localzzxd1 = zzxd.zza(zzg);
    com.google.android.gms.internal.firebase-auth-api.zzxd localzzxd2 = localzzxd1;
    if (localzzxd1 == null) {
      localzzxd2 = zzxd.zzf;
    }
    return localzzxd2;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zze()
  {
    return zzf;
  }
  
  public final String zzf()
  {
    return zze;
  }
  
  public static final class zza
    extends zzakg.zzb<zzwf, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzwf.zza zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzg();
      zzwf.zza((zzwf)zza, paramzzaiw);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzwf.zza zza(com.google.android.gms.internal.firebase-auth-api.zzxd paramzzxd)
    {
      zzg();
      zzwf.zza((zzwf)zza, paramzzxd);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzwf.zza zza(String paramString)
    {
      zzg();
      zzwf.zza((zzwf)zza, paramString);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzwf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
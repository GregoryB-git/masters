package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaiw;
import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzsm
  extends zzakg<zzsm, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzsm zzc;
  private static volatile zzalw<zzsm> zzd;
  private int zze;
  private com.google.android.gms.internal.firebase-auth-api.zzss zzf;
  private com.google.android.gms.internal.firebase-auth-api.zzve zzg;
  
  static
  {
    zzsm localzzsm = new zzsm();
    zzc = localzzsm;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzsm.class, localzzsm);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzsm.zza zza()
  {
    return (zza)zzc.zzm();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzsm zza(zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zzsm)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzsl.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\002\000\001\001\002\002\000\000\000\001ဉ\000\002ဉ\001", new Object[] { "zze", "zzf", "zzg" });
    case 2: 
      return new zza(null);
    }
    return new zzsm();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzss zzc()
  {
    com.google.android.gms.internal.firebase-auth-api.zzss localzzss1 = zzf;
    com.google.android.gms.internal.firebase-auth-api.zzss localzzss2 = localzzss1;
    if (localzzss1 == null) {
      localzzss2 = zzss.zzd();
    }
    return localzzss2;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzve zzd()
  {
    com.google.android.gms.internal.firebase-auth-api.zzve localzzve1 = zzg;
    com.google.android.gms.internal.firebase-auth-api.zzve localzzve2 = localzzve1;
    if (localzzve1 == null) {
      localzzve2 = zzve.zze();
    }
    return localzzve2;
  }
  
  public static final class zza
    extends zzakg.zzb<zzsm, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzsm.zza zza(com.google.android.gms.internal.firebase-auth-api.zzss paramzzss)
    {
      zzg();
      zzsm.zza((zzsm)zza, paramzzss);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzsm.zza zza(com.google.android.gms.internal.firebase-auth-api.zzve paramzzve)
    {
      zzg();
      zzsm.zza((zzsm)zza, paramzzve);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzsm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
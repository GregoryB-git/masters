package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaiw;
import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzsj
  extends zzakg<zzsj, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzsj zzc;
  private static volatile zzalw<zzsj> zzd;
  private int zze;
  private int zzf;
  private com.google.android.gms.internal.firebase-auth-api.zzsp zzg;
  private com.google.android.gms.internal.firebase-auth-api.zzvb zzh;
  
  static
  {
    zzsj localzzsj = new zzsj();
    zzc = localzzsj;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzsj.class, localzzsj);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzsj zza(zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zzsj)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzsj.zza zzb()
  {
    return (zza)zzc.zzm();
  }
  
  public static zzalw<zzsj> zzf()
  {
    return (zzalw)zzc.zza(zzakg.zze.zzg, null, null);
  }
  
  public final int zza()
  {
    return zzf;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzsi.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\003\000\001\001\003\003\000\000\000\001\013\002ဉ\000\003ဉ\001", new Object[] { "zze", "zzf", "zzg", "zzh" });
    case 2: 
      return new zza(null);
    }
    return new zzsj();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzsp zzd()
  {
    com.google.android.gms.internal.firebase-auth-api.zzsp localzzsp1 = zzg;
    com.google.android.gms.internal.firebase-auth-api.zzsp localzzsp2 = localzzsp1;
    if (localzzsp1 == null) {
      localzzsp2 = zzsp.zzd();
    }
    return localzzsp2;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzvb zze()
  {
    com.google.android.gms.internal.firebase-auth-api.zzvb localzzvb1 = zzh;
    com.google.android.gms.internal.firebase-auth-api.zzvb localzzvb2 = localzzvb1;
    if (localzzvb1 == null) {
      localzzvb2 = zzvb.zzd();
    }
    return localzzvb2;
  }
  
  public static final class zza
    extends zzakg.zzb<zzsj, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzsj.zza zza(com.google.android.gms.internal.firebase-auth-api.zzsp paramzzsp)
    {
      zzg();
      zzsj.zza((zzsj)zza, paramzzsp);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzsj.zza zza(com.google.android.gms.internal.firebase-auth-api.zzvb paramzzvb)
    {
      zzg();
      zzsj.zza((zzsj)zza, paramzzvb);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzsj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
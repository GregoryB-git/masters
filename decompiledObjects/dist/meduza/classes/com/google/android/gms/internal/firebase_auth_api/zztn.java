package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zztn
  extends zzakg<zztn, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zztn zzc;
  private static volatile zzalw<zztn> zzd;
  private int zze;
  private com.google.android.gms.internal.firebase-auth-api.zzaiw zzf = zzaiw.zza;
  
  static
  {
    zztn localzztn = new zztn();
    zzc = localzztn;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zztn.class, localzztn);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zztn zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zztn)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zztn.zza zzb()
  {
    return (zza)zzc.zzm();
  }
  
  public static zzalw<zztn> zze()
  {
    return (zzalw)zzc.zza(zzakg.zze.zzg, null, null);
  }
  
  public final int zza()
  {
    return zze;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zztm.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\002\000\000\001\003\002\000\000\000\001\013\003\n", new Object[] { "zze", "zzf" });
    case 2: 
      return new zza(null);
    }
    return new zztn();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zzd()
  {
    return zzf;
  }
  
  public static final class zza
    extends zzakg.zzb<zztn, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zztn.zza zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzg();
      zztn.zza((zztn)zza, paramzzaiw);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zztn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
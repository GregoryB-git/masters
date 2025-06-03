package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaiw;
import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzwu
  extends zzakg<zzwu, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzwu zzc;
  private static volatile zzalw<zzwu> zzd;
  private String zze = "";
  
  static
  {
    zzwu localzzwu = new zzwu();
    zzc = localzzwu;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzwu.class, localzzwu);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwu.zza zza()
  {
    return (zza)zzc.zzm();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwu zza(zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zzwu)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwu zzc()
  {
    return zzc;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzwt.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\001\000\000\001\001\001\000\000\000\001Ȉ", new Object[] { "zze" });
    case 2: 
      return new zza(null);
    }
    return new zzwu();
  }
  
  public final String zzd()
  {
    return zze;
  }
  
  public static final class zza
    extends zzakg.zzb<zzwu, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzwu.zza zza(String paramString)
    {
      zzg();
      zzwu.zza((zzwu)zza, paramString);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzwu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
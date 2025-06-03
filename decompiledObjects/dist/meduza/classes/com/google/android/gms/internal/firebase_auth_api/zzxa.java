package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaiw;
import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzxa
  extends zzakg<zzxa, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzxa zzc;
  private static volatile zzalw<zzxa> zzd;
  private int zze;
  private String zzf = "";
  private com.google.android.gms.internal.firebase-auth-api.zzwf zzg;
  
  static
  {
    zzxa localzzxa = new zzxa();
    zzc = localzzxa;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzxa.class, localzzxa);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzxa zza(zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zzxa)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzxa.zza zzb()
  {
    return (zza)zzc.zzm();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzxa zzd()
  {
    return zzc;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzwf zza()
  {
    com.google.android.gms.internal.firebase-auth-api.zzwf localzzwf1 = zzg;
    com.google.android.gms.internal.firebase-auth-api.zzwf localzzwf2 = localzzwf1;
    if (localzzwf1 == null) {
      localzzwf2 = zzwf.zzc();
    }
    return localzzwf2;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzwz.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\002\000\001\001\002\002\000\000\000\001Ȉ\002ဉ\000", new Object[] { "zze", "zzf", "zzg" });
    case 2: 
      return new zza(null);
    }
    return new zzxa();
  }
  
  public final String zze()
  {
    return zzf;
  }
  
  public static final class zza
    extends zzakg.zzb<zzxa, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzxa.zza zza(com.google.android.gms.internal.firebase-auth-api.zzwf paramzzwf)
    {
      zzg();
      zzxa.zza((zzxa)zza, paramzzwf);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzxa.zza zza(String paramString)
    {
      zzg();
      zzxa.zza((zzxa)zza, paramString);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzxa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
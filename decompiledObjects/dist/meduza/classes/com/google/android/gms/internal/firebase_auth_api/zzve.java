package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaiw;
import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzve
  extends zzakg<zzve, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzve zzc;
  private static volatile zzalw<zzve> zzd;
  private int zze;
  private com.google.android.gms.internal.firebase-auth-api.zzvh zzf;
  private int zzg;
  private int zzh;
  
  static
  {
    zzve localzzve = new zzve();
    zzc = localzzve;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzve.class, localzzve);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzve zza(zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zzve)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzve.zza zzc()
  {
    return (zza)zzc.zzm();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzve zze()
  {
    return zzc;
  }
  
  public final int zza()
  {
    return zzg;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzvg.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\003\000\001\001\003\003\000\000\000\001ဉ\000\002\013\003\013", new Object[] { "zze", "zzf", "zzg", "zzh" });
    case 2: 
      return new zza(null);
    }
    return new zzve();
  }
  
  public final int zzb()
  {
    return zzh;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzvh zzf()
  {
    com.google.android.gms.internal.firebase-auth-api.zzvh localzzvh1 = zzf;
    com.google.android.gms.internal.firebase-auth-api.zzvh localzzvh2 = localzzvh1;
    if (localzzvh1 == null) {
      localzzvh2 = zzvh.zze();
    }
    return localzzvh2;
  }
  
  public static final class zza
    extends zzakg.zzb<zzve, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzve.zza zza(int paramInt)
    {
      zzg();
      zzve.zza((zzve)zza, paramInt);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzve.zza zza(com.google.android.gms.internal.firebase-auth-api.zzvh paramzzvh)
    {
      zzg();
      zzve.zza((zzve)zza, paramzzvh);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzve
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
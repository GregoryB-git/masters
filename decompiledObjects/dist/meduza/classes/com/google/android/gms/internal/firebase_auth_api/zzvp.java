package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaiw;
import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzvp
  extends zzakg<zzvp, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzvp zzc;
  private static volatile zzalw<zzvp> zzd;
  private int zze;
  private com.google.android.gms.internal.firebase-auth-api.zzvs zzf;
  
  static
  {
    zzvp localzzvp = new zzvp();
    zzc = localzzvp;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzvp.class, localzzvp);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvp.zza zza()
  {
    return (zza)zzc.zzm();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvp zza(zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zzvp)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzvo.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\001\000\001\001\001\001\000\000\000\001ဉ\000", new Object[] { "zze", "zzf" });
    case 2: 
      return new zza(null);
    }
    return new zzvp();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzvs zzc()
  {
    com.google.android.gms.internal.firebase-auth-api.zzvs localzzvs1 = zzf;
    com.google.android.gms.internal.firebase-auth-api.zzvs localzzvs2 = localzzvs1;
    if (localzzvs1 == null) {
      localzzvs2 = zzvs.zzf();
    }
    return localzzvs2;
  }
  
  public static final class zza
    extends zzakg.zzb<zzvp, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzvp.zza zza(com.google.android.gms.internal.firebase-auth-api.zzvs paramzzvs)
    {
      zzg();
      zzvp.zza((zzvp)zza, paramzzvs);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzvp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
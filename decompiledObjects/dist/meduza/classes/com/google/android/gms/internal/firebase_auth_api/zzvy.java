package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzvy
  extends zzakg<zzvy, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzvy zzc;
  private static volatile zzalw<zzvy> zzd;
  private int zze;
  private int zzf;
  private com.google.android.gms.internal.firebase-auth-api.zzvs zzg;
  private com.google.android.gms.internal.firebase-auth-api.zzaiw zzh = zzaiw.zza;
  
  static
  {
    zzvy localzzvy = new zzvy();
    zzc = localzzvy;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzvy.class, localzzvy);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvy zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zzvy)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvy.zza zzc()
  {
    return (zza)zzc.zzm();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvy zze()
  {
    return zzc;
  }
  
  public static zzalw<zzvy> zzg()
  {
    return (zzalw)zzc.zza(zzakg.zze.zzg, null, null);
  }
  
  public final int zza()
  {
    return zzf;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzvx.zza[(paramInt - 1)])
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
    return new zzvy();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzvs zzb()
  {
    com.google.android.gms.internal.firebase-auth-api.zzvs localzzvs1 = zzg;
    com.google.android.gms.internal.firebase-auth-api.zzvs localzzvs2 = localzzvs1;
    if (localzzvs1 == null) {
      localzzvs2 = zzvs.zzf();
    }
    return localzzvs2;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zzf()
  {
    return zzh;
  }
  
  public static final class zza
    extends zzakg.zzb<zzvy, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzvy.zza zza(int paramInt)
    {
      zzg();
      zzvy.zza((zzvy)zza, 0);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzvy.zza zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzg();
      zzvy.zza((zzvy)zza, paramzzaiw);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzvy.zza zza(com.google.android.gms.internal.firebase-auth-api.zzvs paramzzvs)
    {
      zzg();
      zzvy.zza((zzvy)zza, paramzzvs);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzvy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
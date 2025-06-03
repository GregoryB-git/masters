package com.google.android.gms.internal.firebase_auth_api;

public final class zzwb
  extends zzakg<zzwb, zzb>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzwb zzc;
  private static volatile zzalw<zzwb> zzd;
  private String zze = "";
  private com.google.android.gms.internal.firebase-auth-api.zzaiw zzf = zzaiw.zza;
  private int zzg;
  
  static
  {
    zzwb localzzwb = new zzwb();
    zzc = localzzwb;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzwb.class, localzzwb);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwb.zzb zza()
  {
    return (zzb)zzc.zzm();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwb zzd()
  {
    return zzc;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzwa.zza[(paramInt - 1)])
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
      return new zzb(null);
    }
    return new zzwb();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzwb.zza zzb()
  {
    com.google.android.gms.internal.firebase-auth-api.zzwb.zza localzza1 = zza.zza(zzg);
    com.google.android.gms.internal.firebase-auth-api.zzwb.zza localzza2 = localzza1;
    if (localzza1 == null) {
      localzza2 = zza.zzf;
    }
    return localzza2;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zze()
  {
    return zzf;
  }
  
  public final String zzf()
  {
    return zze;
  }
  
  public static enum zza
    implements zzakl
  {
    private final int zzh;
    
    static
    {
      zza localzza1 = new zza("UNKNOWN_KEYMATERIAL", 0, 0);
      zza = localzza1;
      zza localzza2 = new zza("SYMMETRIC", 1, 1);
      zzb = localzza2;
      zza localzza3 = new zza("ASYMMETRIC_PRIVATE", 2, 2);
      zzc = localzza3;
      zza localzza4 = new zza("ASYMMETRIC_PUBLIC", 3, 3);
      zzd = localzza4;
      zza localzza5 = new zza("REMOTE", 4, 4);
      zze = localzza5;
      zza localzza6 = new zza("UNRECOGNIZED", 5, -1);
      zzf = localzza6;
      zzg = new zza[] { localzza1, localzza2, localzza3, localzza4, localzza5, localzza6 };
    }
    
    private zza(int paramInt)
    {
      zzh = paramInt;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.zzwb.zza[] values()
    {
      return (zza[])zzg.clone();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.zzwb.zza zza(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            if (paramInt != 3)
            {
              if (paramInt != 4) {
                return null;
              }
              return zze;
            }
            return zzd;
          }
          return zzc;
        }
        return zzb;
      }
      return zza;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("<");
      localStringBuilder.append(com.google.android.gms.internal.firebase-auth-api.zzwb.zza.class.getName());
      localStringBuilder.append('@');
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      if (this != zzf)
      {
        localStringBuilder.append(" number=");
        localStringBuilder.append(zza());
      }
      localStringBuilder.append(" name=");
      localStringBuilder.append(name());
      localStringBuilder.append('>');
      return localStringBuilder.toString();
    }
    
    public final int zza()
    {
      if (this != zzf) {
        return zzh;
      }
      throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
  }
  
  public static final class zzb
    extends zzakg.zzb<zzwb, zzb>
    implements zzalp
  {
    private zzb()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzwb.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzg();
      zzwb.zza((zzwb)zza, paramzzaiw);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzwb.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzwb.zza paramzza)
    {
      zzg();
      zzwb.zza((zzwb)zza, paramzza);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzwb.zzb zza(String paramString)
    {
      zzg();
      zzwb.zza((zzwb)zza, paramString);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzwb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.firebase_auth_api;

public final class zzxl
  extends zzakg<zzxl, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzxl zzc;
  private static volatile zzalw<zzxl> zzd;
  private int zze;
  
  static
  {
    zzxl localzzxl = new zzxl();
    zzc = localzzxl;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzxl.class, localzzxl);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzxl.zza zzb()
  {
    return (zza)zzc.zzm();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzxl zzd()
  {
    return zzc;
  }
  
  public final int zza()
  {
    return zze;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzxn.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\001\000\000\001\001\001\000\000\000\001\013", new Object[] { "zze" });
    case 2: 
      return new zza(null);
    }
    return new zzxl();
  }
  
  public static final class zza
    extends zzakg.zzb<zzxl, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzxl.zza zza(int paramInt)
    {
      zzg();
      zzxl.zza((zzxl)zza, paramInt);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzxl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
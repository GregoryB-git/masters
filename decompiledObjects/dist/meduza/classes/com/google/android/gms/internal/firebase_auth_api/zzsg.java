package com.google.android.gms.internal.firebase_auth_api;

public final class zzsg
  extends zzakg<zzsg, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzsg zzc;
  private static volatile zzalw<zzsg> zzd;
  private int zze;
  
  static
  {
    zzsg localzzsg = new zzsg();
    zzc = localzzsg;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzsg.class, localzzsg);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzsg.zza zzb()
  {
    return (zza)zzc.zzm();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzsg zzd()
  {
    return zzc;
  }
  
  public final int zza()
  {
    return zze;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzsf.zza[(paramInt - 1)])
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
    return new zzsg();
  }
  
  public static final class zza
    extends zzakg.zzb<zzsg, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzsg.zza zza(int paramInt)
    {
      zzg();
      zzsg.zza((zzsg)zza, paramInt);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzsg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
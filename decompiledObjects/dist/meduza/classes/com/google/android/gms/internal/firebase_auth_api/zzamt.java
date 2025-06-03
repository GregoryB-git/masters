package com.google.android.gms.internal.firebase_auth_api;

public final class zzamt
  extends zzakg<zzamt, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzamt zzc;
  private static volatile zzalw<zzamt> zzd;
  private long zze;
  private int zzf;
  
  static
  {
    zzamt localzzamt = new zzamt();
    zzc = localzzamt;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzamt.class, localzzamt);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzamt.zza zzc()
  {
    return (zza)zzc.zzm();
  }
  
  public final int zza()
  {
    return zzf;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzams.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\002\000\000\001\002\002\000\000\000\001\002\002\004", new Object[] { "zze", "zzf" });
    case 2: 
      return new zza(null);
    }
    return new zzamt();
  }
  
  public final long zzb()
  {
    return zze;
  }
  
  public static final class zza
    extends zzakg.zzb<zzamt, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzamt.zza zza(int paramInt)
    {
      if (!zza.zzw()) {
        zzh();
      }
      zzamt.zza((zzamt)zza, paramInt);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzamt.zza zza(long paramLong)
    {
      if (!zza.zzw()) {
        zzh();
      }
      zzamt.zza((zzamt)zza, paramLong);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzamt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
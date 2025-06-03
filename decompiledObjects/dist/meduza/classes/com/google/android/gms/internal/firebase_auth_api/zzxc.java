package com.google.android.gms.internal.firebase_auth_api;

@Deprecated
public final class zzxc
  extends zzakg<zzxc, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzxc zzc;
  private static volatile zzalw<zzxc> zzd;
  private String zze = "";
  private zzakn<zzwi> zzf = zzakg.zzp();
  
  static
  {
    zzxc localzzxc = new zzxc();
    zzc = localzzxc;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzxc.class, localzzxc);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzxc zzb()
  {
    return zzc;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzxe.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\002\000\000\001\002\002\000\001\000\001Ȉ\002\033", new Object[] { "zze", "zzf", com.google.android.gms.internal.firebase-auth-api.zzwi.class });
    case 2: 
      return new zza(null);
    }
    return new zzxc();
  }
  
  public static final class zza
    extends zzakg.zzb<zzxc, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzxc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
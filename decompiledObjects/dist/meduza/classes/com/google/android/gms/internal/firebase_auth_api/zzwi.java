package com.google.android.gms.internal.firebase_auth_api;

@Deprecated
public final class zzwi
  extends zzakg<zzwi, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzwi zzc;
  private static volatile zzalw<zzwi> zzd;
  private String zze = "";
  private String zzf = "";
  private int zzg;
  private boolean zzh;
  private String zzi = "";
  
  static
  {
    zzwi localzzwi = new zzwi();
    zzc = localzzwi;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzwi.class, localzzwi);
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzwh.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\005\000\000\001\005\005\000\000\000\001Ȉ\002Ȉ\003\013\004\007\005Ȉ", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
    case 2: 
      return new zza(null);
    }
    return new zzwi();
  }
  
  public static final class zza
    extends zzakg.zzb<zzwi, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzwi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
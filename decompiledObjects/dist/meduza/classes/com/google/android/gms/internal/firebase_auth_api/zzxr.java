package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaiw;
import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzxr
  extends zzakg<zzxr, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzxr zzc;
  private static volatile zzalw<zzxr> zzd;
  private int zze;
  
  static
  {
    zzxr localzzxr = new zzxr();
    zzc = localzzxr;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzxr.class, localzzxr);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzxr zza(zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zzxr)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzxr zzc()
  {
    return zzc;
  }
  
  public final int zza()
  {
    return zze;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzxt.zza[(paramInt - 1)])
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
    return new zzxr();
  }
  
  public static final class zza
    extends zzakg.zzb<zzxr, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzxr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
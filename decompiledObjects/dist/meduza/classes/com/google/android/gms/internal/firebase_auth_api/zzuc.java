package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaiw;
import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzuc
  extends zzakg<zzuc, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzuc zzc;
  private static volatile zzalw<zzuc> zzd;
  
  static
  {
    zzuc localzzuc = new zzuc();
    zzc = localzzuc;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzuc.class, localzzuc);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzuc zza(zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zzuc)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzuc zzb()
  {
    return zzc;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzub.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\000", null);
    case 2: 
      return new zza(null);
    }
    return new zzuc();
  }
  
  public static final class zza
    extends zzakg.zzb<zzuc, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzuc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
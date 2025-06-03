package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaiw;
import com.google.android.gms.internal.firebase-auth-api.zzajv;

public final class zzuh
  extends zzakg<zzuh, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzuh zzc;
  private static volatile zzalw<zzuh> zzd;
  private int zze;
  private com.google.android.gms.internal.firebase-auth-api.zzuk zzf;
  
  static
  {
    zzuh localzzuh = new zzuh();
    zzc = localzzuh;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzuh.class, localzzuh);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzuh.zza zza()
  {
    return (zza)zzc.zzm();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzuh zza(zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return (zzuh)zzakg.zza(zzc, paramzzaiw, paramzzajv);
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzuj.zza[(paramInt - 1)])
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
    return new zzuh();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzuk zzc()
  {
    com.google.android.gms.internal.firebase-auth-api.zzuk localzzuk1 = zzf;
    com.google.android.gms.internal.firebase-auth-api.zzuk localzzuk2 = localzzuk1;
    if (localzzuk1 == null) {
      localzzuk2 = zzuk.zze();
    }
    return localzzuk2;
  }
  
  public static final class zza
    extends zzakg.zzb<zzuh, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzuh.zza zza(com.google.android.gms.internal.firebase-auth-api.zzuk paramzzuk)
    {
      zzg();
      zzuh.zza((zzuh)zza, paramzzuk);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzuh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
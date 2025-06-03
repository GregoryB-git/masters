package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzajv;
import com.google.android.gms.internal.firebase-auth-api.zzwo;
import java.io.InputStream;

public final class zzuz
  extends zzakg<zzuz, zza>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzuz zzc;
  private static volatile zzalw<zzuz> zzd;
  private int zze;
  private com.google.android.gms.internal.firebase-auth-api.zzaiw zzf = zzaiw.zza;
  private zzwo zzg;
  
  static
  {
    zzuz localzzuz = new zzuz();
    zzc = localzzuz;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzuz.class, localzzuz);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzuz.zza zza()
  {
    return (zza)zzc.zzm();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzuz zza(InputStream paramInputStream, zzajv paramzzajv)
  {
    return (zzuz)zzakg.zza(zzc, paramInputStream, paramzzajv);
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzuy.zza[(paramInt - 1)])
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
      return zzakg.zza(zzc, "\000\002\000\001\002\003\002\000\000\000\002\n\003ဉ\000", new Object[] { "zze", "zzf", "zzg" });
    case 2: 
      return new zza(null);
    }
    return new zzuz();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zzc()
  {
    return zzf;
  }
  
  public static final class zza
    extends zzakg.zzb<zzuz, zza>
    implements zzalp
  {
    private zza()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzuz.zza zza()
    {
      zzg();
      zzuz.zza((zzuz)zza);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzuz.zza zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
    {
      zzg();
      zzuz.zza((zzuz)zza, paramzzaiw);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzuz.zza zza(zzwo paramzzwo)
    {
      zzg();
      zzuz.zza((zzuz)zza, paramzzwo);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzuz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
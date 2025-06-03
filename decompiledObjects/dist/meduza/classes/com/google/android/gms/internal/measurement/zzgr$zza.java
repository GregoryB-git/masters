package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgr$zza
  extends zzkg<zza, zza>
  implements zzlo
{
  private static final zza zzc;
  private static volatile zzlz<zza> zzd;
  private zzkm<zzgr.zzb> zze = zzkg.zzcl();
  
  static
  {
    zza localzza = new zza();
    zzc = localzza;
    zzkg.zza(zza.class, localzza);
  }
  
  public static zza zzc()
  {
    return zzc;
  }
  
  public final int zza()
  {
    return zze.size();
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzgq.zza[(paramInt - 1)])
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
            paramObject1 = new com/google/android/gms/internal/measurement/zzkg$zzc;
            ((zzkg.zzc)paramObject1).<init>(zzc);
            zzd = (zzlz)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzc;
    case 3: 
      return zzkg.zza(zzc, "\004\001\000\000\001\001\001\000\001\000\001\033", new Object[] { "zze", zzgr.zzb.class });
    case 2: 
      return new zza(null);
    }
    return new zza();
  }
  
  public final List<zzgr.zzb> zzd()
  {
    return zze;
  }
  
  public static final class zza
    extends zzkg.zza<zzgr.zza, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgr.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
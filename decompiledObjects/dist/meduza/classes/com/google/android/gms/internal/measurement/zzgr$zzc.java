package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgr$zzc
  extends zzkg<zzc, zza>
  implements zzlo
{
  private static final zzc zzc;
  private static volatile zzlz<zzc> zzd;
  private int zze;
  private zzkm<zzgr.zzd> zzf = zzkg.zzcl();
  private zzgr.zza zzg;
  
  static
  {
    zzc localzzc = new zzc();
    zzc = localzzc;
    zzkg.zza(zzc.class, localzzc);
  }
  
  public final zzgr.zza zza()
  {
    zzgr.zza localzza1 = zzg;
    zzgr.zza localzza2 = localzza1;
    if (localzza1 == null) {
      localzza2 = zzgr.zza.zzc();
    }
    return localzza2;
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
      return zzkg.zza(zzc, "\004\002\000\001\001\002\002\000\001\000\001\033\002ဉ\000", new Object[] { "zze", "zzf", zzgr.zzd.class, "zzg" });
    case 2: 
      return new zza(null);
    }
    return new zzc();
  }
  
  public final List<zzgr.zzd> zzc()
  {
    return zzf;
  }
  
  public static final class zza
    extends zzkg.zza<zzgr.zzc, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgr.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
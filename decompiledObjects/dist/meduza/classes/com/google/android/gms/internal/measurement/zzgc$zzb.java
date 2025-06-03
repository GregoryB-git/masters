package com.google.android.gms.internal.measurement;

public final class zzgc$zzb
  extends zzkg<zzb, zza>
  implements zzlo
{
  private static final zzb zzc;
  private static volatile zzlz<zzb> zzd;
  private int zze;
  private String zzf = "";
  private zzkm<zzgc.zzg> zzg = zzkg.zzcl();
  private boolean zzh;
  
  static
  {
    zzb localzzb = new zzb();
    zzc = localzzb;
    zzkg.zza(zzb.class, localzzb);
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzgb.zza[(paramInt - 1)])
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
      return zzkg.zza(zzc, "\004\003\000\001\001\003\003\000\001\000\001ဈ\000\002\033\003ဇ\001", new Object[] { "zze", "zzf", "zzg", zzgc.zzg.class, "zzh" });
    case 2: 
      return new zza(null);
    }
    return new zzb();
  }
  
  public final String zzb()
  {
    return zzf;
  }
  
  public static final class zza
    extends zzkg.zza<zzgc.zzb, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgc.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
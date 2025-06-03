package com.google.android.gms.internal.measurement;

public final class zzgc$zzf
  extends zzkg<zzf, zza>
  implements zzlo
{
  private static final zzf zzc;
  private static volatile zzlz<zzf> zzd;
  private int zze;
  private int zzf = 14;
  private int zzg = 11;
  private int zzh = 60;
  
  static
  {
    zzf localzzf = new zzf();
    zzc = localzzf;
    zzkg.zza(zzf.class, localzzf);
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
      return zzkg.zza(zzc, "\004\003\000\001\001\003\003\000\000\000\001င\000\002င\001\003င\002", new Object[] { "zze", "zzf", "zzg", "zzh" });
    case 2: 
      return new zza(null);
    }
    return new zzf();
  }
  
  public static final class zza
    extends zzkg.zza<zzgc.zzf, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgc.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
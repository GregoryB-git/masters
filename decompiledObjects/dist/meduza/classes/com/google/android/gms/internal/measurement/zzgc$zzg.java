package com.google.android.gms.internal.measurement;

public final class zzgc$zzg
  extends zzkg<zzg, zza>
  implements zzlo
{
  private static final zzg zzc;
  private static volatile zzlz<zzg> zzd;
  private int zze;
  private String zzf = "";
  private String zzg = "";
  
  static
  {
    zzg localzzg = new zzg();
    zzc = localzzg;
    zzkg.zza(zzg.class, localzzg);
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
      return zzkg.zza(zzc, "\004\002\000\001\001\002\002\000\000\000\001ဈ\000\002ဈ\001", new Object[] { "zze", "zzf", "zzg" });
    case 2: 
      return new zza(null);
    }
    return new zzg();
  }
  
  public static final class zza
    extends zzkg.zza<zzgc.zzg, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgc.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.measurement;

public final class zzgf$zzi
  extends zzkg<zzi, zza>
  implements zzlo
{
  private static final zzi zzc;
  private static volatile zzlz<zzi> zzd;
  private int zze;
  private String zzf = "";
  private String zzg = "";
  private zzgf.zzb zzh;
  
  static
  {
    zzi localzzi = new zzi();
    zzc = localzzi;
    zzkg.zza(zzi.class, localzzi);
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzgi.zza[(paramInt - 1)])
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
      return zzkg.zza(zzc, "\004\003\000\001\001\003\003\000\000\000\001ဈ\000\002ဈ\001\003ဉ\002", new Object[] { "zze", "zzf", "zzg", "zzh" });
    case 2: 
      return new zza(null);
    }
    return new zzi();
  }
  
  public static final class zza
    extends zzkg.zza<zzgf.zzi, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgf.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
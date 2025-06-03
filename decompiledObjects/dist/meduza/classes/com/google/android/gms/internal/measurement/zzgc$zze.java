package com.google.android.gms.internal.measurement;

public final class zzgc$zze
  extends zzkg<zze, zza>
  implements zzlo
{
  private static final zze zzc;
  private static volatile zzlz<zze> zzd;
  private zzkm<String> zze = zzkg.zzcl();
  
  static
  {
    zze localzze = new zze();
    zzc = localzze;
    zzkg.zza(zze.class, localzze);
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
      return zzkg.zza(zzc, "\004\001\000\000\001\001\001\000\001\000\001\032", new Object[] { "zze" });
    case 2: 
      return new zza(null);
    }
    return new zze();
  }
  
  public static final class zza
    extends zzkg.zza<zzgc.zze, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgc.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgf$zzn
  extends zzkg<zzn, zza>
  implements zzlo
{
  private static final zzn zzc;
  private static volatile zzlz<zzn> zzd;
  private int zze;
  private int zzf;
  private zzkn zzg = zzkg.zzck();
  
  static
  {
    zzn localzzn = new zzn();
    zzc = localzzn;
    zzkg.zza(zzn.class, localzzn);
  }
  
  public static zza zzc()
  {
    return (zza)zzc.zzcg();
  }
  
  public final int zza()
  {
    return zzg.size();
  }
  
  public final long zza(int paramInt)
  {
    return zzg.zzb(paramInt);
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
      return zzkg.zza(zzc, "\004\002\000\001\001\002\002\000\001\000\001င\000\002\024", new Object[] { "zze", "zzf", "zzg" });
    case 2: 
      return new zza(null);
    }
    return new zzn();
  }
  
  public final int zzb()
  {
    return zzf;
  }
  
  public final List<Long> zze()
  {
    return zzg;
  }
  
  public final boolean zzf()
  {
    return (zze & 0x1) != 0;
  }
  
  public static final class zza
    extends zzkg.zza<zzgf.zzn, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
    
    public final zza zza(int paramInt)
    {
      zzam();
      zzgf.zzn.zza((zzgf.zzn)zza, paramInt);
      return this;
    }
    
    public final zza zza(Iterable<? extends Long> paramIterable)
    {
      zzam();
      zzgf.zzn.zza((zzgf.zzn)zza, paramIterable);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgf.zzn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
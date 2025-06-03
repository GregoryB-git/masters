package com.google.android.gms.internal.measurement;

import java.util.List;

final class zzkz
  implements zzkw
{
  private static <E> zzkm<E> zzc(Object paramObject, long paramLong)
  {
    return (zzkm)zzmz.zze(paramObject, paramLong);
  }
  
  public final <L> List<L> zza(Object paramObject, long paramLong)
  {
    zzkm localzzkm1 = zzc(paramObject, paramLong);
    zzkm localzzkm2 = localzzkm1;
    if (!localzzkm1.zzc())
    {
      int i = localzzkm1.size();
      if (i == 0) {
        i = 10;
      } else {
        i <<= 1;
      }
      localzzkm2 = localzzkm1.zza(i);
      zzmz.zza(paramObject, paramLong, localzzkm2);
    }
    return localzzkm2;
  }
  
  public final <E> void zza(Object paramObject1, Object paramObject2, long paramLong)
  {
    Object localObject = zzc(paramObject1, paramLong);
    zzkm localzzkm = zzc(paramObject2, paramLong);
    int i = ((List)localObject).size();
    int j = localzzkm.size();
    paramObject2 = localObject;
    if (i > 0)
    {
      paramObject2 = localObject;
      if (j > 0)
      {
        paramObject2 = localObject;
        if (!((zzkm)localObject).zzc()) {
          paramObject2 = ((zzkm)localObject).zza(j + i);
        }
        ((List)paramObject2).addAll(localzzkm);
      }
    }
    localObject = localzzkm;
    if (i > 0) {
      localObject = paramObject2;
    }
    zzmz.zza(paramObject1, paramLong, localObject);
  }
  
  public final void zzb(Object paramObject, long paramLong)
  {
    zzc(paramObject, paramLong).zzb();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
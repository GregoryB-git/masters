package com.google.android.gms.internal.auth;

import java.util.List;

final class zzfj
  extends zzfl
{
  private zzfj()
  {
    super(null);
  }
  
  public final void zza(Object paramObject, long paramLong)
  {
    ((zzez)zzhj.zzf(paramObject, paramLong)).zzb();
  }
  
  public final void zzb(Object paramObject1, Object paramObject2, long paramLong)
  {
    zzez localzzez1 = (zzez)zzhj.zzf(paramObject1, paramLong);
    zzez localzzez2 = (zzez)zzhj.zzf(paramObject2, paramLong);
    int i = localzzez1.size();
    int j = localzzez2.size();
    paramObject2 = localzzez1;
    if (i > 0)
    {
      paramObject2 = localzzez1;
      if (j > 0)
      {
        paramObject2 = localzzez1;
        if (!localzzez1.zzc()) {
          paramObject2 = localzzez1.zzd(j + i);
        }
        ((List)paramObject2).addAll(localzzez2);
      }
    }
    if (i <= 0) {
      paramObject2 = localzzez2;
    }
    zzhj.zzp(paramObject1, paramLong, paramObject2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzfj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
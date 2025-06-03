package com.google.android.recaptcha.internal;

abstract class zzpl
{
  private static volatile int zza = 100;
  
  public abstract Object zza(Object paramObject);
  
  public abstract Object zzb();
  
  public abstract Object zzc(Object paramObject);
  
  public abstract void zzd(Object paramObject, int paramInt1, int paramInt2);
  
  public abstract void zze(Object paramObject, int paramInt, long paramLong);
  
  public abstract void zzf(Object paramObject1, int paramInt, Object paramObject2);
  
  public abstract void zzg(Object paramObject, int paramInt, zzle paramzzle);
  
  public abstract void zzh(Object paramObject, int paramInt, long paramLong);
  
  public abstract void zzi(Object paramObject);
  
  public abstract void zzj(Object paramObject1, Object paramObject2);
  
  public final boolean zzk(Object paramObject, zzov paramzzov, int paramInt)
  {
    int i = paramzzov.zzd();
    int j = i >>> 3;
    i &= 0x7;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              if (i == 5)
              {
                zzd(paramObject, j, paramzzov.zzf());
                return true;
              }
              throw new zznm("Protocol message tag had invalid wire type.");
            }
            return false;
          }
          Object localObject = zzb();
          paramInt++;
          if (paramInt < zza)
          {
            while ((paramzzov.zzc() != Integer.MAX_VALUE) && (zzk(localObject, paramzzov, paramInt))) {}
            if ((j << 3 | 0x4) == paramzzov.zzd())
            {
              zzf(paramObject, j, zzc(localObject));
              return true;
            }
            throw new zznn("Protocol message end-group tag did not match expected tag.");
          }
          throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        zzg(paramObject, j, paramzzov.zzp());
        return true;
      }
      zze(paramObject, j, paramzzov.zzk());
      return true;
    }
    zzh(paramObject, j, paramzzov.zzl());
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
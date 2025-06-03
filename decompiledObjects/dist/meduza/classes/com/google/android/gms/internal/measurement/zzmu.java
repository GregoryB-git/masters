package com.google.android.gms.internal.measurement;

abstract class zzmu<T, B>
{
  private static volatile int zza = 100;
  
  public abstract int zza(T paramT);
  
  public abstract B zza();
  
  public abstract T zza(T paramT1, T paramT2);
  
  public abstract void zza(B paramB, int paramInt1, int paramInt2);
  
  public abstract void zza(B paramB, int paramInt, long paramLong);
  
  public abstract void zza(B paramB, int paramInt, zziy paramzziy);
  
  public abstract void zza(B paramB, int paramInt, T paramT);
  
  public abstract void zza(T paramT, zznl paramzznl);
  
  public abstract boolean zza(zzmf paramzzmf);
  
  public final boolean zza(B paramB, zzmf paramzzmf, int paramInt)
  {
    int i = paramzzmf.zzd();
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
                zza(paramB, j, paramzzmf.zzf());
                return true;
              }
              throw zzkp.zza();
            }
            if (paramInt != 0) {
              return false;
            }
            throw zzkp.zzb();
          }
          Object localObject = zza();
          paramInt++;
          if (paramInt < zza)
          {
            while ((paramzzmf.zzc() != Integer.MAX_VALUE) && (zza(localObject, paramzzmf, paramInt))) {}
            if ((0x4 | j << 3) == paramzzmf.zzd())
            {
              zza(paramB, j, zze(localObject));
              return true;
            }
            throw zzkp.zzb();
          }
          throw zzkp.zzh();
        }
        zza(paramB, j, paramzzmf.zzp());
        return true;
      }
      zza(paramB, j, paramzzmf.zzk());
      return true;
    }
    zzb(paramB, j, paramzzmf.zzl());
    return true;
  }
  
  public abstract int zzb(T paramT);
  
  public abstract void zzb(B paramB, int paramInt, long paramLong);
  
  public abstract void zzb(T paramT, zznl paramzznl);
  
  public abstract void zzb(Object paramObject, B paramB);
  
  public abstract B zzc(Object paramObject);
  
  public abstract void zzc(Object paramObject, T paramT);
  
  public abstract T zzd(Object paramObject);
  
  public abstract T zze(B paramB);
  
  public abstract void zzf(Object paramObject);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzmu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
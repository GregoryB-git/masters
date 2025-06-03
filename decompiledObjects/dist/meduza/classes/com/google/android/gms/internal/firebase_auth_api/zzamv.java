package com.google.android.gms.internal.firebase_auth_api;

abstract class zzamv<T, B>
{
  private static volatile int zza = 100;
  
  public abstract int zza(T paramT);
  
  public abstract B zza();
  
  public abstract T zza(T paramT1, T paramT2);
  
  public abstract void zza(B paramB, int paramInt1, int paramInt2);
  
  public abstract void zza(B paramB, int paramInt, long paramLong);
  
  public abstract void zza(B paramB, int paramInt, zzaiw paramzzaiw);
  
  public abstract void zza(B paramB, int paramInt, T paramT);
  
  public abstract void zza(T paramT, zzanm paramzzanm);
  
  public abstract boolean zza(com.google.android.gms.internal.firebase-auth-api.zzamd paramzzamd);
  
  public final boolean zza(B paramB, zzamd paramzzamd, int paramInt)
  {
    int i = paramzzamd.zzd();
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
                zza(paramB, j, paramzzamd.zzf());
                return true;
              }
              throw zzakm.zza();
            }
            if (paramInt != 0) {
              return false;
            }
            throw zzakm.zzb();
          }
          Object localObject = zza();
          paramInt++;
          if (paramInt < zza)
          {
            while ((paramzzamd.zzc() != Integer.MAX_VALUE) && (zza(localObject, paramzzamd, paramInt))) {}
            if ((0x4 | j << 3) == paramzzamd.zzd())
            {
              zza(paramB, j, zze(localObject));
              return true;
            }
            throw zzakm.zzb();
          }
          throw zzakm.zzh();
        }
        zza(paramB, j, paramzzamd.zzp());
        return true;
      }
      zza(paramB, j, paramzzamd.zzk());
      return true;
    }
    zzb(paramB, j, paramzzamd.zzl());
    return true;
  }
  
  public abstract int zzb(T paramT);
  
  public abstract void zzb(B paramB, int paramInt, long paramLong);
  
  public abstract void zzb(T paramT, zzanm paramzzanm);
  
  public abstract void zzb(Object paramObject, B paramB);
  
  public abstract B zzc(Object paramObject);
  
  public abstract void zzc(Object paramObject, T paramT);
  
  public abstract T zzd(Object paramObject);
  
  public abstract T zze(B paramB);
  
  public abstract void zzf(Object paramObject);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzamv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
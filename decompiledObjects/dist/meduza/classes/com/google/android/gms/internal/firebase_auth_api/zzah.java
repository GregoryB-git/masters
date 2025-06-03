package com.google.android.gms.internal.firebase_auth_api;

import java.util.Arrays;

class zzah<E>
  extends zzak<E>
{
  public Object[] zza;
  public int zzb;
  public boolean zzc;
  
  public zzah(int paramInt)
  {
    zzag.zza(4, "initialCapacity");
    zza = new Object[4];
    zzb = 0;
  }
  
  public zzah<E> zza(E paramE)
  {
    zzw.zza(paramE);
    Object[] arrayOfObject = zza;
    int i = zzak.zza(arrayOfObject.length, zzb + 1);
    if ((i > arrayOfObject.length) || (zzc))
    {
      zza = Arrays.copyOf(zza, i);
      zzc = false;
    }
    arrayOfObject = zza;
    i = zzb;
    zzb = (i + 1);
    arrayOfObject[i] = paramE;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzah
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
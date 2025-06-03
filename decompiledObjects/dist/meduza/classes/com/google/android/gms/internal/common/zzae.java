package com.google.android.gms.internal.common;

import java.util.Arrays;

class zzae
  extends zzaf
{
  public Object[] zza = new Object[4];
  public int zzb = 0;
  public boolean zzc;
  
  public zzae(int paramInt) {}
  
  public final zzae zza(Object paramObject)
  {
    paramObject.getClass();
    int i = zza.length;
    int j = zzb + 1;
    if (j >= 0)
    {
      int k;
      if (j <= i)
      {
        k = i;
      }
      else
      {
        k = (i >> 1) + i + 1;
        m = k;
        if (k < j)
        {
          m = Integer.highestOneBit(j - 1);
          m += m;
        }
        k = m;
        if (m < 0) {
          k = Integer.MAX_VALUE;
        }
      }
      if ((k > i) || (zzc))
      {
        zza = Arrays.copyOf(zza, k);
        zzc = false;
      }
      Object[] arrayOfObject = zza;
      int m = zzb;
      zzb = (m + 1);
      arrayOfObject[m] = paramObject;
      return this;
    }
    throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.common.zzae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
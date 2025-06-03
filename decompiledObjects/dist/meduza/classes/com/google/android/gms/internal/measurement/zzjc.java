package com.google.android.gms.internal.measurement;

import a0.j;
import g;

final class zzjc
  extends zzjf
{
  private final int zzc;
  private final int zzd;
  
  public zzjc(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramArrayOfByte);
    zziy.zza(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    zzc = paramInt1;
    zzd = paramInt2;
  }
  
  public final byte zza(int paramInt)
  {
    int i = zzb();
    if ((i - (paramInt + 1) | paramInt) < 0)
    {
      if (paramInt < 0) {
        throw new ArrayIndexOutOfBoundsException(j.g("Index < 0: ", paramInt));
      }
      throw new ArrayIndexOutOfBoundsException(g.c("Index > length: ", paramInt, ", ", i));
    }
    return zzb[(zzc + paramInt)];
  }
  
  public final byte zzb(int paramInt)
  {
    return zzb[(zzc + paramInt)];
  }
  
  public final int zzb()
  {
    return zzd;
  }
  
  public final int zzc()
  {
    return zzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzjc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
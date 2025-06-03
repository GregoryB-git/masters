package com.google.android.gms.internal.auth;

import f;

final class zzdz
  extends zzec
{
  private final int zzc;
  
  public zzdz(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramArrayOfByte);
    zzef.zzi(0, paramInt2, paramArrayOfByte.length);
    zzc = paramInt2;
  }
  
  public final byte zza(int paramInt)
  {
    int i = zzc;
    if ((i - (paramInt + 1) | paramInt) < 0)
    {
      if (paramInt < 0) {
        throw new ArrayIndexOutOfBoundsException(f.h("Index < 0: ", paramInt));
      }
      throw new ArrayIndexOutOfBoundsException(f.i("Index > length: ", paramInt, ", ", i));
    }
    return zza[paramInt];
  }
  
  public final byte zzb(int paramInt)
  {
    return zza[paramInt];
  }
  
  public final int zzc()
  {
    return 0;
  }
  
  public final int zzd()
  {
    return zzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzdz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
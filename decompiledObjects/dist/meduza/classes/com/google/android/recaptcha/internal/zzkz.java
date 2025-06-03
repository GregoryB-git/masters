package com.google.android.recaptcha.internal;

import f;

final class zzkz
  extends zzlc
{
  private final int zzc;
  
  public zzkz(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramArrayOfByte);
    zzle.zzi(0, paramInt2, paramArrayOfByte.length);
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
  
  public final void zze(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(zza, 0, paramArrayOfByte, 0, paramInt3);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzkz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
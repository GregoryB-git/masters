package com.google.android.gms.internal.fido;

import f;

final class zzct
  extends zzcw
{
  private final int zzc;
  private final int zzd;
  
  public zzct(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramArrayOfByte);
    zzcz.zzj(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    zzc = paramInt1;
    zzd = paramInt2;
  }
  
  public final byte zza(int paramInt)
  {
    int i = zzd;
    if ((i - (paramInt + 1) | paramInt) < 0)
    {
      if (paramInt < 0) {
        throw new ArrayIndexOutOfBoundsException(f.h("Index < 0: ", paramInt));
      }
      throw new ArrayIndexOutOfBoundsException(f.i("Index > length: ", paramInt, ", ", i));
    }
    return zza[(zzc + paramInt)];
  }
  
  public final byte zzb(int paramInt)
  {
    return zza[(zzc + paramInt)];
  }
  
  public final int zzc()
  {
    return zzc;
  }
  
  public final int zzd()
  {
    return zzd;
  }
  
  public final void zze(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(zza, zzc, paramArrayOfByte, 0, paramInt3);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzct
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
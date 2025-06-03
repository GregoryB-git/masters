package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import g;

final class zzaja
  extends zzajh
{
  private final int zzc;
  private final int zzd;
  
  public zzaja(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramArrayOfByte);
    zzaiw.zza(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
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
  
  public final void zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(zzb, zze(), paramArrayOfByte, 0, paramInt3);
  }
  
  public final byte zzb(int paramInt)
  {
    return zzb[(zzc + paramInt)];
  }
  
  public final int zzb()
  {
    return zzd;
  }
  
  public final int zze()
  {
    return zzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaja
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
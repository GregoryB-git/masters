package com.google.android.recaptcha.internal;

import java.io.Serializable;

final class zzju
  extends zzjv
  implements Serializable
{
  public final byte[] zza;
  
  public zzju(byte[] paramArrayOfByte)
  {
    paramArrayOfByte.getClass();
    zza = paramArrayOfByte;
  }
  
  public final int zza()
  {
    byte[] arrayOfByte = zza;
    int i = arrayOfByte.length;
    if (i >= 4)
    {
      int j = arrayOfByte[0];
      int k = arrayOfByte[1];
      i = arrayOfByte[2];
      return (arrayOfByte[3] & 0xFF) << 24 | j & 0xFF | (k & 0xFF) << 8 | (i & 0xFF) << 16;
    }
    throw new IllegalStateException(zzji.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", new Object[] { Integer.valueOf(i) }));
  }
  
  public final int zzb()
  {
    return zza.length * 8;
  }
  
  public final boolean zzc(zzjv paramzzjv)
  {
    int i = paramzzjv.zze().length;
    if (zza.length == i)
    {
      boolean bool1 = true;
      for (i = 0;; i++)
      {
        byte[] arrayOfByte = zza;
        if (i >= arrayOfByte.length) {
          break;
        }
        boolean bool2;
        if (arrayOfByte[i] == paramzzjv.zze()[i]) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        bool1 &= bool2;
      }
      return bool1;
    }
    return false;
  }
  
  public final byte[] zzd()
  {
    return (byte[])zza.clone();
  }
  
  public final byte[] zze()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzju
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
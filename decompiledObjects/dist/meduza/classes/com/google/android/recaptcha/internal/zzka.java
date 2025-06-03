package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

final class zzka
  extends zzjr
{
  private final MessageDigest zza;
  private final int zzb;
  private boolean zzc;
  
  private final void zzc()
  {
    zzjf.zze(zzc ^ true, "Cannot re-use a Hasher after calling hash() on it");
  }
  
  public final void zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zzc();
    zza.update(paramArrayOfByte, 0, paramInt2);
  }
  
  public final zzjv zzb()
  {
    zzc();
    zzc = true;
    int i = zzb;
    Object localObject;
    if (i == zza.getDigestLength())
    {
      localObject = zza.digest();
      i = zzjv.zzb;
      localObject = new zzju((byte[])localObject);
    }
    else
    {
      localObject = Arrays.copyOf(zza.digest(), i);
      i = zzjv.zzb;
      localObject = new zzju((byte[])localObject);
    }
    return (zzjv)localObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzka
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
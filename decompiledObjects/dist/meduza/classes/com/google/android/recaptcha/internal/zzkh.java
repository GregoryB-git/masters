package com.google.android.recaptcha.internal;

import java.io.IOException;

public abstract class zzkh
{
  private static final zzkh zza;
  private static final zzkh zzb;
  
  static
  {
    Object localObject = Character.valueOf('=');
    zza = new zzke("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", (Character)localObject);
    zzb = new zzke("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", (Character)localObject);
    new zzkg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", (Character)localObject);
    new zzkg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", (Character)localObject);
    localObject = new zzkd("base16()", "0123456789ABCDEF".toCharArray());
    new zzkg((zzkd)localObject, null);
    char[] arrayOfChar = new char['Ȁ'];
    int i = zzkd.zze((zzkd)localObject).length;
    int j = 0;
    boolean bool;
    if (i == 16) {
      bool = true;
    } else {
      bool = false;
    }
    zzjf.zza(bool);
    while (j < 256)
    {
      arrayOfChar[j] = ((zzkd)localObject).zza(j >>> 4);
      arrayOfChar[(j | 0x100)] = ((zzkd)localObject).zza(j & 0xF);
      j++;
    }
  }
  
  public static zzkh zzg()
  {
    return zza;
  }
  
  public static zzkh zzh()
  {
    return zzb;
  }
  
  public abstract int zza(byte[] paramArrayOfByte, CharSequence paramCharSequence);
  
  public abstract void zzb(Appendable paramAppendable, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract int zzc(int paramInt);
  
  public abstract int zzd(int paramInt);
  
  public CharSequence zze(CharSequence paramCharSequence)
  {
    throw null;
  }
  
  public final String zzi(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zzjf.zzd(0, paramInt2, paramArrayOfByte.length);
    StringBuilder localStringBuilder = new StringBuilder(zzd(paramInt2));
    try
    {
      zzb(localStringBuilder, paramArrayOfByte, 0, paramInt2);
      return localStringBuilder.toString();
    }
    catch (IOException paramArrayOfByte)
    {
      throw new AssertionError(paramArrayOfByte);
    }
  }
  
  public final byte[] zzj(CharSequence paramCharSequence)
  {
    try
    {
      Object localObject = zze(paramCharSequence);
      int i = zzc(((CharSequence)localObject).length());
      paramCharSequence = new byte[i];
      int j = zza(paramCharSequence, (CharSequence)localObject);
      if (j != i)
      {
        localObject = new byte[j];
        System.arraycopy(paramCharSequence, 0, localObject, 0, j);
        paramCharSequence = (CharSequence)localObject;
      }
      return paramCharSequence;
    }
    catch (zzkf paramCharSequence)
    {
      throw new IllegalArgumentException(paramCharSequence);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzkh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
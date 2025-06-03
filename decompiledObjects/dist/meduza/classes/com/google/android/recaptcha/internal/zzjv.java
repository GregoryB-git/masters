package com.google.android.recaptcha.internal;

public abstract class zzjv
{
  private static final char[] zza = "0123456789abcdef".toCharArray();
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof zzjv))
    {
      paramObject = (zzjv)paramObject;
      if ((zzb() == ((zzjv)paramObject).zzb()) && (zzc((zzjv)paramObject))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    if (zzb() >= 32) {
      return zza();
    }
    byte[] arrayOfByte = zze();
    int i = arrayOfByte[0] & 0xFF;
    for (int j = 1; j < arrayOfByte.length; j++) {
      i |= (arrayOfByte[j] & 0xFF) << j * 8;
    }
    return i;
  }
  
  public final String toString()
  {
    byte[] arrayOfByte = zze();
    int i = arrayOfByte.length;
    StringBuilder localStringBuilder = new StringBuilder(i + i);
    for (int j = 0; j < i; j++)
    {
      int k = arrayOfByte[j];
      char[] arrayOfChar = zza;
      localStringBuilder.append(arrayOfChar[(k >> 4 & 0xF)]);
      localStringBuilder.append(arrayOfChar[(k & 0xF)]);
    }
    return localStringBuilder.toString();
  }
  
  public abstract int zza();
  
  public abstract int zzb();
  
  public abstract boolean zzc(zzjv paramzzjv);
  
  public abstract byte[] zzd();
  
  public byte[] zze()
  {
    throw null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzjv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
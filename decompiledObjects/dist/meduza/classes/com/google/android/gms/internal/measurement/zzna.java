package com.google.android.gms.internal.measurement;

final class zzna
{
  private static final zznb zza = new zzne();
  
  static
  {
    if (zzmz.zzc()) {
      zzmz.zzd();
    }
  }
  
  public static int zza(String paramString)
  {
    int i = paramString.length();
    int j = 0;
    for (int k = 0; (k < i) && (paramString.charAt(k) < ''); k++) {}
    int m = i;
    for (;;)
    {
      n = m;
      if (k >= i) {
        break label203;
      }
      n = paramString.charAt(k);
      if (n >= 2048) {
        break;
      }
      m += (127 - n >>> 31);
      k++;
    }
    int i1 = paramString.length();
    int n = j;
    while (k < i1)
    {
      int i2 = paramString.charAt(k);
      if (i2 < 2048)
      {
        n += (127 - i2 >>> 31);
        j = k;
      }
      else
      {
        int i3 = n + 2;
        n = i3;
        j = k;
        if (55296 <= i2)
        {
          n = i3;
          j = k;
          if (i2 <= 57343) {
            if (Character.codePointAt(paramString, k) >= 65536)
            {
              j = k + 1;
              n = i3;
            }
            else
            {
              throw new zznd(k, i1);
            }
          }
        }
      }
      k = j + 1;
    }
    n = m + n;
    label203:
    if (n >= i) {
      return n;
    }
    long l = n;
    paramString = new StringBuilder("UTF-8 length does not fit in int: ");
    paramString.append(l + 4294967296L);
    throw new IllegalArgumentException(paramString.toString());
  }
  
  public static int zza(String paramString, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return zza.zza(paramString, paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static String zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return zza.zza(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static boolean zzc(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return zza.zza(0, paramArrayOfByte, paramInt1, paramInt2) == 0;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzna
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
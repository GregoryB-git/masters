package com.google.android.recaptcha.internal;

import f;

final class zzpv
{
  static
  {
    if ((zzps.zzx()) && (zzps.zzy())) {
      int i = zzks.zza;
    }
  }
  
  public static int zzb(String paramString, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramString.length();
    int k;
    int m;
    int n;
    for (int j = 0;; j++)
    {
      k = paramInt1 + paramInt2;
      if (j >= i) {
        break;
      }
      m = j + paramInt1;
      if (m >= k) {
        break;
      }
      n = paramString.charAt(j);
      if (n >= 128) {
        break;
      }
      paramArrayOfByte[m] = ((byte)(byte)n);
    }
    if (j == i)
    {
      j = paramInt1 + i;
    }
    else
    {
      paramInt1 += j;
      int i1;
      for (paramInt2 = j;; paramInt2++)
      {
        j = paramInt1;
        if (paramInt2 >= i) {
          break label535;
        }
        i1 = paramString.charAt(paramInt2);
        if ((i1 < 128) && (paramInt1 < k))
        {
          paramArrayOfByte[paramInt1] = ((byte)(byte)i1);
          paramInt1++;
        }
        else if ((i1 < 2048) && (paramInt1 <= k - 2))
        {
          j = paramInt1 + 1;
          paramArrayOfByte[paramInt1] = ((byte)(byte)(i1 >>> 6 | 0x3C0));
          paramArrayOfByte[j] = ((byte)(byte)(i1 & 0x3F | 0x80));
          paramInt1 = j + 1;
        }
        else if (((i1 < 55296) || (i1 > 57343)) && (paramInt1 <= k - 3))
        {
          m = paramInt1 + 1;
          j = m + 1;
          paramArrayOfByte[paramInt1] = ((byte)(byte)(i1 >>> 12 | 0x1E0));
          paramArrayOfByte[m] = ((byte)(byte)(i1 >>> 6 & 0x3F | 0x80));
          paramArrayOfByte[j] = ((byte)(byte)(i1 & 0x3F | 0x80));
          paramInt1 = j + 1;
        }
        else
        {
          if (paramInt1 > k - 4) {
            break label435;
          }
          j = paramInt2 + 1;
          if (j == paramString.length()) {
            break label422;
          }
          char c = paramString.charAt(j);
          if (!Character.isSurrogatePair(i1, c)) {
            break;
          }
          n = paramInt1 + 1;
          int i2 = n + 1;
          paramInt2 = i2 + 1;
          m = Character.toCodePoint(i1, c);
          paramArrayOfByte[paramInt1] = ((byte)(byte)(m >>> 18 | 0xF0));
          paramArrayOfByte[n] = ((byte)(byte)(m >>> 12 & 0x3F | 0x80));
          paramArrayOfByte[i2] = ((byte)(byte)(m >>> 6 & 0x3F | 0x80));
          paramInt1 = paramInt2 + 1;
          paramArrayOfByte[paramInt2] = ((byte)(byte)(m & 0x3F | 0x80));
          paramInt2 = j;
        }
      }
      paramInt2 = j;
      label422:
      throw new zzpu(paramInt2 - 1, i);
      label435:
      if ((i1 >= 55296) && (i1 <= 57343))
      {
        j = paramInt2 + 1;
        if ((j == paramString.length()) || (!Character.isSurrogatePair(i1, paramString.charAt(j)))) {
          throw new zzpu(paramInt2, i);
        }
      }
      paramString = new StringBuilder();
      paramString.append("Failed writing ");
      paramString.append(i1);
      paramString.append(" at index ");
      paramString.append(paramInt1);
      throw new ArrayIndexOutOfBoundsException(paramString.toString());
    }
    label535:
    return j;
  }
  
  public static int zzc(String paramString)
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
        if (i2 >= 55296)
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
              throw new zzpu(k, i1);
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
    paramString = f.l("UTF-8 length does not fit in int: ");
    paramString.append(l + 4294967296L);
    throw new IllegalArgumentException(paramString.toString());
  }
  
  public static String zzd(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfByte.length;
    if ((i - paramInt1 - paramInt2 | paramInt1 | paramInt2) >= 0)
    {
      int j = paramInt1 + paramInt2;
      char[] arrayOfChar = new char[paramInt2];
      int k = 0;
      i = paramInt1;
      byte b1;
      for (;;)
      {
        paramInt1 = k;
        paramInt2 = i;
        if (i >= j) {
          break;
        }
        b1 = paramArrayOfByte[i];
        paramInt1 = k;
        paramInt2 = i;
        if (!zzpt.zzd(b1)) {
          break;
        }
        i++;
        arrayOfChar[k] = ((char)(char)b1);
        k++;
      }
      while (paramInt2 < j)
      {
        i = paramInt2 + 1;
        b1 = paramArrayOfByte[paramInt2];
        if (zzpt.zzd(b1))
        {
          paramInt2 = paramInt1 + 1;
          arrayOfChar[paramInt1] = ((char)(char)b1);
          paramInt1 = paramInt2;
          for (;;)
          {
            k = paramInt1;
            paramInt1 = k;
            paramInt2 = i;
            if (i >= j) {
              break;
            }
            b1 = paramArrayOfByte[i];
            paramInt1 = k;
            paramInt2 = i;
            if (!zzpt.zzd(b1)) {
              break;
            }
            i++;
            paramInt1 = k + 1;
            arrayOfChar[k] = ((char)(char)b1);
          }
        }
        if (b1 < -32)
        {
          if (i < j)
          {
            zzpt.zzc(b1, paramArrayOfByte[i], arrayOfChar, paramInt1);
            paramInt1++;
            paramInt2 = i + 1;
          }
          else
          {
            throw new zznn("Protocol message had invalid UTF-8.");
          }
        }
        else if (b1 < -16)
        {
          if (i < j - 1)
          {
            paramInt2 = i + 1;
            zzpt.zzb(b1, paramArrayOfByte[i], paramArrayOfByte[paramInt2], arrayOfChar, paramInt1);
            paramInt1++;
            paramInt2++;
          }
          else
          {
            throw new zznn("Protocol message had invalid UTF-8.");
          }
        }
        else if (i < j - 2)
        {
          paramInt2 = i + 1;
          byte b2 = paramArrayOfByte[i];
          i = paramInt2 + 1;
          zzpt.zza(b1, b2, paramArrayOfByte[paramInt2], paramArrayOfByte[i], arrayOfChar, paramInt1);
          paramInt1 += 2;
          paramInt2 = i + 1;
        }
        else
        {
          throw new zznn("Protocol message had invalid UTF-8.");
        }
      }
      return new String(arrayOfChar, 0, paramInt1);
    }
    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
  }
  
  public static boolean zze(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    for (int i = paramInt1; (i < paramInt2) && (paramArrayOfByte[i] >= 0); i++) {}
    paramInt1 = i;
    if (i < paramInt2) {
      label186:
      label243:
      label245:
      while (paramInt1 < paramInt2)
      {
        i = paramInt1 + 1;
        int j = paramArrayOfByte[paramInt1];
        paramInt1 = i;
        if (j < 0)
        {
          if (j < -32)
          {
            if (i >= paramInt2)
            {
              paramInt1 = j;
            }
            else
            {
              if (j < -62) {
                break label243;
              }
              paramInt1 = i + 1;
              if (paramArrayOfByte[i] <= -65) {
                continue;
              }
              break label243;
            }
          }
          else
          {
            if (j < -16)
            {
              if (i < paramInt2 - 1)
              {
                int k = i + 1;
                paramInt1 = paramArrayOfByte[i];
                if ((paramInt1 > -65) || ((j == -32) && (paramInt1 < -96)) || ((j == -19) && (paramInt1 >= -96))) {
                  break label243;
                }
                paramInt1 = k + 1;
                if (paramArrayOfByte[k] <= -65) {
                  continue;
                }
                break label243;
              }
            }
            else {
              if (i < paramInt2 - 2) {
                break label186;
              }
            }
            paramInt1 = zza(paramArrayOfByte, i, paramInt2);
          }
          if (paramInt1 == 0) {
            break;
          }
          break label243;
          paramInt1 = i + 1;
          i = paramArrayOfByte[i];
          if ((i <= -65) && (i + 112 + (j << 28) >> 30 == 0))
          {
            i = paramInt1 + 1;
            if (paramArrayOfByte[paramInt1] <= -65)
            {
              paramInt1 = i + 1;
              if (paramArrayOfByte[i] <= -65) {
                break label245;
              }
            }
          }
          return false;
        }
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzpv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
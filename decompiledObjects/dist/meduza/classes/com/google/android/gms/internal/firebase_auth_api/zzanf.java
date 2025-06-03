package com.google.android.gms.internal.firebase_auth_api;

final class zzanf
  extends zzanc
{
  public final int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    while ((paramInt2 < paramInt3) && (paramArrayOfByte[paramInt2] >= 0)) {
      paramInt2++;
    }
    paramInt1 = paramInt2;
    if (paramInt2 >= paramInt3) {
      return 0;
    }
    label241:
    for (;;)
    {
      if (paramInt1 >= paramInt3) {
        return 0;
      }
      paramInt2 = paramInt1 + 1;
      int i = paramArrayOfByte[paramInt1];
      paramInt1 = paramInt2;
      if (i < 0) {
        if (i < -32)
        {
          if (paramInt2 >= paramInt3) {
            return i;
          }
          if (i >= -62)
          {
            paramInt1 = paramInt2 + 1;
            if (paramArrayOfByte[paramInt2] <= -65) {}
          }
          else
          {
            return -1;
          }
        }
        else if (i < -16)
        {
          if (paramInt2 >= paramInt3 - 1) {
            return zzanb.zza(paramArrayOfByte, paramInt2, paramInt3);
          }
          int j = paramInt2 + 1;
          paramInt1 = paramArrayOfByte[paramInt2];
          if ((paramInt1 <= -65) && ((i != -32) || (paramInt1 >= -96)) && ((i != -19) || (paramInt1 < -96)))
          {
            paramInt1 = j + 1;
            if (paramArrayOfByte[j] <= -65) {}
          }
          else
          {
            return -1;
          }
        }
        else
        {
          if (paramInt2 >= paramInt3 - 2) {
            return zzanb.zza(paramArrayOfByte, paramInt2, paramInt3);
          }
          paramInt1 = paramInt2 + 1;
          paramInt2 = paramArrayOfByte[paramInt2];
          if ((paramInt2 <= -65) && (paramInt2 + 112 + (i << 28) >> 30 == 0))
          {
            paramInt2 = paramInt1 + 1;
            if (paramArrayOfByte[paramInt1] <= -65)
            {
              paramInt1 = paramInt2 + 1;
              if (paramArrayOfByte[paramInt2] <= -65) {
                break label241;
              }
            }
          }
          return -1;
        }
      }
    }
  }
  
  public final int zza(String paramString, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramString.length();
    int j = paramInt2 + paramInt1;
    int k;
    for (paramInt2 = 0; paramInt2 < i; paramInt2++)
    {
      k = paramInt2 + paramInt1;
      if (k >= j) {
        break;
      }
      m = paramString.charAt(paramInt2);
      if (m >= 128) {
        break;
      }
      paramArrayOfByte[k] = ((byte)(byte)m);
    }
    if (paramInt2 == i) {
      return paramInt1 + i;
    }
    int m = paramInt1 + paramInt2;
    paramInt1 = paramInt2;
    while (paramInt1 < i)
    {
      int n = paramString.charAt(paramInt1);
      if ((n < 128) && (m < j))
      {
        paramInt2 = m + 1;
        paramArrayOfByte[m] = ((byte)(byte)n);
      }
      for (;;)
      {
        break;
        if ((n < 2048) && (m <= j - 2))
        {
          k = m + 1;
          paramArrayOfByte[m] = ((byte)(byte)(n >>> 6 | 0x3C0));
          paramInt2 = k + 1;
          paramArrayOfByte[k] = ((byte)(byte)(n & 0x3F | 0x80));
        }
        else if (((n < 55296) || (57343 < n)) && (m <= j - 3))
        {
          paramInt2 = m + 1;
          paramArrayOfByte[m] = ((byte)(byte)(n >>> 12 | 0x1E0));
          m = paramInt2 + 1;
          paramArrayOfByte[paramInt2] = ((byte)(byte)(n >>> 6 & 0x3F | 0x80));
          paramInt2 = m + 1;
          paramArrayOfByte[m] = ((byte)(byte)(n & 0x3F | 0x80));
        }
        else
        {
          if (m > j - 4) {
            break label453;
          }
          paramInt2 = paramInt1 + 1;
          if (paramInt2 == paramString.length()) {
            break label440;
          }
          char c = paramString.charAt(paramInt2);
          if (!Character.isSurrogatePair(n, c)) {
            break label437;
          }
          paramInt1 = Character.toCodePoint(n, c);
          k = m + 1;
          paramArrayOfByte[m] = ((byte)(byte)(paramInt1 >>> 18 | 0xF0));
          m = k + 1;
          paramArrayOfByte[k] = ((byte)(byte)(paramInt1 >>> 12 & 0x3F | 0x80));
          k = m + 1;
          paramArrayOfByte[m] = ((byte)(byte)(paramInt1 >>> 6 & 0x3F | 0x80));
          m = k + 1;
          paramArrayOfByte[k] = ((byte)(byte)(paramInt1 & 0x3F | 0x80));
          paramInt1 = paramInt2;
          paramInt2 = m;
        }
      }
      paramInt1++;
      m = paramInt2;
      continue;
      label437:
      paramInt1 = paramInt2;
      label440:
      throw new zzane(paramInt1 - 1, i);
      label453:
      if ((55296 <= n) && (n <= 57343))
      {
        paramInt2 = paramInt1 + 1;
        if ((paramInt2 == paramString.length()) || (!Character.isSurrogatePair(n, paramString.charAt(paramInt2)))) {
          throw new zzane(paramInt1, i);
        }
      }
      paramString = new StringBuilder("Failed writing ");
      paramString.append(n);
      paramString.append(" at index ");
      paramString.append(m);
      throw new ArrayIndexOutOfBoundsException(paramString.toString());
    }
    return m;
  }
  
  public final String zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramInt1 | paramInt2 | paramArrayOfByte.length - paramInt1 - paramInt2) >= 0)
    {
      int i = paramInt1 + paramInt2;
      char[] arrayOfChar = new char[paramInt2];
      byte b1;
      for (paramInt2 = 0; paramInt1 < i; paramInt2++)
      {
        b1 = paramArrayOfByte[paramInt1];
        if (b1 >= 0) {
          j = 1;
        } else {
          j = 0;
        }
        if (j == 0) {
          break;
        }
        paramInt1++;
        zzand.zza(b1, arrayOfChar, paramInt2);
      }
      int j = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = j;
      while (paramInt2 < i)
      {
        j = paramInt2 + 1;
        b1 = paramArrayOfByte[paramInt2];
        if (b1 >= 0) {
          paramInt2 = 1;
        } else {
          paramInt2 = 0;
        }
        if (paramInt2 != 0)
        {
          paramInt2 = paramInt1 + 1;
          zzand.zza(b1, arrayOfChar, paramInt1);
          paramInt1 = paramInt2;
          paramInt2 = j;
          while (paramInt2 < i)
          {
            b1 = paramArrayOfByte[paramInt2];
            if (b1 >= 0) {
              j = 1;
            } else {
              j = 0;
            }
            if (j == 0) {
              break;
            }
            paramInt2++;
            zzand.zza(b1, arrayOfChar, paramInt1);
            paramInt1++;
          }
        }
        else if (b1 < -32)
        {
          if (j < i)
          {
            zzand.zza(b1, paramArrayOfByte[j], arrayOfChar, paramInt1);
            paramInt2 = j + 1;
            paramInt1++;
          }
          else
          {
            throw zzakm.zzd();
          }
        }
        else if (b1 < -16)
        {
          if (j < i - 1)
          {
            paramInt2 = j + 1;
            zzand.zza(b1, paramArrayOfByte[j], paramArrayOfByte[paramInt2], arrayOfChar, paramInt1);
            paramInt2++;
            paramInt1++;
          }
          else
          {
            throw zzakm.zzd();
          }
        }
        else if (j < i - 2)
        {
          paramInt2 = j + 1;
          byte b2 = paramArrayOfByte[j];
          j = paramInt2 + 1;
          zzand.zza(b1, b2, paramArrayOfByte[paramInt2], paramArrayOfByte[j], arrayOfChar, paramInt1);
          paramInt2 = j + 1;
          paramInt1 = paramInt1 + 1 + 1;
        }
        else
        {
          throw zzakm.zzd();
        }
      }
      return new String(arrayOfChar, 0, paramInt1);
    }
    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzanf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
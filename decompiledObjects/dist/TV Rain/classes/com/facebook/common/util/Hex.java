package com.facebook.common.util;

import z2;

public class Hex
{
  private static final byte[] DIGITS;
  private static final char[] FIRST_CHAR;
  private static final char[] HEX_DIGITS = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  private static final char[] SECOND_CHAR;
  
  static
  {
    FIRST_CHAR = new char['Ā'];
    SECOND_CHAR = new char['Ā'];
    int i = 0;
    Object localObject;
    for (int j = 0; j < 256; j++)
    {
      char[] arrayOfChar = FIRST_CHAR;
      localObject = HEX_DIGITS;
      arrayOfChar[j] = ((char)localObject[(j >> 4 & 0xF)]);
      SECOND_CHAR[j] = ((char)localObject[(j & 0xF)]);
    }
    DIGITS = new byte[103];
    for (j = 0; j <= 70; j++) {
      DIGITS[j] = ((byte)-1);
    }
    for (int k = 0;; k = (byte)(k + 1))
    {
      j = i;
      if (k >= 10) {
        break;
      }
      DIGITS[(k + 48)] = ((byte)k);
    }
    while (j < 6)
    {
      localObject = DIGITS;
      k = (byte)(j + 10);
      localObject[(j + 65)] = ((byte)k);
      localObject[(j + 97)] = ((byte)k);
      j = (byte)(j + 1);
    }
  }
  
  public static String byte2Hex(int paramInt)
  {
    if ((paramInt <= 255) && (paramInt >= 0))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(String.valueOf(FIRST_CHAR[paramInt]));
      localStringBuilder.append(String.valueOf(SECOND_CHAR[paramInt]));
      return localStringBuilder.toString();
    }
    throw new IllegalArgumentException("The int converting to hex should be in range 0~255");
  }
  
  public static byte[] decodeHex(String paramString)
  {
    int i = paramString.length();
    if ((i & 0x1) == 0)
    {
      byte[] arrayOfByte1 = new byte[i >> 1];
      int j = 0;
      int k = 0;
      int m = k;
      int n;
      for (;;)
      {
        n = j;
        if (k >= i) {
          break;
        }
        n = k + 1;
        k = paramString.charAt(k);
        int i1;
        if (k <= 102)
        {
          byte[] arrayOfByte2 = DIGITS;
          k = arrayOfByte2[k];
          if (k != -1)
          {
            i1 = paramString.charAt(n);
            if (i1 <= 102)
            {
              i1 = arrayOfByte2[i1];
              if (i1 != -1) {
                break label117;
              }
            }
          }
        }
        n = 1;
        break;
        label117:
        arrayOfByte1[m] = ((byte)(byte)(k << 4 | i1));
        m++;
        k = n + 1;
      }
      if (n == 0) {
        return arrayOfByte1;
      }
      throw new IllegalArgumentException(z2.o("Invalid hexadecimal digit: ", paramString));
    }
    throw new IllegalArgumentException("Odd number of characters.");
  }
  
  public static String encodeHex(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    char[] arrayOfChar = new char[paramArrayOfByte.length * 2];
    int i = 0;
    int j = i;
    while (i < paramArrayOfByte.length)
    {
      int k = paramArrayOfByte[i] & 0xFF;
      if ((k == 0) && (paramBoolean)) {
        break;
      }
      int m = j + 1;
      arrayOfChar[j] = ((char)FIRST_CHAR[k]);
      j = m + 1;
      arrayOfChar[m] = ((char)SECOND_CHAR[k]);
      i++;
    }
    return new String(arrayOfChar, 0, j);
  }
  
  public static byte[] hexStringToByteArray(String paramString)
  {
    return decodeHex(paramString.replaceAll(" ", ""));
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.util.Hex
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
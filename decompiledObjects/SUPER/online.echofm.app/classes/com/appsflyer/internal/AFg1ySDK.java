package com.appsflyer.internal;

public final class AFg1ySDK
{
  static final int[] AFInAppEventParameterName;
  static final byte[] AFInAppEventType;
  static final int[] AFKeystoreWrapper;
  private static byte[] afDebugLog = new byte['Ā'];
  private static int[] afInfoLog;
  static final int[] valueOf;
  static final int[] values;
  
  static
  {
    AFInAppEventType = new byte['Ā'];
    valueOf = new int['Ā'];
    AFInAppEventParameterName = new int['Ā'];
    values = new int['Ā'];
    AFKeystoreWrapper = new int['Ā'];
    afInfoLog = new int[10];
    int i = 1;
    int j = i;
    int k;
    byte[] arrayOfByte;
    int m;
    do
    {
      if ((i & 0x80) != 0) {
        k = 27;
      } else {
        k = 0;
      }
      i = (byte)(k ^ i << 1 ^ i);
      j = (byte)(j ^ j << 1);
      j = (byte)(j ^ j << 2);
      k = (byte)(j ^ j << 4);
      if ((k & 0x80) != 0) {
        j = 9;
      } else {
        j = 0;
      }
      j = (byte)(k ^ j);
      arrayOfByte = afDebugLog;
      k = i & 0xFF;
      m = j & 0xFF;
      arrayOfByte[k] = ((byte)(byte)(j ^ 0x63 ^ (m << 1 | m >> 7) ^ (m << 2 | m >> 6) ^ (m << 3 | m >> 5) ^ (m >> 4 | m << 4)));
    } while (k != 1);
    arrayOfByte[0] = ((byte)99);
    for (j = 0; j < 256; j++)
    {
      int n = afDebugLog[j] & 0xFF;
      AFInAppEventType[n] = ((byte)(byte)j);
      k = j << 1;
      i = k;
      if (k >= 256) {
        i = k ^ 0x11B;
      }
      m = i << 1;
      k = m;
      if (m >= 256) {
        k = m ^ 0x11B;
      }
      int i1 = k << 1;
      m = i1;
      if (i1 >= 256) {
        m = i1 ^ 0x11B;
      }
      i1 = m ^ j;
      i = (i ^ k ^ m) << 24 | i1 << 16 | (i1 ^ k) << 8 | i1 ^ i;
      valueOf[n] = i;
      AFInAppEventParameterName[n] = (i >>> 8 | i << 24);
      values[n] = (i >>> 16 | i << 16);
      AFKeystoreWrapper[n] = (i << 8 | i >>> 24);
    }
    afInfoLog[0] = 16777216;
    i = 1;
    j = i;
    while (i < 10)
    {
      k = j << 1;
      j = k;
      if (k >= 256) {
        j = k ^ 0x11B;
      }
      afInfoLog[i] = (j << 24);
      i++;
    }
  }
  
  public static byte[][] AFInAppEventParameterName(int paramInt)
  {
    byte[][] arrayOfByte = new byte[4][];
    for (int i = 0; i < 4; i++)
    {
      int j = paramInt >>> (i << 3);
      arrayOfByte[i] = { (byte)(j & 0x3), (byte)(j >> 2 & 0x3), (byte)(j >> 4 & 0x3), (byte)(j >> 6 & 0x3) };
    }
    return arrayOfByte;
  }
  
  public static int[] valueOf(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    if (paramArrayOfByte.length == 16)
    {
      int j = 4;
      int k = (i + 1) * 4;
      int[] arrayOfInt1 = new int[k];
      int m = 0;
      int n = m;
      int i2;
      int i3;
      int i4;
      for (;;)
      {
        i1 = n;
        if (m >= 4) {
          break;
        }
        i2 = paramArrayOfByte[i1];
        i3 = paramArrayOfByte[(i1 + 1)];
        i4 = paramArrayOfByte[(i1 + 2)];
        n = i1 + 4;
        arrayOfInt1[m] = ((i3 & 0xFF) << 16 | i2 << 24 | (i4 & 0xFF) << 8 | paramArrayOfByte[(i1 + 3)] & 0xFF);
        m++;
      }
      int i1 = 4;
      n = 0;
      Object localObject;
      for (m = n; i1 < k; m = i4)
      {
        int i5 = arrayOfInt1[(i1 - 1)];
        i3 = n;
        i4 = m;
        i2 = i5;
        if (n == 0)
        {
          localObject = afDebugLog;
          n = localObject[(i5 >>> 16 & 0xFF)];
          i4 = localObject[(i5 >>> 8 & 0xFF)];
          i2 = localObject[(i5 & 0xFF)];
          i2 = (localObject[(i5 >>> 24)] & 0xFF | n << 24 | (i4 & 0xFF) << 16 | (i2 & 0xFF) << 8) ^ afInfoLog[m];
          i3 = 4;
          i4 = m + 1;
        }
        arrayOfInt1[i1] = (i2 ^ arrayOfInt1[(i1 - 4)]);
        i1++;
        n = i3 - 1;
      }
      if (paramArrayOfByte.length == 16)
      {
        int[] arrayOfInt2 = new int[k];
        i1 = i * 4;
        arrayOfInt2[0] = arrayOfInt1[i1];
        n = arrayOfInt1[(i1 + 1)];
        m = 1;
        arrayOfInt2[1] = n;
        arrayOfInt2[2] = arrayOfInt1[(i1 + 2)];
        arrayOfInt2[3] = arrayOfInt1[(i1 + 3)];
        i1 -= 4;
        for (n = j; m < paramInt; n = i4)
        {
          i4 = arrayOfInt1[i1];
          localObject = valueOf;
          paramArrayOfByte = afDebugLog;
          i3 = localObject[(paramArrayOfByte[(i4 >>> 24)] & 0xFF)];
          int[] arrayOfInt3 = AFInAppEventParameterName;
          i2 = arrayOfInt3[(paramArrayOfByte[(i4 >>> 16 & 0xFF)] & 0xFF)];
          int[] arrayOfInt4 = values;
          j = arrayOfInt4[(paramArrayOfByte[(i4 >>> 8 & 0xFF)] & 0xFF)];
          int[] arrayOfInt5 = AFKeystoreWrapper;
          arrayOfInt2[n] = (arrayOfInt5[(paramArrayOfByte[(i4 & 0xFF)] & 0xFF)] ^ i3 ^ i2 ^ j);
          i4 = arrayOfInt1[(i1 + 1)];
          i2 = localObject[(paramArrayOfByte[(i4 >>> 24)] & 0xFF)];
          arrayOfInt2[(n + 1)] = (arrayOfInt3[(paramArrayOfByte[(i4 >>> 16 & 0xFF)] & 0xFF)] ^ i2 ^ arrayOfInt4[(paramArrayOfByte[(i4 >>> 8 & 0xFF)] & 0xFF)] ^ arrayOfInt5[(paramArrayOfByte[(i4 & 0xFF)] & 0xFF)]);
          i2 = arrayOfInt1[(i1 + 2)];
          j = localObject[(paramArrayOfByte[(i2 >>> 24)] & 0xFF)];
          i4 = arrayOfInt3[(paramArrayOfByte[(i2 >>> 16 & 0xFF)] & 0xFF)];
          i3 = arrayOfInt4[(paramArrayOfByte[(i2 >>> 8 & 0xFF)] & 0xFF)];
          arrayOfInt2[(n + 2)] = (arrayOfInt5[(paramArrayOfByte[(i2 & 0xFF)] & 0xFF)] ^ j ^ i4 ^ i3);
          i2 = arrayOfInt1[(i1 + 3)];
          i4 = n + 4;
          j = localObject[(paramArrayOfByte[(i2 >>> 24)] & 0xFF)];
          i = arrayOfInt3[(paramArrayOfByte[(i2 >>> 16 & 0xFF)] & 0xFF)];
          i3 = arrayOfInt4[(paramArrayOfByte[(i2 >>> 8 & 0xFF)] & 0xFF)];
          arrayOfInt2[(n + 3)] = (arrayOfInt5[(paramArrayOfByte[(i2 & 0xFF)] & 0xFF)] ^ j ^ i ^ i3);
          i1 -= 4;
          m++;
        }
        arrayOfInt2[n] = arrayOfInt1[i1];
        arrayOfInt2[(n + 1)] = arrayOfInt1[(i1 + 1)];
        arrayOfInt2[(n + 2)] = arrayOfInt1[(i1 + 2)];
        arrayOfInt2[(n + 3)] = arrayOfInt1[(i1 + 3)];
        return arrayOfInt2;
      }
      throw new IllegalArgumentException();
    }
    throw new IllegalArgumentException();
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFg1ySDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
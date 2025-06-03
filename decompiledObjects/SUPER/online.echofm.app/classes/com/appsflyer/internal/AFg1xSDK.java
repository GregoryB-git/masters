package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class AFg1xSDK
  extends FilterInputStream
{
  private static final byte[] AFInAppEventParameterName = AFg1ySDK.AFInAppEventType;
  private static final int[] AFInAppEventType = AFg1ySDK.values;
  private static final int[] AFKeystoreWrapper = AFg1ySDK.valueOf;
  private static final int[] valueOf = AFg1ySDK.AFKeystoreWrapper;
  private static final int[] values = AFg1ySDK.AFInAppEventParameterName;
  private final int[] AFLogger = new int[4];
  private int AFVersionDeclaration = 16;
  private final byte[][] afDebugLog;
  private final byte[] afErrorLog = new byte[16];
  private int afErrorLogForExcManagerOnly = 16;
  private final int[] afInfoLog;
  private final int afRDLog;
  private final byte[] afWarnLog = new byte[16];
  private int getLevel = Integer.MAX_VALUE;
  
  public AFg1xSDK(InputStream paramInputStream, int paramInt, byte[] paramArrayOfByte, byte[][] paramArrayOfByte1)
  {
    super(paramInputStream);
    afRDLog = paramInt;
    afInfoLog = AFg1ySDK.valueOf(paramArrayOfByte, paramInt);
    afDebugLog = valueOf(paramArrayOfByte1);
  }
  
  private static byte[][] valueOf(byte[][] paramArrayOfByte)
  {
    byte[][] arrayOfByte = new byte[paramArrayOfByte.length][];
    for (int i = 0; i < paramArrayOfByte.length; i++)
    {
      arrayOfByte[i] = new byte[paramArrayOfByte[i].length];
      for (int j = 0;; j++)
      {
        byte[] arrayOfByte1 = paramArrayOfByte[i];
        if (j >= arrayOfByte1.length) {
          break;
        }
        arrayOfByte[i][arrayOfByte1[j]] = ((byte)(byte)j);
      }
    }
    return arrayOfByte;
  }
  
  private int values()
  {
    if (getLevel == Integer.MAX_VALUE) {
      getLevel = in.read();
    }
    int i = AFVersionDeclaration;
    int j = 16;
    if (i == 16)
    {
      byte[] arrayOfByte = afErrorLog;
      i = getLevel;
      arrayOfByte[0] = ((byte)(byte)i);
      if (i >= 0)
      {
        i = 1;
        int m;
        do
        {
          int k = in.read(afErrorLog, i, 16 - i);
          m = i;
          if (k <= 0) {
            break;
          }
          m = i + k;
          i = m;
        } while (m < 16);
        if (m >= 16)
        {
          values(afErrorLog, afWarnLog);
          m = in.read();
          getLevel = m;
          AFVersionDeclaration = 0;
          i = j;
          if (m < 0) {
            i = 16 - (afWarnLog[15] & 0xFF);
          }
          afErrorLogForExcManagerOnly = i;
        }
        else
        {
          throw new IllegalStateException("unexpected block size");
        }
      }
      else
      {
        throw new IllegalStateException("unexpected block size");
      }
    }
    return afErrorLogForExcManagerOnly;
  }
  
  private void values(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int[] arrayOfInt1 = AFLogger;
    int i = paramArrayOfByte1[0];
    int j = paramArrayOfByte1[1];
    int k = paramArrayOfByte1[2];
    int m = paramArrayOfByte1[3];
    int[] arrayOfInt2 = afInfoLog;
    arrayOfInt1[0] = ((i << 24 | (j & 0xFF) << 16 | (k & 0xFF) << 8 | m & 0xFF) ^ arrayOfInt2[0]);
    arrayOfInt1[1] = ((paramArrayOfByte1[4] << 24 | (paramArrayOfByte1[5] & 0xFF) << 16 | (paramArrayOfByte1[6] & 0xFF) << 8 | paramArrayOfByte1[7] & 0xFF) ^ arrayOfInt2[1]);
    arrayOfInt1[2] = ((paramArrayOfByte1[8] << 24 | (paramArrayOfByte1[9] & 0xFF) << 16 | (paramArrayOfByte1[10] & 0xFF) << 8 | paramArrayOfByte1[11] & 0xFF) ^ arrayOfInt2[2]);
    m = paramArrayOfByte1[12];
    i = paramArrayOfByte1[13];
    k = paramArrayOfByte1[14];
    j = paramArrayOfByte1[15];
    arrayOfInt2[3] ^= ((i & 0xFF) << 16 | m << 24 | (k & 0xFF) << 8 | j & 0xFF);
    i = 4;
    k = 1;
    while (k < afRDLog)
    {
      arrayOfInt1 = AFKeystoreWrapper;
      localObject1 = AFLogger;
      Object localObject2 = afDebugLog;
      arrayOfInt3 = localObject2[0];
      int n = arrayOfInt1[(localObject1[arrayOfInt3[0]] >>> 24)];
      int[] arrayOfInt4 = values;
      paramArrayOfByte1 = localObject2[1];
      int i1 = arrayOfInt4[(localObject1[paramArrayOfByte1[0]] >>> 16 & 0xFF)];
      arrayOfInt5 = AFInAppEventType;
      arrayOfInt2 = localObject2[2];
      int i2 = arrayOfInt5[(localObject1[arrayOfInt2[0]] >>> 8 & 0xFF)];
      localObject3 = valueOf;
      localObject2 = localObject2[3];
      int i3 = localObject3[(localObject1[localObject2[0]] & 0xFF)];
      int[] arrayOfInt6 = afInfoLog;
      int i4 = arrayOfInt6[i];
      int i5 = arrayOfInt1[(localObject1[arrayOfInt3[1]] >>> 24)];
      int i6 = arrayOfInt4[(localObject1[paramArrayOfByte1[1]] >>> 16 & 0xFF)];
      j = arrayOfInt5[(localObject1[arrayOfInt2[1]] >>> 8 & 0xFF)];
      int i7 = localObject3[(localObject1[localObject2[1]] & 0xFF)];
      int i8 = arrayOfInt6[(i + 1)];
      int i9 = arrayOfInt1[(localObject1[arrayOfInt3[2]] >>> 24)];
      int i10 = arrayOfInt4[(localObject1[paramArrayOfByte1[2]] >>> 16 & 0xFF)];
      int i11 = arrayOfInt5[(localObject1[arrayOfInt2[2]] >>> 8 & 0xFF)];
      int i12 = localObject3[(localObject1[localObject2[2]] & 0xFF)];
      int i13 = arrayOfInt6[(i + 2)];
      int i14 = arrayOfInt1[(localObject1[arrayOfInt3[3]] >>> 24)];
      int i15 = arrayOfInt4[(localObject1[paramArrayOfByte1[3]] >>> 16 & 0xFF)];
      m = arrayOfInt5[(localObject1[arrayOfInt2[3]] >>> 8 & 0xFF)];
      int i16 = localObject3[(localObject1[localObject2[3]] & 0xFF)];
      int i17 = arrayOfInt6[(i + 3)];
      localObject1[0] = (i3 ^ i2 ^ n ^ i1 ^ i4);
      localObject1[1] = (j ^ i5 ^ i6 ^ i7 ^ i8);
      localObject1[2] = (i10 ^ i9 ^ i11 ^ i12 ^ i13);
      localObject1[3] = (i14 ^ i15 ^ m ^ i16 ^ i17);
      k++;
      i += 4;
    }
    arrayOfInt1 = afInfoLog;
    k = arrayOfInt1[i];
    Object localObject1 = AFInAppEventParameterName;
    int[] arrayOfInt3 = AFLogger;
    Object localObject3 = afDebugLog;
    paramArrayOfByte1 = localObject3[0];
    paramArrayOfByte2[0] = ((byte)(byte)(localObject1[(arrayOfInt3[paramArrayOfByte1[0]] >>> 24)] ^ k >>> 24));
    int[] arrayOfInt5 = localObject3[1];
    paramArrayOfByte2[1] = ((byte)(byte)(localObject1[(arrayOfInt3[arrayOfInt5[0]] >>> 16 & 0xFF)] ^ k >>> 16));
    arrayOfInt2 = localObject3[2];
    paramArrayOfByte2[2] = ((byte)(byte)(localObject1[(arrayOfInt3[arrayOfInt2[0]] >>> 8 & 0xFF)] ^ k >>> 8));
    localObject3 = localObject3[3];
    paramArrayOfByte2[3] = ((byte)(byte)(localObject1[(arrayOfInt3[localObject3[0]] & 0xFF)] ^ k));
    k = arrayOfInt1[(i + 1)];
    paramArrayOfByte2[4] = ((byte)(byte)(localObject1[(arrayOfInt3[paramArrayOfByte1[1]] >>> 24)] ^ k >>> 24));
    paramArrayOfByte2[5] = ((byte)(byte)(localObject1[(arrayOfInt3[arrayOfInt5[1]] >>> 16 & 0xFF)] ^ k >>> 16));
    paramArrayOfByte2[6] = ((byte)(byte)(localObject1[(arrayOfInt3[arrayOfInt2[1]] >>> 8 & 0xFF)] ^ k >>> 8));
    paramArrayOfByte2[7] = ((byte)(byte)(k ^ localObject1[(arrayOfInt3[localObject3[1]] & 0xFF)]));
    k = arrayOfInt1[(i + 2)];
    paramArrayOfByte2[8] = ((byte)(byte)(localObject1[(arrayOfInt3[paramArrayOfByte1[2]] >>> 24)] ^ k >>> 24));
    paramArrayOfByte2[9] = ((byte)(byte)(localObject1[(arrayOfInt3[arrayOfInt5[2]] >>> 16 & 0xFF)] ^ k >>> 16));
    paramArrayOfByte2[10] = ((byte)(byte)(localObject1[(arrayOfInt3[arrayOfInt2[2]] >>> 8 & 0xFF)] ^ k >>> 8));
    paramArrayOfByte2[11] = ((byte)(byte)(k ^ localObject1[(arrayOfInt3[localObject3[2]] & 0xFF)]));
    i = arrayOfInt1[(i + 3)];
    paramArrayOfByte2[12] = ((byte)(byte)(localObject1[(arrayOfInt3[paramArrayOfByte1[3]] >>> 24)] ^ i >>> 24));
    paramArrayOfByte2[13] = ((byte)(byte)(localObject1[(arrayOfInt3[arrayOfInt5[3]] >>> 16 & 0xFF)] ^ i >>> 16));
    paramArrayOfByte2[14] = ((byte)(byte)(localObject1[(arrayOfInt3[arrayOfInt2[3]] >>> 8 & 0xFF)] ^ i >>> 8));
    paramArrayOfByte2[15] = ((byte)(byte)(i ^ localObject1[(arrayOfInt3[localObject3[3]] & 0xFF)]));
  }
  
  public final int available()
  {
    values();
    return afErrorLogForExcManagerOnly - AFVersionDeclaration;
  }
  
  public final void close()
  {
    super.close();
  }
  
  public final void mark(int paramInt) {}
  
  public final boolean markSupported()
  {
    return false;
  }
  
  public final int read()
  {
    values();
    int i = AFVersionDeclaration;
    if (i >= afErrorLogForExcManagerOnly) {
      return -1;
    }
    byte[] arrayOfByte = afWarnLog;
    AFVersionDeclaration = (i + 1);
    return arrayOfByte[i] & 0xFF;
  }
  
  public final int read(byte[] paramArrayOfByte)
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramInt1 + paramInt2;
    for (int j = paramInt1; j < i; j++)
    {
      values();
      int k = AFVersionDeclaration;
      if (k >= afErrorLogForExcManagerOnly)
      {
        if (j == paramInt1) {
          return -1;
        }
        return paramInt2 - (i - j);
      }
      byte[] arrayOfByte = afWarnLog;
      AFVersionDeclaration = (k + 1);
      paramArrayOfByte[j] = ((byte)arrayOfByte[k]);
    }
    return paramInt2;
  }
  
  public final void reset() {}
  
  public final long skip(long paramLong)
  {
    for (long l = 0L; (l < paramLong) && (read() != -1); l += 1L) {}
    return l;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFg1xSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
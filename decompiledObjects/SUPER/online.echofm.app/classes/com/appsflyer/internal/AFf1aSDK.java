package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class AFf1aSDK
  extends FilterInputStream
{
  private byte[] AFInAppEventParameterName;
  private long[] AFInAppEventType;
  private short AFKeystoreWrapper;
  private int afDebugLog = Integer.MAX_VALUE;
  private int afErrorLog;
  private int afInfoLog;
  private final int valueOf;
  private long[] values;
  
  public AFf1aSDK(InputStream paramInputStream, int paramInt1, int paramInt2, short paramShort, int paramInt3, int paramInt4)
  {
    super(paramInputStream);
    paramShort = Math.min(Math.max(paramShort, 4), 8);
    valueOf = paramShort;
    AFInAppEventParameterName = new byte[paramShort];
    AFInAppEventType = new long[4];
    values = new long[4];
    afInfoLog = paramShort;
    afErrorLog = paramShort;
    AFInAppEventType = AFg1zSDK.AFInAppEventType(paramInt1 ^ paramInt4, paramShort ^ paramInt4);
    values = AFg1zSDK.AFInAppEventType(paramInt2 ^ paramInt4, paramInt3 ^ paramInt4);
  }
  
  private void AFKeystoreWrapper()
  {
    Object localObject = AFInAppEventType;
    long[] arrayOfLong = values;
    int i = AFKeystoreWrapper;
    long l1 = localObject[(i % 4)];
    long l2 = arrayOfLong[((i + 2) % 4)];
    i = (i + 3) % 4;
    arrayOfLong[i] = ((localObject[i] * 2147483085L + l2) / 2147483647L);
    localObject[i] = ((l1 * 2147483085L + l2) % 2147483647L);
    for (i = 0; i < valueOf; i++)
    {
      localObject = AFInAppEventParameterName;
      localObject[i] = ((byte)(byte)(int)(localObject[i] ^ AFInAppEventType[AFKeystoreWrapper] >> (i << 3) & 0xFF));
    }
    AFKeystoreWrapper = ((short)(short)((AFKeystoreWrapper + 1) % 4));
  }
  
  private int valueOf()
  {
    if (afDebugLog == Integer.MAX_VALUE) {
      afDebugLog = in.read();
    }
    if (afInfoLog == valueOf)
    {
      byte[] arrayOfByte = AFInAppEventParameterName;
      int i = afDebugLog;
      arrayOfByte[0] = ((byte)(byte)i);
      if (i >= 0)
      {
        i = 1;
        int k;
        do
        {
          int j = in.read(AFInAppEventParameterName, i, valueOf - i);
          k = i;
          if (j <= 0) {
            break;
          }
          k = i + j;
          i = k;
        } while (k < valueOf);
        if (k >= valueOf)
        {
          AFKeystoreWrapper();
          i = in.read();
          afDebugLog = i;
          afInfoLog = 0;
          if (i < 0)
          {
            i = valueOf;
            i -= (AFInAppEventParameterName[(i - 1)] & 0xFF);
          }
          else
          {
            i = valueOf;
          }
          afErrorLog = i;
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
    return afErrorLog;
  }
  
  public final int available()
  {
    valueOf();
    return afErrorLog - afInfoLog;
  }
  
  public final boolean markSupported()
  {
    return false;
  }
  
  public final int read()
  {
    valueOf();
    int i = afInfoLog;
    if (i >= afErrorLog) {
      return -1;
    }
    byte[] arrayOfByte = AFInAppEventParameterName;
    afInfoLog = (i + 1);
    return arrayOfByte[i] & 0xFF;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramInt1 + paramInt2;
    for (int j = paramInt1; j < i; j++)
    {
      valueOf();
      int k = afInfoLog;
      if (k >= afErrorLog)
      {
        if (j == paramInt1) {
          return -1;
        }
        return paramInt2 - (i - j);
      }
      byte[] arrayOfByte = AFInAppEventParameterName;
      afInfoLog = (k + 1);
      paramArrayOfByte[j] = ((byte)arrayOfByte[k]);
    }
    return paramInt2;
  }
  
  public final long skip(long paramLong)
  {
    for (long l = 0L; (l < paramLong) && (read() != -1); l += 1L) {}
    return l;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1aSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
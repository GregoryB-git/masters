package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class a4
{
  public static final Charset a = Charset.forName("US-ASCII");
  public static final Charset b = Charset.forName("UTF-8");
  public static final Charset c = Charset.forName("ISO-8859-1");
  public static final byte[] d;
  public static final ByteBuffer e;
  public static final G3 f;
  
  static
  {
    byte[] arrayOfByte = new byte[0];
    d = arrayOfByte;
    e = ByteBuffer.wrap(arrayOfByte);
    f = G3.c(arrayOfByte, 0, arrayOfByte.length, false);
  }
  
  public static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    for (int i = paramInt2; i < paramInt2 + paramInt3; i++) {
      paramInt1 = paramInt1 * 31 + paramArrayOfByte[i];
    }
    return paramInt1;
  }
  
  public static int b(long paramLong)
  {
    return (int)(paramLong ^ paramLong >>> 32);
  }
  
  public static int c(boolean paramBoolean)
  {
    if (paramBoolean) {
      return 1231;
    }
    return 1237;
  }
  
  public static int d(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int j = a(i, paramArrayOfByte, 0, i);
    i = j;
    if (j == 0) {
      i = 1;
    }
    return i;
  }
  
  public static Object e(Object paramObject)
  {
    paramObject.getClass();
    return paramObject;
  }
  
  public static Object f(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return paramObject;
    }
    throw new NullPointerException(paramString);
  }
  
  public static boolean g(I4 paramI4)
  {
    return false;
  }
  
  public static String h(byte[] paramArrayOfByte)
  {
    return new String(paramArrayOfByte, b);
  }
  
  public static boolean i(byte[] paramArrayOfByte)
  {
    return E5.d(paramArrayOfByte);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.a4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
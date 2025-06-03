package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

public abstract class t
{
  public static final Charset a = Charset.forName("US-ASCII");
  public static final Charset b = Charset.forName("UTF-8");
  public static final Charset c = Charset.forName("ISO-8859-1");
  public static final byte[] d;
  public static final ByteBuffer e;
  public static final g f;
  
  static
  {
    byte[] arrayOfByte = new byte[0];
    d = arrayOfByte;
    e = ByteBuffer.wrap(arrayOfByte);
    f = g.a(arrayOfByte);
  }
  
  public static Object a(Object paramObject)
  {
    paramObject.getClass();
    return paramObject;
  }
  
  public static Object b(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return paramObject;
    }
    throw new NullPointerException(paramString);
  }
  
  public static int c(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 1231;
    } else {
      i = 1237;
    }
    return i;
  }
  
  public static int d(byte[] paramArrayOfByte)
  {
    return e(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static int e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramInt2 = h(paramInt2, paramArrayOfByte, paramInt1, paramInt2);
    paramInt1 = paramInt2;
    if (paramInt2 == 0) {
      paramInt1 = 1;
    }
    return paramInt1;
  }
  
  public static int f(long paramLong)
  {
    return (int)(paramLong ^ paramLong >>> 32);
  }
  
  public static boolean g(byte[] paramArrayOfByte)
  {
    return l0.l(paramArrayOfByte);
  }
  
  public static int h(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = paramInt2;
    int j = paramInt1;
    for (paramInt1 = i; paramInt1 < paramInt2 + paramInt3; paramInt1++) {
      j = j * 31 + paramArrayOfByte[paramInt1];
    }
    return j;
  }
  
  public static String i(byte[] paramArrayOfByte)
  {
    return new String(paramArrayOfByte, b);
  }
  
  public static abstract interface a
  {
    public abstract int g();
  }
  
  public static abstract interface b {}
  
  public static abstract interface c {}
  
  public static abstract interface d
    extends t.e
  {
    public abstract int F(int paramInt);
    
    public abstract d h(int paramInt);
    
    public abstract void z(int paramInt);
  }
  
  public static abstract interface e
    extends List, RandomAccess
  {
    public abstract e h(int paramInt);
    
    public abstract void j();
    
    public abstract boolean p();
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
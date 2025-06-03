package com.google.ads.interactivemedia.v3.internal;

import java.nio.charset.Charset;
import z2;

public final class vy
{
  public byte[] a;
  private int b;
  private int c;
  
  public vy()
  {
    a = wl.f;
  }
  
  public vy(int paramInt)
  {
    a = new byte[paramInt];
    c = paramInt;
  }
  
  public vy(byte[] paramArrayOfByte)
  {
    a = paramArrayOfByte;
    c = paramArrayOfByte.length;
  }
  
  public vy(byte[] paramArrayOfByte, int paramInt)
  {
    a = paramArrayOfByte;
    c = paramInt;
  }
  
  public final void a()
  {
    b = 0;
    c = 0;
  }
  
  public final void a(int paramInt)
  {
    byte[] arrayOfByte1 = a;
    byte[] arrayOfByte2 = arrayOfByte1;
    if (arrayOfByte1.length < paramInt) {
      arrayOfByte2 = new byte[paramInt];
    }
    a(arrayOfByte2, paramInt);
  }
  
  public final void a(vz paramvz, int paramInt)
  {
    a(a, 0, paramInt);
    paramvz.a(0);
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt)
  {
    a = paramArrayOfByte;
    c = paramInt;
    b = 0;
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    System.arraycopy(a, b, paramArrayOfByte, paramInt1, paramInt2);
    b += paramInt2;
  }
  
  public final int b()
  {
    return c - b;
  }
  
  public final void b(int paramInt)
  {
    boolean bool;
    if ((paramInt >= 0) && (paramInt <= a.length)) {
      bool = true;
    } else {
      bool = false;
    }
    rp.b(bool);
    c = paramInt;
  }
  
  public final int c()
  {
    return c;
  }
  
  public final void c(int paramInt)
  {
    boolean bool;
    if ((paramInt >= 0) && (paramInt <= c)) {
      bool = true;
    } else {
      bool = false;
    }
    rp.b(bool);
    b = paramInt;
  }
  
  public final int d()
  {
    return b;
  }
  
  public final void d(int paramInt)
  {
    c(b + paramInt);
  }
  
  public final int e()
  {
    byte[] arrayOfByte = a;
    int i = b;
    b = (i + 1);
    return arrayOfByte[i] & 0xFF;
  }
  
  public final String e(int paramInt)
  {
    Object localObject = Charset.forName("UTF-8");
    localObject = new String(a, b, paramInt, (Charset)localObject);
    b += paramInt;
    return (String)localObject;
  }
  
  public final int f()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = i + 1;
    i = arrayOfByte[i];
    b = (j + 1);
    return arrayOfByte[j] & 0xFF | (i & 0xFF) << 8;
  }
  
  public final String f(int paramInt)
  {
    if (paramInt == 0) {
      return "";
    }
    int i = b;
    int j = i + paramInt - 1;
    if ((j < c) && (a[j] == 0)) {
      j = paramInt - 1;
    } else {
      j = paramInt;
    }
    String str = wl.a(a, i, j);
    b += paramInt;
    return str;
  }
  
  public final int g()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = i + 1;
    i = arrayOfByte[i];
    b = (j + 1);
    return (arrayOfByte[j] & 0xFF) << 8 | i & 0xFF;
  }
  
  public final short h()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = i + 1;
    i = arrayOfByte[i];
    b = (j + 1);
    return (short)(arrayOfByte[j] & 0xFF | (i & 0xFF) << 8);
  }
  
  public final int i()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = i + 1;
    i = arrayOfByte[i];
    int k = j + 1;
    j = arrayOfByte[j];
    b = (k + 1);
    return arrayOfByte[k] & 0xFF | (i & 0xFF) << 16 | (j & 0xFF) << 8;
  }
  
  public final long j()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = i + 1;
    long l1 = arrayOfByte[i];
    i = j + 1;
    long l2 = arrayOfByte[j];
    j = i + 1;
    long l3 = arrayOfByte[i];
    b = (j + 1);
    return (l1 & 0xFF) << 24 | (l2 & 0xFF) << 16 | (l3 & 0xFF) << 8 | arrayOfByte[j] & 0xFF;
  }
  
  public final long k()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = i + 1;
    long l1 = arrayOfByte[i];
    i = j + 1;
    long l2 = arrayOfByte[j];
    j = i + 1;
    long l3 = arrayOfByte[i];
    b = (j + 1);
    return l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (arrayOfByte[j] & 0xFF) << 24;
  }
  
  public final int l()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = i + 1;
    i = arrayOfByte[i];
    int k = j + 1;
    j = arrayOfByte[j];
    int m = k + 1;
    k = arrayOfByte[k];
    b = (m + 1);
    return arrayOfByte[m] & 0xFF | (i & 0xFF) << 24 | (j & 0xFF) << 16 | (k & 0xFF) << 8;
  }
  
  public final long m()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = i + 1;
    long l1 = arrayOfByte[i];
    int k = j + 1;
    long l2 = arrayOfByte[j];
    i = k + 1;
    long l3 = arrayOfByte[k];
    j = i + 1;
    long l4 = arrayOfByte[i];
    i = j + 1;
    long l5 = arrayOfByte[j];
    j = i + 1;
    long l6 = arrayOfByte[i];
    i = j + 1;
    long l7 = arrayOfByte[j];
    b = (i + 1);
    return (l1 & 0xFF) << 56 | (l2 & 0xFF) << 48 | (l3 & 0xFF) << 40 | (l4 & 0xFF) << 32 | (l5 & 0xFF) << 24 | (l6 & 0xFF) << 16 | (l7 & 0xFF) << 8 | arrayOfByte[i] & 0xFF;
  }
  
  public final int n()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = i + 1;
    int k = arrayOfByte[i];
    i = arrayOfByte[j];
    b = (j + 1 + 2);
    return i & 0xFF | (k & 0xFF) << 8;
  }
  
  public final int o()
  {
    return e() << 21 | e() << 14 | e() << 7 | e();
  }
  
  public final int p()
  {
    int i = l();
    if (i >= 0) {
      return i;
    }
    throw new IllegalStateException(z2.k(29, "Top bit not zero: ", i));
  }
  
  public final long q()
  {
    long l = m();
    if (l >= 0L) {
      return l;
    }
    StringBuilder localStringBuilder = new StringBuilder(38);
    localStringBuilder.append("Top bit not zero: ");
    localStringBuilder.append(l);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public final String r()
  {
    if (b() == 0) {
      return null;
    }
    for (int i = b; (i < c) && (a[i] != 0); i++) {}
    Object localObject = a;
    int j = b;
    localObject = wl.a((byte[])localObject, j, i - j);
    b = i;
    if (i < c) {
      b = (i + 1);
    }
    return (String)localObject;
  }
  
  public final String s()
  {
    if (b() == 0) {
      return null;
    }
    for (int i = b; (i < c) && (!wl.a(a[i])); i++) {}
    int j = b;
    if (i - j >= 3)
    {
      localObject = a;
      if ((localObject[j] == -17) && (localObject[(j + 1)] == -69) && (localObject[(j + 2)] == -65)) {
        b = (j + 3);
      }
    }
    Object localObject = a;
    j = b;
    localObject = wl.a((byte[])localObject, j, i - j);
    b = i;
    j = c;
    if (i == j) {
      return (String)localObject;
    }
    byte[] arrayOfByte = a;
    if (arrayOfByte[i] == 13)
    {
      i++;
      b = i;
      if (i == j) {
        return (String)localObject;
      }
    }
    i = b;
    if (arrayOfByte[i] == 10) {
      b = (i + 1);
    }
    return (String)localObject;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.vy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
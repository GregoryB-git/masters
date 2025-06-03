package v5;

import a0.j;
import f;
import java.nio.charset.Charset;
import java.util.Arrays;
import n7.d;
import o7.r;
import o7.x;
import x6.b;

public final class u
{
  public static final char[] d = { 13, 10 };
  public static final char[] e = { '\n' };
  public static final x<Charset> f = x.p(5, new Object[] { d.a, d.c, d.f, d.d, d.e });
  public byte[] a;
  public int b;
  public int c;
  
  public u()
  {
    a = e0.f;
  }
  
  public u(int paramInt)
  {
    a = new byte[paramInt];
    c = paramInt;
  }
  
  public u(byte[] paramArrayOfByte)
  {
    a = paramArrayOfByte;
    c = paramArrayOfByte.length;
  }
  
  public u(byte[] paramArrayOfByte, int paramInt)
  {
    a = paramArrayOfByte;
    c = paramInt;
  }
  
  public final int A()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = i + 1;
    i = arrayOfByte[i];
    b = (j + 1);
    return arrayOfByte[j] & 0xFF | (i & 0xFF) << 8;
  }
  
  public final long B()
  {
    long l = a[b];
    int j;
    int k;
    for (int i = 7;; i--)
    {
      j = 1;
      if (i < 0) {
        break;
      }
      k = 1 << i;
      if ((k & l) == 0L)
      {
        if (i < 6)
        {
          l &= k - 1;
          i = 7 - i;
          break label77;
        }
        if (i != 7) {
          break;
        }
        i = 1;
        break label77;
      }
    }
    i = 0;
    label77:
    if (i != 0)
    {
      while (j < i)
      {
        k = a[(b + j)];
        if ((k & 0xC0) == 128)
        {
          l = l << 6 | k & 0x3F;
          j++;
        }
        else
        {
          throw new NumberFormatException(j.i("Invalid UTF-8 sequence continuation byte: ", l));
        }
      }
      b += i;
      return l;
    }
    throw new NumberFormatException(j.i("Invalid UTF-8 sequence first byte: ", l));
  }
  
  public final Charset C()
  {
    int i = c;
    int j = b;
    byte[] arrayOfByte;
    if (i - j >= 3)
    {
      arrayOfByte = a;
      if ((arrayOfByte[j] == -17) && (arrayOfByte[(j + 1)] == -69) && (arrayOfByte[(j + 2)] == -65))
      {
        b = (j + 3);
        return d.c;
      }
    }
    if (i - j >= 2)
    {
      arrayOfByte = a;
      i = arrayOfByte[j];
      if ((i == -2) && (arrayOfByte[(j + 1)] == -1))
      {
        b = (j + 2);
        return d.d;
      }
      if ((i == -1) && (arrayOfByte[(j + 1)] == -2))
      {
        b = (j + 2);
        return d.e;
      }
    }
    return null;
  }
  
  public final void D(int paramInt)
  {
    byte[] arrayOfByte1 = a;
    byte[] arrayOfByte2 = arrayOfByte1;
    if (arrayOfByte1.length < paramInt) {
      arrayOfByte2 = new byte[paramInt];
    }
    E(arrayOfByte2, paramInt);
  }
  
  public final void E(byte[] paramArrayOfByte, int paramInt)
  {
    a = paramArrayOfByte;
    c = paramInt;
    b = 0;
  }
  
  public final void F(int paramInt)
  {
    boolean bool;
    if ((paramInt >= 0) && (paramInt <= a.length)) {
      bool = true;
    } else {
      bool = false;
    }
    b.q(bool);
    c = paramInt;
  }
  
  public final void G(int paramInt)
  {
    boolean bool;
    if ((paramInt >= 0) && (paramInt <= c)) {
      bool = true;
    } else {
      bool = false;
    }
    b.q(bool);
    b = paramInt;
  }
  
  public final void H(int paramInt)
  {
    G(b + paramInt);
  }
  
  public final void a(int paramInt)
  {
    byte[] arrayOfByte = a;
    if (paramInt > arrayOfByte.length) {
      a = Arrays.copyOf(arrayOfByte, paramInt);
    }
  }
  
  public final char b(Charset paramCharset)
  {
    boolean bool = f.contains(paramCharset);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unsupported charset: ");
    localStringBuilder.append(paramCharset);
    b.o(localStringBuilder.toString(), bool);
    return (char)(c(paramCharset) >> 16);
  }
  
  public final int c(Charset paramCharset)
  {
    boolean bool1 = paramCharset.equals(d.c);
    boolean bool2 = false;
    int i = 2;
    if ((bool1) || (paramCharset.equals(d.a)))
    {
      j = c;
      k = b;
      if (j - k >= 1)
      {
        l = a[k] & 0xFF;
        k = (char)(int)l;
        if (k == l) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        b.m(l, "Out of range: %s", bool1);
        j = (byte)k;
        k = 1;
        break label254;
      }
    }
    if ((paramCharset.equals(d.f)) || (paramCharset.equals(d.d)))
    {
      k = c;
      j = b;
      if (k - j >= 2)
      {
        paramCharset = a;
        k = paramCharset[j];
        j = paramCharset[(j + 1)];
        k <<= 8;
      }
    }
    for (;;)
    {
      k = (char)(j & 0xFF | k);
      break;
      if (!paramCharset.equals(d.e)) {
        break label295;
      }
      j = c;
      k = b;
      if (j - k < 2) {
        break label295;
      }
      paramCharset = a;
      int m = paramCharset[(k + 1)];
      j = paramCharset[k];
      k = m << 8;
    }
    int j = (byte)k;
    int k = i;
    label254:
    long l = j;
    j = (char)(int)l;
    bool1 = bool2;
    if (j == l) {
      bool1 = true;
    }
    b.m(l, "Out of range: %s", bool1);
    return (j << 16) + k;
    label295:
    return 0;
  }
  
  public final void d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    System.arraycopy(a, b, paramArrayOfByte, paramInt1, paramInt2);
    b += paramInt2;
  }
  
  public final char e(Charset paramCharset, char[] paramArrayOfChar)
  {
    int i = c(paramCharset);
    if (i != 0)
    {
      char c1 = (char)(i >> 16);
      int j = paramArrayOfChar.length;
      for (int k = 0; k < j; k++) {
        if (paramArrayOfChar[k] == c1)
        {
          k = 1;
          break label55;
        }
      }
      k = 0;
      label55:
      if (k != 0)
      {
        b += (i & 0xFFFF);
        return c1;
      }
    }
    return '\000';
  }
  
  public final int f()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = i + 1;
    i = arrayOfByte[i];
    int k = j + 1;
    int m = arrayOfByte[j];
    j = k + 1;
    k = arrayOfByte[k];
    b = (j + 1);
    return arrayOfByte[j] & 0xFF | (i & 0xFF) << 24 | (m & 0xFF) << 16 | (k & 0xFF) << 8;
  }
  
  public final String g()
  {
    return h(d.c);
  }
  
  public final String h(Charset paramCharset)
  {
    boolean bool = f.contains(paramCharset);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Unsupported charset: ");
    ((StringBuilder)localObject).append(paramCharset);
    b.o(((StringBuilder)localObject).toString(), bool);
    if (c - b == 0) {
      return null;
    }
    localObject = d.a;
    if (!paramCharset.equals(localObject)) {
      C();
    }
    int i;
    if ((!paramCharset.equals(d.c)) && (!paramCharset.equals(localObject)))
    {
      if ((!paramCharset.equals(d.f)) && (!paramCharset.equals(d.e)) && (!paramCharset.equals(d.d)))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Unsupported charset: ");
        ((StringBuilder)localObject).append(paramCharset);
        throw new IllegalArgumentException(((StringBuilder)localObject).toString());
      }
      i = 2;
    }
    else
    {
      i = 1;
    }
    int j = b;
    int k;
    for (;;)
    {
      k = c;
      if (j >= k - (i - 1)) {
        break;
      }
      if (((paramCharset.equals(d.c)) || (paramCharset.equals(d.a))) && (e0.G(a[j]))) {
        break label322;
      }
      if ((paramCharset.equals(d.f)) || (paramCharset.equals(d.d)))
      {
        localObject = a;
        if ((localObject[j] == 0) && (e0.G(localObject[(j + 1)]))) {
          break label322;
        }
      }
      if (paramCharset.equals(d.e))
      {
        localObject = a;
        if ((localObject[(j + 1)] == 0) && (e0.G(localObject[j]))) {
          break label322;
        }
      }
      j += i;
    }
    j = k;
    label322:
    localObject = t(j - b, paramCharset);
    if (b == c) {
      return (String)localObject;
    }
    if (e(paramCharset, d) == '\r') {
      e(paramCharset, e);
    }
    return (String)localObject;
  }
  
  public final int i()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = i + 1;
    i = arrayOfByte[i];
    int k = j + 1;
    int m = arrayOfByte[j];
    j = k + 1;
    k = arrayOfByte[k];
    b = (j + 1);
    return (arrayOfByte[j] & 0xFF) << 24 | i & 0xFF | (m & 0xFF) << 8 | (k & 0xFF) << 16;
  }
  
  public final long j()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = i + 1;
    long l1 = arrayOfByte[i];
    i = j + 1;
    long l2 = arrayOfByte[j];
    int k = i + 1;
    long l3 = arrayOfByte[i];
    j = k + 1;
    long l4 = arrayOfByte[k];
    i = j + 1;
    long l5 = arrayOfByte[j];
    j = i + 1;
    long l6 = arrayOfByte[i];
    i = j + 1;
    long l7 = arrayOfByte[j];
    b = (i + 1);
    return l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48 | (arrayOfByte[i] & 0xFF) << 56;
  }
  
  public final short k()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = i + 1;
    i = arrayOfByte[i];
    b = (j + 1);
    return (short)((arrayOfByte[j] & 0xFF) << 8 | i & 0xFF);
  }
  
  public final long l()
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
  
  public final int m()
  {
    int i = i();
    if (i >= 0) {
      return i;
    }
    throw new IllegalStateException(f.h("Top bit not zero: ", i));
  }
  
  public final int n()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = i + 1;
    i = arrayOfByte[i];
    b = (j + 1);
    return (arrayOfByte[j] & 0xFF) << 8 | i & 0xFF;
  }
  
  public final long o()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = i + 1;
    long l1 = arrayOfByte[i];
    i = j + 1;
    long l2 = arrayOfByte[j];
    j = i + 1;
    long l3 = arrayOfByte[i];
    i = j + 1;
    long l4 = arrayOfByte[j];
    j = i + 1;
    long l5 = arrayOfByte[i];
    i = j + 1;
    long l6 = arrayOfByte[j];
    j = i + 1;
    long l7 = arrayOfByte[i];
    b = (j + 1);
    return (l1 & 0xFF) << 56 | (l2 & 0xFF) << 48 | (l3 & 0xFF) << 40 | (l4 & 0xFF) << 32 | (l5 & 0xFF) << 24 | (l6 & 0xFF) << 16 | (l7 & 0xFF) << 8 | arrayOfByte[j] & 0xFF;
  }
  
  public final String p()
  {
    int i = c;
    int j = b;
    int k = j;
    Object localObject;
    if (i - j == 0)
    {
      localObject = null;
    }
    else
    {
      while ((k < c) && (a[k] != 0)) {
        k++;
      }
      localObject = a;
      i = b;
      j = e0.a;
      localObject = new String((byte[])localObject, i, k - i, d.c);
      b = k;
      if (k < c) {
        b = (k + 1);
      }
    }
    return (String)localObject;
  }
  
  public final String q(int paramInt)
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
    Object localObject = a;
    int k = e0.a;
    localObject = new String((byte[])localObject, i, j, d.c);
    b += paramInt;
    return (String)localObject;
  }
  
  public final short r()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = i + 1;
    i = arrayOfByte[i];
    b = (j + 1);
    return (short)(arrayOfByte[j] & 0xFF | (i & 0xFF) << 8);
  }
  
  public final String s(int paramInt)
  {
    return t(paramInt, d.c);
  }
  
  public final String t(int paramInt, Charset paramCharset)
  {
    paramCharset = new String(a, b, paramInt, paramCharset);
    b += paramInt;
    return paramCharset;
  }
  
  public final int u()
  {
    return v() << 21 | v() << 14 | v() << 7 | v();
  }
  
  public final int v()
  {
    byte[] arrayOfByte = a;
    int i = b;
    b = (i + 1);
    return arrayOfByte[i] & 0xFF;
  }
  
  public final long w()
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
  
  public final int x()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = i + 1;
    int k = arrayOfByte[i];
    i = j + 1;
    j = arrayOfByte[j];
    b = (i + 1);
    return arrayOfByte[i] & 0xFF | (k & 0xFF) << 16 | (j & 0xFF) << 8;
  }
  
  public final int y()
  {
    int i = f();
    if (i >= 0) {
      return i;
    }
    throw new IllegalStateException(f.h("Top bit not zero: ", i));
  }
  
  public final long z()
  {
    long l = o();
    if (l >= 0L) {
      return l;
    }
    throw new IllegalStateException(j.i("Top bit not zero: ", l));
  }
}

/* Location:
 * Qualified Name:     v5.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
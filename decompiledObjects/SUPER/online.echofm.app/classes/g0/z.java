package g0;

import W2.e;
import X2.t;
import a3.b;
import a3.i;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class z
{
  public static final char[] d = { 13, 10 };
  public static final char[] e = { '\n' };
  public static final X2.y f = X2.y.b0(e.a, e.c, e.f, e.d, e.e);
  public byte[] a;
  public int b;
  public int c;
  
  public z()
  {
    a = M.f;
  }
  
  public z(int paramInt)
  {
    a = new byte[paramInt];
    c = paramInt;
  }
  
  public z(byte[] paramArrayOfByte)
  {
    a = paramArrayOfByte;
    c = paramArrayOfByte.length;
  }
  
  public z(byte[] paramArrayOfByte, int paramInt)
  {
    a = paramArrayOfByte;
    c = paramInt;
  }
  
  public String A()
  {
    return n('\000');
  }
  
  public String B(int paramInt)
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
    String str = M.I(a, i, j);
    b += paramInt;
    return str;
  }
  
  public short C()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = arrayOfByte[i];
    b = (i + 2);
    return (short)(arrayOfByte[(i + 1)] & 0xFF | (j & 0xFF) << 8);
  }
  
  public String D(int paramInt)
  {
    return E(paramInt, e.c);
  }
  
  public String E(int paramInt, Charset paramCharset)
  {
    paramCharset = new String(a, b, paramInt, paramCharset);
    b += paramInt;
    return paramCharset;
  }
  
  public int F()
  {
    return G() << 21 | G() << 14 | G() << 7 | G();
  }
  
  public int G()
  {
    byte[] arrayOfByte = a;
    int i = b;
    b = (i + 1);
    return arrayOfByte[i] & 0xFF;
  }
  
  public int H()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = arrayOfByte[i];
    int k = arrayOfByte[(i + 1)];
    b = (i + 4);
    return k & 0xFF | (j & 0xFF) << 8;
  }
  
  public long I()
  {
    byte[] arrayOfByte = a;
    int i = b;
    long l1 = arrayOfByte[i];
    long l2 = arrayOfByte[(i + 1)];
    long l3 = arrayOfByte[(i + 2)];
    b = (i + 4);
    return arrayOfByte[(i + 3)] & 0xFF | (l1 & 0xFF) << 24 | (l2 & 0xFF) << 16 | (l3 & 0xFF) << 8;
  }
  
  public int J()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = arrayOfByte[i];
    int k = arrayOfByte[(i + 1)];
    b = (i + 3);
    return arrayOfByte[(i + 2)] & 0xFF | (k & 0xFF) << 8 | (j & 0xFF) << 16;
  }
  
  public int K()
  {
    int i = p();
    if (i >= 0) {
      return i;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Top bit not zero: ");
    localStringBuilder.append(i);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public long L()
  {
    long l = z();
    if (l >= 0L) {
      return l;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Top bit not zero: ");
    localStringBuilder.append(l);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public int M()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = arrayOfByte[i];
    b = (i + 2);
    return arrayOfByte[(i + 1)] & 0xFF | (j & 0xFF) << 8;
  }
  
  public long N()
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
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("Invalid UTF-8 sequence continuation byte: ");
          localStringBuilder.append(l);
          throw new NumberFormatException(localStringBuilder.toString());
        }
      }
      b += i;
      return l;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Invalid UTF-8 sequence first byte: ");
    localStringBuilder.append(l);
    throw new NumberFormatException(localStringBuilder.toString());
  }
  
  public Charset O()
  {
    byte[] arrayOfByte;
    int i;
    if (a() >= 3)
    {
      arrayOfByte = a;
      i = b;
      if ((arrayOfByte[i] == -17) && (arrayOfByte[(i + 1)] == -69) && (arrayOfByte[(i + 2)] == -65))
      {
        b = (i + 3);
        return e.c;
      }
    }
    if (a() >= 2)
    {
      arrayOfByte = a;
      int j = b;
      i = arrayOfByte[j];
      if ((i == -2) && (arrayOfByte[(j + 1)] == -1))
      {
        b = (j + 2);
        return e.d;
      }
      if ((i == -1) && (arrayOfByte[(j + 1)] == -2))
      {
        b = (j + 2);
        return e.e;
      }
    }
    return null;
  }
  
  public void P(int paramInt)
  {
    byte[] arrayOfByte;
    if (b() < paramInt) {
      arrayOfByte = new byte[paramInt];
    } else {
      arrayOfByte = a;
    }
    R(arrayOfByte, paramInt);
  }
  
  public void Q(byte[] paramArrayOfByte)
  {
    R(paramArrayOfByte, paramArrayOfByte.length);
  }
  
  public void R(byte[] paramArrayOfByte, int paramInt)
  {
    a = paramArrayOfByte;
    c = paramInt;
    b = 0;
  }
  
  public void S(int paramInt)
  {
    boolean bool;
    if ((paramInt >= 0) && (paramInt <= a.length)) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    c = paramInt;
  }
  
  public void T(int paramInt)
  {
    boolean bool;
    if ((paramInt >= 0) && (paramInt <= c)) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    b = paramInt;
  }
  
  public void U(int paramInt)
  {
    T(b + paramInt);
  }
  
  public final void V(Charset paramCharset)
  {
    if (m(paramCharset, d) == '\r') {
      m(paramCharset, e);
    }
  }
  
  public int a()
  {
    return c - b;
  }
  
  public int b()
  {
    return a.length;
  }
  
  public void c(int paramInt)
  {
    if (paramInt > b()) {
      a = Arrays.copyOf(a, paramInt);
    }
  }
  
  public final int d(Charset paramCharset)
  {
    Object localObject;
    int i;
    if ((!paramCharset.equals(e.c)) && (!paramCharset.equals(e.a)))
    {
      if ((!paramCharset.equals(e.f)) && (!paramCharset.equals(e.e)) && (!paramCharset.equals(e.d)))
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
      if (((paramCharset.equals(e.c)) || (paramCharset.equals(e.a))) && (M.C0(a[j]))) {
        return j;
      }
      if ((paramCharset.equals(e.f)) || (paramCharset.equals(e.d)))
      {
        localObject = a;
        if ((localObject[j] == 0) && (M.C0(localObject[(j + 1)]))) {
          return j;
        }
      }
      if (paramCharset.equals(e.e))
      {
        localObject = a;
        if ((localObject[(j + 1)] == 0) && (M.C0(localObject[j]))) {
          return j;
        }
      }
      j += i;
    }
    return k;
  }
  
  public byte[] e()
  {
    return a;
  }
  
  public int f()
  {
    return b;
  }
  
  public int g()
  {
    return c;
  }
  
  public char h(Charset paramCharset)
  {
    boolean bool = f.contains(paramCharset);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unsupported charset: ");
    localStringBuilder.append(paramCharset);
    a.b(bool, localStringBuilder.toString());
    return (char)(i(paramCharset) >> 16);
  }
  
  public final int i(Charset paramCharset)
  {
    boolean bool = paramCharset.equals(e.c);
    int i = 1;
    int j;
    if (((bool) || (paramCharset.equals(e.a))) && (a() >= 1))
    {
      j = (byte)b.a(i.b(a[b]));
    }
    else
    {
      if (((paramCharset.equals(e.f)) || (paramCharset.equals(e.d))) && (a() >= 2))
      {
        paramCharset = a;
        i = b;
      }
      for (i = b.c(paramCharset[i], paramCharset[(i + 1)]);; i = b.c(paramCharset[(i + 1)], paramCharset[i]))
      {
        j = (byte)i;
        i = 2;
        break;
        if ((!paramCharset.equals(e.e)) || (a() < 2)) {
          break label168;
        }
        paramCharset = a;
        i = b;
      }
    }
    return (b.a(j) << '\020') + i;
    label168:
    return 0;
  }
  
  public int j()
  {
    return a[b] & 0xFF;
  }
  
  public void k(y paramy, int paramInt)
  {
    l(a, 0, paramInt);
    paramy.p(0);
  }
  
  public void l(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    System.arraycopy(a, b, paramArrayOfByte, paramInt1, paramInt2);
    b += paramInt2;
  }
  
  public final char m(Charset paramCharset, char[] paramArrayOfChar)
  {
    int i = i(paramCharset);
    if (i != 0)
    {
      char c1 = (char)(i >> 16);
      if (b.b(paramArrayOfChar, c1))
      {
        b += (i & 0xFFFF);
        return c1;
      }
    }
    return '\000';
  }
  
  public String n(char paramChar)
  {
    if (a() == 0) {
      return null;
    }
    for (char c1 = b; (c1 < c) && (a[c1] != paramChar); c1++) {}
    Object localObject = a;
    paramChar = b;
    localObject = M.I((byte[])localObject, paramChar, c1 - paramChar);
    b = c1;
    if (c1 < c) {
      b = (c1 + '\001');
    }
    return (String)localObject;
  }
  
  public double o()
  {
    return Double.longBitsToDouble(z());
  }
  
  public int p()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = arrayOfByte[i];
    int k = arrayOfByte[(i + 1)];
    int m = arrayOfByte[(i + 2)];
    b = (i + 4);
    return arrayOfByte[(i + 3)] & 0xFF | (k & 0xFF) << 16 | (j & 0xFF) << 24 | (m & 0xFF) << 8;
  }
  
  public int q()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = arrayOfByte[i];
    int k = arrayOfByte[(i + 1)];
    b = (i + 3);
    return arrayOfByte[(i + 2)] & 0xFF | (k & 0xFF) << 8 | (j & 0xFF) << 24 >> 8;
  }
  
  public String r()
  {
    return s(e.c);
  }
  
  public String s(Charset paramCharset)
  {
    boolean bool = f.contains(paramCharset);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Unsupported charset: ");
    ((StringBuilder)localObject).append(paramCharset);
    a.b(bool, ((StringBuilder)localObject).toString());
    if (a() == 0) {
      return null;
    }
    if (!paramCharset.equals(e.a)) {
      O();
    }
    localObject = E(d(paramCharset) - b, paramCharset);
    if (b == c) {
      return (String)localObject;
    }
    V(paramCharset);
    return (String)localObject;
  }
  
  public int t()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = arrayOfByte[i];
    int k = arrayOfByte[(i + 1)];
    int m = arrayOfByte[(i + 2)];
    b = (i + 4);
    return (arrayOfByte[(i + 3)] & 0xFF) << 24 | (k & 0xFF) << 8 | j & 0xFF | (m & 0xFF) << 16;
  }
  
  public long u()
  {
    byte[] arrayOfByte = a;
    int i = b;
    long l1 = arrayOfByte[i];
    long l2 = arrayOfByte[(i + 1)];
    long l3 = arrayOfByte[(i + 2)];
    long l4 = arrayOfByte[(i + 3)];
    long l5 = arrayOfByte[(i + 4)];
    long l6 = arrayOfByte[(i + 5)];
    long l7 = arrayOfByte[(i + 6)];
    b = (i + 8);
    return (arrayOfByte[(i + 7)] & 0xFF) << 56 | l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48;
  }
  
  public short v()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = arrayOfByte[i];
    b = (i + 2);
    return (short)((arrayOfByte[(i + 1)] & 0xFF) << 8 | j & 0xFF);
  }
  
  public long w()
  {
    byte[] arrayOfByte = a;
    int i = b;
    long l1 = arrayOfByte[i];
    long l2 = arrayOfByte[(i + 1)];
    long l3 = arrayOfByte[(i + 2)];
    b = (i + 4);
    return (arrayOfByte[(i + 3)] & 0xFF) << 24 | l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16;
  }
  
  public int x()
  {
    int i = t();
    if (i >= 0) {
      return i;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Top bit not zero: ");
    localStringBuilder.append(i);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public int y()
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = arrayOfByte[i];
    b = (i + 2);
    return (arrayOfByte[(i + 1)] & 0xFF) << 8 | j & 0xFF;
  }
  
  public long z()
  {
    byte[] arrayOfByte = a;
    int i = b;
    long l1 = arrayOfByte[i];
    long l2 = arrayOfByte[(i + 1)];
    long l3 = arrayOfByte[(i + 2)];
    long l4 = arrayOfByte[(i + 3)];
    long l5 = arrayOfByte[(i + 4)];
    long l6 = arrayOfByte[(i + 5)];
    long l7 = arrayOfByte[(i + 6)];
    b = (i + 8);
    return arrayOfByte[(i + 7)] & 0xFF | (l1 & 0xFF) << 56 | (l2 & 0xFF) << 48 | (l3 & 0xFF) << 40 | (l4 & 0xFF) << 32 | (l5 & 0xFF) << 24 | (l6 & 0xFF) << 16 | (l7 & 0xFF) << 8;
  }
}

/* Location:
 * Qualified Name:     g0.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class h$c
  extends h
{
  public final InputStream f;
  public final byte[] g;
  public int h;
  public int i;
  public int j;
  public int k;
  public int l;
  public int m = Integer.MAX_VALUE;
  
  public h$c(InputStream paramInputStream, int paramInt)
  {
    super(null);
    y.b(paramInputStream, "input");
    f = paramInputStream;
    g = new byte[paramInt];
    h = 0;
    j = 0;
    l = 0;
  }
  
  private void P()
  {
    int n = h + i;
    h = n;
    int i1 = l + n;
    int i2 = m;
    if (i1 > i2)
    {
      i1 -= i2;
      i = i1;
      h = (n - i1);
    }
    else
    {
      i = 0;
    }
  }
  
  private void U()
  {
    if (h - j >= 10) {
      V();
    } else {
      W();
    }
  }
  
  private void V()
  {
    for (int n = 0; n < 10; n++)
    {
      byte[] arrayOfByte = g;
      int i1 = j;
      j = (i1 + 1);
      if (arrayOfByte[i1] >= 0) {
        return;
      }
    }
    throw z.e();
  }
  
  private void W()
  {
    for (int n = 0; n < 10; n++) {
      if (G() >= 0) {
        return;
      }
    }
    throw z.e();
  }
  
  public String A()
  {
    int n = M();
    int i1 = j;
    int i2 = h;
    byte[] arrayOfByte;
    if ((n <= i2 - i1) && (n > 0))
    {
      arrayOfByte = g;
      j = (i1 + n);
    }
    else
    {
      if (n == 0) {
        return "";
      }
      i1 = 0;
      if (n <= i2)
      {
        Q(n);
        arrayOfByte = g;
        j = n;
      }
      else
      {
        arrayOfByte = H(n, false);
      }
    }
    return q0.e(arrayOfByte, i1, n);
  }
  
  public int B()
  {
    if (e())
    {
      k = 0;
      return 0;
    }
    int n = M();
    k = n;
    if (r0.a(n) != 0) {
      return k;
    }
    throw z.b();
  }
  
  public int C()
  {
    return M();
  }
  
  public long D()
  {
    return N();
  }
  
  public boolean E(int paramInt)
  {
    int n = r0.b(paramInt);
    if (n != 0)
    {
      if (n != 1)
      {
        if (n != 2)
        {
          if (n != 3)
          {
            if (n != 4)
            {
              if (n == 5)
              {
                S(4);
                return true;
              }
              throw z.d();
            }
            return false;
          }
          R();
          a(r0.c(r0.a(paramInt), 4));
          return true;
        }
        S(M());
        return true;
      }
      S(8);
      return true;
    }
    U();
    return true;
  }
  
  public final g F(int paramInt)
  {
    byte[] arrayOfByte1 = I(paramInt);
    if (arrayOfByte1 != null) {
      return g.i(arrayOfByte1);
    }
    int n = j;
    int i1 = h;
    int i2 = i1 - n;
    l += i1;
    j = 0;
    h = 0;
    Object localObject = J(paramInt - i2);
    arrayOfByte1 = new byte[paramInt];
    System.arraycopy(g, n, arrayOfByte1, 0, i2);
    localObject = ((List)localObject).iterator();
    paramInt = i2;
    while (((Iterator)localObject).hasNext())
    {
      byte[] arrayOfByte2 = (byte[])((Iterator)localObject).next();
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, paramInt, arrayOfByte2.length);
      paramInt += arrayOfByte2.length;
    }
    return g.b0(arrayOfByte1);
  }
  
  public byte G()
  {
    if (j == h) {
      Q(1);
    }
    byte[] arrayOfByte = g;
    int n = j;
    j = (n + 1);
    return arrayOfByte[n];
  }
  
  public final byte[] H(int paramInt, boolean paramBoolean)
  {
    Object localObject1 = I(paramInt);
    if (localObject1 != null)
    {
      localObject2 = localObject1;
      if (paramBoolean) {
        localObject2 = (byte[])((byte[])localObject1).clone();
      }
      return (byte[])localObject2;
    }
    int n = j;
    int i1 = h;
    int i2 = i1 - n;
    l += i1;
    j = 0;
    h = 0;
    localObject1 = J(paramInt - i2);
    Object localObject2 = new byte[paramInt];
    System.arraycopy(g, n, localObject2, 0, i2);
    Iterator localIterator = ((List)localObject1).iterator();
    paramInt = i2;
    while (localIterator.hasNext())
    {
      localObject1 = (byte[])localIterator.next();
      System.arraycopy(localObject1, 0, localObject2, paramInt, localObject1.length);
      paramInt += localObject1.length;
    }
    return (byte[])localObject2;
  }
  
  public final byte[] I(int paramInt)
  {
    if (paramInt == 0) {
      return y.c;
    }
    if (paramInt >= 0)
    {
      int n = l;
      int i1 = j;
      int i2 = n + i1 + paramInt;
      if (i2 - c <= 0)
      {
        int i3 = m;
        if (i2 <= i3)
        {
          i1 = h - i1;
          n = paramInt - i1;
          if ((n >= 4096) && (n > f.available())) {
            return null;
          }
          byte[] arrayOfByte = new byte[paramInt];
          System.arraycopy(g, j, arrayOfByte, 0, i1);
          l += h;
          j = 0;
          h = 0;
          while (i1 < paramInt)
          {
            n = f.read(arrayOfByte, i1, paramInt - i1);
            if (n != -1)
            {
              l += n;
              i1 += n;
            }
            else
            {
              throw z.k();
            }
          }
          return arrayOfByte;
        }
        S(i3 - n - i1);
        throw z.k();
      }
      throw z.j();
    }
    throw z.f();
  }
  
  public final List J(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    while (paramInt > 0)
    {
      int n = Math.min(paramInt, 4096);
      byte[] arrayOfByte = new byte[n];
      int i1 = 0;
      while (i1 < n)
      {
        int i2 = f.read(arrayOfByte, i1, n - i1);
        if (i2 != -1)
        {
          l += i2;
          i1 += i2;
        }
        else
        {
          throw z.k();
        }
      }
      paramInt -= n;
      localArrayList.add(arrayOfByte);
    }
    return localArrayList;
  }
  
  public int K()
  {
    int n = j;
    int i1 = n;
    if (h - n < 4)
    {
      Q(4);
      i1 = j;
    }
    byte[] arrayOfByte = g;
    j = (i1 + 4);
    int i2 = arrayOfByte[i1];
    int i3 = arrayOfByte[(i1 + 1)];
    n = arrayOfByte[(i1 + 2)];
    return (arrayOfByte[(i1 + 3)] & 0xFF) << 24 | i2 & 0xFF | (i3 & 0xFF) << 8 | (n & 0xFF) << 16;
  }
  
  public long L()
  {
    int n = j;
    int i1 = n;
    if (h - n < 8)
    {
      Q(8);
      i1 = j;
    }
    byte[] arrayOfByte = g;
    j = (i1 + 8);
    long l1 = arrayOfByte[i1];
    long l2 = arrayOfByte[(i1 + 1)];
    long l3 = arrayOfByte[(i1 + 2)];
    long l4 = arrayOfByte[(i1 + 3)];
    long l5 = arrayOfByte[(i1 + 4)];
    long l6 = arrayOfByte[(i1 + 5)];
    long l7 = arrayOfByte[(i1 + 6)];
    return (arrayOfByte[(i1 + 7)] & 0xFF) << 56 | l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48;
  }
  
  public int M()
  {
    int n = j;
    int i1 = h;
    byte[] arrayOfByte;
    int i2;
    int i3;
    if (i1 != n)
    {
      arrayOfByte = g;
      i2 = n + 1;
      i3 = arrayOfByte[n];
      if (i3 >= 0)
      {
        j = i2;
        return i3;
      }
      if (i1 - i2 >= 9)
      {
        i1 = n + 2;
        i3 = arrayOfByte[i2] << 7 ^ i3;
        if (i3 < 0)
        {
          i2 = i3 ^ 0xFFFFFF80;
          break label311;
        }
        i2 = n + 3;
        i3 = arrayOfByte[i1] << 14 ^ i3;
        if (i3 >= 0)
        {
          i1 = i3 ^ 0x3F80;
          i3 = i2;
          i2 = i1;
          i1 = i3;
          break label311;
        }
        i1 = n + 4;
        i2 = i3 ^ arrayOfByte[i2] << 21;
        if (i2 < 0)
        {
          i3 = 0xFFE03F80 ^ i2;
          i2 = i1;
          i1 = i3;
        }
      }
    }
    label308:
    for (;;)
    {
      i3 = i2;
      i2 = i1;
      i1 = i3;
      break label311;
      i3 = n + 5;
      int i4 = arrayOfByte[i1];
      i1 = i2 ^ i4 << 28 ^ 0xFE03F80;
      i2 = i3;
      if (i4 < 0)
      {
        i4 = n + 6;
        i2 = i4;
        if (arrayOfByte[i3] >= 0) {
          break label308;
        }
        i3 = n + 7;
        i2 = i3;
        if (arrayOfByte[i4] < 0)
        {
          i4 = n + 8;
          i2 = i4;
          if (arrayOfByte[i3] >= 0) {
            break label308;
          }
          i3 = n + 9;
          i2 = i3;
          if (arrayOfByte[i4] < 0)
          {
            if (arrayOfByte[i3] < 0) {
              return (int)O();
            }
            i3 = n + 10;
            i2 = i1;
            i1 = i3;
            break label311;
          }
        }
      }
      break;
    }
    label311:
    j = i1;
    return i2;
  }
  
  public long N()
  {
    int n = j;
    int i1 = h;
    long l1;
    if (i1 != n)
    {
      byte[] arrayOfByte = g;
      int i2 = n + 1;
      int i3 = arrayOfByte[n];
      if (i3 >= 0)
      {
        j = i2;
        return i3;
      }
      if (i1 - i2 >= 9)
      {
        i1 = n + 2;
        i2 = arrayOfByte[i2] << 7 ^ i3;
        if (i2 < 0)
        {
          l1 = i2 ^ 0xFFFFFF80;
          break label373;
        }
        i3 = n + 3;
        i2 = arrayOfByte[i1] << 14 ^ i2;
        if (i2 >= 0)
        {
          l1 = i2 ^ 0x3F80;
          i1 = i3;
          break label373;
        }
        i1 = n + 4;
        i3 = i2 ^ arrayOfByte[i3] << 21;
        if (i3 < 0)
        {
          l1 = 0xFFE03F80 ^ i3;
          break label373;
        }
        l1 = i3;
        i3 = n + 5;
        long l2 = l1 ^ arrayOfByte[i1] << 28;
        if (l2 >= 0L)
        {
          l1 = 266354560L;
          i1 = i3;
          l1 = l2 ^ l1;
          break label373;
        }
        i2 = n + 6;
        l1 = l2 ^ arrayOfByte[i3] << 35;
        if (l1 < 0L) {
          l2 = -34093383808L;
        }
        for (i1 = i2;; i1 = i2)
        {
          l1 ^= l2;
          break label373;
          i1 = n + 7;
          l2 = l1 ^ arrayOfByte[i2] << 42;
          if (l2 >= 0L)
          {
            l1 = 4363953127296L;
            break;
          }
          i2 = n + 8;
          l1 = l2 ^ arrayOfByte[i1] << 49;
          if (l1 >= 0L) {
            break label320;
          }
          l2 = -558586000294016L;
        }
        label320:
        i3 = n + 9;
        l1 = l1 ^ arrayOfByte[i2] << 56 ^ 0xFE03F80FE03F80;
        i1 = i3;
        if (l1 >= 0L) {
          break label373;
        }
        if (arrayOfByte[i3] >= 0L) {
          break label368;
        }
      }
    }
    return O();
    label368:
    i1 = n + 10;
    label373:
    j = i1;
    return l1;
  }
  
  public long O()
  {
    long l1 = 0L;
    for (int n = 0; n < 64; n += 7)
    {
      int i1 = G();
      l1 |= (i1 & 0x7F) << n;
      if ((i1 & 0x80) == 0) {
        return l1;
      }
    }
    throw z.e();
  }
  
  public final void Q(int paramInt)
  {
    if (!X(paramInt))
    {
      if (paramInt > c - l - j) {
        throw z.j();
      }
      throw z.k();
    }
  }
  
  public void R()
  {
    int n;
    do
    {
      n = B();
    } while ((n != 0) && (E(n)));
  }
  
  public void S(int paramInt)
  {
    int n = h;
    int i1 = j;
    if ((paramInt <= n - i1) && (paramInt >= 0)) {
      j = (i1 + paramInt);
    } else {
      T(paramInt);
    }
  }
  
  public final void T(int paramInt)
  {
    if (paramInt >= 0)
    {
      int n = l;
      int i1 = j;
      int i3 = m;
      int i2;
      if (n + i1 + paramInt <= i3)
      {
        l = (n + i1);
        i3 = h - i1;
        h = 0;
        j = 0;
        while (i3 < paramInt) {
          try
          {
            Object localObject1 = f;
            long l1 = paramInt - i3;
            long l2 = ((InputStream)localObject1).skip(l1);
            boolean bool = l2 < 0L;
            if ((!bool) && (l2 <= l1))
            {
              if (bool) {
                i3 += (int)l2;
              }
            }
            else
            {
              localObject1 = new java/lang/IllegalStateException;
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localStringBuilder.append(f.getClass());
              localStringBuilder.append("#skip returned invalid result: ");
              localStringBuilder.append(l2);
              localStringBuilder.append("\nThe InputStream implementation is buggy.");
              ((IllegalStateException)localObject1).<init>(localStringBuilder.toString());
              throw ((Throwable)localObject1);
            }
          }
          finally
          {
            l += i3;
            P();
          }
        }
        l += i3;
        P();
        if (i3 < paramInt)
        {
          i2 = h;
          i3 = i2 - j;
          for (j = i2;; j = i2)
          {
            Q(1);
            n = paramInt - i3;
            i2 = h;
            if (n <= i2) {
              break;
            }
            i3 += i2;
          }
          j = n;
        }
        return;
      }
      S(i3 - n - i2);
      throw z.k();
    }
    throw z.f();
  }
  
  public final boolean X(int paramInt)
  {
    int n = j;
    int i1 = h;
    if (n + paramInt > i1)
    {
      int i2 = c;
      int i3 = l;
      if (paramInt > i2 - i3 - n) {
        return false;
      }
      if (i3 + n + paramInt > m) {
        return false;
      }
      if (n > 0)
      {
        if (i1 > n)
        {
          localObject = g;
          System.arraycopy(localObject, n, localObject, 0, i1 - n);
        }
        l += n;
        h -= n;
        j = 0;
      }
      InputStream localInputStream = f;
      localObject = g;
      i3 = h;
      i3 = localInputStream.read((byte[])localObject, i3, Math.min(localObject.length - i3, c - l - i3));
      if ((i3 != 0) && (i3 >= -1) && (i3 <= g.length))
      {
        if (i3 > 0)
        {
          h += i3;
          P();
          boolean bool;
          if (h >= paramInt) {
            bool = true;
          } else {
            bool = X(paramInt);
          }
          return bool;
        }
        return false;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(f.getClass());
      ((StringBuilder)localObject).append("#read(byte[]) returned invalid result: ");
      ((StringBuilder)localObject).append(i3);
      ((StringBuilder)localObject).append("\nThe InputStream implementation is buggy.");
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("refillBuffer() called when ");
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append(" bytes were already available in buffer");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public void a(int paramInt)
  {
    if (k == paramInt) {
      return;
    }
    throw z.a();
  }
  
  public int d()
  {
    return l + j;
  }
  
  public boolean e()
  {
    boolean bool;
    if (j == h)
    {
      bool = true;
      if (!X(1)) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public void k(int paramInt)
  {
    m = paramInt;
    P();
  }
  
  public int l(int paramInt)
  {
    if (paramInt >= 0)
    {
      paramInt += l + j;
      int n = m;
      if (paramInt <= n)
      {
        m = paramInt;
        P();
        return n;
      }
      throw z.k();
    }
    throw z.f();
  }
  
  public boolean m()
  {
    boolean bool;
    if (N() != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public g n()
  {
    int n = M();
    int i1 = h;
    int i2 = j;
    if ((n <= i1 - i2) && (n > 0))
    {
      g localg = g.k(g, i2, n);
      j += n;
      return localg;
    }
    if (n == 0) {
      return g.p;
    }
    return F(n);
  }
  
  public double o()
  {
    return Double.longBitsToDouble(L());
  }
  
  public int p()
  {
    return M();
  }
  
  public int q()
  {
    return K();
  }
  
  public long r()
  {
    return L();
  }
  
  public float s()
  {
    return Float.intBitsToFloat(K());
  }
  
  public int t()
  {
    return M();
  }
  
  public long u()
  {
    return N();
  }
  
  public int v()
  {
    return K();
  }
  
  public long w()
  {
    return L();
  }
  
  public int x()
  {
    return h.b(M());
  }
  
  public long y()
  {
    return h.c(N());
  }
  
  public String z()
  {
    int n = M();
    String str;
    if (n > 0)
    {
      int i1 = h;
      int i2 = j;
      if (n <= i1 - i2)
      {
        str = new String(g, i2, n, y.a);
        j += n;
        return str;
      }
    }
    if (n == 0) {
      return "";
    }
    if (n <= h)
    {
      Q(n);
      str = new String(g, j, n, y.a);
      j += n;
      return str;
    }
    return new String(H(n, false), y.a);
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.h.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
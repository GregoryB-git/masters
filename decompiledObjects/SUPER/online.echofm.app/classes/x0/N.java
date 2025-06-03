package x0;

import B0.b;
import B0.b.a;
import F0.T.a;
import g0.M;
import g0.z;
import j0.c;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class N
{
  public final b a;
  public final int b;
  public final z c;
  public a d;
  public a e;
  public a f;
  public long g;
  
  public N(b paramb)
  {
    a = paramb;
    int i = paramb.e();
    b = i;
    c = new z(32);
    paramb = new a(0L, i);
    d = paramb;
    e = paramb;
    f = paramb;
  }
  
  public static a d(a parama, long paramLong)
  {
    while (paramLong >= b) {
      parama = d;
    }
    return parama;
  }
  
  public static a i(a parama, long paramLong, ByteBuffer paramByteBuffer, int paramInt)
  {
    parama = d(parama, paramLong);
    while (paramInt > 0)
    {
      int i = Math.min(paramInt, (int)(b - paramLong));
      paramByteBuffer.put(c.a, parama.e(paramLong), i);
      int j = paramInt - i;
      long l = paramLong + i;
      paramLong = l;
      paramInt = j;
      if (l == b)
      {
        parama = d;
        paramLong = l;
        paramInt = j;
      }
    }
    return parama;
  }
  
  public static a j(a parama, long paramLong, byte[] paramArrayOfByte, int paramInt)
  {
    parama = d(parama, paramLong);
    int i = paramInt;
    while (i > 0)
    {
      int j = Math.min(i, (int)(b - paramLong));
      System.arraycopy(c.a, parama.e(paramLong), paramArrayOfByte, paramInt - i, j);
      int k = i - j;
      long l = paramLong + j;
      i = k;
      paramLong = l;
      if (l == b)
      {
        parama = d;
        i = k;
        paramLong = l;
      }
    }
    return parama;
  }
  
  public static a k(a parama, j0.i parami, P.b paramb, z paramz)
  {
    long l1 = b;
    int i = 1;
    paramz.P(1);
    parama = j(parama, l1, paramz.e(), 1);
    l1 += 1L;
    Object localObject1 = paramz.e();
    int j = 0;
    int k = localObject1[0];
    if ((k & 0x80) != 0) {
      m = 1;
    } else {
      m = 0;
    }
    k &= 0x7F;
    c localc = q;
    parami = a;
    if (parami == null) {
      a = new byte[16];
    } else {
      Arrays.fill(parami, (byte)0);
    }
    parami = j(parama, l1, a, k);
    long l2 = l1 + k;
    l1 = l2;
    parama = parami;
    if (m != 0)
    {
      paramz.P(2);
      parama = j(parami, l2, paramz.e(), 2);
      l1 = l2 + 2L;
      i = paramz.M();
    }
    localObject1 = d;
    if (localObject1 != null)
    {
      parami = (j0.i)localObject1;
      if (localObject1.length < i) {}
    }
    for (;;)
    {
      break;
      parami = new int[i];
    }
    Object localObject2 = e;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (localObject2.length < i) {}
    }
    for (;;)
    {
      break;
      localObject1 = new int[i];
    }
    if (m != 0)
    {
      m = i * 6;
      paramz.P(m);
      localObject2 = j(parama, l1, paramz.e(), m);
      l2 = l1 + m;
      paramz.T(0);
      for (m = j;; m++)
      {
        l1 = l2;
        parama = (a)localObject2;
        if (m >= i) {
          break;
        }
        parami[m] = paramz.M();
        localObject1[m] = paramz.K();
      }
    }
    parami[0] = 0;
    localObject1[0] = (a - (int)(l1 - b));
    paramz = (T.a)M.i(c);
    localc.c(i, parami, (int[])localObject1, b, a, a, c, d);
    l2 = b;
    int m = (int)(l1 - l2);
    b = (l2 + m);
    a -= m;
    return parama;
  }
  
  public static a l(a parama, j0.i parami, P.b paramb, z paramz)
  {
    a locala = parama;
    if (parami.D()) {
      locala = k(parama, parami, paramb, paramz);
    }
    long l;
    if (parami.o())
    {
      paramz.P(4);
      parama = j(locala, b, paramz.e(), 4);
      int i = paramz.K();
      b += 4L;
      a -= 4;
      parami.z(i);
      locala = i(parama, b, r, i);
      b += i;
      i = a - i;
      a = i;
      parami.G(i);
      l = b;
    }
    for (parama = u;; parama = r)
    {
      parama = i(locala, l, parama, a);
      break;
      parami.z(a);
      l = b;
    }
    return parama;
  }
  
  public final void a(a parama)
  {
    if (c == null) {
      return;
    }
    a.b(parama);
    parama.b();
  }
  
  public void b(long paramLong)
  {
    if (paramLong == -1L) {
      return;
    }
    a locala;
    for (;;)
    {
      locala = d;
      if (paramLong < b) {
        break;
      }
      a.c(c);
      d = d.b();
    }
    if (e.a < a) {
      e = locala;
    }
  }
  
  public void c(long paramLong)
  {
    boolean bool;
    if (paramLong <= g) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.a(bool);
    g = paramLong;
    if (paramLong != 0L)
    {
      Object localObject1 = d;
      localObject2 = localObject1;
      if (paramLong != a)
      {
        while (g > b) {
          localObject2 = d;
        }
        a locala1 = (a)g0.a.e(d);
        a(locala1);
        a locala2 = new a(b, b);
        d = locala2;
        localObject1 = localObject2;
        if (g == b) {
          localObject1 = locala2;
        }
        f = ((a)localObject1);
        if (e != locala1) {
          return;
        }
        e = locala2;
        return;
      }
    }
    a(d);
    Object localObject2 = new a(g, b);
    d = ((a)localObject2);
    e = ((a)localObject2);
    f = ((a)localObject2);
  }
  
  public long e()
  {
    return g;
  }
  
  public void f(j0.i parami, P.b paramb)
  {
    l(e, parami, paramb, c);
  }
  
  public final void g(int paramInt)
  {
    long l = g + paramInt;
    g = l;
    a locala = f;
    if (l == b) {
      f = d;
    }
  }
  
  public final int h(int paramInt)
  {
    a locala = f;
    if (c == null) {
      locala.c(a.d(), new a(f.b, b));
    }
    return Math.min(paramInt, (int)(f.b - g));
  }
  
  public void m(j0.i parami, P.b paramb)
  {
    e = l(e, parami, paramb, c);
  }
  
  public void n()
  {
    a(d);
    d.d(0L, b);
    a locala = d;
    e = locala;
    f = locala;
    g = 0L;
    a.a();
  }
  
  public void o()
  {
    e = d;
  }
  
  public int p(d0.i parami, int paramInt, boolean paramBoolean)
  {
    paramInt = h(paramInt);
    a locala = f;
    paramInt = parami.read(c.a, locala.e(g), paramInt);
    if (paramInt == -1)
    {
      if (paramBoolean) {
        return -1;
      }
      throw new EOFException();
    }
    g(paramInt);
    return paramInt;
  }
  
  public void q(z paramz, int paramInt)
  {
    while (paramInt > 0)
    {
      int i = h(paramInt);
      a locala = f;
      paramz.l(c.a, locala.e(g), i);
      paramInt -= i;
      g(i);
    }
  }
  
  public static final class a
    implements b.a
  {
    public long a;
    public long b;
    public B0.a c;
    public a d;
    
    public a(long paramLong, int paramInt)
    {
      d(paramLong, paramInt);
    }
    
    public B0.a a()
    {
      return (B0.a)g0.a.e(c);
    }
    
    public a b()
    {
      c = null;
      a locala = d;
      d = null;
      return locala;
    }
    
    public void c(B0.a parama, a parama1)
    {
      c = parama;
      d = parama1;
    }
    
    public void d(long paramLong, int paramInt)
    {
      boolean bool;
      if (c == null) {
        bool = true;
      } else {
        bool = false;
      }
      g0.a.f(bool);
      a = paramLong;
      b = (paramLong + paramInt);
    }
    
    public int e(long paramLong)
    {
      return (int)(paramLong - a) + c.b;
    }
    
    public b.a next()
    {
      a locala = d;
      if ((locala != null) && (c != null)) {
        return locala;
      }
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     x0.N
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
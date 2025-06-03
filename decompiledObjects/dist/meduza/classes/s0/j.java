package s0;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import m.e;
import o0.q.b;

public abstract class j
  extends e
{
  public static final Logger c = Logger.getLogger(j.class.getName());
  public static final boolean d = l1.f;
  public k b;
  
  public j()
  {
    super(1);
  }
  
  public static int A(int paramInt)
  {
    return N(paramInt) + 8;
  }
  
  public static int B(int paramInt)
  {
    return N(paramInt) + 4;
  }
  
  @Deprecated
  public static int C(int paramInt, o0 paramo0, c1 paramc1)
  {
    paramInt = N(paramInt);
    return ((a)paramo0).i(paramc1) + paramInt * 2;
  }
  
  public static int D(int paramInt1, int paramInt2)
  {
    paramInt1 = N(paramInt1);
    return E(paramInt2) + paramInt1;
  }
  
  public static int E(int paramInt)
  {
    if (paramInt >= 0) {
      return P(paramInt);
    }
    return 10;
  }
  
  public static int F(int paramInt, long paramLong)
  {
    paramInt = N(paramInt);
    return R(paramLong) + paramInt;
  }
  
  public static int G(b0 paramb0)
  {
    int i;
    if (b != null) {
      i = b.size();
    } else if (a != null) {
      i = a.d();
    } else {
      i = 0;
    }
    return P(i) + i;
  }
  
  public static int H(int paramInt)
  {
    return N(paramInt) + 4;
  }
  
  public static int I(int paramInt)
  {
    return N(paramInt) + 8;
  }
  
  public static int J(int paramInt1, int paramInt2)
  {
    paramInt1 = N(paramInt1);
    return P(paramInt2 >> 31 ^ paramInt2 << 1) + paramInt1;
  }
  
  public static int K(int paramInt, long paramLong)
  {
    paramInt = N(paramInt);
    return R(paramLong >> 63 ^ paramLong << 1) + paramInt;
  }
  
  public static int L(int paramInt, String paramString)
  {
    paramInt = N(paramInt);
    return M(paramString) + paramInt;
  }
  
  public static int M(String paramString)
  {
    int i;
    try
    {
      i = m1.a(paramString);
    }
    catch (m1.d locald)
    {
      i = paramString.getBytes(x.a).length;
    }
    return P(i) + i;
  }
  
  public static int N(int paramInt)
  {
    return P(paramInt << 3 | 0x0);
  }
  
  public static int O(int paramInt1, int paramInt2)
  {
    paramInt1 = N(paramInt1);
    return P(paramInt2) + paramInt1;
  }
  
  public static int P(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0) {
      return 1;
    }
    if ((paramInt & 0xC000) == 0) {
      return 2;
    }
    if ((0xFFE00000 & paramInt) == 0) {
      return 3;
    }
    if ((paramInt & 0xF0000000) == 0) {
      return 4;
    }
    return 5;
  }
  
  public static int Q(int paramInt, long paramLong)
  {
    paramInt = N(paramInt);
    return R(paramLong) + paramInt;
  }
  
  public static int R(long paramLong)
  {
    if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L) {
      return 1;
    }
    if (paramLong < 0L) {
      return 10;
    }
    if ((0xFFFFFFF800000000 & paramLong) != 0L)
    {
      i = 6;
      paramLong >>>= 28;
    }
    else
    {
      i = 2;
    }
    int j = i;
    long l = paramLong;
    if ((0xFFFFFFFFFFE00000 & paramLong) != 0L)
    {
      j = i + 2;
      l = paramLong >>> 14;
    }
    int i = j;
    if ((l & 0xFFFFFFFFFFFFC000) != 0L) {
      i = j + 1;
    }
    return i;
  }
  
  public static int v(int paramInt)
  {
    return N(paramInt) + 1;
  }
  
  public static int w(int paramInt, g paramg)
  {
    paramInt = N(paramInt);
    int i = paramg.size();
    return P(i) + i + paramInt;
  }
  
  public static int x(int paramInt)
  {
    return N(paramInt) + 8;
  }
  
  public static int y(int paramInt1, int paramInt2)
  {
    paramInt1 = N(paramInt1);
    return E(paramInt2) + paramInt1;
  }
  
  public static int z(int paramInt)
  {
    return N(paramInt) + 4;
  }
  
  public final void S(String paramString, m1.d paramd)
  {
    c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", paramd);
    paramString = paramString.getBytes(x.a);
    try
    {
      m0(paramString.length);
      s(paramString, 0, paramString.length);
      return;
    }
    catch (c paramString)
    {
      throw paramString;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new c(paramString);
    }
  }
  
  public abstract void T(byte paramByte);
  
  public abstract void U(int paramInt, boolean paramBoolean);
  
  public abstract void V(byte[] paramArrayOfByte, int paramInt);
  
  public abstract void W(int paramInt, g paramg);
  
  public abstract void X(g paramg);
  
  public abstract void Y(int paramInt1, int paramInt2);
  
  public abstract void Z(int paramInt);
  
  public abstract void a0(int paramInt, long paramLong);
  
  public abstract void b0(long paramLong);
  
  public abstract void c0(int paramInt1, int paramInt2);
  
  public abstract void d0(int paramInt);
  
  public abstract void e0(int paramInt, o0 paramo0, c1 paramc1);
  
  public abstract void f0(o0 paramo0);
  
  public abstract void g0(int paramInt, o0 paramo0);
  
  public abstract void h0(int paramInt, g paramg);
  
  public abstract void i0(int paramInt, String paramString);
  
  public abstract void j0(String paramString);
  
  public abstract void k0(int paramInt1, int paramInt2);
  
  public abstract void l0(int paramInt1, int paramInt2);
  
  public abstract void m0(int paramInt);
  
  public abstract void n0(int paramInt, long paramLong);
  
  public abstract void o0(long paramLong);
  
  public static abstract class a
    extends j
  {
    public final byte[] e;
    public final int f;
    public int g;
    
    public a(int paramInt)
    {
      if (paramInt >= 0)
      {
        byte[] arrayOfByte = new byte[Math.max(paramInt, 20)];
        e = arrayOfByte;
        f = arrayOfByte.length;
        return;
      }
      throw new IllegalArgumentException("bufferSize must be >= 0");
    }
    
    public final void p0(int paramInt)
    {
      byte[] arrayOfByte = e;
      int i = g;
      int j = i + 1;
      arrayOfByte[i] = ((byte)(byte)(paramInt & 0xFF));
      i = j + 1;
      arrayOfByte[j] = ((byte)(byte)(paramInt >> 8 & 0xFF));
      j = i + 1;
      arrayOfByte[i] = ((byte)(byte)(paramInt >> 16 & 0xFF));
      g = (j + 1);
      arrayOfByte[j] = ((byte)(byte)(paramInt >> 24 & 0xFF));
    }
    
    public final void q0(long paramLong)
    {
      byte[] arrayOfByte = e;
      int i = g;
      int j = i + 1;
      arrayOfByte[i] = ((byte)(byte)(int)(paramLong & 0xFF));
      i = j + 1;
      arrayOfByte[j] = ((byte)(byte)(int)(paramLong >> 8 & 0xFF));
      j = i + 1;
      arrayOfByte[i] = ((byte)(byte)(int)(paramLong >> 16 & 0xFF));
      i = j + 1;
      arrayOfByte[j] = ((byte)(byte)(int)(0xFF & paramLong >> 24));
      j = i + 1;
      arrayOfByte[i] = ((byte)(byte)((int)(paramLong >> 32) & 0xFF));
      i = j + 1;
      arrayOfByte[j] = ((byte)(byte)((int)(paramLong >> 40) & 0xFF));
      j = i + 1;
      arrayOfByte[i] = ((byte)(byte)((int)(paramLong >> 48) & 0xFF));
      g = (j + 1);
      arrayOfByte[j] = ((byte)(byte)((int)(paramLong >> 56) & 0xFF));
    }
    
    public final void r0(int paramInt1, int paramInt2)
    {
      s0(paramInt1 << 3 | paramInt2);
    }
    
    public final void s0(int paramInt)
    {
      int i = paramInt;
      byte[] arrayOfByte;
      if (j.d) {
        for (;;)
        {
          if ((paramInt & 0xFFFFFF80) == 0)
          {
            arrayOfByte = e;
            i = g;
            g = (i + 1);
            l1.p(arrayOfByte, i, (byte)paramInt);
            return;
          }
          arrayOfByte = e;
          i = g;
          g = (i + 1);
          l1.p(arrayOfByte, i, (byte)(paramInt & 0x7F | 0x80));
          paramInt >>>= 7;
        }
      }
      for (;;)
      {
        if ((i & 0xFFFFFF80) == 0)
        {
          arrayOfByte = e;
          paramInt = g;
          g = (paramInt + 1);
          arrayOfByte[paramInt] = ((byte)(byte)i);
          return;
        }
        arrayOfByte = e;
        paramInt = g;
        g = (paramInt + 1);
        arrayOfByte[paramInt] = ((byte)(byte)(i & 0x7F | 0x80));
        i >>>= 7;
      }
    }
    
    public final void t0(long paramLong)
    {
      long l = paramLong;
      byte[] arrayOfByte;
      int i;
      if (j.d) {
        for (;;)
        {
          if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
          {
            arrayOfByte = e;
            i = g;
            g = (i + 1);
            l1.p(arrayOfByte, i, (byte)(int)paramLong);
            return;
          }
          arrayOfByte = e;
          i = g;
          g = (i + 1);
          l1.p(arrayOfByte, i, (byte)((int)paramLong & 0x7F | 0x80));
          paramLong >>>= 7;
        }
      }
      for (;;)
      {
        if ((l & 0xFFFFFFFFFFFFFF80) == 0L)
        {
          arrayOfByte = e;
          i = g;
          g = (i + 1);
          arrayOfByte[i] = ((byte)(byte)(int)l);
          return;
        }
        arrayOfByte = e;
        i = g;
        g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)((int)l & 0x7F | 0x80));
        l >>>= 7;
      }
    }
  }
  
  public static final class b
    extends j
  {
    public final byte[] e;
    public final int f;
    public int g;
    
    public b(byte[] paramArrayOfByte, int paramInt)
    {
      int i = paramArrayOfByte.length;
      int j = 0 + paramInt;
      if ((0x0 | paramInt | i - j) >= 0)
      {
        e = paramArrayOfByte;
        g = 0;
        f = j;
        return;
      }
      throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(0), Integer.valueOf(paramInt) }));
    }
    
    public final void T(byte paramByte)
    {
      try
      {
        byte[] arrayOfByte = e;
        int i = g;
        g = (i + 1);
        arrayOfByte[i] = ((byte)paramByte);
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        throw new j.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
    }
    
    public final void U(int paramInt, boolean paramBoolean)
    {
      k0(paramInt, 0);
      T((byte)paramBoolean);
    }
    
    public final void V(byte[] paramArrayOfByte, int paramInt)
    {
      m0(paramInt);
      p0(paramArrayOfByte, 0, paramInt);
    }
    
    public final void W(int paramInt, g paramg)
    {
      k0(paramInt, 2);
      X(paramg);
    }
    
    public final void X(g paramg)
    {
      m0(paramg.size());
      paramg.o(this);
    }
    
    public final void Y(int paramInt1, int paramInt2)
    {
      k0(paramInt1, 5);
      Z(paramInt2);
    }
    
    public final void Z(int paramInt)
    {
      try
      {
        byte[] arrayOfByte = e;
        int i = g;
        int j = i + 1;
        arrayOfByte[i] = ((byte)(byte)(paramInt & 0xFF));
        i = j + 1;
        arrayOfByte[j] = ((byte)(byte)(paramInt >> 8 & 0xFF));
        j = i + 1;
        arrayOfByte[i] = ((byte)(byte)(paramInt >> 16 & 0xFF));
        g = (j + 1);
        arrayOfByte[j] = ((byte)(byte)(paramInt >> 24 & 0xFF));
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        throw new j.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
    }
    
    public final void a0(int paramInt, long paramLong)
    {
      k0(paramInt, 1);
      b0(paramLong);
    }
    
    public final void b0(long paramLong)
    {
      try
      {
        byte[] arrayOfByte = e;
        int i = g;
        int j = i + 1;
        arrayOfByte[i] = ((byte)(byte)((int)paramLong & 0xFF));
        i = j + 1;
        arrayOfByte[j] = ((byte)(byte)((int)(paramLong >> 8) & 0xFF));
        int k = i + 1;
        arrayOfByte[i] = ((byte)(byte)((int)(paramLong >> 16) & 0xFF));
        j = k + 1;
        arrayOfByte[k] = ((byte)(byte)((int)(paramLong >> 24) & 0xFF));
        i = j + 1;
        arrayOfByte[j] = ((byte)(byte)((int)(paramLong >> 32) & 0xFF));
        j = i + 1;
        arrayOfByte[i] = ((byte)(byte)((int)(paramLong >> 40) & 0xFF));
        i = j + 1;
        arrayOfByte[j] = ((byte)(byte)((int)(paramLong >> 48) & 0xFF));
        g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)((int)(paramLong >> 56) & 0xFF));
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        throw new j.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
    }
    
    public final void c0(int paramInt1, int paramInt2)
    {
      k0(paramInt1, 0);
      d0(paramInt2);
    }
    
    public final void d0(int paramInt)
    {
      if (paramInt >= 0) {
        m0(paramInt);
      } else {
        o0(paramInt);
      }
    }
    
    public final void e0(int paramInt, o0 paramo0, c1 paramc1)
    {
      k0(paramInt, 2);
      m0(((a)paramo0).i(paramc1));
      paramc1.h(paramo0, b);
    }
    
    public final void f0(o0 paramo0)
    {
      m0(paramo0.d());
      paramo0.g(this);
    }
    
    public final void g0(int paramInt, o0 paramo0)
    {
      k0(1, 3);
      l0(2, paramInt);
      k0(3, 2);
      f0(paramo0);
      k0(1, 4);
    }
    
    public final void h0(int paramInt, g paramg)
    {
      k0(1, 3);
      l0(2, paramInt);
      W(3, paramg);
      k0(1, 4);
    }
    
    public final void i0(int paramInt, String paramString)
    {
      k0(paramInt, 2);
      j0(paramString);
    }
    
    public final void j0(String paramString)
    {
      int i = g;
      try
      {
        int j = j.P(paramString.length() * 3);
        int k = j.P(paramString.length());
        byte[] arrayOfByte;
        if (k == j)
        {
          int m = i + k;
          g = m;
          arrayOfByte = e;
          j = f;
          j = m1.a.b(paramString, arrayOfByte, m, j - m);
          g = i;
          m0(j - i - k);
        }
        else
        {
          m0(m1.a(paramString));
          arrayOfByte = e;
          j = g;
          k = f;
          j = m1.a.b(paramString, arrayOfByte, j, k - j);
        }
        g = j;
      }
      catch (IndexOutOfBoundsException paramString)
      {
        throw new j.c(paramString);
      }
      catch (m1.d locald)
      {
        g = i;
        S(paramString, locald);
      }
    }
    
    public final void k0(int paramInt1, int paramInt2)
    {
      m0(paramInt1 << 3 | paramInt2);
    }
    
    public final void l0(int paramInt1, int paramInt2)
    {
      k0(paramInt1, 0);
      m0(paramInt2);
    }
    
    public final void m0(int paramInt)
    {
      int i = paramInt;
      byte[] arrayOfByte;
      if (j.d)
      {
        i = paramInt;
        if (!d.a())
        {
          int j = f;
          int k = g;
          i = paramInt;
          if (j - k >= 5)
          {
            if ((paramInt & 0xFFFFFF80) == 0)
            {
              arrayOfByte = e;
              g = (k + 1);
              l1.p(arrayOfByte, k, (byte)paramInt);
              return;
            }
            arrayOfByte = e;
            g = (k + 1);
            l1.p(arrayOfByte, k, (byte)(paramInt | 0x80));
            paramInt >>>= 7;
            if ((paramInt & 0xFFFFFF80) == 0)
            {
              arrayOfByte = e;
              i = g;
              g = (i + 1);
              l1.p(arrayOfByte, i, (byte)paramInt);
              return;
            }
            arrayOfByte = e;
            i = g;
            g = (i + 1);
            l1.p(arrayOfByte, i, (byte)(paramInt | 0x80));
            paramInt >>>= 7;
            if ((paramInt & 0xFFFFFF80) == 0)
            {
              arrayOfByte = e;
              i = g;
              g = (i + 1);
              l1.p(arrayOfByte, i, (byte)paramInt);
              return;
            }
            arrayOfByte = e;
            i = g;
            g = (i + 1);
            l1.p(arrayOfByte, i, (byte)(paramInt | 0x80));
            paramInt >>>= 7;
            if ((paramInt & 0xFFFFFF80) == 0)
            {
              arrayOfByte = e;
              i = g;
              g = (i + 1);
              l1.p(arrayOfByte, i, (byte)paramInt);
              return;
            }
            arrayOfByte = e;
            i = g;
            g = (i + 1);
            l1.p(arrayOfByte, i, (byte)(paramInt | 0x80));
            arrayOfByte = e;
            i = g;
            g = (i + 1);
            l1.p(arrayOfByte, i, (byte)(paramInt >>> 7));
            return;
          }
        }
      }
      for (;;)
      {
        if ((i & 0xFFFFFF80) == 0) {}
        try
        {
          arrayOfByte = e;
          paramInt = g;
          g = (paramInt + 1);
          arrayOfByte[paramInt] = ((byte)(byte)i);
          return;
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
        {
          throw new j.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
        }
        arrayOfByte = e;
        paramInt = g;
        g = (paramInt + 1);
        arrayOfByte[paramInt] = ((byte)(byte)(i & 0x7F | 0x80));
        i >>>= 7;
      }
    }
    
    public final void n0(int paramInt, long paramLong)
    {
      k0(paramInt, 0);
      o0(paramLong);
    }
    
    public final void o0(long paramLong)
    {
      long l = paramLong;
      byte[] arrayOfByte;
      int i;
      if (j.d)
      {
        l = paramLong;
        if (f - g >= 10) {
          for (;;)
          {
            if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
            {
              arrayOfByte = e;
              i = g;
              g = (i + 1);
              l1.p(arrayOfByte, i, (byte)(int)paramLong);
              return;
            }
            arrayOfByte = e;
            i = g;
            g = (i + 1);
            l1.p(arrayOfByte, i, (byte)((int)paramLong & 0x7F | 0x80));
            paramLong >>>= 7;
          }
        }
      }
      for (;;)
      {
        if ((l & 0xFFFFFFFFFFFFFF80) == 0L) {}
        try
        {
          arrayOfByte = e;
          i = g;
          g = (i + 1);
          arrayOfByte[i] = ((byte)(byte)(int)l);
          return;
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
        {
          throw new j.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
        }
        arrayOfByte = e;
        i = g;
        g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)((int)l & 0x7F | 0x80));
        l >>>= 7;
      }
    }
    
    public final void p0(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      try
      {
        System.arraycopy(paramArrayOfByte, paramInt1, e, g, paramInt2);
        g += paramInt2;
        return;
      }
      catch (IndexOutOfBoundsException paramArrayOfByte)
      {
        throw new j.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(paramInt2) }), paramArrayOfByte);
      }
    }
    
    public final void s(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      p0(paramArrayOfByte, paramInt1, paramInt2);
    }
  }
  
  public static final class c
    extends IOException
  {
    public c(IndexOutOfBoundsException paramIndexOutOfBoundsException)
    {
      super(paramIndexOutOfBoundsException);
    }
    
    public c(String paramString, IndexOutOfBoundsException paramIndexOutOfBoundsException)
    {
      super(paramIndexOutOfBoundsException);
    }
  }
  
  public static final class d
    extends j.a
  {
    public final OutputStream h;
    
    public d(q.b paramb, int paramInt)
    {
      super();
      h = paramb;
    }
    
    public final void T(byte paramByte)
    {
      if (g == f) {
        u0();
      }
      byte[] arrayOfByte = e;
      int i = g;
      g = (i + 1);
      arrayOfByte[i] = ((byte)paramByte);
    }
    
    public final void U(int paramInt, boolean paramBoolean)
    {
      v0(11);
      r0(paramInt, 0);
      int i = (byte)paramBoolean;
      byte[] arrayOfByte = e;
      paramInt = g;
      g = (paramInt + 1);
      arrayOfByte[paramInt] = ((byte)i);
    }
    
    public final void V(byte[] paramArrayOfByte, int paramInt)
    {
      m0(paramInt);
      w0(paramArrayOfByte, 0, paramInt);
    }
    
    public final void W(int paramInt, g paramg)
    {
      k0(paramInt, 2);
      X(paramg);
    }
    
    public final void X(g paramg)
    {
      m0(paramg.size());
      paramg.o(this);
    }
    
    public final void Y(int paramInt1, int paramInt2)
    {
      v0(14);
      r0(paramInt1, 5);
      p0(paramInt2);
    }
    
    public final void Z(int paramInt)
    {
      v0(4);
      p0(paramInt);
    }
    
    public final void a0(int paramInt, long paramLong)
    {
      v0(18);
      r0(paramInt, 1);
      q0(paramLong);
    }
    
    public final void b0(long paramLong)
    {
      v0(8);
      q0(paramLong);
    }
    
    public final void c0(int paramInt1, int paramInt2)
    {
      v0(20);
      r0(paramInt1, 0);
      if (paramInt2 >= 0) {
        s0(paramInt2);
      } else {
        t0(paramInt2);
      }
    }
    
    public final void d0(int paramInt)
    {
      if (paramInt >= 0) {
        m0(paramInt);
      } else {
        o0(paramInt);
      }
    }
    
    public final void e0(int paramInt, o0 paramo0, c1 paramc1)
    {
      k0(paramInt, 2);
      m0(((a)paramo0).i(paramc1));
      paramc1.h(paramo0, b);
    }
    
    public final void f0(o0 paramo0)
    {
      m0(paramo0.d());
      paramo0.g(this);
    }
    
    public final void g0(int paramInt, o0 paramo0)
    {
      k0(1, 3);
      l0(2, paramInt);
      k0(3, 2);
      f0(paramo0);
      k0(1, 4);
    }
    
    public final void h0(int paramInt, g paramg)
    {
      k0(1, 3);
      l0(2, paramInt);
      W(3, paramg);
      k0(1, 4);
    }
    
    public final void i0(int paramInt, String paramString)
    {
      k0(paramInt, 2);
      j0(paramString);
    }
    
    public final void j0(String paramString)
    {
      try
      {
        int i = paramString.length() * 3;
        int j = j.P(i);
        int k = j + i;
        m = f;
        byte[] arrayOfByte1;
        if (k > m)
        {
          arrayOfByte1 = new byte[i];
          m = m1.a.b(paramString, arrayOfByte1, 0, i);
          m0(m);
          w0(arrayOfByte1, 0, m);
          return;
        }
        if (k > m - g) {
          u0();
        }
        i = j.P(paramString.length());
        m = g;
        if (i == j)
        {
          k = m + i;
          try
          {
            g = k;
            arrayOfByte1 = e;
            j = f;
            j = m1.a.b(paramString, arrayOfByte1, k, j - k);
            g = m;
            s0(j - m - i);
            g = j;
          }
          catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
          {
            break label211;
          }
          catch (m1.d locald1)
          {
            break label226;
          }
        }
        else
        {
          i = m1.a(paramString);
          s0(i);
          arrayOfByte2 = e;
          j = g;
          g = m1.a.b(paramString, arrayOfByte2, j, i);
        }
      }
      catch (m1.d locald2)
      {
        int m;
        byte[] arrayOfByte2;
        label211:
        j.c localc;
        label226:
        S(paramString, locald2);
      }
      localc = new s0/j$c;
      localc.<init>(arrayOfByte2);
      throw localc;
      g = m;
      throw arrayOfByte2;
    }
    
    public final void k0(int paramInt1, int paramInt2)
    {
      m0(paramInt1 << 3 | paramInt2);
    }
    
    public final void l0(int paramInt1, int paramInt2)
    {
      v0(20);
      r0(paramInt1, 0);
      s0(paramInt2);
    }
    
    public final void m0(int paramInt)
    {
      v0(5);
      s0(paramInt);
    }
    
    public final void n0(int paramInt, long paramLong)
    {
      v0(20);
      r0(paramInt, 0);
      t0(paramLong);
    }
    
    public final void o0(long paramLong)
    {
      v0(10);
      t0(paramLong);
    }
    
    public final void s(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      w0(paramArrayOfByte, paramInt1, paramInt2);
    }
    
    public final void u0()
    {
      h.write(e, 0, g);
      g = 0;
    }
    
    public final void v0(int paramInt)
    {
      if (f - g < paramInt) {
        u0();
      }
    }
    
    public final void w0(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      int i = f;
      int j = g;
      i -= j;
      if (i >= paramInt2)
      {
        System.arraycopy(paramArrayOfByte, paramInt1, e, j, paramInt2);
        g += paramInt2;
      }
      else
      {
        System.arraycopy(paramArrayOfByte, paramInt1, e, j, i);
        paramInt1 += i;
        paramInt2 -= i;
        g = f;
        u0();
        if (paramInt2 <= f)
        {
          System.arraycopy(paramArrayOfByte, paramInt1, e, 0, paramInt2);
          g = paramInt2;
        }
        else
        {
          h.write(paramArrayOfByte, paramInt1, paramInt2);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     s0.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
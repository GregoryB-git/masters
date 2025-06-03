package m1;

import F0.L;
import F0.T;
import F0.X;
import F0.r;
import F0.s;
import F0.t;
import F0.x;
import android.util.Pair;
import d0.A;
import d0.q;
import d0.q.b;
import g0.M;
import g0.o;
import g0.z;

public final class b
  implements r
{
  public static final x h = new a();
  public t a;
  public T b;
  public int c = 0;
  public long d = -1L;
  public b e;
  public int f = -1;
  public long g = -1L;
  
  private void f()
  {
    g0.a.h(b);
    M.i(a);
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    int i;
    if (paramLong1 == 0L) {
      i = 0;
    } else {
      i = 4;
    }
    c = i;
    b localb = e;
    if (localb != null) {
      localb.c(paramLong2);
    }
  }
  
  public void b(t paramt)
  {
    a = paramt;
    b = paramt.a(0, 1);
    paramt.j();
  }
  
  public boolean e(s params)
  {
    return d.a(params);
  }
  
  public int i(s params, L paramL)
  {
    f();
    int i = c;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i == 4) {
              return m(params);
            }
            throw new IllegalStateException();
          }
          n(params);
          return 0;
        }
        k(params);
        return 0;
      }
      l(params);
      return 0;
    }
    j(params);
    return 0;
  }
  
  public final void j(s params)
  {
    boolean bool;
    if (params.p() == 0L) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.f(bool);
    int i = f;
    if (i != -1)
    {
      params.i(i);
      c = 4;
      return;
    }
    if (d.a(params))
    {
      params.i((int)(params.m() - params.p()));
      c = 1;
      return;
    }
    throw A.a("Unsupported or unrecognized wav file type.", null);
  }
  
  public final void k(s params)
  {
    params = d.b(params);
    int i = a;
    if (i == 17) {
      params = new a(a, b, params);
    }
    for (;;)
    {
      e = params;
      break;
      if (i == 6)
      {
        params = new c(a, b, params, "audio/g711-alaw", -1);
      }
      else if (i == 7)
      {
        params = new c(a, b, params, "audio/g711-mlaw", -1);
      }
      else
      {
        i = X.a(i, f);
        if (i == 0) {
          break label141;
        }
        params = new c(a, b, params, "audio/raw", i);
      }
    }
    c = 3;
    return;
    label141:
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unsupported WAV format type: ");
    localStringBuilder.append(a);
    throw A.d(localStringBuilder.toString());
  }
  
  public final void l(s params)
  {
    d = d.c(params);
    c = 2;
  }
  
  public final int m(s params)
  {
    long l1 = g;
    int i = 0;
    boolean bool;
    if (l1 != -1L) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.f(bool);
    long l2 = g;
    l1 = params.p();
    if (((b)g0.a.e(e)).a(params, l2 - l1)) {
      i = -1;
    }
    return i;
  }
  
  public final void n(s params)
  {
    Pair localPair = d.e(params);
    f = ((Long)first).intValue();
    long l1 = ((Long)second).longValue();
    long l2 = d;
    long l3 = l1;
    if (l2 != -1L)
    {
      l3 = l1;
      if (l1 == 4294967295L) {
        l3 = l2;
      }
    }
    g = (f + l3);
    l3 = params.a();
    if ((l3 != -1L) && (g > l3))
    {
      params = new StringBuilder();
      params.append("Data exceeds input length: ");
      params.append(g);
      params.append(", ");
      params.append(l3);
      o.h("WavExtractor", params.toString());
      g = l3;
    }
    ((b)g0.a.e(e)).b(f, g);
    c = 4;
  }
  
  public void release() {}
  
  public static final class a
    implements b.b
  {
    public static final int[] m = { -1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8 };
    public static final int[] n = { 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767 };
    public final t a;
    public final T b;
    public final c c;
    public final int d;
    public final byte[] e;
    public final z f;
    public final int g;
    public final q h;
    public int i;
    public long j;
    public int k;
    public long l;
    
    public a(t paramt, T paramT, c paramc)
    {
      a = paramt;
      b = paramT;
      c = paramc;
      int i1 = Math.max(1, c / 10);
      g = i1;
      paramt = new z(g);
      paramt.y();
      int i2 = paramt.y();
      d = i2;
      int i3 = b;
      int i4 = (e - i3 * 4) * 8 / (f * i3) + 1;
      if (i2 == i4)
      {
        i4 = M.k(i1, i2);
        e = new byte[e * i4];
        f = new z(i4 * h(i2, i3));
        i2 = c * e * 8 / i2;
        h = new q.b().o0("audio/raw").M(i2).j0(i2).f0(h(i1, i3)).N(b).p0(c).i0(2).K();
        return;
      }
      paramt = new StringBuilder();
      paramt.append("Expected frames per block: ");
      paramt.append(i4);
      paramt.append("; got: ");
      paramt.append(i2);
      throw A.a(paramt.toString(), null);
    }
    
    public static int h(int paramInt1, int paramInt2)
    {
      return paramInt1 * 2 * paramInt2;
    }
    
    public boolean a(s params, long paramLong)
    {
      int i1 = M.k(g - f(k), d) * c.e;
      boolean bool;
      if (paramLong == 0L) {
        bool = true;
      } else {
        bool = false;
      }
      int i2;
      for (;;)
      {
        if (bool) {
          break label117;
        }
        i2 = i;
        if (i2 >= i1) {
          break label117;
        }
        i2 = (int)Math.min(i1 - i2, paramLong);
        i2 = params.read(e, i, i2);
        if (i2 == -1) {
          break;
        }
        i += i2;
      }
      label117:
      i1 = i / c.e;
      if (i1 > 0)
      {
        d(e, i1, f);
        i -= i1 * c.e;
        i1 = f.g();
        b.e(f, i1);
        i1 = k + i1;
        k = i1;
        i1 = f(i1);
        i2 = g;
        if (i1 >= i2) {
          i(i2);
        }
      }
      if (bool)
      {
        i1 = f(k);
        if (i1 > 0) {
          i(i1);
        }
      }
      return bool;
    }
    
    public void b(int paramInt, long paramLong)
    {
      a.e(new e(c, d, paramInt, paramLong));
      b.d(h);
    }
    
    public void c(long paramLong)
    {
      i = 0;
      j = paramLong;
      k = 0;
      l = 0L;
    }
    
    public final void d(byte[] paramArrayOfByte, int paramInt, z paramz)
    {
      for (int i1 = 0; i1 < paramInt; i1++) {
        for (int i2 = 0; i2 < c.b; i2++) {
          e(paramArrayOfByte, i1, i2, paramz.e());
        }
      }
      paramInt = g(d * paramInt);
      paramz.T(0);
      paramz.S(paramInt);
    }
    
    public final void e(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
    {
      Object localObject = c;
      int i1 = e;
      int i2 = b;
      int i3 = paramInt1 * i1 + paramInt2 * 4;
      int i4 = i1 / i2;
      int i5 = (short)((paramArrayOfByte1[(i3 + 1)] & 0xFF) << 8 | paramArrayOfByte1[i3] & 0xFF);
      int i6 = Math.min(paramArrayOfByte1[(i3 + 2)] & 0xFF, 88);
      int i7 = n[i6];
      i1 = (paramInt1 * d * i2 + paramInt2) * 2;
      paramArrayOfByte2[i1] = ((byte)(byte)(i5 & 0xFF));
      paramArrayOfByte2[(i1 + 1)] = ((byte)(byte)(i5 >> 8));
      paramInt1 = 0;
      paramInt2 = i6;
      while (paramInt1 < (i4 - 4) * 2)
      {
        i6 = paramArrayOfByte1[(paramInt1 / 8 * i2 * 4 + (i2 * 4 + i3) + paramInt1 / 2 % 4)];
        if (paramInt1 % 2 == 0) {
          i6 &= 0xF;
        } else {
          i6 = (i6 & 0xFF) >> 4;
        }
        int i8 = ((i6 & 0x7) * 2 + 1) * i7 >> 3;
        i7 = i8;
        if ((i6 & 0x8) != 0) {
          i7 = -i8;
        }
        i5 = M.p(i5 + i7, 32768, 32767);
        i1 += i2 * 2;
        paramArrayOfByte2[i1] = ((byte)(byte)(i5 & 0xFF));
        paramArrayOfByte2[(i1 + 1)] = ((byte)(byte)(i5 >> 8));
        i7 = m[i6];
        localObject = n;
        paramInt2 = M.p(paramInt2 + i7, 0, localObject.length - 1);
        i7 = localObject[paramInt2];
        paramInt1++;
      }
    }
    
    public final int f(int paramInt)
    {
      return paramInt / (c.b * 2);
    }
    
    public final int g(int paramInt)
    {
      return h(paramInt, c.b);
    }
    
    public final void i(int paramInt)
    {
      long l1 = j;
      long l2 = M.W0(l, 1000000L, c.c);
      int i1 = g(paramInt);
      int i2 = k;
      b.b(l1 + l2, 1, i1, i2 - i1, null);
      l += paramInt;
      k -= i1;
    }
  }
  
  public static abstract interface b
  {
    public abstract boolean a(s params, long paramLong);
    
    public abstract void b(int paramInt, long paramLong);
    
    public abstract void c(long paramLong);
  }
  
  public static final class c
    implements b.b
  {
    public final t a;
    public final T b;
    public final c c;
    public final q d;
    public final int e;
    public long f;
    public int g;
    public long h;
    
    public c(t paramt, T paramT, c paramc, String paramString, int paramInt)
    {
      a = paramt;
      b = paramT;
      c = paramc;
      int i = b * f / 8;
      if (e == i)
      {
        int j = c;
        int k = j * i * 8;
        j = Math.max(i, j * i / 10);
        e = j;
        d = new q.b().o0(paramString).M(k).j0(k).f0(j).N(b).p0(c).i0(paramInt).K();
        return;
      }
      paramt = new StringBuilder();
      paramt.append("Expected block size: ");
      paramt.append(i);
      paramt.append("; got: ");
      paramt.append(e);
      throw A.a(paramt.toString(), null);
    }
    
    public boolean a(s params, long paramLong)
    {
      boolean bool2;
      int i;
      for (;;)
      {
        boolean bool1 = paramLong < 0L;
        bool2 = true;
        if (!bool1) {
          break;
        }
        j = g;
        k = e;
        if (j >= k) {
          break;
        }
        i = (int)Math.min(k - j, paramLong);
        i = b.f(params, i, true);
        if (i == -1)
        {
          paramLong = 0L;
        }
        else
        {
          g += i;
          paramLong -= i;
        }
      }
      params = c;
      int j = e;
      int k = g / j;
      if (k > 0)
      {
        long l = f;
        paramLong = M.W0(h, 1000000L, c);
        j = k * j;
        int m = g - j;
        b.b(l + paramLong, 1, j, m, null);
        h += k;
        g = m;
      }
      if (i > 0) {
        bool2 = false;
      }
      return bool2;
    }
    
    public void b(int paramInt, long paramLong)
    {
      a.e(new e(c, 1, paramInt, paramLong));
      b.d(d);
    }
    
    public void c(long paramLong)
    {
      f = paramLong;
      g = 0;
      h = 0L;
    }
  }
}

/* Location:
 * Qualified Name:     m1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
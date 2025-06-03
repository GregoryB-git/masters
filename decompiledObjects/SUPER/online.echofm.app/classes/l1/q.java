package l1;

import F0.T;
import F0.t;
import d0.h.b;
import d0.q.b;
import g0.M;
import g0.a;
import g0.z;
import h0.d.a;
import java.util.Collections;

public final class q
  implements m
{
  public final F a;
  public String b;
  public T c;
  public a d;
  public boolean e;
  public final boolean[] f;
  public final w g;
  public final w h;
  public final w i;
  public final w j;
  public final w k;
  public long l;
  public long m;
  public final z n;
  
  public q(F paramF)
  {
    a = paramF;
    f = new boolean[3];
    g = new w(32, 128);
    h = new w(33, 128);
    i = new w(34, 128);
    j = new w(39, 128);
    k = new w(40, 128);
    m = -9223372036854775807L;
    n = new z();
  }
  
  private void f()
  {
    a.h(c);
    M.i(d);
  }
  
  private void g(long paramLong1, int paramInt1, int paramInt2, long paramLong2)
  {
    d.b(paramLong1, paramInt1, e);
    if (!e)
    {
      g.b(paramInt2);
      h.b(paramInt2);
      i.b(paramInt2);
      if ((g.c()) && (h.c()) && (i.c()))
      {
        c.d(i(b, g, h, i));
        e = true;
      }
    }
    w localw;
    if (j.b(paramInt2))
    {
      localw = j;
      paramInt1 = h0.d.r(d, e);
      n.R(j.d, paramInt1);
      n.U(5);
      a.a(paramLong2, n);
    }
    if (k.b(paramInt2))
    {
      localw = k;
      paramInt1 = h0.d.r(d, e);
      n.R(k.d, paramInt1);
      n.U(5);
      a.a(paramLong2, n);
    }
  }
  
  private void h(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    d.f(paramArrayOfByte, paramInt1, paramInt2);
    if (!e)
    {
      g.a(paramArrayOfByte, paramInt1, paramInt2);
      h.a(paramArrayOfByte, paramInt1, paramInt2);
      i.a(paramArrayOfByte, paramInt1, paramInt2);
    }
    j.a(paramArrayOfByte, paramInt1, paramInt2);
    k.a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static d0.q i(String paramString, w paramw1, w paramw2, w paramw3)
  {
    int i1 = e;
    byte[] arrayOfByte = new byte[e + i1 + e];
    System.arraycopy(d, 0, arrayOfByte, 0, i1);
    System.arraycopy(d, 0, arrayOfByte, e, e);
    System.arraycopy(d, 0, arrayOfByte, e + e, e);
    paramw1 = h0.d.h(d, 3, e);
    paramw2 = g0.d.c(a, b, c, d, h, i);
    return new q.b().a0(paramString).o0("video/hevc").O(paramw2).v0(k).Y(l).P(new h.b().d(o).c(p).e(q).g(f + 8).b(g + 8).a()).k0(m).g0(n).b0(Collections.singletonList(arrayOfByte)).K();
  }
  
  public void a(z paramz)
  {
    f();
    while (paramz.a() > 0)
    {
      int i1 = paramz.f();
      int i2 = paramz.g();
      byte[] arrayOfByte = paramz.e();
      l += paramz.a();
      c.e(paramz, paramz.a());
      while (i1 < i2)
      {
        int i3 = h0.d.c(arrayOfByte, i1, i2, f);
        if (i3 == i2)
        {
          h(arrayOfByte, i1, i2);
          return;
        }
        int i4 = h0.d.e(arrayOfByte, i3);
        int i5 = i3 - i1;
        if (i5 > 0) {
          h(arrayOfByte, i1, i3);
        }
        int i6 = i2 - i3;
        long l1 = l - i6;
        if (i5 < 0) {}
        for (i1 = -i5;; i1 = 0) {
          break;
        }
        g(l1, i6, i1, m);
        j(l1, i6, i4, m);
        i1 = i3 + 3;
      }
    }
  }
  
  public void b()
  {
    l = 0L;
    m = -9223372036854775807L;
    h0.d.a(f);
    g.d();
    h.d();
    i.d();
    j.d();
    k.d();
    a locala = d;
    if (locala != null) {
      locala.g();
    }
  }
  
  public void c(boolean paramBoolean)
  {
    f();
    if (paramBoolean) {
      d.a(l);
    }
  }
  
  public void d(long paramLong, int paramInt)
  {
    m = paramLong;
  }
  
  public void e(t paramt, K.d paramd)
  {
    paramd.a();
    b = paramd.b();
    T localT = paramt.a(paramd.c(), 2);
    c = localT;
    d = new a(localT);
    a.b(paramt, paramd);
  }
  
  public final void j(long paramLong1, int paramInt1, int paramInt2, long paramLong2)
  {
    d.h(paramLong1, paramInt1, paramInt2, paramLong2, e);
    if (!e)
    {
      g.e(paramInt2);
      h.e(paramInt2);
      i.e(paramInt2);
    }
    j.e(paramInt2);
    k.e(paramInt2);
  }
  
  public static final class a
  {
    public final T a;
    public long b;
    public boolean c;
    public int d;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public boolean m;
    
    public a(T paramT)
    {
      a = paramT;
    }
    
    public static boolean c(int paramInt)
    {
      boolean bool;
      if (((32 <= paramInt) && (paramInt <= 35)) || (paramInt == 39)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public static boolean d(int paramInt)
    {
      boolean bool;
      if ((paramInt >= 32) && (paramInt != 40)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public void a(long paramLong)
    {
      m = c;
      e((int)(paramLong - b));
      k = b;
      b = paramLong;
      e(0);
      i = false;
    }
    
    public void b(long paramLong, int paramInt, boolean paramBoolean)
    {
      if ((j) && (g))
      {
        m = c;
        j = false;
      }
      else if ((h) || (g))
      {
        if ((paramBoolean) && (i)) {
          e(paramInt + (int)(paramLong - b));
        }
        k = b;
        l = e;
        m = c;
        i = true;
      }
    }
    
    public final void e(int paramInt)
    {
      long l1 = l;
      if (l1 == -9223372036854775807L) {
        return;
      }
      int n = m;
      int i1 = (int)(b - k);
      a.b(l1, n, i1, paramInt, null);
    }
    
    public void f(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if (f)
      {
        int n = d;
        int i1 = paramInt1 + 2 - n;
        if (i1 < paramInt2)
        {
          boolean bool;
          if ((paramArrayOfByte[i1] & 0x80) != 0) {
            bool = true;
          } else {
            bool = false;
          }
          g = bool;
          f = false;
        }
        else
        {
          d = (n + (paramInt2 - paramInt1));
        }
      }
    }
    
    public void g()
    {
      f = false;
      g = false;
      h = false;
      i = false;
      j = false;
    }
    
    public void h(long paramLong1, int paramInt1, int paramInt2, long paramLong2, boolean paramBoolean)
    {
      boolean bool = false;
      g = false;
      h = false;
      e = paramLong2;
      d = 0;
      b = paramLong1;
      if (!d(paramInt2))
      {
        if ((i) && (!j))
        {
          if (paramBoolean) {
            e(paramInt1);
          }
          i = false;
        }
        if (c(paramInt2))
        {
          h = (j ^ true);
          j = true;
        }
      }
      if ((paramInt2 >= 16) && (paramInt2 <= 21)) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      c = paramBoolean;
      if (!paramBoolean)
      {
        paramBoolean = bool;
        if (paramInt2 > 9) {}
      }
      else
      {
        paramBoolean = true;
      }
      f = paramBoolean;
    }
  }
}

/* Location:
 * Qualified Name:     l1.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
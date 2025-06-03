package l1;

import F0.T;
import F0.t;
import android.util.SparseArray;
import d0.h.b;
import d0.q.b;
import g0.M;
import g0.a;
import g0.z;
import h0.d.b;
import h0.d.c;
import h0.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class p
  implements m
{
  public final F a;
  public final boolean b;
  public final boolean c;
  public final w d;
  public final w e;
  public final w f;
  public long g;
  public final boolean[] h;
  public String i;
  public T j;
  public b k;
  public boolean l;
  public long m;
  public boolean n;
  public final z o;
  
  public p(F paramF, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramF;
    b = paramBoolean1;
    c = paramBoolean2;
    h = new boolean[3];
    d = new w(7, 128);
    e = new w(8, 128);
    f = new w(6, 128);
    m = -9223372036854775807L;
    o = new z();
  }
  
  private void f()
  {
    a.h(j);
    M.i(k);
  }
  
  public void a(z paramz)
  {
    f();
    int i1 = paramz.f();
    int i2 = paramz.g();
    byte[] arrayOfByte = paramz.e();
    g += paramz.a();
    j.e(paramz, paramz.a());
    for (;;)
    {
      int i3 = h0.d.c(arrayOfByte, i1, i2, h);
      if (i3 == i2)
      {
        h(arrayOfByte, i1, i2);
        return;
      }
      int i4 = h0.d.f(arrayOfByte, i3);
      int i5 = i3 - i1;
      if (i5 > 0) {
        h(arrayOfByte, i1, i3);
      }
      int i6 = i2 - i3;
      long l1 = g - i6;
      if (i5 < 0) {}
      for (i1 = -i5;; i1 = 0) {
        break;
      }
      g(l1, i6, i1, m);
      i(l1, i4, m);
      i1 = i3 + 3;
    }
  }
  
  public void b()
  {
    g = 0L;
    n = false;
    m = -9223372036854775807L;
    h0.d.a(h);
    d.d();
    e.d();
    f.d();
    b localb = k;
    if (localb != null) {
      localb.h();
    }
  }
  
  public void c(boolean paramBoolean)
  {
    f();
    if (paramBoolean) {
      k.b(g);
    }
  }
  
  public void d(long paramLong, int paramInt)
  {
    m = paramLong;
    int i1 = n;
    if ((paramInt & 0x2) != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    n = (i1 | paramInt);
  }
  
  public void e(t paramt, K.d paramd)
  {
    paramd.a();
    i = paramd.b();
    T localT = paramt.a(paramd.c(), 2);
    j = localT;
    k = new b(localT, b, c);
    a.b(paramt, paramd);
  }
  
  public final void g(long paramLong1, int paramInt1, int paramInt2, long paramLong2)
  {
    Object localObject1;
    if ((!l) || (k.d()))
    {
      d.b(paramInt2);
      e.b(paramInt2);
      if (!l)
      {
        if ((d.c()) && (e.c()))
        {
          localObject1 = new ArrayList();
          Object localObject2 = d;
          ((List)localObject1).add(Arrays.copyOf(d, e));
          localObject2 = e;
          ((List)localObject1).add(Arrays.copyOf(d, e));
          localObject2 = d;
          localObject2 = h0.d.l(d, 3, e);
          Object localObject3 = e;
          localObject3 = h0.d.j(d, 3, e);
          String str = g0.d.a(a, b, c);
          j.d(new q.b().a0(i).o0("video/avc").O(str).v0(f).Y(g).P(new h.b().d(q).c(r).e(s).g(i + 8).b(j + 8).a()).k0(h).b0((List)localObject1).g0(t).K());
          l = true;
          k.g((d.c)localObject2);
          k.f((d.b)localObject3);
          d.d();
        }
      }
      else {
        for (;;)
        {
          for (localObject1 = e;; localObject1 = d)
          {
            ((w)localObject1).d();
            break label461;
            if (!d.c()) {
              break;
            }
            localObject1 = d;
            localObject1 = h0.d.l(d, 3, e);
            k.g((d.c)localObject1);
          }
          if (!e.c()) {
            break;
          }
          localObject1 = e;
          localObject1 = h0.d.j(d, 3, e);
          k.f((d.b)localObject1);
        }
      }
    }
    label461:
    if (f.b(paramInt2))
    {
      localObject1 = f;
      paramInt2 = h0.d.r(d, e);
      o.R(f.d, paramInt2);
      o.T(4);
      a.a(paramLong2, o);
    }
    if (k.c(paramLong1, paramInt1, l)) {
      n = false;
    }
  }
  
  public final void h(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((!l) || (k.d()))
    {
      d.a(paramArrayOfByte, paramInt1, paramInt2);
      e.a(paramArrayOfByte, paramInt1, paramInt2);
    }
    f.a(paramArrayOfByte, paramInt1, paramInt2);
    k.a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final void i(long paramLong1, int paramInt, long paramLong2)
  {
    if ((!l) || (k.d()))
    {
      d.e(paramInt);
      e.e(paramInt);
    }
    f.e(paramInt);
    k.j(paramLong1, paramInt, paramLong2, n);
  }
  
  public static final class b
  {
    public final T a;
    public final boolean b;
    public final boolean c;
    public final SparseArray d;
    public final SparseArray e;
    public final e f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public long l;
    public a m;
    public a n;
    public boolean o;
    public long p;
    public long q;
    public boolean r;
    public boolean s;
    
    public b(T paramT, boolean paramBoolean1, boolean paramBoolean2)
    {
      a = paramT;
      b = paramBoolean1;
      c = paramBoolean2;
      d = new SparseArray();
      e = new SparseArray();
      m = new a(null);
      n = new a(null);
      paramT = new byte[''];
      g = paramT;
      f = new e(paramT, 0, 0);
      h();
    }
    
    public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if (!k) {
        return;
      }
      int i1 = paramInt2 - paramInt1;
      Object localObject = g;
      paramInt2 = localObject.length;
      int i2 = h;
      if (paramInt2 < i2 + i1) {
        g = Arrays.copyOf((byte[])localObject, (i2 + i1) * 2);
      }
      System.arraycopy(paramArrayOfByte, paramInt1, g, h, i1);
      paramInt1 = h + i1;
      h = paramInt1;
      f.i(g, 0, paramInt1);
      if (!f.b(8)) {
        return;
      }
      f.k();
      int i3 = f.e(2);
      f.l(5);
      if (!f.c()) {
        return;
      }
      f.h();
      if (!f.c()) {
        return;
      }
      int i4 = f.h();
      if (!c)
      {
        k = false;
        n.f(i4);
        return;
      }
      if (!f.c()) {
        return;
      }
      int i5 = f.h();
      if (e.indexOfKey(i5) < 0)
      {
        k = false;
        return;
      }
      paramArrayOfByte = (d.b)e.get(i5);
      localObject = (d.c)d.get(b);
      if (k)
      {
        if (!f.b(2)) {
          return;
        }
        f.l(2);
      }
      if (!f.b(m)) {
        return;
      }
      int i6 = f.e(m);
      boolean bool1;
      boolean bool2;
      boolean bool3;
      if (!l)
      {
        if (!f.b(1)) {
          return;
        }
        bool1 = f.d();
        if (bool1)
        {
          if (!f.b(1)) {
            return;
          }
          bool2 = f.d();
          bool3 = true;
          break label395;
        }
      }
      for (;;)
      {
        bool3 = false;
        bool2 = false;
        break;
        bool1 = false;
      }
      label395:
      boolean bool4;
      if (i == 5) {
        bool4 = true;
      } else {
        bool4 = false;
      }
      int i7;
      if (bool4)
      {
        if (!f.c()) {
          return;
        }
        i7 = f.h();
      }
      else
      {
        i7 = 0;
      }
      paramInt1 = n;
      if (paramInt1 == 0)
      {
        if (!f.b(o)) {
          return;
        }
        paramInt2 = f.e(o);
        if ((c) && (!bool1))
        {
          if (!f.c()) {
            return;
          }
          i2 = f.g();
          paramInt1 = 0;
          i1 = paramInt1;
          break label619;
        }
      }
      for (;;)
      {
        i2 = 0;
        paramInt1 = 0;
        break;
        if ((paramInt1 == 1) && (!p))
        {
          if (!f.c()) {
            return;
          }
          paramInt1 = f.g();
          if ((c) && (!bool1))
          {
            if (!f.c()) {
              return;
            }
            i1 = f.g();
            paramInt2 = 0;
            i2 = paramInt2;
            break label619;
          }
          paramInt2 = 0;
          i2 = paramInt2;
          i1 = i2;
          break label619;
        }
        paramInt2 = 0;
      }
      label619:
      n.e((d.c)localObject, i3, i4, i6, i5, bool1, bool3, bool2, bool4, i7, paramInt2, i2, paramInt1, i1);
      k = false;
    }
    
    public void b(long paramLong)
    {
      i();
      j = paramLong;
      e(0);
      o = false;
    }
    
    public boolean c(long paramLong, int paramInt, boolean paramBoolean)
    {
      if ((i == 9) || ((c) && (a.a(n, m))))
      {
        if ((paramBoolean) && (o)) {
          e(paramInt + (int)(paramLong - j));
        }
        p = j;
        q = l;
        r = false;
        o = true;
      }
      i();
      return r;
    }
    
    public boolean d()
    {
      return c;
    }
    
    public final void e(int paramInt)
    {
      long l1 = q;
      if (l1 == -9223372036854775807L) {
        return;
      }
      int i1 = r;
      int i2 = (int)(j - p);
      a.b(l1, i1, i2, paramInt, null);
    }
    
    public void f(d.b paramb)
    {
      e.append(a, paramb);
    }
    
    public void g(d.c paramc)
    {
      d.append(d, paramc);
    }
    
    public void h()
    {
      k = false;
      o = false;
      n.b();
    }
    
    public final void i()
    {
      boolean bool1;
      if (b) {
        bool1 = n.d();
      } else {
        bool1 = s;
      }
      boolean bool2 = r;
      int i1 = i;
      boolean bool3 = true;
      boolean bool4 = bool3;
      if (i1 != 5) {
        if ((bool1) && (i1 == 1)) {
          bool4 = bool3;
        } else {
          bool4 = false;
        }
      }
      r = (bool2 | bool4);
    }
    
    public void j(long paramLong1, int paramInt, long paramLong2, boolean paramBoolean)
    {
      i = paramInt;
      l = paramLong2;
      j = paramLong1;
      s = paramBoolean;
      if (((b) && (paramInt == 1)) || ((c) && ((paramInt == 5) || (paramInt == 1) || (paramInt == 2))))
      {
        a locala = m;
        m = n;
        n = locala;
        locala.b();
        h = 0;
        k = true;
      }
    }
    
    public static final class a
    {
      public boolean a;
      public boolean b;
      public d.c c;
      public int d;
      public int e;
      public int f;
      public int g;
      public boolean h;
      public boolean i;
      public boolean j;
      public boolean k;
      public int l;
      public int m;
      public int n;
      public int o;
      public int p;
      
      public void b()
      {
        b = false;
        a = false;
      }
      
      public final boolean c(a parama)
      {
        boolean bool1 = a;
        boolean bool2 = false;
        if (!bool1) {
          return false;
        }
        if (!a) {
          return true;
        }
        d.c localc1 = (d.c)a.h(c);
        d.c localc2 = (d.c)a.h(c);
        if ((f == f) && (g == g) && (h == h) && ((!i) || (!i) || (j == j)))
        {
          int i1 = d;
          int i2 = d;
          if ((i1 == i2) || ((i1 != 0) && (i2 != 0)))
          {
            i2 = n;
            if (((i2 != 0) || (n != 0) || ((m == m) && (n == n))) && ((i2 != 1) || (n != 1) || ((o == o) && (p == p))))
            {
              boolean bool3 = k;
              if (bool3 == k)
              {
                bool1 = bool2;
                if (!bool3) {
                  return bool1;
                }
                bool1 = bool2;
                if (l == l) {
                  return bool1;
                }
              }
            }
          }
        }
        bool1 = true;
        return bool1;
      }
      
      public boolean d()
      {
        if (b)
        {
          int i1 = e;
          if ((i1 == 7) || (i1 == 2)) {
            return true;
          }
        }
        boolean bool = false;
        return bool;
      }
      
      public void e(d.c paramc, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
      {
        c = paramc;
        d = paramInt1;
        e = paramInt2;
        f = paramInt3;
        g = paramInt4;
        h = paramBoolean1;
        i = paramBoolean2;
        j = paramBoolean3;
        k = paramBoolean4;
        l = paramInt5;
        m = paramInt6;
        n = paramInt7;
        o = paramInt8;
        p = paramInt9;
        a = true;
        b = true;
      }
      
      public void f(int paramInt)
      {
        e = paramInt;
        b = true;
      }
    }
  }
}

/* Location:
 * Qualified Name:     l1.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
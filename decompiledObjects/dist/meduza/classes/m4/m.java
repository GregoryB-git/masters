package m4;

import android.util.SparseArray;
import b.a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v3.i0;
import v3.i0.a;
import v5.e0;
import v5.q;
import v5.q.b;
import v5.q.c;
import v5.u;

public final class m
  implements j
{
  public final z a;
  public final boolean b;
  public final boolean c;
  public final r d;
  public final r e;
  public final r f;
  public long g;
  public final boolean[] h;
  public String i;
  public c4.v j;
  public a k;
  public boolean l;
  public long m;
  public boolean n;
  public final u o;
  
  public m(z paramz, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramz;
    b = paramBoolean1;
    c = paramBoolean2;
    h = new boolean[3];
    d = new r(7);
    e = new r(8);
    f = new r(6);
    m = -9223372036854775807L;
    o = new u();
  }
  
  public final void a(u paramu)
  {
    x6.b.K(j);
    int i1 = e0.a;
    int i2 = b;
    i1 = c;
    Object localObject1 = a;
    long l1 = g;
    int i3 = i1 - i2;
    g = (l1 + i3);
    j.b(i3, paramu);
    paramu = (u)localObject1;
    for (;;)
    {
      int i4 = q.b(paramu, i2, i1, h);
      if (i4 == i1)
      {
        f(paramu, i2, i1);
        return;
      }
      i3 = i4 + 3;
      int i5 = paramu[i3] & 0x1F;
      int i6 = i4 - i2;
      if (i6 > 0) {
        f(paramu, i2, i4);
      }
      i4 = i1 - i4;
      l1 = g - i4;
      if (i6 < 0) {
        i2 = -i6;
      } else {
        i2 = 0;
      }
      long l2 = m;
      if ((l) && (!k.c)) {}
      Object localObject2;
      Object localObject3;
      int i8;
      Object localObject4;
      Object localObject5;
      for (;;)
      {
        break;
        d.b(i2);
        e.b(i2);
        if (!l)
        {
          if ((!d.c) || (!e.c)) {
            continue;
          }
          localObject1 = new ArrayList();
          localObject2 = d;
          ((ArrayList)localObject1).add(Arrays.copyOf(d, e));
          localObject2 = e;
          ((ArrayList)localObject1).add(Arrays.copyOf(d, e));
          localObject2 = d;
          localObject2 = q.d(d, 3, e);
          localObject3 = e;
          localObject3 = new v5.v(d, 4, e);
          i6 = ((v5.v)localObject3).f();
          i8 = ((v5.v)localObject3).f();
          ((v5.v)localObject3).i();
          localObject4 = new q.b(i6, i8, ((v5.v)localObject3).d());
          localObject3 = a0.l(a, b, c);
          c4.v localv = j;
          localObject5 = new i0.a();
          a = i;
          k = "video/avc";
          h = ((String)localObject3);
          p = e;
          q = f;
          t = g;
          m = ((List)localObject1);
          localv.d(new i0((i0.a)localObject5));
          l = true;
          k.d.append(d, localObject2);
          k.e.append(i6, localObject4);
          d.c();
        }
        else
        {
          localObject1 = d;
          if (c)
          {
            localObject1 = q.d(d, 3, e);
            k.d.append(d, localObject1);
            localObject1 = d;
            break label675;
          }
          localObject1 = e;
          if (!c) {
            break;
          }
          localObject1 = new v5.v(d, 4, e);
          i8 = ((v5.v)localObject1).f();
          i6 = ((v5.v)localObject1).f();
          ((v5.v)localObject1).i();
          localObject1 = new q.b(i8, i6, ((v5.v)localObject1).d());
          k.e.append(i8, localObject1);
        }
        localObject1 = e;
        label675:
        ((r)localObject1).c();
      }
      if (f.b(i2))
      {
        localObject1 = f;
        i2 = q.e(d, e);
        o.E(f.d, i2);
        o.G(4);
        localObject1 = a;
        c4.b.a(l2, o, b);
      }
      localObject1 = k;
      boolean bool1 = l;
      boolean bool2 = n;
      if (i != 9)
      {
        if (c)
        {
          localObject4 = n;
          localObject2 = m;
          if (a)
          {
            if (a)
            {
              localObject3 = c;
              x6.b.K(localObject3);
              localObject5 = c;
              x6.b.K(localObject5);
              if ((f == f) && (g == g) && (h == h) && ((!i) || (!i) || (j == j)))
              {
                i2 = d;
                i6 = d;
                if ((i2 == i6) || ((i2 != 0) && (i6 != 0)))
                {
                  i2 = k;
                  if (((i2 != 0) || (k != 0) || ((m == m) && (n == n))) && ((i2 != 1) || (k != 1) || ((o == o) && (p == p))))
                  {
                    i9 = k;
                    if ((i9 != k) || ((i9 != 0) && (l != l))) {}
                  }
                }
              }
            }
          }
          else
          {
            i2 = 0;
            break label1075;
          }
          i2 = 1;
          label1075:
          if (i2 == 0) {}
        }
      }
      else
      {
        if ((bool1) && (o))
        {
          long l3 = j;
          i2 = (int)(l1 - l3);
          l2 = q;
          if (l2 != -9223372036854775807L)
          {
            int i7 = r;
            i8 = (int)(l3 - p);
            a.c(l2, i7, i8, i4 + i2, null);
          }
        }
        p = j;
        q = l;
        r = false;
        o = true;
      }
      if (b)
      {
        localObject2 = n;
        if (b)
        {
          i2 = e;
          if ((i2 == 7) || (i2 == 2))
          {
            bool2 = true;
            break label1245;
          }
        }
        bool2 = false;
      }
      label1245:
      int i9 = r;
      i2 = i;
      if ((i2 != 5) && ((!bool2) || (i2 != 1))) {
        i2 = 0;
      } else {
        i2 = 1;
      }
      bool2 = i9 | i2;
      r = bool2;
      if (bool2) {
        n = false;
      }
      l2 = m;
      if ((!l) || (k.c))
      {
        d.d(i5);
        e.d(i5);
      }
      f.d(i5);
      localObject1 = k;
      i = i5;
      l = l2;
      j = l1;
      if (b) {
        if (i5 == 1) {
          break label1426;
        }
      }
      if ((c) && ((i5 == 5) || (i5 == 1) || (i5 == 2)))
      {
        label1426:
        localObject2 = m;
        m = n;
        n = ((m.a.a)localObject2);
        b = false;
        a = false;
        h = 0;
        k = true;
      }
      i2 = i3;
    }
  }
  
  public final void b()
  {
    g = 0L;
    n = false;
    m = -9223372036854775807L;
    q.a(h);
    d.c();
    e.c();
    f.c();
    Object localObject = k;
    if (localObject != null)
    {
      k = false;
      o = false;
      localObject = n;
      b = false;
      a = false;
    }
  }
  
  public final void c() {}
  
  public final void d(int paramInt, long paramLong)
  {
    if (paramLong != -9223372036854775807L) {
      m = paramLong;
    }
    int i1 = n;
    if ((paramInt & 0x2) != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    n = (paramInt | i1);
  }
  
  public final void e(c4.j paramj, d0.d paramd)
  {
    paramd.a();
    paramd.b();
    i = e;
    paramd.b();
    c4.v localv = paramj.r(d, 2);
    j = localv;
    k = new a(localv, b, c);
    a.a(paramj, paramd);
  }
  
  public final void f(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((!l) || (k.c))
    {
      d.a(paramArrayOfByte, paramInt1, paramInt2);
      e.a(paramArrayOfByte, paramInt1, paramInt2);
    }
    f.a(paramArrayOfByte, paramInt1, paramInt2);
    a locala = k;
    if (k)
    {
      int i1 = paramInt2 - paramInt1;
      Object localObject = g;
      paramInt2 = localObject.length;
      int i2 = h + i1;
      if (paramInt2 < i2) {
        g = Arrays.copyOf((byte[])localObject, i2 * 2);
      }
      System.arraycopy(paramArrayOfByte, paramInt1, g, h, i1);
      paramInt1 = h + i1;
      h = paramInt1;
      paramArrayOfByte = f;
      a = g;
      c = 0;
      b = paramInt1;
      d = 0;
      paramArrayOfByte.a();
      if (f.b(8))
      {
        f.i();
        int i3 = f.e(2);
        f.j(5);
        if (f.c())
        {
          f.f();
          if (f.c())
          {
            int i4 = f.f();
            if (!c)
            {
              k = false;
              paramArrayOfByte = n;
              e = i4;
              b = true;
            }
            else if (f.c())
            {
              int i5 = f.f();
              if (e.indexOfKey(i5) < 0)
              {
                k = false;
              }
              else
              {
                localObject = (q.b)e.get(i5);
                paramArrayOfByte = (q.c)d.get(a);
                if (h)
                {
                  if (f.b(2)) {
                    f.j(2);
                  }
                }
                else if (f.b(j))
                {
                  int i6 = f.e(j);
                  boolean bool2;
                  boolean bool4;
                  if (!i)
                  {
                    if (!f.b(1)) {
                      return;
                    }
                    bool1 = f.d();
                    bool2 = bool1;
                    if (bool1)
                    {
                      if (!f.b(1)) {
                        return;
                      }
                      bool3 = f.d();
                      bool4 = true;
                      bool2 = bool1;
                      bool1 = bool4;
                      break label532;
                    }
                  }
                  else
                  {
                    bool2 = false;
                  }
                  boolean bool3 = false;
                  boolean bool1 = bool3;
                  label532:
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
                    i7 = f.f();
                  }
                  else
                  {
                    i7 = 0;
                  }
                  paramInt1 = k;
                  if (paramInt1 == 0)
                  {
                    if (!f.b(l)) {
                      return;
                    }
                    paramInt2 = f.e(l);
                    paramInt1 = paramInt2;
                    if (b)
                    {
                      paramInt1 = paramInt2;
                      if (!bool2)
                      {
                        if (!f.c()) {
                          return;
                        }
                        i2 = f.g();
                        int i8 = 0;
                        i1 = 0;
                        paramInt1 = paramInt2;
                        paramInt2 = i8;
                        break label775;
                      }
                    }
                  }
                  else
                  {
                    if ((paramInt1 == 1) && (!m))
                    {
                      if (!f.c()) {
                        return;
                      }
                      i1 = f.g();
                      if ((b) && (!bool2))
                      {
                        if (!f.c()) {
                          return;
                        }
                        paramInt2 = f.g();
                        i2 = 0;
                        paramInt1 = 0;
                        break label775;
                      }
                      paramInt1 = 0;
                      break label770;
                    }
                    paramInt1 = 0;
                  }
                  i1 = 0;
                  label770:
                  paramInt2 = 0;
                  i2 = 0;
                  label775:
                  localObject = n;
                  c = paramArrayOfByte;
                  d = i3;
                  e = i4;
                  f = i6;
                  g = i5;
                  h = bool2;
                  i = bool1;
                  j = bool3;
                  k = bool4;
                  l = i7;
                  m = paramInt1;
                  n = i2;
                  o = i1;
                  p = paramInt2;
                  a = true;
                  b = true;
                  k = false;
                }
              }
            }
          }
        }
      }
    }
  }
  
  public static final class a
  {
    public final c4.v a;
    public final boolean b;
    public final boolean c;
    public final SparseArray<q.c> d;
    public final SparseArray<q.b> e;
    public final v5.v f;
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
    
    public a(c4.v paramv, boolean paramBoolean1, boolean paramBoolean2)
    {
      a = paramv;
      b = paramBoolean1;
      c = paramBoolean2;
      d = new SparseArray();
      e = new SparseArray();
      m = new a();
      n = new a();
      paramv = new byte[''];
      g = paramv;
      f = new v5.v(paramv, 0, 0);
      k = false;
      o = false;
      paramv = n;
      b = false;
      a = false;
    }
    
    public static final class a
    {
      public boolean a;
      public boolean b;
      public q.c c;
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
    }
  }
}

/* Location:
 * Qualified Name:     m4.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
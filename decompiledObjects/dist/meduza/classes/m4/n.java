package m4;

import b.a0;
import c4.v;
import java.util.Collections;
import v3.i0;
import v3.i0.a;
import v5.e0;
import v5.q;
import v5.q.a;
import v5.u;

public final class n
  implements j
{
  public final z a;
  public String b;
  public v c;
  public a d;
  public boolean e;
  public final boolean[] f;
  public final r g;
  public final r h;
  public final r i;
  public final r j;
  public final r k;
  public long l;
  public long m;
  public final u n;
  
  public n(z paramz)
  {
    a = paramz;
    f = new boolean[3];
    g = new r(32);
    h = new r(33);
    i = new r(34);
    j = new r(39);
    k = new r(40);
    m = -9223372036854775807L;
    n = new u();
  }
  
  public final void a(u paramu)
  {
    x6.b.K(c);
    int i1 = e0.a;
    for (;;)
    {
      Object localObject1 = paramu;
      i1 = c;
      int i2 = b;
      int i3 = i1 - i2;
      if (i3 <= 0) {
        break;
      }
      byte[] arrayOfByte1 = a;
      l += i3;
      c.b(i3, (u)localObject1);
      while (i2 < i1)
      {
        int i4 = q.b(arrayOfByte1, i2, i1, f);
        if (i4 == i1)
        {
          f(arrayOfByte1, i2, i1);
          return;
        }
        i3 = i4 + 3;
        int i5 = (arrayOfByte1[i3] & 0x7E) >> 1;
        int i6 = i4 - i2;
        if (i6 > 0) {
          f(arrayOfByte1, i2, i4);
        }
        i4 = i1 - i4;
        long l1 = l - i4;
        if (i6 < 0) {
          i2 = -i6;
        } else {
          i2 = 0;
        }
        long l2 = m;
        localObject1 = d;
        boolean bool = e;
        if ((j) && (g))
        {
          m = c;
          j = false;
        }
        else
        {
          if ((h) || (g)) {
            break label240;
          }
        }
        break label353;
        label240:
        if ((bool) && (i))
        {
          l3 = b;
          int i8 = (int)(l1 - l3);
          long l4 = l;
          if (l4 != -9223372036854775807L)
          {
            int i9 = m;
            i6 = (int)(l3 - k);
            a.c(l4, i9, i6, i8 + i4, null);
          }
        }
        k = b;
        l = e;
        m = c;
        i = true;
        label353:
        if (!e)
        {
          g.b(i2);
          h.b(i2);
          i.b(i2);
          Object localObject2 = g;
          if (c)
          {
            Object localObject3 = h;
            if (c)
            {
              Object localObject4 = i;
              if (c)
              {
                v localv = c;
                localObject1 = b;
                i6 = e;
                byte[] arrayOfByte2 = new byte[e + i6 + e];
                System.arraycopy(d, 0, arrayOfByte2, 0, i6);
                System.arraycopy(d, 0, arrayOfByte2, e, e);
                System.arraycopy(d, 0, arrayOfByte2, e + e, e);
                localObject2 = q.c(d, 3, e);
                localObject4 = a0.m(a, b, c, d, e, f);
                localObject3 = new i0.a();
                a = ((String)localObject1);
                k = "video/hevc";
                h = ((String)localObject4);
                p = g;
                q = h;
                t = i;
                m = Collections.singletonList(arrayOfByte2);
                localv.d(new i0((i0.a)localObject3));
                e = true;
              }
            }
          }
        }
        if (j.b(i2))
        {
          localObject1 = j;
          i6 = q.e(d, e);
          n.E(j.d, i6);
          n.H(5);
          localObject1 = a;
          c4.b.a(l2, n, b);
        }
        if (k.b(i2))
        {
          localObject1 = k;
          i2 = q.e(d, e);
          n.E(k.d, i2);
          n.H(5);
          localObject1 = a;
          c4.b.a(l2, n, b);
        }
        long l3 = m;
        localObject1 = d;
        bool = e;
        g = false;
        h = false;
        e = l3;
        d = 0;
        b = l1;
        if ((i5 >= 32) && (i5 != 40)) {
          i2 = 0;
        } else {
          i2 = 1;
        }
        if (i2 == 0)
        {
          if ((i) && (!j))
          {
            if (bool)
            {
              l3 = l;
              if (l3 != -9223372036854775807L)
              {
                int i7 = m;
                i2 = (int)(l1 - k);
                a.c(l3, i7, i2, i4, null);
              }
            }
            i = false;
          }
          if (((32 <= i5) && (i5 <= 35)) || (i5 == 39)) {
            i2 = 1;
          } else {
            i2 = 0;
          }
          if (i2 != 0)
          {
            h = (j ^ true);
            j = true;
          }
        }
        if ((i5 >= 16) && (i5 <= 21)) {
          bool = true;
        } else {
          bool = false;
        }
        c = bool;
        if ((!bool) && (i5 > 9)) {
          bool = false;
        } else {
          bool = true;
        }
        f = bool;
        if (!e)
        {
          g.d(i5);
          h.d(i5);
          i.d(i5);
        }
        j.d(i5);
        k.d(i5);
        i2 = i3;
      }
    }
  }
  
  public final void b()
  {
    l = 0L;
    m = -9223372036854775807L;
    q.a(f);
    g.c();
    h.c();
    i.c();
    j.c();
    k.c();
    a locala = d;
    if (locala != null)
    {
      f = false;
      g = false;
      h = false;
      i = false;
      j = false;
    }
  }
  
  public final void c() {}
  
  public final void d(int paramInt, long paramLong)
  {
    if (paramLong != -9223372036854775807L) {
      m = paramLong;
    }
  }
  
  public final void e(c4.j paramj, d0.d paramd)
  {
    paramd.a();
    paramd.b();
    b = e;
    paramd.b();
    v localv = paramj.r(d, 2);
    c = localv;
    d = new a(localv);
    a.a(paramj, paramd);
  }
  
  public final void f(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a locala = d;
    if (f)
    {
      int i1 = d;
      int i2 = paramInt1 + 2 - i1;
      if (i2 < paramInt2)
      {
        boolean bool;
        if ((paramArrayOfByte[i2] & 0x80) != 0) {
          bool = true;
        } else {
          bool = false;
        }
        g = bool;
        f = false;
      }
      else
      {
        d = (paramInt2 - paramInt1 + i1);
      }
    }
    if (!e)
    {
      g.a(paramArrayOfByte, paramInt1, paramInt2);
      h.a(paramArrayOfByte, paramInt1, paramInt2);
      i.a(paramArrayOfByte, paramInt1, paramInt2);
    }
    j.a(paramArrayOfByte, paramInt1, paramInt2);
    k.a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static final class a
  {
    public final v a;
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
    
    public a(v paramv)
    {
      a = paramv;
    }
  }
}

/* Location:
 * Qualified Name:     m4.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
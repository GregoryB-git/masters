package l1;

import F0.T;
import F0.a.b;
import F0.n;
import F0.t;
import d0.q;
import d0.q.b;
import g0.M;
import g0.o;
import g0.y;
import g0.z;
import java.util.Arrays;
import java.util.Collections;

public final class i
  implements m
{
  public static final byte[] w = { 73, 68, 51 };
  public final boolean a;
  public final y b = new y(new byte[7]);
  public final z c = new z(Arrays.copyOf(w, 10));
  public final String d;
  public final int e;
  public String f;
  public T g;
  public T h;
  public int i;
  public int j;
  public int k;
  public boolean l;
  public boolean m;
  public int n;
  public int o;
  public int p;
  public boolean q;
  public long r;
  public int s;
  public long t;
  public T u;
  public long v;
  
  public i(boolean paramBoolean)
  {
    this(paramBoolean, null, 0);
  }
  
  public i(boolean paramBoolean, String paramString, int paramInt)
  {
    s();
    n = -1;
    o = -1;
    r = -9223372036854775807L;
    t = -9223372036854775807L;
    a = paramBoolean;
    d = paramString;
    e = paramInt;
  }
  
  private boolean i(z paramz, byte[] paramArrayOfByte, int paramInt)
  {
    int i1 = Math.min(paramz.a(), paramInt - j);
    paramz.l(paramArrayOfByte, j, i1);
    i1 = j + i1;
    j = i1;
    boolean bool;
    if (i1 == paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean m(int paramInt)
  {
    boolean bool;
    if ((paramInt & 0xFFF6) == 65520) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void a(z paramz)
  {
    f();
    while (paramz.a() > 0)
    {
      int i1 = i;
      if (i1 != 0)
      {
        if (i1 != 1)
        {
          if (i1 != 2)
          {
            if (i1 != 3)
            {
              if (i1 == 4) {
                p(paramz);
              } else {
                throw new IllegalStateException();
              }
            }
            else
            {
              if (l) {
                i1 = 7;
              } else {
                i1 = 5;
              }
              if (i(paramz, b.a, i1)) {
                n();
              }
            }
          }
          else if (i(paramz, c.e(), 10)) {
            o();
          }
        }
        else {
          g(paramz);
        }
      }
      else {
        j(paramz);
      }
    }
  }
  
  public void b()
  {
    t = -9223372036854775807L;
    q();
  }
  
  public void c(boolean paramBoolean) {}
  
  public void d(long paramLong, int paramInt)
  {
    t = paramLong;
  }
  
  public void e(t paramt, K.d paramd)
  {
    paramd.a();
    f = paramd.b();
    T localT = paramt.a(paramd.c(), 1);
    g = localT;
    u = localT;
    if (a)
    {
      paramd.a();
      paramt = paramt.a(paramd.c(), 5);
      h = paramt;
      paramt.d(new q.b().a0(paramd.b()).o0("application/id3").K());
    }
    else
    {
      h = new n();
    }
  }
  
  public final void f()
  {
    g0.a.e(g);
    M.i(u);
    M.i(h);
  }
  
  public final void g(z paramz)
  {
    if (paramz.a() == 0) {
      return;
    }
    b.a[0] = ((byte)paramz.e()[paramz.f()]);
    b.p(2);
    int i1 = b.h(4);
    int i2 = o;
    if ((i2 != -1) && (i1 != i2))
    {
      q();
      return;
    }
    if (!m)
    {
      m = true;
      n = p;
      o = i1;
    }
    t();
  }
  
  public final boolean h(z paramz, int paramInt)
  {
    paramz.T(paramInt + 1);
    byte[] arrayOfByte = b.a;
    boolean bool1 = true;
    boolean bool2 = true;
    if (!w(paramz, arrayOfByte, 1)) {
      return false;
    }
    b.p(4);
    int i1 = b.h(1);
    int i2 = n;
    if ((i2 != -1) && (i1 != i2)) {
      return false;
    }
    if (o != -1)
    {
      if (!w(paramz, b.a, 1)) {
        return true;
      }
      b.p(2);
      if (b.h(4) != o) {
        return false;
      }
      paramz.T(paramInt + 2);
    }
    if (!w(paramz, b.a, 4)) {
      return true;
    }
    b.p(14);
    int i3 = b.h(13);
    if (i3 < 7) {
      return false;
    }
    arrayOfByte = paramz.e();
    i2 = paramz.g();
    paramInt += i3;
    if (paramInt >= i2) {
      return true;
    }
    i3 = arrayOfByte[paramInt];
    if (i3 == -1)
    {
      paramInt++;
      if (paramInt == i2) {
        return true;
      }
      if ((!l((byte)-1, arrayOfByte[paramInt])) || ((arrayOfByte[paramInt] & 0x8) >> 3 != i1)) {
        bool2 = false;
      }
      return bool2;
    }
    if (i3 != 73) {
      return false;
    }
    i1 = paramInt + 1;
    if (i1 == i2) {
      return true;
    }
    if (arrayOfByte[i1] != 68) {
      return false;
    }
    paramInt += 2;
    if (paramInt == i2) {
      return true;
    }
    if (arrayOfByte[paramInt] == 51) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    return bool2;
  }
  
  public final void j(z paramz)
  {
    byte[] arrayOfByte = paramz.e();
    int i1 = paramz.f();
    int i2 = paramz.g();
    while (i1 < i2)
    {
      int i3 = i1 + 1;
      int i4 = arrayOfByte[i1];
      int i5 = i4 & 0xFF;
      if ((k == 512) && (l((byte)-1, (byte)i5)) && ((m) || (h(paramz, i1 - 1))))
      {
        p = ((i4 & 0x8) >> 3);
        boolean bool = true;
        if ((i4 & 0x1) != 0) {
          bool = false;
        }
        l = bool;
        if (!m) {
          r();
        } else {
          t();
        }
        paramz.T(i3);
        return;
      }
      i4 = k;
      i5 |= i4;
      if (i5 != 329) {
        if (i5 != 511) {
          if (i5 != 836)
          {
            if (i5 != 1075)
            {
              if (i4 == 256) {
                break label240;
              }
              k = 256;
              continue;
            }
            u();
            paramz.T(i3);
            return;
          }
        }
      }
      for (i1 = 1024;; i1 = 768)
      {
        k = i1;
        break;
        k = 512;
        break;
      }
      label240:
      i1 = i3;
    }
    paramz.T(i1);
  }
  
  public long k()
  {
    return r;
  }
  
  public final boolean l(byte paramByte1, byte paramByte2)
  {
    return m((paramByte1 & 0xFF) << 8 | paramByte2 & 0xFF);
  }
  
  public final void n()
  {
    b.p(0);
    if (!q)
    {
      Object localObject = b;
      i1 = 2;
      i2 = ((y)localObject).h(2) + 1;
      if (i2 != 2)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Detected audio object type: ");
        ((StringBuilder)localObject).append(i2);
        ((StringBuilder)localObject).append(", but assuming AAC LC.");
        o.h("AdtsReader", ((StringBuilder)localObject).toString());
      }
      else
      {
        i1 = i2;
      }
      b.r(5);
      i2 = b.h(3);
      localObject = F0.a.a(i1, o, i2);
      a.b localb = F0.a.e((byte[])localObject);
      localObject = new q.b().a0(f).o0("audio/mp4a-latm").O(c).N(b).p0(a).b0(Collections.singletonList(localObject)).e0(d).m0(e).K();
      r = (1024000000L / C);
      g.d((q)localObject);
      q = true;
    }
    else
    {
      b.r(10);
    }
    b.r(4);
    int i2 = b.h(13);
    int i1 = i2 - 7;
    if (l) {
      i1 = i2 - 9;
    }
    v(g, r, 0, i1);
  }
  
  public final void o()
  {
    h.e(c, 10);
    c.T(6);
    v(h, 0L, 10, c.F() + 10);
  }
  
  public final void p(z paramz)
  {
    int i1 = Math.min(paramz.a(), s - j);
    u.e(paramz, i1);
    i1 = j + i1;
    j = i1;
    if (i1 == s)
    {
      boolean bool;
      if (t != -9223372036854775807L) {
        bool = true;
      } else {
        bool = false;
      }
      g0.a.f(bool);
      u.b(t, 1, s, 0, null);
      t += v;
      s();
    }
  }
  
  public final void q()
  {
    m = false;
    s();
  }
  
  public final void r()
  {
    i = 1;
    j = 0;
  }
  
  public final void s()
  {
    i = 0;
    j = 0;
    k = 256;
  }
  
  public final void t()
  {
    i = 3;
    j = 0;
  }
  
  public final void u()
  {
    i = 2;
    j = w.length;
    s = 0;
    c.T(0);
  }
  
  public final void v(T paramT, long paramLong, int paramInt1, int paramInt2)
  {
    i = 4;
    j = paramInt1;
    u = paramT;
    v = paramLong;
    s = paramInt2;
  }
  
  public final boolean w(z paramz, byte[] paramArrayOfByte, int paramInt)
  {
    if (paramz.a() < paramInt) {
      return false;
    }
    paramz.l(paramArrayOfByte, 0, paramInt);
    return true;
  }
}

/* Location:
 * Qualified Name:     l1.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package l1;

import F0.t;
import g0.E;
import g0.a;
import g0.o;
import g0.z;

public final class y
  implements K
{
  public final m a;
  public final g0.y b;
  public int c;
  public int d;
  public E e;
  public boolean f;
  public boolean g;
  public boolean h;
  public int i;
  public int j;
  public boolean k;
  public long l;
  
  public y(m paramm)
  {
    a = paramm;
    b = new g0.y(new byte[10]);
    c = 0;
  }
  
  public void a(z paramz, int paramInt)
  {
    a.h(e);
    int m = paramInt;
    int n;
    if ((paramInt & 0x1) != 0)
    {
      n = c;
      m = paramInt;
      if (n != 0)
      {
        m = paramInt;
        if (n != 1) {
          if (n != 2)
          {
            if (n == 3)
            {
              if (j != -1)
              {
                StringBuilder localStringBuilder = new StringBuilder();
                localStringBuilder.append("Unexpected start indicator: expected ");
                localStringBuilder.append(j);
                localStringBuilder.append(" more bytes");
                o.h("PesReader", localStringBuilder.toString());
              }
              boolean bool;
              if (paramz.g() == 0) {
                bool = true;
              } else {
                bool = false;
              }
              a.c(bool);
              m = paramInt;
            }
            else
            {
              throw new IllegalStateException();
            }
          }
          else
          {
            o.h("PesReader", "Unexpected start indicator reading extended header");
            m = paramInt;
          }
        }
      }
      h(1);
    }
    for (;;)
    {
      if (paramz.a() <= 0) {
        return;
      }
      paramInt = c;
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            if (paramInt == 3)
            {
              int i1 = paramz.a();
              paramInt = j;
              if (paramInt == -1) {
                n = 0;
              } else {
                n = i1 - paramInt;
              }
              paramInt = i1;
              if (n > 0)
              {
                paramInt = i1 - n;
                paramz.S(paramz.f() + paramInt);
              }
              a.a(paramz);
              n = j;
              if (n == -1) {
                continue;
              }
              paramInt = n - paramInt;
              j = paramInt;
              if (paramInt != 0) {
                continue;
              }
              a.c(false);
              break;
            }
            throw new IllegalStateException();
          }
          paramInt = Math.min(10, i);
          if ((!e(paramz, b.a, paramInt)) || (!e(paramz, null, i))) {
            continue;
          }
          g();
          if (k) {
            paramInt = 4;
          } else {
            paramInt = 0;
          }
          m |= paramInt;
          a.d(l, m);
          h(3);
          continue;
        }
        if (!e(paramz, b.a, 9)) {
          continue;
        }
        if (f()) {
          paramInt = 2;
        } else {
          paramInt = 0;
        }
        h(paramInt);
        continue;
      }
      paramz.U(paramz.a());
    }
  }
  
  public void b()
  {
    c = 0;
    d = 0;
    h = false;
    a.b();
  }
  
  public void c(E paramE, t paramt, K.d paramd)
  {
    e = paramE;
    a.e(paramt, paramd);
  }
  
  public boolean d(boolean paramBoolean)
  {
    if ((c == 3) && (j == -1) && ((!paramBoolean) || (!(a instanceof n)))) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
  
  public final boolean e(z paramz, byte[] paramArrayOfByte, int paramInt)
  {
    int m = Math.min(paramz.a(), paramInt - d);
    boolean bool = true;
    if (m <= 0) {
      return true;
    }
    if (paramArrayOfByte == null) {
      paramz.U(m);
    } else {
      paramz.l(paramArrayOfByte, d, m);
    }
    m = d + m;
    d = m;
    if (m != paramInt) {
      bool = false;
    }
    return bool;
  }
  
  public final boolean f()
  {
    b.p(0);
    int m = b.h(24);
    StringBuilder localStringBuilder;
    if (m != 1)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unexpected start code prefix: ");
      localStringBuilder.append(m);
      o.h("PesReader", localStringBuilder.toString());
      j = -1;
      return false;
    }
    b.r(8);
    m = b.h(16);
    b.r(5);
    k = b.g();
    b.r(2);
    f = b.g();
    g = b.g();
    b.r(6);
    int n = b.h(8);
    i = n;
    if (m == 0) {}
    for (;;)
    {
      j = -1;
      break;
      m = m - 3 - n;
      j = m;
      if (m >= 0) {
        break;
      }
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Found negative packet payload size: ");
      localStringBuilder.append(j);
      o.h("PesReader", localStringBuilder.toString());
    }
    return true;
  }
  
  public final void g()
  {
    b.p(0);
    l = -9223372036854775807L;
    if (f)
    {
      b.r(4);
      long l1 = b.h(3);
      b.r(1);
      long l2 = b.h(15) << 15;
      b.r(1);
      long l3 = b.h(15);
      b.r(1);
      if ((!h) && (g))
      {
        b.r(4);
        long l4 = b.h(3);
        b.r(1);
        long l5 = b.h(15) << 15;
        b.r(1);
        long l6 = b.h(15);
        b.r(1);
        e.b(l4 << 30 | l5 | l6);
        h = true;
      }
      l = e.b(l1 << 30 | l2 | l3);
    }
  }
  
  public final void h(int paramInt)
  {
    c = paramInt;
    d = 0;
  }
}

/* Location:
 * Qualified Name:     l1.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
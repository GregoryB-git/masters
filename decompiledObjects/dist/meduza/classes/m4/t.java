package m4;

import f;
import v5.c0;
import v5.m;
import v5.u;
import x6.b;

public final class t
  implements d0
{
  public final j a;
  public final v5.t b;
  public int c;
  public int d;
  public c0 e;
  public boolean f;
  public boolean g;
  public boolean h;
  public int i;
  public int j;
  public boolean k;
  public long l;
  
  public t(j paramj)
  {
    a = paramj;
    b = new v5.t(new byte[10], 10);
    c = 0;
  }
  
  public final void a(int paramInt, u paramu)
  {
    b.K(e);
    int m = -1;
    int n = 0;
    int i1 = 2;
    int i2 = m;
    int i3 = n;
    int i4 = i1;
    int i5 = paramInt;
    StringBuilder localStringBuilder;
    if ((paramInt & 0x1) != 0)
    {
      i3 = c;
      if ((i3 != 0) && (i3 != 1)) {
        if (i3 != 2)
        {
          if (i3 == 3)
          {
            if (j != -1)
            {
              localStringBuilder = f.l("Unexpected start indicator: expected ");
              localStringBuilder.append(j);
              localStringBuilder.append(" more bytes");
              m.f("PesReader", localStringBuilder.toString());
            }
            a.c();
          }
          else
          {
            throw new IllegalStateException();
          }
        }
        else {
          m.f("PesReader", "Unexpected start indicator reading extended header");
        }
      }
      c = 1;
      d = 0;
      i5 = paramInt;
      i4 = i1;
      i3 = n;
      i2 = m;
    }
    for (;;)
    {
      paramInt = c;
      i1 = b;
      n = paramInt - i1;
      if (n <= 0) {
        break;
      }
      paramInt = c;
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != i4)
          {
            if (paramInt == 3)
            {
              paramInt = j;
              if (paramInt == i2) {
                m = i3;
              } else {
                m = n - paramInt;
              }
              paramInt = n;
              if (m > 0)
              {
                paramInt = n - m;
                paramu.F(i1 + paramInt);
              }
              a.a(paramu);
              m = j;
              if (m == i2) {
                continue;
              }
              paramInt = m - paramInt;
              j = paramInt;
              if (paramInt != 0) {
                continue;
              }
              a.c();
              c = 1;
              d = i3;
              continue;
            }
            throw new IllegalStateException();
          }
          if ((d(Math.min(10, i), paramu, b.a)) && (d(i, paramu, null)))
          {
            b.k(i3);
            l = -9223372036854775807L;
            boolean bool = f;
            paramInt = 4;
            if (bool)
            {
              b.m(4);
              long l1 = b.g(3);
              b.m(1);
              long l2 = b.g(15) << 15;
              b.m(1);
              long l3 = b.g(15);
              b.m(1);
              if ((!h) && (g))
              {
                b.m(4);
                long l4 = b.g(3);
                b.m(1);
                long l5 = b.g(15) << 15;
                b.m(1);
                long l6 = b.g(15);
                b.m(1);
                e.b(l4 << 30 | l5 | l6);
                h = true;
              }
              l = e.b(l1 << 30 | l2 | l3);
            }
            if (!k) {
              paramInt = 0;
            }
            i5 |= paramInt;
            a.d(i5, l);
            c = 3;
            d = 0;
            i2 = -1;
            i3 = 0;
            i4 = 2;
          }
        }
        else if (d(9, paramu, b.a))
        {
          b.k(0);
          paramInt = b.g(24);
          if (paramInt != 1)
          {
            f.p("Unexpected start code prefix: ", paramInt, "PesReader");
            j = -1;
            paramInt = 0;
          }
          else
          {
            b.m(8);
            paramInt = b.g(16);
            b.m(5);
            k = b.f();
            b.m(2);
            f = b.f();
            g = b.f();
            b.m(6);
            i3 = b.g(8);
            i = i3;
            if (paramInt != 0)
            {
              paramInt = paramInt + 6 - 9 - i3;
              j = paramInt;
              if (paramInt < 0)
              {
                localStringBuilder = f.l("Found negative packet payload size: ");
                localStringBuilder.append(j);
                m.f("PesReader", localStringBuilder.toString());
              }
            }
            else
            {
              j = -1;
            }
            paramInt = 1;
          }
          if (paramInt != 0) {
            paramInt = 2;
          } else {
            paramInt = 0;
          }
          c = paramInt;
          d = 0;
        }
        i4 = 2;
        i3 = 0;
        i2 = -1;
      }
      else
      {
        paramu.H(n);
      }
    }
  }
  
  public final void b()
  {
    c = 0;
    d = 0;
    h = false;
    a.b();
  }
  
  public final void c(c0 paramc0, c4.j paramj, d0.d paramd)
  {
    e = paramc0;
    a.e(paramj, paramd);
  }
  
  public final boolean d(int paramInt, u paramu, byte[] paramArrayOfByte)
  {
    int m = Math.min(c - b, paramInt - d);
    boolean bool = true;
    if (m <= 0) {
      return true;
    }
    if (paramArrayOfByte == null) {
      paramu.H(m);
    } else {
      paramu.d(paramArrayOfByte, d, m);
    }
    m = d + m;
    d = m;
    if (m != paramInt) {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     m4.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
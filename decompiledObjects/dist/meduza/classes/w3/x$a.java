package w3;

import v3.r1;
import v3.r1.b;
import v3.r1.c;
import z4.s;
import z4.t.b;

public final class x$a
{
  public final String a;
  public int b;
  public long c;
  public t.b d;
  public boolean e;
  public boolean f;
  
  public x$a(x paramx, String paramString, int paramInt, t.b paramb)
  {
    a = paramString;
    b = paramInt;
    long l;
    if (paramb == null) {
      l = -1L;
    } else {
      l = d;
    }
    c = l;
    if ((paramb != null) && (paramb.a())) {
      d = paramb;
    }
  }
  
  public final boolean a(b.a parama)
  {
    t.b localb = d;
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = true;
    if (localb == null)
    {
      if (b == c) {
        bool3 = false;
      }
      return bool3;
    }
    long l = c;
    if (l == -1L) {
      return false;
    }
    if (d > l) {
      return true;
    }
    if (d == null) {
      return false;
    }
    int i = b.b(a);
    int j = b.b(d.a);
    localb = d;
    if ((d >= d.d) && (i >= j))
    {
      if (i > j) {
        return true;
      }
      bool3 = localb.a();
      parama = d;
      if (bool3)
      {
        j = b;
        int k = c;
        parama = d;
        i = b;
        bool3 = bool1;
        if (j <= i) {
          if ((j == i) && (k > c)) {
            bool3 = bool1;
          } else {
            bool3 = false;
          }
        }
        return bool3;
      }
      j = e;
      bool3 = bool2;
      if (j != -1) {
        if (j > d.b) {
          bool3 = bool2;
        } else {
          bool3 = false;
        }
      }
      return bool3;
    }
    return false;
  }
  
  public final boolean b(r1 paramr11, r1 paramr12)
  {
    int i = b;
    int j = paramr11.o();
    boolean bool = false;
    if (i >= j)
    {
      if (i < paramr12.o()) {}
    }
    else {
      for (;;)
      {
        i = -1;
        break;
        paramr11.m(i, g.a);
        for (i = g.a.w; i <= g.a.x; i++)
        {
          j = paramr12.b(paramr11.l(i));
          if (j != -1)
          {
            i = fg.b, false).c;
            break label118;
          }
        }
      }
    }
    label118:
    b = i;
    if (i == -1) {
      return false;
    }
    paramr11 = d;
    if (paramr11 == null) {
      return true;
    }
    if (paramr12.b(a) != -1) {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     w3.x.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
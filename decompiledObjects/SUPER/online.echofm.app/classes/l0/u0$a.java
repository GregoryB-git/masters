package l0;

import d0.I;
import d0.I.b;
import d0.I.c;
import x0.x.b;

public final class u0$a
{
  public final String a;
  public int b;
  public long c;
  public x.b d;
  public boolean e;
  public boolean f;
  
  public u0$a(u0 paramu0, String paramString, int paramInt, x.b paramb)
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
    if ((paramb != null) && (paramb.b())) {
      d = paramb;
    }
  }
  
  public boolean i(int paramInt, x.b paramb)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (paramb == null)
    {
      if (paramInt == b) {
        bool3 = true;
      }
      return bool3;
    }
    x.b localb = d;
    if (localb == null)
    {
      bool3 = bool1;
      if (!paramb.b())
      {
        bool3 = bool1;
        if (d == c) {
          bool3 = true;
        }
      }
      return bool3;
    }
    bool3 = bool2;
    if (d == d)
    {
      bool3 = bool2;
      if (b == b)
      {
        bool3 = bool2;
        if (c == c) {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public boolean j(c.a parama)
  {
    x.b localb = d;
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
      bool3 = localb.b();
      parama = d;
      if (bool3)
      {
        j = b;
        i = c;
        parama = d;
        int k = b;
        bool3 = bool1;
        if (j <= k) {
          if ((j == k) && (i > c)) {
            bool3 = bool1;
          } else {
            bool3 = false;
          }
        }
        return bool3;
      }
      i = e;
      bool3 = bool2;
      if (i != -1) {
        if (i > d.b) {
          bool3 = bool2;
        } else {
          bool3 = false;
        }
      }
      return bool3;
    }
    return false;
  }
  
  public void k(int paramInt, x.b paramb)
  {
    if ((c == -1L) && (paramInt == b) && (paramb != null) && (d >= u0.i(g))) {
      c = d;
    }
  }
  
  public final int l(I paramI1, I paramI2, int paramInt)
  {
    if (paramInt >= paramI1.p())
    {
      if (paramInt >= paramI2.p()) {
        paramInt = -1;
      }
      return paramInt;
    }
    paramI1.n(paramInt, u0.j(g));
    for (paramInt = jg).n; paramInt <= jg).o; paramInt++)
    {
      int i = paramI2.b(paramI1.m(paramInt));
      if (i != -1) {
        return fkg)).c;
      }
    }
    return -1;
  }
  
  public boolean m(I paramI1, I paramI2)
  {
    int i = l(paramI1, paramI2, b);
    b = i;
    boolean bool = false;
    if (i == -1) {
      return false;
    }
    paramI1 = d;
    if (paramI1 == null) {
      return true;
    }
    if (paramI2.b(a) != -1) {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     l0.u0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
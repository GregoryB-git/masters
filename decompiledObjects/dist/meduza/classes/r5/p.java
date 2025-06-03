package r5;

import v3.l1;
import v3.s1;
import v5.e0;

public final class p
{
  public final int a;
  public final l1[] b;
  public final h[] c;
  public final s1 d;
  public final Object e;
  
  public p(l1[] paramArrayOfl1, h[] paramArrayOfh, s1 params1, j.a parama)
  {
    b = paramArrayOfl1;
    c = ((h[])paramArrayOfh.clone());
    d = params1;
    e = parama;
    a = paramArrayOfl1.length;
  }
  
  public final boolean a(p paramp, int paramInt)
  {
    boolean bool1 = false;
    if (paramp == null) {
      return false;
    }
    boolean bool2 = bool1;
    if (e0.a(b[paramInt], b[paramInt]))
    {
      bool2 = bool1;
      if (e0.a(c[paramInt], c[paramInt])) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public final boolean b(int paramInt)
  {
    boolean bool;
    if (b[paramInt] != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     r5.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package k0;

import d0.q;
import g0.a;

public final class p
{
  public final String a;
  public final q b;
  public final q c;
  public final int d;
  public final int e;
  
  public p(String paramString, q paramq1, q paramq2, int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt1 != 0) && (paramInt2 != 0)) {
      bool = false;
    } else {
      bool = true;
    }
    a.a(bool);
    a = a.d(paramString);
    b = ((q)a.e(paramq1));
    c = ((q)a.e(paramq2));
    d = paramInt1;
    e = paramInt2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (p.class == paramObject.getClass()))
    {
      paramObject = (p)paramObject;
      if ((d != d) || (e != e) || (!a.equals(a)) || (!b.equals(b)) || (!c.equals(c))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return ((((527 + d) * 31 + e) * 31 + a.hashCode()) * 31 + b.hashCode()) * 31 + c.hashCode();
  }
}

/* Location:
 * Qualified Name:     k0.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package m9;

import j9.i;
import ma.h;
import t8.e;

public final class k0
{
  public final h a;
  public final boolean b;
  public final e<i> c;
  public final e<i> d;
  public final e<i> e;
  
  public k0(h paramh, boolean paramBoolean, e<i> parame1, e<i> parame2, e<i> parame3)
  {
    a = paramh;
    b = paramBoolean;
    c = parame1;
    d = parame2;
    e = parame3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (k0.class == paramObject.getClass()))
    {
      paramObject = (k0)paramObject;
      if (b != b) {
        return false;
      }
      if (!a.equals(a)) {
        return false;
      }
      if (!c.equals(c)) {
        return false;
      }
      if (!d.equals(d)) {
        return false;
      }
      return e.equals(e);
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b;
    int k = c.hashCode();
    int m = d.hashCode();
    return e.hashCode() + (m + (k + (i * 31 + j) * 31) * 31) * 31;
  }
}

/* Location:
 * Qualified Name:     m9.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
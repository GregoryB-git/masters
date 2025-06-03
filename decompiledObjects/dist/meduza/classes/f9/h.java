package f9;

import j9.i;
import j9.q;
import java.util.ArrayList;
import java.util.List;

public final class h
  implements c
{
  public final i a;
  public final q b;
  public final boolean c;
  public final List<String> d;
  
  public h(i parami, q paramq, boolean paramBoolean, ArrayList paramArrayList)
  {
    a = parami;
    b = paramq;
    c = paramBoolean;
    d = paramArrayList;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (h.class == paramObject.getClass()))
    {
      paramObject = (h)paramObject;
      if (c != c) {
        return false;
      }
      if (!a.equals(a)) {
        return false;
      }
      if (!b.equals(b)) {
        return false;
      }
      return d.equals(d);
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b.hashCode();
    int k = c;
    return d.hashCode() + ((j + i * 31) * 31 + k) * 31;
  }
}

/* Location:
 * Qualified Name:     f9.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
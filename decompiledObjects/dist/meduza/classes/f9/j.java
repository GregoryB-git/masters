package f9;

import j9.q;

public final class j
  implements c
{
  public final String a;
  public final i b;
  public final q c;
  
  public j(String paramString, i parami, q paramq)
  {
    a = paramString;
    b = parami;
    c = paramq;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (j.class == paramObject.getClass()))
    {
      paramObject = (j)paramObject;
      if (!a.equals(a)) {
        return false;
      }
      if (!b.equals(b)) {
        return false;
      }
      return c.equals(c);
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b.hashCode();
    return c.hashCode() + (j + i * 31) * 31;
  }
}

/* Location:
 * Qualified Name:     f9.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
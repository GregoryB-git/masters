package k9;

import j9.l;

public final class e
{
  public final l a;
  public final p b;
  
  public e(l paraml, p paramp)
  {
    a = paraml;
    b = paramp;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (e.class == paramObject.getClass()))
    {
      paramObject = (e)paramObject;
      if (!a.equals(a)) {
        return false;
      }
      return b.equals(b);
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    return b.hashCode() + i * 31;
  }
}

/* Location:
 * Qualified Name:     k9.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
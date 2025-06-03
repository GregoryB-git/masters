package f9;

import j9.m;

public final class b
  implements c
{
  public m a;
  
  public b(m paramm)
  {
    a = paramm;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (b.class == paramObject.getClass()))
    {
      paramObject = (b)paramObject;
      return a.equals(a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
}

/* Location:
 * Qualified Name:     f9.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package Y3;

import V3.k;
import V3.p;

public final class h
{
  public p a;
  public k b;
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (h.class == paramObject.getClass()))
    {
      paramObject = (h)paramObject;
      if (!a.equals(a)) {
        return false;
      }
      return b.equals(b);
    }
    return false;
  }
  
  public int hashCode()
  {
    return a.hashCode() * 31 + b.hashCode();
  }
}

/* Location:
 * Qualified Name:     Y3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
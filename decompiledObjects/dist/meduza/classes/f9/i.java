package f9;

import g9.k0;
import q0.g;

public final class i
  implements c
{
  public final k0 a;
  public final int b;
  
  public i(k0 paramk0, int paramInt)
  {
    a = paramk0;
    b = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (i.class == paramObject.getClass()))
    {
      paramObject = (i)paramObject;
      if (!a.equals(a)) {
        return false;
      }
      if (b != b) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    return g.c(b) + i * 31;
  }
}

/* Location:
 * Qualified Name:     f9.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
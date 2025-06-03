package z2;

import A2.m;
import A2.m.a;
import x2.d;

public final class z
{
  public final b a;
  public final d b;
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof z)))
    {
      paramObject = (z)paramObject;
      if ((m.a(a, a)) && (m.a(b, b))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return m.b(new Object[] { a, b });
  }
  
  public final String toString()
  {
    return m.c(this).a("key", a).a("feature", b).toString();
  }
}

/* Location:
 * Qualified Name:     z2.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
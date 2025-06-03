package gb;

import eb.l0;
import java.util.Arrays;
import n7.g;
import n7.g.a;
import x6.b;

public final class g3$b
{
  public final l0 a;
  public final Object b;
  
  public g3$b(l0 paraml0, Object paramObject)
  {
    a = paraml0;
    b = paramObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (b.class == paramObject.getClass()))
    {
      paramObject = (b)paramObject;
      if ((!b.Q(a, a)) || (!b.Q(b, b))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b });
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.a(a, "provider");
    locala.a(b, "config");
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     gb.g3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
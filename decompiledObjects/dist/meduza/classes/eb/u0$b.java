package eb;

import java.util.Arrays;
import n7.g;
import n7.g.a;
import x6.b;

public final class u0$b
{
  public final e1 a;
  public final Object b;
  
  public u0$b(e1 parame1)
  {
    b = null;
    b.y(parame1, "status");
    a = parame1;
    b.n(parame1, "cannot use OK status: %s", parame1.e() ^ true);
  }
  
  public u0$b(Object paramObject)
  {
    b = paramObject;
    a = null;
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
    g.a locala;
    Object localObject;
    String str;
    if (b != null)
    {
      locala = g.b(this);
      localObject = b;
      str = "config";
    }
    else
    {
      locala = g.b(this);
      localObject = a;
      str = "error";
    }
    locala.a(localObject, str);
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     eb.u0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
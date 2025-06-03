package eb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import n7.g;
import n7.g.a;
import x6.b;

public final class u0$e
{
  public final List<u> a;
  public final a b;
  public final u0.b c;
  
  public u0$e(List<u> paramList, a parama, u0.b paramb)
  {
    a = Collections.unmodifiableList(new ArrayList(paramList));
    b.y(parama, "attributes");
    b = parama;
    c = paramb;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof e;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (e)paramObject;
    bool1 = bool2;
    if (b.Q(a, a))
    {
      bool1 = bool2;
      if (b.Q(b, b))
      {
        bool1 = bool2;
        if (b.Q(c, c)) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, c });
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.a(a, "addresses");
    locala.a(b, "attributes");
    locala.a(c, "serviceConfig");
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     eb.u0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
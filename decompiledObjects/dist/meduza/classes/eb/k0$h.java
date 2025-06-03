package eb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import n7.g;
import n7.g.a;
import x6.b;

public final class k0$h
{
  public final List<u> a;
  public final a b;
  public final Object c;
  
  public k0$h() {}
  
  public k0$h(List paramList, a parama, Object paramObject)
  {
    b.y(paramList, "addresses");
    a = Collections.unmodifiableList(new ArrayList(paramList));
    b.y(parama, "attributes");
    b = parama;
    c = paramObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof h;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (h)paramObject;
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
    locala.a(c, "loadBalancingPolicyConfig");
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     eb.k0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
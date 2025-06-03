package d4;

import V3.k;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class g
  extends c
  implements n
{
  public static final g s = new g();
  
  public static g W()
  {
    return s;
  }
  
  public n A(k paramk)
  {
    return this;
  }
  
  public boolean B()
  {
    return false;
  }
  
  public int D(n paramn)
  {
    int i;
    if (paramn.isEmpty()) {
      i = 0;
    } else {
      i = -1;
    }
    return i;
  }
  
  public int E()
  {
    return 0;
  }
  
  public b I(b paramb)
  {
    return null;
  }
  
  public Object L(boolean paramBoolean)
  {
    return null;
  }
  
  public n N(b paramb, n paramn)
  {
    if (paramn.isEmpty()) {
      return this;
    }
    if (paramb.s()) {
      return this;
    }
    return new c().N(paramb, paramn);
  }
  
  public String O(n.b paramb)
  {
    return "";
  }
  
  public Iterator P()
  {
    return Collections.emptyList().iterator();
  }
  
  public boolean Q(b paramb)
  {
    return false;
  }
  
  public String R()
  {
    return "";
  }
  
  public g X(n paramn)
  {
    return this;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof g;
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    if ((paramObject instanceof n))
    {
      paramObject = (n)paramObject;
      if ((((n)paramObject).isEmpty()) && (t().equals(((n)paramObject).t()))) {}
    }
    else
    {
      bool2 = false;
    }
    return bool2;
  }
  
  public Object getValue()
  {
    return null;
  }
  
  public int hashCode()
  {
    return 0;
  }
  
  public boolean isEmpty()
  {
    return true;
  }
  
  public Iterator iterator()
  {
    return Collections.emptyList().iterator();
  }
  
  public n t()
  {
    return this;
  }
  
  public String toString()
  {
    return "<Empty Node>";
  }
  
  public n v(b paramb)
  {
    return this;
  }
  
  public n y(k paramk, n paramn)
  {
    if (paramk.isEmpty()) {
      return paramn;
    }
    b localb = paramk.Z();
    return N(localb, v(localb).y(paramk.c0(), paramn));
  }
}

/* Location:
 * Qualified Name:     d4.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
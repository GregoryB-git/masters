package d4;

import Y3.m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class k
  implements n
{
  public final n o;
  public String p;
  
  public k(n paramn)
  {
    o = paramn;
  }
  
  public static int D(l paraml, f paramf)
  {
    return Double.valueOf(((Long)paraml.getValue()).longValue()).compareTo((Double)paramf.getValue());
  }
  
  public n A(V3.k paramk)
  {
    if (paramk.isEmpty()) {
      return this;
    }
    if (paramk.Z().s()) {
      return o;
    }
    return g.W();
  }
  
  public boolean B()
  {
    return true;
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
    if ((paramBoolean) && (!o.isEmpty()))
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put(".value", getValue());
      localHashMap.put(".priority", o.getValue());
      return localHashMap;
    }
    return getValue();
  }
  
  public int M(n paramn)
  {
    if (paramn.isEmpty()) {
      return 1;
    }
    if ((paramn instanceof c)) {
      return -1;
    }
    m.g(paramn.B(), "Node is not leaf node!");
    if (((this instanceof l)) && ((paramn instanceof f))) {
      return D((l)this, (f)paramn);
    }
    if (((this instanceof f)) && ((paramn instanceof l))) {
      return D((l)paramn, (f)this) * -1;
    }
    return U((k)paramn);
  }
  
  public n N(b paramb, n paramn)
  {
    if (paramb.s()) {
      return J(paramn);
    }
    if (paramn.isEmpty()) {
      return this;
    }
    return g.W().N(paramb, paramn).J(o);
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
    if (p == null) {
      p = m.i(O(n.b.o));
    }
    return p;
  }
  
  public abstract b S();
  
  public String T(n.b paramb)
  {
    int i = a.a[paramb.ordinal()];
    if ((i != 1) && (i != 2))
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unknown hash version: ");
      localStringBuilder.append(paramb);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    if (o.isEmpty()) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("priority:");
    localStringBuilder.append(o.O(paramb));
    localStringBuilder.append(":");
    return localStringBuilder.toString();
  }
  
  public int U(k paramk)
  {
    b localb1 = S();
    b localb2 = paramk.S();
    if (localb1.equals(localb2)) {
      return s(paramk);
    }
    return localb1.compareTo(localb2);
  }
  
  public boolean isEmpty()
  {
    return false;
  }
  
  public Iterator iterator()
  {
    return Collections.emptyList().iterator();
  }
  
  public abstract int s(k paramk);
  
  public n t()
  {
    return o;
  }
  
  public String toString()
  {
    String str = L(true).toString();
    if (str.length() > 100)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(str.substring(0, 100));
      localStringBuilder.append("...");
      str = localStringBuilder.toString();
    }
    return str;
  }
  
  public n v(b paramb)
  {
    if (paramb.s()) {
      return o;
    }
    return g.W();
  }
  
  public n y(V3.k paramk, n paramn)
  {
    b localb = paramk.Z();
    if (localb == null) {
      return paramn;
    }
    if ((paramn.isEmpty()) && (!localb.s())) {
      return this;
    }
    boolean bool1 = paramk.Z().s();
    boolean bool2 = true;
    boolean bool3 = bool2;
    if (bool1) {
      if (paramk.size() == 1) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
    }
    m.f(bool3);
    return N(localb, g.W().y(paramk.c0(), paramn));
  }
  
  public static enum b
  {
    static
    {
      b localb1 = new b("DeferredValue", 0);
      o = localb1;
      b localb2 = new b("Boolean", 1);
      p = localb2;
      b localb3 = new b("Number", 2);
      q = localb3;
      b localb4 = new b("String", 3);
      r = localb4;
      s = new b[] { localb1, localb2, localb3, localb4 };
    }
  }
}

/* Location:
 * Qualified Name:     d4.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package X3;

import V3.k;
import Y3.d;
import Y3.d.c;
import Y3.i;
import d4.b;

public class g
{
  public static final i b = new a();
  public static final i c = new b();
  public static final d d = new d(Boolean.TRUE);
  public static final d e = new d(Boolean.FALSE);
  public final d a;
  
  public g()
  {
    a = d.d();
  }
  
  public g(d paramd)
  {
    a = paramd;
  }
  
  public g a(b paramb)
  {
    d locald = a.D(paramb);
    if (locald == null)
    {
      paramb = new d((Boolean)a.getValue());
    }
    else
    {
      paramb = locald;
      if (locald.getValue() == null)
      {
        paramb = locald;
        if (a.getValue() != null) {
          paramb = locald.W(k.Y(), (Boolean)a.getValue());
        }
      }
    }
    return new g(paramb);
  }
  
  public Object b(Object paramObject, final d.c paramc)
  {
    return a.k(paramObject, new c(paramc));
  }
  
  public g c(k paramk)
  {
    if (a.V(paramk, b) != null) {
      return this;
    }
    return new g(a.X(paramk, e));
  }
  
  public g d(k paramk)
  {
    if (a.V(paramk, b) == null)
    {
      if (a.V(paramk, c) != null) {
        return this;
      }
      return new g(a.X(paramk, d));
    }
    throw new IllegalArgumentException("Can't prune path that was kept previously!");
  }
  
  public boolean e()
  {
    return a.a(c);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof g)) {
      return false;
    }
    paramObject = (g)paramObject;
    return a.equals(a);
  }
  
  public boolean f(k paramk)
  {
    paramk = (Boolean)a.S(paramk);
    boolean bool;
    if ((paramk != null) && (!paramk.booleanValue())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean g(k paramk)
  {
    paramk = (Boolean)a.S(paramk);
    boolean bool;
    if ((paramk != null) && (paramk.booleanValue())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return a.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{PruneForest:");
    localStringBuilder.append(a.toString());
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public class a
    implements i
  {
    public boolean b(Boolean paramBoolean)
    {
      return paramBoolean.booleanValue() ^ true;
    }
  }
  
  public class b
    implements i
  {
    public boolean b(Boolean paramBoolean)
    {
      return paramBoolean.booleanValue();
    }
  }
  
  public class c
    implements d.c
  {
    public c(d.c paramc) {}
    
    public Object b(k paramk, Boolean paramBoolean, Object paramObject)
    {
      if (!paramBoolean.booleanValue()) {
        return paramc.a(paramk, null, paramObject);
      }
      return paramObject;
    }
  }
}

/* Location:
 * Qualified Name:     X3.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
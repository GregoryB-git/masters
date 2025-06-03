package X2;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class x
  extends g
  implements Serializable
{
  private static final long serialVersionUID = 0L;
  public final transient w r;
  public final transient int s;
  
  public x(w paramw, int paramInt)
  {
    r = paramw;
    s = paramInt;
  }
  
  public boolean b(Object paramObject)
  {
    boolean bool;
    if ((paramObject != null) && (super.b(paramObject))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Map c()
  {
    throw new AssertionError("should never be called");
  }
  
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }
  
  public Set d()
  {
    throw new AssertionError("unreachable");
  }
  
  public w h()
  {
    return r;
  }
  
  public t i()
  {
    return new d(this);
  }
  
  public g0 j()
  {
    return new a();
  }
  
  public t k()
  {
    return (t)super.values();
  }
  
  public final boolean put(Object paramObject1, Object paramObject2)
  {
    throw new UnsupportedOperationException();
  }
  
  public int size()
  {
    return s;
  }
  
  public class a
    extends g0
  {
    public Iterator o = r.k().q();
    public Iterator p = C.f();
    
    public a() {}
    
    public boolean hasNext()
    {
      boolean bool;
      if ((!p.hasNext()) && (!o.hasNext())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public Object next()
    {
      if (!p.hasNext()) {
        p = ((t)o.next()).q();
      }
      return p.next();
    }
  }
  
  public static abstract class b
  {
    public final Map a = Q.c();
    public Comparator b;
    public Comparator c;
  }
  
  public static abstract class c
  {
    public static final Y.b a = Y.a(x.class, "map");
    public static final Y.b b = Y.a(x.class, "size");
  }
  
  public static final class d
    extends t
  {
    private static final long serialVersionUID = 0L;
    public final transient x p;
    
    public d(x paramx)
    {
      p = paramx;
    }
    
    public boolean contains(Object paramObject)
    {
      return p.b(paramObject);
    }
    
    public int d(Object[] paramArrayOfObject, int paramInt)
    {
      g0 localg0 = p.r.k().q();
      while (localg0.hasNext()) {
        paramInt = ((t)localg0.next()).d(paramArrayOfObject, paramInt);
      }
      return paramInt;
    }
    
    public g0 q()
    {
      return p.j();
    }
    
    public int size()
    {
      return p.size();
    }
    
    public Object writeReplace()
    {
      return super.writeReplace();
    }
  }
}

/* Location:
 * Qualified Name:     X2.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
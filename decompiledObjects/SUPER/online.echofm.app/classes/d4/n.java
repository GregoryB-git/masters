package d4;

import V3.k;
import java.util.Iterator;

public abstract interface n
  extends Comparable, Iterable
{
  public static final c l = new a();
  
  public abstract n A(k paramk);
  
  public abstract boolean B();
  
  public abstract int E();
  
  public abstract b I(b paramb);
  
  public abstract n J(n paramn);
  
  public abstract Object L(boolean paramBoolean);
  
  public abstract n N(b paramb, n paramn);
  
  public abstract String O(b paramb);
  
  public abstract Iterator P();
  
  public abstract boolean Q(b paramb);
  
  public abstract String R();
  
  public abstract Object getValue();
  
  public abstract boolean isEmpty();
  
  public abstract n t();
  
  public abstract n v(b paramb);
  
  public abstract n y(k paramk, n paramn);
  
  public class a
    extends c
  {
    public int D(n paramn)
    {
      int i;
      if (paramn == this) {
        i = 0;
      } else {
        i = 1;
      }
      return i;
    }
    
    public boolean Q(b paramb)
    {
      return false;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool;
      if (paramObject == this) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isEmpty()
    {
      return false;
    }
    
    public n t()
    {
      return this;
    }
    
    public String toString()
    {
      return "<Max Node>";
    }
    
    public n v(b paramb)
    {
      if (paramb.s()) {
        return t();
      }
      return g.W();
    }
  }
  
  public static enum b
  {
    static
    {
      b localb1 = new b("V1", 0);
      o = localb1;
      b localb2 = new b("V2", 1);
      p = localb2;
      q = new b[] { localb1, localb2 };
    }
  }
}

/* Location:
 * Qualified Name:     d4.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
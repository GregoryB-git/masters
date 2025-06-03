package X2;

import W2.m;
import W2.s;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class J
{
  public static d a()
  {
    return b(P.d());
  }
  
  public static d b(Comparator paramComparator)
  {
    m.j(paramComparator);
    return new a();
  }
  
  public class a
    extends J.d
  {
    public a() {}
    
    public Map c()
    {
      return new TreeMap(J.this);
    }
  }
  
  public static final class b
    implements s, Serializable
  {
    public final int o;
    
    public b(int paramInt)
    {
      o = i.b(paramInt, "expectedValuesPerKey");
    }
    
    public List a()
    {
      return new ArrayList(o);
    }
  }
  
  public static abstract class c
    extends J
  {
    public c()
    {
      super();
    }
    
    public abstract D c();
  }
  
  public static abstract class d
  {
    public J.c a()
    {
      return b(2);
    }
    
    public J.c b(final int paramInt)
    {
      i.b(paramInt, "expectedValuesPerKey");
      return new a(paramInt);
    }
    
    public abstract Map c();
    
    public class a
      extends J.c
    {
      public a(int paramInt) {}
      
      public D c()
      {
        return K.b(c(), new J.b(paramInt));
      }
    }
  }
}

/* Location:
 * Qualified Name:     X2.J
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
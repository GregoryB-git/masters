package n3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  public static final a b = a().a();
  public final Map a;
  
  public a(Map paramMap)
  {
    a = paramMap;
  }
  
  public static b a()
  {
    return new b();
  }
  
  public Map b()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    return a.equals(a);
  }
  
  public int hashCode()
  {
    return a.hashCode();
  }
  
  public String toString()
  {
    return a.toString();
  }
  
  public static final class b
  {
    public HashMap a = new HashMap();
    
    public a a()
    {
      if (a != null)
      {
        a locala = new a(Collections.unmodifiableMap(a), null);
        a = null;
        return locala;
      }
      throw new IllegalStateException("cannot call build() twice");
    }
  }
}

/* Location:
 * Qualified Name:     n3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
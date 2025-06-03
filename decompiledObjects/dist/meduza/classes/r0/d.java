package r0;

import ec.i;
import java.util.Map;

public abstract class d
{
  public abstract Map<a<?>, Object> a();
  
  public abstract <T> T b(a<T> parama);
  
  public static final class a<T>
  {
    public final String a;
    
    public a(String paramString)
    {
      a = paramString;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool;
      if ((paramObject instanceof a)) {
        bool = i.a(a, a);
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final int hashCode()
    {
      return a.hashCode();
    }
    
    public final String toString()
    {
      return a;
    }
  }
  
  public static final class b<T> {}
}

/* Location:
 * Qualified Name:     r0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
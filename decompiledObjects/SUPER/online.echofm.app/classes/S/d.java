package S;

import W5.C;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public abstract class d
{
  public abstract Map a();
  
  public abstract Object b(a parama);
  
  public final a c()
  {
    return new a(C.o(a()), false);
  }
  
  public final d d()
  {
    return new a(C.o(a()), true);
  }
  
  public static final class a
  {
    public final String a;
    
    public a(String paramString)
    {
      a = paramString;
    }
    
    public final String a()
    {
      return a;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool;
      if ((paramObject instanceof a)) {
        bool = Intrinsics.a(a, a);
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
      return a;
    }
  }
  
  public static final abstract class b {}
}

/* Location:
 * Qualified Name:     S.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
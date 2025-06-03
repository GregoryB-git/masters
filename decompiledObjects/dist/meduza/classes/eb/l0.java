package eb;

import java.util.Map;
import n7.g;
import n7.g.a;

public abstract class l0
  extends k0.c
{
  public static final u0.b a = new u0.b(new a());
  
  public abstract String b();
  
  public abstract int c();
  
  public abstract boolean d();
  
  public u0.b e(Map<String, ?> paramMap)
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (this == paramObject) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return super.hashCode();
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.a(b(), "policy");
    locala.d(String.valueOf(c()), "priority");
    locala.c("available", d());
    return locala.toString();
  }
  
  public static final class a
  {
    public final String toString()
    {
      return "service config is unused";
    }
  }
}

/* Location:
 * Qualified Name:     eb.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package a4;

import V3.k;
import java.util.Map;

public final class i
{
  public final k a;
  public final h b;
  
  public i(k paramk, h paramh)
  {
    a = paramk;
    b = paramh;
  }
  
  public static i a(k paramk)
  {
    return new i(paramk, h.i);
  }
  
  public static i b(k paramk, Map paramMap)
  {
    return new i(paramk, h.c(paramMap));
  }
  
  public d4.h c()
  {
    return b.d();
  }
  
  public h d()
  {
    return b;
  }
  
  public k e()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (i.class == paramObject.getClass()))
    {
      paramObject = (i)paramObject;
      if (!a.equals(a)) {
        return false;
      }
      return b.equals(b);
    }
    return false;
  }
  
  public boolean f()
  {
    return b.p();
  }
  
  public boolean g()
  {
    return b.u();
  }
  
  public int hashCode()
  {
    return a.hashCode() * 31 + b.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(":");
    localStringBuilder.append(b);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     a4.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
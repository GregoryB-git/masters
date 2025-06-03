package d4;

import Q3.d;
import V3.k;

public abstract class r
{
  public static n a()
  {
    return g.W();
  }
  
  public static boolean b(n paramn)
  {
    boolean bool;
    if ((paramn.t().isEmpty()) && ((paramn.isEmpty()) || ((paramn instanceof f)) || ((paramn instanceof t)) || ((paramn instanceof e)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static n c(k paramk, Object paramObject)
  {
    Object localObject = o.a(paramObject);
    paramObject = localObject;
    if ((localObject instanceof l)) {
      paramObject = new f(Double.valueOf(((Long)((n)localObject).getValue()).longValue()), a());
    }
    if (!b((n)paramObject))
    {
      paramObject = new StringBuilder();
      if (paramk != null)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Path '");
        ((StringBuilder)localObject).append(paramk);
        ((StringBuilder)localObject).append("'");
        paramk = ((StringBuilder)localObject).toString();
      }
      else
      {
        paramk = "Node";
      }
      ((StringBuilder)paramObject).append(paramk);
      ((StringBuilder)paramObject).append(" contains invalid priority: Must be a string, double, ServerValue, or null");
      throw new d(((StringBuilder)paramObject).toString());
    }
    return (n)paramObject;
  }
  
  public static n d(Object paramObject)
  {
    return c(null, paramObject);
  }
}

/* Location:
 * Qualified Name:     d4.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package X2;

import W2.g;
import java.util.Comparator;

public abstract class P
  implements Comparator
{
  public static P b(Comparator paramComparator)
  {
    if ((paramComparator instanceof P)) {
      paramComparator = (P)paramComparator;
    } else {
      paramComparator = new m(paramComparator);
    }
    return paramComparator;
  }
  
  public static P d()
  {
    return M.o;
  }
  
  public P a(Comparator paramComparator)
  {
    return new o(this, (Comparator)W2.m.j(paramComparator));
  }
  
  public v c(Iterable paramIterable)
  {
    return v.g0(this, paramIterable);
  }
  
  public abstract int compare(Object paramObject1, Object paramObject2);
  
  public P e()
  {
    return f(G.e());
  }
  
  public P f(g paramg)
  {
    return new h(paramg, this);
  }
  
  public P g()
  {
    return new X(this);
  }
}

/* Location:
 * Qualified Name:     X2.P
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
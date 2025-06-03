package X2;

import W2.m;
import java.io.Serializable;

public final class W
  extends P
  implements Serializable
{
  public static final W o = new W();
  private static final long serialVersionUID = 0L;
  
  private Object readResolve()
  {
    return o;
  }
  
  public P g()
  {
    return P.d();
  }
  
  public int h(Comparable paramComparable1, Comparable paramComparable2)
  {
    m.j(paramComparable1);
    if (paramComparable1 == paramComparable2) {
      return 0;
    }
    return paramComparable2.compareTo(paramComparable1);
  }
  
  public String toString()
  {
    return "Ordering.natural().reverse()";
  }
}

/* Location:
 * Qualified Name:     X2.W
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
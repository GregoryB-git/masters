package X2;

import W2.m;
import java.io.Serializable;

public final class M
  extends P
  implements Serializable
{
  public static final M o = new M();
  private static final long serialVersionUID = 0L;
  
  private Object readResolve()
  {
    return o;
  }
  
  public P g()
  {
    return W.o;
  }
  
  public int h(Comparable paramComparable1, Comparable paramComparable2)
  {
    m.j(paramComparable1);
    m.j(paramComparable2);
    return paramComparable1.compareTo(paramComparable2);
  }
  
  public String toString()
  {
    return "Ordering.natural()";
  }
}

/* Location:
 * Qualified Name:     X2.M
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
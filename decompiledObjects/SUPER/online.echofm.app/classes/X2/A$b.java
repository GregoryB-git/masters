package X2;

import java.io.Serializable;
import java.util.Comparator;

public class A$b
  implements Serializable
{
  private static final long serialVersionUID = 0L;
  public final Comparator o;
  public final Object[] p;
  
  public A$b(Comparator paramComparator, Object[] paramArrayOfObject)
  {
    o = paramComparator;
    p = paramArrayOfObject;
  }
  
  public Object readResolve()
  {
    return new A.a(o).n(p).p();
  }
}

/* Location:
 * Qualified Name:     X2.A.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
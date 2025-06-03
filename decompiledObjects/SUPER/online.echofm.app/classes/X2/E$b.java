package X2;

import W2.g;
import W2.m;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

public class E$b
  extends AbstractSequentialList
  implements Serializable
{
  private static final long serialVersionUID = 0L;
  public final List o;
  public final g p;
  
  public E$b(List paramList, g paramg)
  {
    o = ((List)m.j(paramList));
    p = ((g)m.j(paramg));
  }
  
  public ListIterator listIterator(int paramInt)
  {
    return new a(o.listIterator(paramInt));
  }
  
  public void removeRange(int paramInt1, int paramInt2)
  {
    o.subList(paramInt1, paramInt2).clear();
  }
  
  public int size()
  {
    return o.size();
  }
  
  public class a
    extends f0
  {
    public a(ListIterator paramListIterator)
    {
      super();
    }
    
    public Object b(Object paramObject)
    {
      return p.apply(paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     X2.E.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
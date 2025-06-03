package X2;

import W2.g;
import W2.m;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class E$a
  extends AbstractList
  implements RandomAccess, Serializable
{
  private static final long serialVersionUID = 0L;
  public final List o;
  public final g p;
  
  public E$a(List paramList, g paramg)
  {
    o = ((List)m.j(paramList));
    p = ((g)m.j(paramg));
  }
  
  public Object get(int paramInt)
  {
    return p.apply(o.get(paramInt));
  }
  
  public boolean isEmpty()
  {
    return o.isEmpty();
  }
  
  public Iterator iterator()
  {
    return listIterator();
  }
  
  public ListIterator listIterator(int paramInt)
  {
    return new a(o.listIterator(paramInt));
  }
  
  public Object remove(int paramInt)
  {
    return p.apply(o.remove(paramInt));
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
 * Qualified Name:     X2.E.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
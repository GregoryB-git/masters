package X2;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class d$k
  extends d.j
  implements List
{
  public d$k(d paramd, Object paramObject, List paramList, d.j paramj)
  {
    super(paramd, paramObject, paramList, paramj);
  }
  
  public void add(int paramInt, Object paramObject)
  {
    i();
    boolean bool = f().isEmpty();
    q().add(paramInt, paramObject);
    d.j(t);
    if (bool) {
      a();
    }
  }
  
  public boolean addAll(int paramInt, Collection paramCollection)
  {
    if (paramCollection.isEmpty()) {
      return false;
    }
    int i = size();
    boolean bool = q().addAll(paramInt, paramCollection);
    if (bool)
    {
      paramInt = f().size();
      d.l(t, paramInt - i);
      if (i == 0) {
        a();
      }
    }
    return bool;
  }
  
  public Object get(int paramInt)
  {
    i();
    return q().get(paramInt);
  }
  
  public int indexOf(Object paramObject)
  {
    i();
    return q().indexOf(paramObject);
  }
  
  public int lastIndexOf(Object paramObject)
  {
    i();
    return q().lastIndexOf(paramObject);
  }
  
  public ListIterator listIterator()
  {
    i();
    return new a();
  }
  
  public ListIterator listIterator(int paramInt)
  {
    i();
    return new a(paramInt);
  }
  
  public List q()
  {
    return (List)f();
  }
  
  public Object remove(int paramInt)
  {
    i();
    Object localObject = q().remove(paramInt);
    d.k(t);
    k();
    return localObject;
  }
  
  public Object set(int paramInt, Object paramObject)
  {
    i();
    return q().set(paramInt, paramObject);
  }
  
  public List subList(int paramInt1, int paramInt2)
  {
    i();
    d locald = t;
    Object localObject1 = g();
    List localList = q().subList(paramInt1, paramInt2);
    Object localObject2;
    if (d() == null) {
      localObject2 = this;
    } else {
      localObject2 = d();
    }
    return locald.y(localObject1, localList, (d.j)localObject2);
  }
  
  public class a
    extends d.j.a
    implements ListIterator
  {
    public a()
    {
      super();
    }
    
    public a(int paramInt)
    {
      super(q().listIterator(paramInt));
    }
    
    public void add(Object paramObject)
    {
      boolean bool = isEmpty();
      e().add(paramObject);
      d.j(t);
      if (bool) {
        a();
      }
    }
    
    public final ListIterator e()
    {
      return (ListIterator)b();
    }
    
    public boolean hasPrevious()
    {
      return e().hasPrevious();
    }
    
    public int nextIndex()
    {
      return e().nextIndex();
    }
    
    public Object previous()
    {
      return e().previous();
    }
    
    public int previousIndex()
    {
      return e().previousIndex();
    }
    
    public void set(Object paramObject)
    {
      e().set(paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     X2.d.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
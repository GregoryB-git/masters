package J3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class C
  implements List, RandomAccess
{
  public final List o;
  
  public C(List paramList)
  {
    o = Collections.unmodifiableList(paramList);
  }
  
  public static C a(List paramList)
  {
    return new C(paramList);
  }
  
  public static C d(Object... paramVarArgs)
  {
    return new C(Arrays.asList(paramVarArgs));
  }
  
  public void add(int paramInt, Object paramObject)
  {
    o.add(paramInt, paramObject);
  }
  
  public boolean add(Object paramObject)
  {
    return o.add(paramObject);
  }
  
  public boolean addAll(int paramInt, Collection paramCollection)
  {
    return o.addAll(paramInt, paramCollection);
  }
  
  public boolean addAll(Collection paramCollection)
  {
    return o.addAll(paramCollection);
  }
  
  public void clear()
  {
    o.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    return o.contains(paramObject);
  }
  
  public boolean containsAll(Collection paramCollection)
  {
    return o.containsAll(paramCollection);
  }
  
  public boolean equals(Object paramObject)
  {
    return o.equals(paramObject);
  }
  
  public Object get(int paramInt)
  {
    return o.get(paramInt);
  }
  
  public int hashCode()
  {
    return o.hashCode();
  }
  
  public int indexOf(Object paramObject)
  {
    return o.indexOf(paramObject);
  }
  
  public boolean isEmpty()
  {
    return o.isEmpty();
  }
  
  public Iterator iterator()
  {
    return o.iterator();
  }
  
  public int lastIndexOf(Object paramObject)
  {
    return o.lastIndexOf(paramObject);
  }
  
  public ListIterator listIterator()
  {
    return o.listIterator();
  }
  
  public ListIterator listIterator(int paramInt)
  {
    return o.listIterator(paramInt);
  }
  
  public Object remove(int paramInt)
  {
    return o.remove(paramInt);
  }
  
  public boolean remove(Object paramObject)
  {
    return o.remove(paramObject);
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    return o.removeAll(paramCollection);
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    return o.retainAll(paramCollection);
  }
  
  public Object set(int paramInt, Object paramObject)
  {
    return o.set(paramInt, paramObject);
  }
  
  public int size()
  {
    return o.size();
  }
  
  public List subList(int paramInt1, int paramInt2)
  {
    return o.subList(paramInt1, paramInt2);
  }
  
  public Object[] toArray()
  {
    return o.toArray();
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    return o.toArray(paramArrayOfObject);
  }
}

/* Location:
 * Qualified Name:     J3.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
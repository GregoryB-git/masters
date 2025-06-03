package t8;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class e<T>
  implements Iterable<T>
{
  public final c<T, Void> a;
  
  public e(List<T> paramList, Comparator<T> paramComparator)
  {
    Map localMap = Collections.emptyMap();
    if (paramList.size() < 25)
    {
      Collections.sort(paramList, paramComparator);
      int i = paramList.size();
      Object[] arrayOfObject1 = new Object[i];
      Object[] arrayOfObject2 = new Object[i];
      Iterator localIterator = paramList.iterator();
      for (i = 0; localIterator.hasNext(); i++)
      {
        paramList = localIterator.next();
        arrayOfObject1[i] = paramList;
        arrayOfObject2[i] = localMap.get(paramList);
      }
      paramList = new b(paramComparator, arrayOfObject1, arrayOfObject2);
    }
    else
    {
      paramList = k.a.b(paramList, localMap, paramComparator);
    }
    a = paramList;
  }
  
  public e(c<T, Void> paramc)
  {
    a = paramc;
  }
  
  public final e<T> a(T paramT)
  {
    return new e(a.n(paramT, null));
  }
  
  public final boolean contains(T paramT)
  {
    return a.a(paramT);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof e)) {
      return false;
    }
    paramObject = (e)paramObject;
    return a.equals(a);
  }
  
  public final a h(i9.c paramc)
  {
    return new a(a.o(paramc));
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final e<T> i(T paramT)
  {
    paramT = a.p(paramT);
    if (paramT == a) {
      paramT = this;
    } else {
      paramT = new e(paramT);
    }
    return paramT;
  }
  
  public final Iterator<T> iterator()
  {
    return new a(a.iterator());
  }
  
  public final int size()
  {
    return a.size();
  }
  
  public static final class a<T>
    implements Iterator<T>
  {
    public final Iterator<Map.Entry<T, Void>> a;
    
    public a(Iterator<Map.Entry<T, Void>> paramIterator)
    {
      a = paramIterator;
    }
    
    public final boolean hasNext()
    {
      return a.hasNext();
    }
    
    public final T next()
    {
      return (T)((Map.Entry)a.next()).getKey();
    }
    
    public final void remove()
    {
      a.remove();
    }
  }
}

/* Location:
 * Qualified Name:     t8.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
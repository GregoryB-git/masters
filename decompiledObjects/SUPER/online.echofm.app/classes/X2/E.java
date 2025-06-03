package X2;

import W2.g;
import W2.k;
import W2.m;
import a3.f;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class E
{
  public static List a(Iterable paramIterable)
  {
    return (List)paramIterable;
  }
  
  public static int b(int paramInt)
  {
    i.b(paramInt, "arraySize");
    return f.m(paramInt + 5L + paramInt / 10);
  }
  
  public static boolean c(List paramList, Object paramObject)
  {
    if (paramObject == m.j(paramList)) {
      return true;
    }
    if (!(paramObject instanceof List)) {
      return false;
    }
    paramObject = (List)paramObject;
    int i = paramList.size();
    if (i != ((List)paramObject).size()) {
      return false;
    }
    if (((paramList instanceof RandomAccess)) && ((paramObject instanceof RandomAccess)))
    {
      for (int j = 0; j < i; j++) {
        if (!k.a(paramList.get(j), ((List)paramObject).get(j))) {
          return false;
        }
      }
      return true;
    }
    return C.e(paramList.iterator(), ((List)paramObject).iterator());
  }
  
  public static int d(List paramList, Object paramObject)
  {
    if ((paramList instanceof RandomAccess)) {
      return e(paramList, paramObject);
    }
    paramList = paramList.listIterator();
    while (paramList.hasNext()) {
      if (k.a(paramObject, paramList.next())) {
        return paramList.previousIndex();
      }
    }
    return -1;
  }
  
  public static int e(List paramList, Object paramObject)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (paramObject == null) {
      for (j = k; j < i; j++) {
        if (paramList.get(j) == null) {
          return j;
        }
      }
    }
    while (j < i)
    {
      if (paramObject.equals(paramList.get(j))) {
        return j;
      }
      j++;
    }
    return -1;
  }
  
  public static int f(List paramList, Object paramObject)
  {
    if ((paramList instanceof RandomAccess)) {
      return g(paramList, paramObject);
    }
    paramList = paramList.listIterator(paramList.size());
    while (paramList.hasPrevious()) {
      if (k.a(paramObject, paramList.previous())) {
        return paramList.nextIndex();
      }
    }
    return -1;
  }
  
  public static int g(List paramList, Object paramObject)
  {
    if (paramObject == null) {
      for (i = paramList.size() - 1; i >= 0; i--) {
        if (paramList.get(i) == null) {
          return i;
        }
      }
    }
    for (int i = paramList.size() - 1; i >= 0; i--) {
      if (paramObject.equals(paramList.get(i))) {
        return i;
      }
    }
    return -1;
  }
  
  public static ArrayList h()
  {
    return new ArrayList();
  }
  
  public static ArrayList i(Iterator paramIterator)
  {
    ArrayList localArrayList = h();
    C.a(localArrayList, paramIterator);
    return localArrayList;
  }
  
  public static ArrayList j(Object... paramVarArgs)
  {
    m.j(paramVarArgs);
    ArrayList localArrayList = new ArrayList(b(paramVarArgs.length));
    Collections.addAll(localArrayList, paramVarArgs);
    return localArrayList;
  }
  
  public static List k(List paramList, g paramg)
  {
    if ((paramList instanceof RandomAccess)) {
      paramList = new a(paramList, paramg);
    } else {
      paramList = new b(paramList, paramg);
    }
    return paramList;
  }
  
  public static class a
    extends AbstractList
    implements RandomAccess, Serializable
  {
    private static final long serialVersionUID = 0L;
    public final List o;
    public final g p;
    
    public a(List paramList, g paramg)
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
  
  public static class b
    extends AbstractSequentialList
    implements Serializable
  {
    private static final long serialVersionUID = 0L;
    public final List o;
    public final g p;
    
    public b(List paramList, g paramg)
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
}

/* Location:
 * Qualified Name:     X2.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
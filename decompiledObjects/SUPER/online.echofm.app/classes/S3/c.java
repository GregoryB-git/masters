package S3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public abstract class c
  implements Iterable
{
  public abstract c D(Object paramObject);
  
  public abstract Iterator P();
  
  public abstract boolean a(Object paramObject);
  
  public abstract Object d(Object paramObject);
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof c)) {
      return false;
    }
    Object localObject = (c)paramObject;
    if (!f().equals(((c)localObject).f())) {
      return false;
    }
    if (size() != ((c)localObject).size()) {
      return false;
    }
    paramObject = iterator();
    localObject = ((c)localObject).iterator();
    while (((Iterator)paramObject).hasNext()) {
      if (!((Map.Entry)((Iterator)paramObject).next()).equals(((Iterator)localObject).next())) {
        return false;
      }
    }
    return true;
  }
  
  public abstract Comparator f();
  
  public abstract Object g();
  
  public int hashCode()
  {
    int i = f().hashCode();
    Iterator localIterator = iterator();
    while (localIterator.hasNext()) {
      i = i * 31 + ((Map.Entry)localIterator.next()).hashCode();
    }
    return i;
  }
  
  public abstract Object i();
  
  public abstract boolean isEmpty();
  
  public abstract Iterator iterator();
  
  public abstract Object k(Object paramObject);
  
  public abstract void q(h.b paramb);
  
  public abstract c s(Object paramObject1, Object paramObject2);
  
  public abstract int size();
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append("{");
    Iterator localIterator = iterator();
    int i = 1;
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (i != 0) {
        i = 0;
      } else {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append("(");
      localStringBuilder.append(localEntry.getKey());
      localStringBuilder.append("=>");
      localStringBuilder.append(localEntry.getValue());
      localStringBuilder.append(")");
    }
    localStringBuilder.append("};");
    return localStringBuilder.toString();
  }
  
  public static abstract class a
  {
    public static final a a = new b();
    
    public static c b(List paramList, Map paramMap, a parama, Comparator paramComparator)
    {
      if (paramList.size() < 25) {
        return a.U(paramList, paramMap, parama, paramComparator);
      }
      return k.M(paramList, paramMap, parama, paramComparator);
    }
    
    public static c c(Comparator paramComparator)
    {
      return new a(paramComparator);
    }
    
    public static c d(Map paramMap, Comparator paramComparator)
    {
      if (paramMap.size() < 25) {
        return a.X(paramMap, paramComparator);
      }
      return k.S(paramMap, paramComparator);
    }
    
    public static a e()
    {
      return a;
    }
    
    public static abstract interface a
    {
      public abstract Object a(Object paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     S3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
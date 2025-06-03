package t8;

import e0.e;
import j9.g;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class c<K, V>
  implements Iterable<Map.Entry<K, V>>
{
  public abstract boolean a(K paramK);
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof c)) {
      return false;
    }
    Object localObject = (c)paramObject;
    if (!i().equals(((c)localObject).i())) {
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
  
  public abstract V h(K paramK);
  
  public final int hashCode()
  {
    int i = i().hashCode();
    Iterator localIterator = iterator();
    while (localIterator.hasNext()) {
      i = i * 31 + ((Map.Entry)localIterator.next()).hashCode();
    }
    return i;
  }
  
  public abstract Comparator<K> i();
  
  public abstract boolean isEmpty();
  
  public abstract Iterator<Map.Entry<K, V>> iterator();
  
  public abstract K k();
  
  public abstract K l();
  
  public abstract int m(g paramg);
  
  public abstract c<K, V> n(K paramK, V paramV);
  
  public abstract Iterator<Map.Entry<K, V>> o(K paramK);
  
  public abstract c<K, V> p(K paramK);
  
  public abstract int size();
  
  public final String toString()
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
  
  public static final class a
  {
    public static final e a = new e(24);
    
    public static abstract interface a<C, D> {}
  }
}

/* Location:
 * Qualified Name:     t8.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
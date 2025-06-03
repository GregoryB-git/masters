package j9;

import java.util.Iterator;
import t8.c;
import t8.e;
import t8.e.a;

public final class j
  implements Iterable<g>
{
  public final c<i, g> a;
  public final e<g> b;
  
  public j(c<i, g> paramc, e<g> parame)
  {
    a = paramc;
    b = parame;
  }
  
  public final j a(g paramg)
  {
    j localj = h(paramg.getKey());
    return new j(a.n(paramg.getKey(), paramg), b.a(paramg));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (j.class == paramObject.getClass()))
    {
      Object localObject = (j)paramObject;
      if (size() != ((j)localObject).size()) {
        return false;
      }
      paramObject = iterator();
      localObject = ((j)localObject).iterator();
      e.a locala;
      do
      {
        locala = (e.a)paramObject;
        if (!locala.hasNext()) {
          break;
        }
      } while (((g)locala.next()).equals((g)((e.a)localObject).next()));
      return false;
      return true;
    }
    return false;
  }
  
  public final j h(i parami)
  {
    g localg = (g)a.h(parami);
    if (localg == null) {
      return this;
    }
    return new j(a.p(parami), b.i(localg));
  }
  
  public final int hashCode()
  {
    Iterator localIterator = iterator();
    Object localObject;
    int j;
    for (int i = 0;; i = ((g)localObject).getData().hashCode() + (j + i * 31) * 31)
    {
      localObject = (e.a)localIterator;
      if (!((e.a)localObject).hasNext()) {
        break;
      }
      localObject = (g)((e.a)localObject).next();
      j = ((g)localObject).getKey().hashCode();
    }
    return i;
  }
  
  public final Iterator<g> iterator()
  {
    return b.iterator();
  }
  
  public final int size()
  {
    return a.size();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("[");
    Iterator localIterator = iterator();
    int i = 1;
    for (;;)
    {
      Object localObject = (e.a)localIterator;
      if (!((e.a)localObject).hasNext()) {
        break;
      }
      localObject = (g)((e.a)localObject).next();
      if (i != 0) {
        i = 0;
      } else {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(localObject);
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     j9.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
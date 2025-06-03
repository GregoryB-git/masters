package t;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

public final class a$d
  implements Iterator, Map.Entry
{
  public int o;
  public int p;
  public boolean q;
  
  public a$d(a parama)
  {
    o = (q - 1);
    p = -1;
  }
  
  public Map.Entry b()
  {
    if (hasNext())
    {
      p += 1;
      q = true;
      return this;
    }
    throw new NoSuchElementException();
  }
  
  public boolean equals(Object paramObject)
  {
    if (q)
    {
      boolean bool1 = paramObject instanceof Map.Entry;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (Map.Entry)paramObject;
      bool1 = bool2;
      if (d.c(((Map.Entry)paramObject).getKey(), r.i(p)))
      {
        bool1 = bool2;
        if (d.c(((Map.Entry)paramObject).getValue(), r.l(p))) {
          bool1 = true;
        }
      }
      return bool1;
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public Object getKey()
  {
    if (q) {
      return r.i(p);
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public Object getValue()
  {
    if (q) {
      return r.l(p);
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public boolean hasNext()
  {
    boolean bool;
    if (p < o) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    if (q)
    {
      Object localObject1 = r.i(p);
      Object localObject2 = r.l(p);
      int i = 0;
      int j;
      if (localObject1 == null) {
        j = 0;
      } else {
        j = localObject1.hashCode();
      }
      if (localObject2 != null) {
        i = localObject2.hashCode();
      }
      return j ^ i;
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public void remove()
  {
    if (q)
    {
      r.j(p);
      p -= 1;
      o -= 1;
      q = false;
      return;
    }
    throw new IllegalStateException();
  }
  
  public Object setValue(Object paramObject)
  {
    if (q) {
      return r.k(p, paramObject);
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getKey());
    localStringBuilder.append("=");
    localStringBuilder.append(getValue());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     t.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
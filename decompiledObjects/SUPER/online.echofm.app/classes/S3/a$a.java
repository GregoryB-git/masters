package S3;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Iterator;
import java.util.Map.Entry;

public class a$a
  implements Iterator
{
  public int o;
  
  public a$a(a parama, int paramInt, boolean paramBoolean)
  {
    o = paramInt;
  }
  
  public Map.Entry b()
  {
    Object localObject1 = a.M(r)[o];
    Object localObject2 = a.S(r);
    int i = o;
    localObject2 = localObject2[i];
    if (q) {
      i--;
    } else {
      i++;
    }
    o = i;
    return new AbstractMap.SimpleImmutableEntry(localObject1, localObject2);
  }
  
  public boolean hasNext()
  {
    boolean bool1 = q;
    boolean bool2 = false;
    if (bool1)
    {
      if (o < 0) {}
    }
    else {
      while (o < a.M(r).length)
      {
        bool2 = true;
        break;
      }
    }
    return bool2;
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
  }
}

/* Location:
 * Qualified Name:     S3.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
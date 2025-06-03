package t8;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Iterator;
import java.util.Map.Entry;

public final class a
  implements Iterator<Map.Entry<Object, Object>>
{
  public int a;
  
  public a(b paramb, int paramInt)
  {
    a = paramInt;
  }
  
  public final boolean hasNext()
  {
    boolean bool1 = b;
    boolean bool2 = true;
    if (bool1 ? a < 0 : a >= c.a.length) {
      bool2 = false;
    }
    return bool2;
  }
  
  public final Object next()
  {
    Object localObject1 = c;
    Object localObject2 = a;
    int i = a;
    localObject2 = localObject2[i];
    localObject1 = b[i];
    if (b) {
      i--;
    } else {
      i++;
    }
    a = i;
    return new AbstractMap.SimpleImmutableEntry(localObject2, localObject1);
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
  }
}

/* Location:
 * Qualified Name:     t8.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
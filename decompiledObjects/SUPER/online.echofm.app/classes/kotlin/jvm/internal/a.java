package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a
  implements Iterator, h6.a
{
  public final Object[] o;
  public int p;
  
  public a(Object[] paramArrayOfObject)
  {
    o = paramArrayOfObject;
  }
  
  public boolean hasNext()
  {
    boolean bool;
    if (p < o.length) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Object next()
  {
    try
    {
      Object localObject = o;
      int i = p;
      p = (i + 1);
      localObject = localObject[i];
      return localObject;
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      p -= 1;
      throw new NoSuchElementException(localArrayIndexOutOfBoundsException.getMessage());
    }
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}

/* Location:
 * Qualified Name:     kotlin.jvm.internal.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
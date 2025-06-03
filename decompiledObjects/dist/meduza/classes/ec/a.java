package ec;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a<T>
  implements Iterator<T>
{
  public final T[] a;
  public int b;
  
  public a(T[] paramArrayOfT)
  {
    a = paramArrayOfT;
  }
  
  public final boolean hasNext()
  {
    boolean bool;
    if (b < a.length) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final T next()
  {
    try
    {
      Object localObject = a;
      int i = b;
      b = (i + 1);
      localObject = localObject[i];
      return (T)localObject;
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      b -= 1;
      throw new NoSuchElementException(localArrayIndexOutOfBoundsException.getMessage());
    }
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}

/* Location:
 * Qualified Name:     ec.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
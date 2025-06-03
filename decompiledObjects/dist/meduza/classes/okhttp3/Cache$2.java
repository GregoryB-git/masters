package okhttp3;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Cache$2
  implements Iterator<String>
{
  public boolean a;
  
  public final boolean hasNext()
  {
    a = false;
    throw null;
  }
  
  public final Object next()
  {
    if (hasNext())
    {
      a = true;
      return null;
    }
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    if (!a) {
      throw new IllegalStateException("remove() before next()");
    }
    throw null;
  }
}

/* Location:
 * Qualified Name:     okhttp3.Cache.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
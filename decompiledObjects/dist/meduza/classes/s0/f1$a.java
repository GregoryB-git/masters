package s0;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class f1$a
{
  public static final a a = new a();
  public static final b b = new b();
  
  public static final class a
    implements Iterator<Object>
  {
    public final boolean hasNext()
    {
      return false;
    }
    
    public final Object next()
    {
      throw new NoSuchElementException();
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException();
    }
  }
  
  public static final class b
    implements Iterable<Object>
  {
    public final Iterator<Object> iterator()
    {
      return f1.a.a;
    }
  }
}

/* Location:
 * Qualified Name:     s0.f1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
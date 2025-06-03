package o7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import x6.b;

public final class b0
{
  public static Object a(Iterator paramIterator, String paramString)
  {
    if (paramIterator.hasNext()) {
      paramString = paramIterator.next();
    }
    return paramString;
  }
  
  public static final class a<T>
    extends a<T>
  {
    public static final a e = new a(new Object[0]);
    public final T[] c;
    public final int d;
    
    public a(Object[] paramArrayOfObject)
    {
      super(0);
      c = paramArrayOfObject;
      d = 0;
    }
    
    public final T b(int paramInt)
    {
      return (T)c[(d + paramInt)];
    }
  }
  
  public static enum b
    implements Iterator<Object>
  {
    static
    {
      b localb = new b();
      a = localb;
      b = new b[] { localb };
    }
    
    public b() {}
    
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
      b.I(false, "no calls to next() since the last call to remove()");
    }
  }
}

/* Location:
 * Qualified Name:     o7.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
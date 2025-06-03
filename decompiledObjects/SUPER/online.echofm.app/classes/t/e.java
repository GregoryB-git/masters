package t;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class e
  implements Iterator
{
  public int o;
  public int p;
  public boolean q;
  
  public e(int paramInt)
  {
    o = paramInt;
  }
  
  public abstract Object b(int paramInt);
  
  public abstract void d(int paramInt);
  
  public final boolean hasNext()
  {
    boolean bool;
    if (p < o) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Object next()
  {
    if (hasNext())
    {
      Object localObject = b(p);
      p += 1;
      q = true;
      return localObject;
    }
    throw new NoSuchElementException();
  }
  
  public void remove()
  {
    if (q)
    {
      int i = p - 1;
      p = i;
      d(i);
      o -= 1;
      q = false;
      return;
    }
    throw new IllegalStateException();
  }
}

/* Location:
 * Qualified Name:     t.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
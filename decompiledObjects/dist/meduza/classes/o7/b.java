package o7;

import java.util.NoSuchElementException;
import q0.g;

public abstract class b<T>
  extends x0<T>
{
  public int a = 2;
  public T b;
  
  public abstract T a();
  
  public final boolean hasNext()
  {
    int i = a;
    boolean bool1 = true;
    boolean bool2;
    if (i != 4) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    x6.b.J(bool2);
    i = g.c(a);
    if (i != 0)
    {
      if (i != 2)
      {
        a = 4;
        b = a();
        if (a != 3)
        {
          a = 1;
          bool2 = bool1;
        }
        else
        {
          bool2 = false;
        }
        return bool2;
      }
      return false;
    }
    return true;
  }
  
  public final T next()
  {
    if (hasNext())
    {
      a = 2;
      Object localObject = b;
      b = null;
      return (T)localObject;
    }
    throw new NoSuchElementException();
  }
}

/* Location:
 * Qualified Name:     o7.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
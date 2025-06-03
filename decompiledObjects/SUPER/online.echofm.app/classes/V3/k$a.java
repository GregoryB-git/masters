package V3;

import d4.b;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class k$a
  implements Iterator
{
  public int o;
  
  public k$a(k paramk)
  {
    o = k.s(paramk);
  }
  
  public b b()
  {
    if (hasNext())
    {
      Object localObject = k.M(p);
      int i = o;
      localObject = localObject[i];
      o = (i + 1);
      return (b)localObject;
    }
    throw new NoSuchElementException("No more elements.");
  }
  
  public boolean hasNext()
  {
    boolean bool;
    if (o < k.D(p)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException("Can't remove component from immutable Path!");
  }
}

/* Location:
 * Qualified Name:     V3.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
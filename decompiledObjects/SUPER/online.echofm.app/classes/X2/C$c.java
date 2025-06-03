package X2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public enum C$c
  implements Iterator
{
  public boolean hasNext()
  {
    return false;
  }
  
  public Object next()
  {
    throw new NoSuchElementException();
  }
  
  public void remove()
  {
    i.c(false);
  }
}

/* Location:
 * Qualified Name:     X2.C.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package o7;

import java.util.NoSuchElementException;

public final class a0
  extends x0<Object>
{
  public boolean a;
  
  public a0(Object paramObject) {}
  
  public final boolean hasNext()
  {
    return a ^ true;
  }
  
  public final Object next()
  {
    if (!a)
    {
      a = true;
      return b;
    }
    throw new NoSuchElementException();
  }
}

/* Location:
 * Qualified Name:     o7.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
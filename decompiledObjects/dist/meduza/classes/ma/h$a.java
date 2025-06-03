package ma;

import java.util.NoSuchElementException;

public final class h$a
  extends h.b
{
  public int a = 0;
  public final int b;
  
  public h$a(h paramh)
  {
    b = paramh.size();
  }
  
  public final byte f()
  {
    int i = a;
    if (i < b)
    {
      a = (i + 1);
      return c.p(i);
    }
    throw new NoSuchElementException();
  }
  
  public final boolean hasNext()
  {
    boolean bool;
    if (a < b) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     ma.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package ic;

import ec.i;
import java.util.NoSuchElementException;
import sb.l;

public final class b
  extends l
{
  public final int a;
  public final int b;
  public boolean c;
  public int d;
  
  public b(char paramChar1, char paramChar2, int paramInt)
  {
    a = paramInt;
    b = paramChar2;
    boolean bool = true;
    if (paramInt > 0 ? i.f(paramChar1, paramChar2) > 0 : i.f(paramChar1, paramChar2) < 0) {
      bool = false;
    }
    c = bool;
    if (!bool) {
      paramChar1 = paramChar2;
    }
    d = paramChar1;
  }
  
  public final char a()
  {
    int i = d;
    if (i == b)
    {
      if (c) {
        c = false;
      } else {
        throw new NoSuchElementException();
      }
    }
    else {
      d = (a + i);
    }
    return (char)i;
  }
  
  public final boolean hasNext()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     ic.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
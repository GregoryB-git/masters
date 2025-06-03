package l6;

import W5.B;
import java.util.NoSuchElementException;

public final class b
  extends B
{
  public final int o;
  public final int p;
  public boolean q;
  public int r;
  
  public b(int paramInt1, int paramInt2, int paramInt3)
  {
    o = paramInt3;
    p = paramInt2;
    boolean bool = true;
    if (paramInt3 > 0)
    {
      if (paramInt1 <= paramInt2) {}
    }
    else {
      while (paramInt1 < paramInt2)
      {
        bool = false;
        break;
      }
    }
    q = bool;
    if (!bool) {
      paramInt1 = paramInt2;
    }
    r = paramInt1;
  }
  
  public int b()
  {
    int i = r;
    if (i == p)
    {
      if (q) {
        q = false;
      } else {
        throw new NoSuchElementException();
      }
    }
    else {
      r = (o + i);
    }
    return i;
  }
  
  public boolean hasNext()
  {
    return q;
  }
}

/* Location:
 * Qualified Name:     l6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
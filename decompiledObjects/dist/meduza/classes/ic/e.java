package ic;

import java.util.NoSuchElementException;
import sb.w;

public final class e
  extends w
{
  public final int a;
  public final int b;
  public boolean c;
  public int d;
  
  public e(int paramInt1, int paramInt2, int paramInt3)
  {
    a = paramInt3;
    b = paramInt2;
    boolean bool = true;
    if (paramInt3 > 0 ? paramInt1 > paramInt2 : paramInt1 < paramInt2) {
      bool = false;
    }
    c = bool;
    if (!bool) {
      paramInt1 = paramInt2;
    }
    d = paramInt1;
  }
  
  public final boolean hasNext()
  {
    return c;
  }
  
  public final int nextInt()
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
    return i;
  }
}

/* Location:
 * Qualified Name:     ic.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
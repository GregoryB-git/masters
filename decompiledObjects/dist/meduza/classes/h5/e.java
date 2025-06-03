package h5;

import java.util.ArrayDeque;
import z3.h;
import z3.j;

public final class e
  extends l
{
  public e(f paramf) {}
  
  public final void o()
  {
    f localf = e;
    Object localObject1 = b;
    int i = 0;
    try
    {
      a = 0;
      c = null;
      h[] arrayOfh = f;
      int j = h;
      h = (j + 1);
      arrayOfh[j] = this;
      j = i;
      if (!c.isEmpty())
      {
        j = i;
        if (h > 0) {
          j = 1;
        }
      }
      if (j != 0) {
        b.notify();
      }
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     h5.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
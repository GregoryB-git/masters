package A2;

import android.content.Context;
import android.util.SparseIntArray;
import x2.k;
import y2.a.f;

public final class E
{
  public final SparseIntArray a = new SparseIntArray();
  public k b;
  
  public E(k paramk)
  {
    n.i(paramk);
    b = paramk;
  }
  
  public final int a(Context paramContext, int paramInt)
  {
    return a.get(paramInt, -1);
  }
  
  public final int b(Context paramContext, a.f paramf)
  {
    n.i(paramContext);
    n.i(paramf);
    boolean bool = paramf.g();
    int i = 0;
    if (!bool) {
      return 0;
    }
    int j = paramf.h();
    int k = a(paramContext, j);
    if (k == -1)
    {
      for (k = 0; k < a.size(); k++)
      {
        int m = a.keyAt(k);
        if ((m > j) && (a.get(m) == 0))
        {
          k = i;
          break label113;
        }
      }
      k = -1;
      label113:
      if (k == -1) {
        k = b.h(paramContext, j);
      }
      a.put(j, k);
    }
    return k;
  }
  
  public final void c()
  {
    a.clear();
  }
}

/* Location:
 * Qualified Name:     A2.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
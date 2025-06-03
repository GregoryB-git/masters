package c1;

import F0.M;
import F0.T;
import F0.t;
import android.util.SparseArray;

public final class v
  implements t
{
  public final t o;
  public final t.a p;
  public final SparseArray q;
  
  public v(t paramt, t.a parama)
  {
    o = paramt;
    p = parama;
    q = new SparseArray();
  }
  
  public T a(int paramInt1, int paramInt2)
  {
    if (paramInt2 != 3) {
      return o.a(paramInt1, paramInt2);
    }
    x localx = (x)q.get(paramInt1);
    if (localx != null) {
      return localx;
    }
    localx = new x(o.a(paramInt1, paramInt2), p);
    q.put(paramInt1, localx);
    return localx;
  }
  
  public void b()
  {
    for (int i = 0; i < q.size(); i++) {
      ((x)q.valueAt(i)).k();
    }
  }
  
  public void e(M paramM)
  {
    o.e(paramM);
  }
  
  public void j()
  {
    o.j();
  }
}

/* Location:
 * Qualified Name:     c1.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
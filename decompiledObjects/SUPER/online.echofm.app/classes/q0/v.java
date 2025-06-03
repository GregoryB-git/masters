package q0;

import android.util.SparseArray;
import g0.E;

public final class v
{
  public final SparseArray a = new SparseArray();
  
  public E a(int paramInt)
  {
    E localE1 = (E)a.get(paramInt);
    E localE2 = localE1;
    if (localE1 == null)
    {
      localE2 = new E(9223372036854775806L);
      a.put(paramInt, localE2);
    }
    return localE2;
  }
  
  public void b()
  {
    a.clear();
  }
}

/* Location:
 * Qualified Name:     q0.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
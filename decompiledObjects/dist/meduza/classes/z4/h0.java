package z4;

import android.util.SparseArray;
import r3.j;
import v5.e;
import x6.b;

public final class h0<V>
{
  public int a;
  public final SparseArray<V> b = new SparseArray();
  public final e<V> c;
  
  public h0(j paramj)
  {
    c = paramj;
    a = -1;
  }
  
  public final void a(int paramInt, b0.b paramb)
  {
    int i = a;
    boolean bool1 = false;
    boolean bool2;
    if (i == -1)
    {
      if (b.size() == 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      b.H(bool2);
      a = 0;
    }
    if (b.size() > 0)
    {
      Object localObject = b;
      i = ((SparseArray)localObject).keyAt(((SparseArray)localObject).size() - 1);
      bool2 = bool1;
      if (paramInt >= i) {
        bool2 = true;
      }
      b.q(bool2);
      if (i == paramInt)
      {
        localObject = c;
        SparseArray localSparseArray = b;
        ((e)localObject).accept(localSparseArray.valueAt(localSparseArray.size() - 1));
      }
    }
    b.append(paramInt, paramb);
  }
  
  public final V b(int paramInt)
  {
    if (a == -1) {}
    for (int i = 0;; i = a - 1)
    {
      a = i;
      i = a;
      if ((i <= 0) || (paramInt >= b.keyAt(i))) {
        break;
      }
    }
    while ((a < b.size() - 1) && (paramInt >= b.keyAt(a + 1))) {
      a += 1;
    }
    return (V)b.valueAt(a);
  }
}

/* Location:
 * Qualified Name:     z4.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package x0;

import android.util.SparseArray;
import g0.a;
import g0.g;

public final class W
{
  public int a;
  public final SparseArray b = new SparseArray();
  public final g c;
  
  public W(g paramg)
  {
    c = paramg;
    a = -1;
  }
  
  public void a(int paramInt, Object paramObject)
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
      a.f(bool2);
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
      a.a(bool2);
      if (i == paramInt)
      {
        localObject = c;
        SparseArray localSparseArray = b;
        ((g)localObject).accept(localSparseArray.valueAt(localSparseArray.size() - 1));
      }
    }
    b.append(paramInt, paramObject);
  }
  
  public void b()
  {
    for (int i = 0; i < b.size(); i++) {
      c.accept(b.valueAt(i));
    }
    a = -1;
    b.clear();
  }
  
  public void c(int paramInt)
  {
    for (int i = b.size() - 1; (i >= 0) && (paramInt < b.keyAt(i)); i--)
    {
      c.accept(b.valueAt(i));
      b.removeAt(i);
    }
    if (b.size() > 0) {
      paramInt = Math.min(a, b.size() - 1);
    } else {
      paramInt = -1;
    }
    a = paramInt;
  }
  
  public void d(int paramInt)
  {
    int j;
    for (int i = 0; i < b.size() - 1; i = j)
    {
      SparseArray localSparseArray = b;
      j = i + 1;
      if (paramInt < localSparseArray.keyAt(j)) {
        break;
      }
      c.accept(b.valueAt(i));
      b.removeAt(i);
      i = a;
      if (i > 0) {
        a = (i - 1);
      }
    }
  }
  
  public Object e(int paramInt)
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
    return b.valueAt(a);
  }
  
  public Object f()
  {
    SparseArray localSparseArray = b;
    return localSparseArray.valueAt(localSparseArray.size() - 1);
  }
  
  public boolean g()
  {
    boolean bool;
    if (b.size() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     x0.W
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
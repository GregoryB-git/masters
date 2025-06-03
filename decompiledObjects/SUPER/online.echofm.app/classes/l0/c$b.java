package l0;

import android.util.SparseArray;
import d0.p;
import g0.a;

public final class c$b
{
  public final p a;
  public final SparseArray b;
  
  public c$b(p paramp, SparseArray paramSparseArray)
  {
    a = paramp;
    SparseArray localSparseArray = new SparseArray(paramp.c());
    for (int i = 0; i < paramp.c(); i++)
    {
      int j = paramp.b(i);
      localSparseArray.append(j, (c.a)a.e((c.a)paramSparseArray.get(j)));
    }
    b = localSparseArray;
  }
  
  public boolean a(int paramInt)
  {
    return a.a(paramInt);
  }
  
  public int b(int paramInt)
  {
    return a.b(paramInt);
  }
  
  public c.a c(int paramInt)
  {
    return (c.a)a.e((c.a)b.get(paramInt));
  }
  
  public int d()
  {
    return a.c();
  }
}

/* Location:
 * Qualified Name:     l0.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
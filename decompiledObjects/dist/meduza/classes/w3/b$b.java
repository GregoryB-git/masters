package w3;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import v5.h;

public final class b$b
{
  public final h a;
  public final SparseArray<b.a> b;
  
  public b$b(h paramh, SparseArray<b.a> paramSparseArray)
  {
    a = paramh;
    SparseArray localSparseArray = new SparseArray(paramh.b());
    for (int i = 0; i < paramh.b(); i++)
    {
      int j = paramh.a(i);
      b.a locala = (b.a)paramSparseArray.get(j);
      locala.getClass();
      localSparseArray.append(j, locala);
    }
    b = localSparseArray;
  }
  
  public final boolean a(int paramInt)
  {
    return a.a.get(paramInt);
  }
}

/* Location:
 * Qualified Name:     w3.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
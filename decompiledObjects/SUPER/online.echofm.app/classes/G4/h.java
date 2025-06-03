package G4;

import android.util.SparseIntArray;

public abstract class h
{
  public static a a(SparseIntArray[] paramArrayOfSparseIntArray)
  {
    int i = 0;
    int j = 0;
    if (paramArrayOfSparseIntArray != null)
    {
      paramArrayOfSparseIntArray = paramArrayOfSparseIntArray[0];
      if (paramArrayOfSparseIntArray != null)
      {
        i = 0;
        k = i;
        int i2;
        for (m = k; j < paramArrayOfSparseIntArray.size(); m = i2)
        {
          int n = paramArrayOfSparseIntArray.keyAt(j);
          int i1 = paramArrayOfSparseIntArray.valueAt(j);
          i += i1;
          i2 = m;
          if (n > 700) {
            i2 = m + i1;
          }
          m = k;
          if (n > 16) {
            m = k + i1;
          }
          j++;
          k = m;
        }
        break label106;
      }
    }
    int k = 0;
    int m = k;
    label106:
    return new a(i, k, m);
  }
  
  public static class a
  {
    public int a;
    public int b;
    public int c;
    
    public a(int paramInt1, int paramInt2, int paramInt3)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramInt3;
    }
    
    public a a(a parama)
    {
      return new a(a - parama.d(), b - parama.c(), c - parama.b());
    }
    
    public int b()
    {
      return c;
    }
    
    public int c()
    {
      return b;
    }
    
    public int d()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     G4.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
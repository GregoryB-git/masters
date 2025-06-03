package z;

import java.util.List;

public final class f$a
{
  public final int[] a;
  public final float[] b;
  
  public f$a(int paramInt1, int paramInt2)
  {
    a = new int[] { paramInt1, paramInt2 };
    b = new float[] { 0.0F, 1.0F };
  }
  
  public f$a(int paramInt1, int paramInt2, int paramInt3)
  {
    a = new int[] { paramInt1, paramInt2, paramInt3 };
    b = new float[] { 0.0F, 0.5F, 1.0F };
  }
  
  public f$a(List paramList1, List paramList2)
  {
    int i = paramList1.size();
    a = new int[i];
    b = new float[i];
    for (int j = 0; j < i; j++)
    {
      a[j] = ((Integer)paramList1.get(j)).intValue();
      b[j] = ((Float)paramList2.get(j)).floatValue();
    }
  }
}

/* Location:
 * Qualified Name:     z.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package w;

import java.util.ArrayList;

public final class e
{
  public final int[] a;
  public final float[] b;
  
  public e(int paramInt1, int paramInt2)
  {
    a = new int[] { paramInt1, paramInt2 };
    b = new float[] { 0.0F, 1.0F };
  }
  
  public e(int paramInt1, int paramInt2, int paramInt3)
  {
    a = new int[] { paramInt1, paramInt2, paramInt3 };
    b = new float[] { 0.0F, 0.5F, 1.0F };
  }
  
  public e(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    int i = paramArrayList1.size();
    a = new int[i];
    b = new float[i];
    for (int j = 0; j < i; j++)
    {
      a[j] = ((Integer)paramArrayList1.get(j)).intValue();
      b[j] = ((Float)paramArrayList2.get(j)).floatValue();
    }
  }
}

/* Location:
 * Qualified Name:     w.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
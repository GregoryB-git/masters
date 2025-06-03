package y0;

import F0.T;
import F0.n;
import g0.o;
import x0.P;

public final class c
  implements f.b
{
  public final int[] a;
  public final P[] b;
  
  public c(int[] paramArrayOfInt, P[] paramArrayOfP)
  {
    a = paramArrayOfInt;
    b = paramArrayOfP;
  }
  
  public T a(int paramInt1, int paramInt2)
  {
    for (paramInt1 = 0;; paramInt1++)
    {
      localObject = a;
      if (paramInt1 >= localObject.length) {
        break;
      }
      if (paramInt2 == localObject[paramInt1]) {
        return b[paramInt1];
      }
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Unmatched track of type: ");
    ((StringBuilder)localObject).append(paramInt2);
    o.c("BaseMediaChunkOutput", ((StringBuilder)localObject).toString());
    return new n();
  }
  
  public int[] b()
  {
    int[] arrayOfInt = new int[b.length];
    for (int i = 0;; i++)
    {
      P[] arrayOfP = b;
      if (i >= arrayOfP.length) {
        break;
      }
      arrayOfInt[i] = arrayOfP[i].H();
    }
    return arrayOfInt;
  }
  
  public void c(long paramLong)
  {
    P[] arrayOfP = b;
    int i = arrayOfP.length;
    for (int j = 0; j < i; j++) {
      arrayOfP[j].b0(paramLong);
    }
  }
}

/* Location:
 * Qualified Name:     y0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
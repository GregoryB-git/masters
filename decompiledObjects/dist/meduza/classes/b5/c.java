package b5;

import c4.g;
import c4.v;
import v5.m;
import z4.b0;

public final class c
  implements f.a
{
  public final int[] a;
  public final b0[] b;
  
  public c(int[] paramArrayOfInt, b0[] paramArrayOfb0)
  {
    a = paramArrayOfInt;
    b = paramArrayOfb0;
  }
  
  public final v a(int paramInt)
  {
    for (int i = 0;; i++)
    {
      localObject = a;
      if (i >= localObject.length) {
        break;
      }
      if (paramInt == localObject[i]) {
        return b[i];
      }
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Unmatched track of type: ");
    ((StringBuilder)localObject).append(paramInt);
    m.c("BaseMediaChunkOutput", ((StringBuilder)localObject).toString());
    return new g();
  }
}

/* Location:
 * Qualified Name:     b5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
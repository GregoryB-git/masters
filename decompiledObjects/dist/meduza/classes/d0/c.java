package d0;

import c4.e;
import ec.i;
import v5.u;

public final class c
{
  public int a;
  public final Object b;
  
  public final Object a()
  {
    int i = a;
    if (i > 0)
    {
      i--;
      Object localObject = ((Object[])b)[i];
      i.c(localObject, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
      ((Object[])b)[i] = null;
      a -= 1;
      return localObject;
    }
    return null;
  }
  
  public final long b(e parame)
  {
    byte[] arrayOfByte = b).a;
    int i = 0;
    parame.c(arrayOfByte, 0, 1, false);
    int j = b).a[0] & 0xFF;
    if (j == 0) {
      return Long.MIN_VALUE;
    }
    int k = 128;
    for (int m = 0; (j & k) == 0; m++) {
      k >>= 1;
    }
    j &= k;
    parame.c(b).a, 1, m, false);
    k = i;
    for (i = j; k < m; i = (parame[k] & 0xFF) + (i << 8))
    {
      parame = b).a;
      k++;
    }
    a = (m + 1 + a);
    return i;
  }
  
  public final void c(Object paramObject)
  {
    i.e(paramObject, "instance");
    int i = a;
    int j = 0;
    int m;
    for (int k = 0;; k++)
    {
      m = j;
      if (k >= i) {
        break;
      }
      if (((Object[])b)[k] == paramObject)
      {
        m = 1;
        break;
      }
    }
    if ((m ^ 0x1) != 0)
    {
      k = a;
      Object[] arrayOfObject = (Object[])b;
      if (k < arrayOfObject.length)
      {
        arrayOfObject[k] = paramObject;
        a = (k + 1);
      }
      return;
    }
    throw new IllegalStateException("Already in the pool!".toString());
  }
}

/* Location:
 * Qualified Name:     d0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
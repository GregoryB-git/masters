package u6;

import X5.g;
import kotlin.jvm.internal.Intrinsics;
import p6.K0;

public final class N
{
  public final g a;
  public final Object[] b;
  public final K0[] c;
  public int d;
  
  public N(g paramg, int paramInt)
  {
    a = paramg;
    b = new Object[paramInt];
    c = new K0[paramInt];
  }
  
  public final void a(K0 paramK0, Object paramObject)
  {
    Object[] arrayOfObject = b;
    int i = d;
    arrayOfObject[i] = paramObject;
    paramObject = c;
    d = (i + 1);
    Intrinsics.c(paramK0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    paramObject[i] = paramK0;
  }
  
  public final void b(g paramg)
  {
    int i = c.length - 1;
    if (i >= 0) {
      for (;;)
      {
        int j = i - 1;
        K0 localK0 = c[i];
        Intrinsics.b(localK0);
        localK0.D(paramg, b[i]);
        if (j < 0) {
          break;
        }
        i = j;
      }
    }
  }
}

/* Location:
 * Qualified Name:     u6.N
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
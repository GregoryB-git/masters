package z4;

import l3.l;
import t5.d0;
import t5.d0.c;
import t5.u;
import z3.g;

public final class y$c
  implements c0
{
  public final int a;
  
  public y$c(y paramy, int paramInt)
  {
    a = paramInt;
  }
  
  public final void a()
  {
    y localy = b;
    int i = a;
    A[i].s();
    Object localObject1 = s;
    Object localObject2 = d;
    i = J;
    int j = ((u)localObject2).b(i);
    localObject2 = c;
    if (localObject2 == null)
    {
      localObject2 = b;
      if (localObject2 != null)
      {
        i = j;
        if (j == Integer.MIN_VALUE) {
          i = a;
        }
        localObject1 = e;
        if ((localObject1 != null) && (f > i)) {
          throw ((Throwable)localObject1);
        }
      }
      return;
    }
    throw ((Throwable)localObject2);
  }
  
  public final boolean b()
  {
    y localy = b;
    int i = a;
    boolean bool;
    if ((!localy.D()) && (A[i].q(S))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int m(long paramLong)
  {
    y localy = b;
    int i = a;
    int j;
    if (localy.D())
    {
      j = 0;
    }
    else
    {
      localy.z(i);
      b0 localb0 = A[i];
      int k = localb0.o(paramLong, S);
      localb0.y(k);
      j = k;
      if (k == 0)
      {
        localy.A(i);
        j = k;
      }
    }
    return j;
  }
  
  public final int r(l paraml, g paramg, int paramInt)
  {
    y localy = b;
    int i = a;
    boolean bool = localy.D();
    int j = -3;
    if (bool)
    {
      paramInt = j;
    }
    else
    {
      localy.z(i);
      paramInt = A[i].u(paraml, paramg, paramInt, S);
      if (paramInt == -3) {
        localy.A(i);
      }
    }
    return paramInt;
  }
}

/* Location:
 * Qualified Name:     z4.y.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
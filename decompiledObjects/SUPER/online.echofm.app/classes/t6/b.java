package t6;

import V5.n;
import V5.n.a;
import V5.t;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public abstract class b
{
  public d[] o;
  public int p;
  public int q;
  
  public final d b()
  {
    Object localObject1;
    try
    {
      localObject1 = o;
      if (localObject1 == null)
      {
        d[] arrayOfd = d(2);
        o = arrayOfd;
      }
    }
    finally
    {
      break label147;
    }
    Object localObject3 = localObject1;
    if (p >= localObject1.length)
    {
      localObject3 = Arrays.copyOf((Object[])localObject1, localObject1.length * 2);
      Intrinsics.checkNotNullExpressionValue(localObject3, "copyOf(this, newSize)");
      o = ((d[])localObject3);
      localObject3 = (d[])localObject3;
    }
    int i = q;
    int j;
    do
    {
      Object localObject4 = localObject3[i];
      localObject1 = localObject4;
      if (localObject4 == null)
      {
        localObject1 = c();
        localObject3[i] = localObject1;
      }
      i++;
      j = i;
      if (i >= localObject3.length) {
        j = 0;
      }
      Intrinsics.c(localObject1, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
      i = j;
    } while (!((d)localObject1).a(this));
    q = j;
    p += 1;
    return (d)localObject1;
    label147:
    throw ((Throwable)localObject3);
  }
  
  public abstract d c();
  
  public abstract d[] d(int paramInt);
  
  public final void e(d paramd)
  {
    int j;
    try
    {
      i = p - 1;
      p = i;
      j = 0;
      if (i == 0) {
        q = 0;
      }
    }
    finally
    {
      break label89;
    }
    Intrinsics.c(paramd, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
    X5.d[] arrayOfd = paramd.b(this);
    int i = arrayOfd.length;
    while (j < i)
    {
      paramd = arrayOfd[j];
      if (paramd != null)
      {
        n.a locala = n.o;
        paramd.resumeWith(n.a(t.a));
      }
      j++;
    }
    return;
    label89:
    throw paramd;
  }
  
  public final d[] f()
  {
    return o;
  }
}

/* Location:
 * Qualified Name:     t6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
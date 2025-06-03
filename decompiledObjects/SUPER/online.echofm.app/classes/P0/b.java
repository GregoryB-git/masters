package P0;

import O0.c;
import W2.e;
import d0.x;
import g0.y;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class b
  extends c
{
  public static x c(y paramy)
  {
    paramy.r(12);
    int i = paramy.h(12);
    int j = paramy.d();
    paramy.r(44);
    paramy.s(paramy.h(12));
    paramy.r(16);
    ArrayList localArrayList = new ArrayList();
    Object localObject1;
    for (;;)
    {
      int k = paramy.d();
      localObject1 = null;
      Object localObject2 = null;
      if (k >= j + i - 4) {
        break;
      }
      paramy.r(48);
      int m = paramy.h(8);
      paramy.r(4);
      k = paramy.h(12);
      int n = paramy.d() + k;
      Object localObject3;
      Object localObject4;
      for (localObject1 = null; paramy.d() < n; localObject1 = localObject4)
      {
        k = paramy.h(8);
        int i1 = paramy.h(8);
        int i2 = paramy.d() + i1;
        if (k == 2)
        {
          k = paramy.h(16);
          paramy.r(8);
          localObject3 = localObject2;
          localObject4 = localObject1;
          if (k == 3)
          {
            localObject3 = localObject2;
            localObject4 = localObject1;
            if (paramy.d() < i2)
            {
              localObject3 = paramy.l(paramy.h(8), e.a);
              i1 = paramy.h(8);
              for (k = 0;; k++)
              {
                localObject2 = localObject3;
                if (k >= i1) {
                  break;
                }
                paramy.s(paramy.h(8));
              }
            }
          }
        }
        else
        {
          localObject3 = localObject2;
          localObject4 = localObject1;
          if (k == 21)
          {
            localObject4 = paramy.l(i1, e.a);
            localObject3 = localObject2;
          }
        }
        paramy.p(i2 * 8);
        localObject2 = localObject3;
      }
      paramy.p(n * 8);
      if ((localObject2 != null) && (localObject1 != null))
      {
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append((String)localObject2);
        ((StringBuilder)localObject3).append((String)localObject1);
        localArrayList.add(new a(m, ((StringBuilder)localObject3).toString()));
      }
    }
    if (localArrayList.isEmpty()) {
      paramy = (y)localObject1;
    } else {
      paramy = new x(localArrayList);
    }
    return paramy;
  }
  
  public x b(O0.b paramb, ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer.get() == 116) {
      paramb = c(new y(paramByteBuffer.array(), paramByteBuffer.limit()));
    } else {
      paramb = null;
    }
    return paramb;
  }
}

/* Location:
 * Qualified Name:     P0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
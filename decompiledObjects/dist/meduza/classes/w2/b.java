package w2;

import androidx.work.impl.foreground.a;
import b.a0;
import java.util.HashMap;
import p2.k0;
import p2.q0;
import p2.r;
import t2.h;
import x2.s;

public final class b
  implements Runnable
{
  public final void run()
  {
    Object localObject1 = b.a.f;
    Object localObject2 = a;
    synchronized (k)
    {
      localObject2 = ((r)localObject1).c((String)localObject2);
      if (localObject2 != null) {
        localObject2 = c;
      } else {
        localObject2 = null;
      }
      if ((localObject2 != null) && (((s)localObject2).b())) {
        synchronized (b.c)
        {
          b.f.put(a0.s((s)localObject2), localObject2);
          localObject1 = b;
          localObject1 = h.a(p, (s)localObject2, b.a(), b);
          b.o.put(a0.s((s)localObject2), localObject1);
        }
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     w2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
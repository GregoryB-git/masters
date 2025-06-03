package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import ec.i;
import i2.k;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import w.g;

public final class b$a
  implements a.a
{
  public final void a(Activity paramActivity, k paramk)
  {
    i.e(paramActivity, "activity");
    Iterator localIterator = a.b.iterator();
    while (localIterator.hasNext())
    {
      b.b localb = (b.b)localIterator.next();
      if (i.a(a, paramActivity))
      {
        d = paramk;
        b.execute(new g(6, localb, paramk));
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.adapter.sidecar.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
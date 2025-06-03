package k2;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import ec.d;
import ec.i;
import ec.t;
import f2.b.b;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import rb.h;

public final class c
  implements j2.a
{
  public final WindowLayoutComponent a;
  public final f2.b b;
  public final ReentrantLock c;
  public final LinkedHashMap d;
  public final LinkedHashMap e;
  public final LinkedHashMap f;
  
  public c(WindowLayoutComponent paramWindowLayoutComponent, f2.b paramb)
  {
    a = paramWindowLayoutComponent;
    b = paramb;
    c = new ReentrantLock();
    d = new LinkedHashMap();
    e = new LinkedHashMap();
    f = new LinkedHashMap();
  }
  
  public final void a(Activity paramActivity, m1.b paramb, x0.k paramk)
  {
    i.e(paramActivity, "context");
    ReentrantLock localReentrantLock = c;
    localReentrantLock.lock();
    try
    {
      paramb = (f)d.get(paramActivity);
      if (paramb != null)
      {
        paramb.b(paramk);
        e.put(paramk, paramActivity);
        paramb = h.a;
      }
      else
      {
        paramb = null;
      }
      if (paramb == null)
      {
        paramb = new k2/f;
        paramb.<init>(paramActivity);
        d.put(paramActivity, paramb);
        e.put(paramk, paramActivity);
        paramb.b(paramk);
        f2.b localb = b;
        WindowLayoutComponent localWindowLayoutComponent = a;
        d locald = t.a(WindowLayoutInfo.class);
        paramk = new k2/b;
        paramk.<init>(paramb);
        paramActivity = localb.a(localWindowLayoutComponent, locald, paramActivity, paramk);
        f.put(paramb, paramActivity);
      }
      paramActivity = h.a;
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public final void b(d0.a<i2.k> parama)
  {
    i.e(parama, "callback");
    ReentrantLock localReentrantLock = c;
    localReentrantLock.lock();
    try
    {
      Context localContext = (Context)e.get(parama);
      if (localContext == null) {
        return;
      }
      f localf = (f)d.get(localContext);
      if (localf == null) {
        return;
      }
      localf.d(parama);
      e.remove(parama);
      if (localf.c())
      {
        d.remove(localContext);
        parama = (b.b)f.remove(localf);
        if (parama != null) {
          parama.dispose();
        }
      }
      parama = h.a;
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
}

/* Location:
 * Qualified Name:     k2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
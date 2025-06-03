package k2;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import ec.i;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import m1.b;
import rb.h;

public final class d
  implements j2.a
{
  public final WindowLayoutComponent a;
  public final ReentrantLock b;
  public final LinkedHashMap c;
  public final LinkedHashMap d;
  
  public d(WindowLayoutComponent paramWindowLayoutComponent)
  {
    a = paramWindowLayoutComponent;
    b = new ReentrantLock();
    c = new LinkedHashMap();
    d = new LinkedHashMap();
  }
  
  public final void a(Activity paramActivity, b paramb, x0.k paramk)
  {
    i.e(paramActivity, "context");
    ReentrantLock localReentrantLock = b;
    localReentrantLock.lock();
    try
    {
      paramb = (f)c.get(paramActivity);
      if (paramb != null)
      {
        paramb.b(paramk);
        d.put(paramk, paramActivity);
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
        c.put(paramActivity, paramb);
        d.put(paramk, paramActivity);
        paramb.b(paramk);
        a.addWindowLayoutInfoListener(paramActivity, paramb);
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
    ReentrantLock localReentrantLock = b;
    localReentrantLock.lock();
    try
    {
      Context localContext = (Context)d.get(parama);
      if (localContext == null) {
        return;
      }
      f localf = (f)c.get(localContext);
      if (localf == null) {
        return;
      }
      localf.d(parama);
      d.remove(parama);
      if (localf.c())
      {
        c.remove(localContext);
        a.removeWindowLayoutInfoListener(localf);
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
 * Qualified Name:     k2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
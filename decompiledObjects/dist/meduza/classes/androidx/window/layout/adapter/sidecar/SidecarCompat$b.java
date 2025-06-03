package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import ec.i;
import i2.k;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import rb.h;

public final class SidecarCompat$b
  implements a.a
{
  public final a.a a;
  public final ReentrantLock b;
  public final WeakHashMap<Activity, k> c;
  
  public SidecarCompat$b(b.a parama)
  {
    a = parama;
    b = new ReentrantLock();
    c = new WeakHashMap();
  }
  
  public final void a(Activity paramActivity, k paramk)
  {
    i.e(paramActivity, "activity");
    ReentrantLock localReentrantLock = b;
    localReentrantLock.lock();
    try
    {
      boolean bool = i.a(paramk, (k)c.get(paramActivity));
      if (bool) {
        return;
      }
      k localk = (k)c.put(paramActivity, paramk);
      localReentrantLock.unlock();
      a.a(paramActivity, paramk);
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public final void b(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
    ReentrantLock localReentrantLock = b;
    localReentrantLock.lock();
    try
    {
      c.put(paramActivity, null);
      paramActivity = h.a;
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.adapter.sidecar.SidecarCompat.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package k2;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import d0.a;
import ec.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import rb.h;

public final class f
  implements a<WindowLayoutInfo>, Consumer<WindowLayoutInfo>
{
  public final Context a;
  public final ReentrantLock b;
  public i2.k c;
  public final LinkedHashSet d;
  
  public f(Activity paramActivity)
  {
    a = paramActivity;
    b = new ReentrantLock();
    d = new LinkedHashSet();
  }
  
  public final void a(WindowLayoutInfo paramWindowLayoutInfo)
  {
    i.e(paramWindowLayoutInfo, "value");
    ReentrantLock localReentrantLock = b;
    localReentrantLock.lock();
    try
    {
      c = e.b(a, paramWindowLayoutInfo);
      paramWindowLayoutInfo = d.iterator();
      while (paramWindowLayoutInfo.hasNext()) {
        ((a)paramWindowLayoutInfo.next()).accept(c);
      }
      paramWindowLayoutInfo = h.a;
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public final void b(x0.k paramk)
  {
    ReentrantLock localReentrantLock = b;
    localReentrantLock.lock();
    try
    {
      i2.k localk = c;
      if (localk != null) {
        paramk.accept(localk);
      }
      d.add(paramk);
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public final boolean c()
  {
    return d.isEmpty();
  }
  
  public final void d(a<i2.k> parama)
  {
    i.e(parama, "listener");
    ReentrantLock localReentrantLock = b;
    localReentrantLock.lock();
    try
    {
      d.remove(parama);
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
}

/* Location:
 * Qualified Name:     k2.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
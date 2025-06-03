package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class vk<T>
{
  private final CopyOnWriteArrayList<vm<T>> a = new CopyOnWriteArrayList();
  
  public final void a(Handler paramHandler, T paramT)
  {
    boolean bool;
    if ((paramHandler != null) && (paramT != null)) {
      bool = true;
    } else {
      bool = false;
    }
    rp.b(bool);
    a(paramT);
    a.add(new vm(paramHandler, paramT));
  }
  
  public final void a(vn<T> paramvn)
  {
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((vm)localIterator.next()).a(paramvn);
    }
  }
  
  public final void a(T paramT)
  {
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      vm localvm = (vm)localIterator.next();
      if (vm.a(localvm) == paramT)
      {
        localvm.a();
        a.remove(localvm);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.vk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
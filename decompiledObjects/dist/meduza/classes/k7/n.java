package k7;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import w1.c;

public final class n
{
  public static final HashMap n = new HashMap();
  public final Context a;
  public final d b;
  public final String c;
  public final ArrayList d = new ArrayList();
  public final HashSet e = new HashSet();
  public final Object f = new Object();
  public boolean g;
  public final Intent h;
  public final WeakReference i;
  public final f j = new f(this);
  public final AtomicInteger k = new AtomicInteger(0);
  public m l;
  public IInterface m;
  
  public n(Context paramContext, d paramd, Intent paramIntent)
  {
    a = paramContext;
    b = paramd;
    c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    h = paramIntent;
    i = new WeakReference(null);
  }
  
  public static void b(n paramn, e parame)
  {
    if ((m == null) && (!g))
    {
      b.a("Initiate binding to the service.", new Object[0]);
      d.add(parame);
      parame = new m(paramn);
      l = parame;
      g = true;
      if (!a.bindService(h, parame, 1))
      {
        b.a("Failed to bind to the service.", new Object[0]);
        g = false;
        Iterator localIterator = d.iterator();
        while (localIterator.hasNext())
        {
          Object localObject = (e)localIterator.next();
          parame = new c();
          localObject = a;
          if (localObject != null) {
            ((TaskCompletionSource)localObject).trySetException(parame);
          }
        }
        d.clear();
      }
      return;
    }
    if (g)
    {
      b.a("Waiting to bind to the service.", new Object[0]);
      d.add(parame);
      return;
    }
    parame.run();
  }
  
  public final Handler a()
  {
    synchronized (n)
    {
      if (!???.containsKey(c))
      {
        localObject1 = new android/os/HandlerThread;
        ((HandlerThread)localObject1).<init>(c, 10);
        ((Thread)localObject1).start();
        String str = c;
        Handler localHandler = new android/os/Handler;
        localHandler.<init>(((HandlerThread)localObject1).getLooper());
        ???.put(str, localHandler);
      }
      Object localObject1 = (Handler)???.get(c);
      return (Handler)localObject1;
    }
  }
  
  public final void c()
  {
    Iterator localIterator = e.iterator();
    while (localIterator.hasNext()) {
      ((TaskCompletionSource)localIterator.next()).trySetException(new RemoteException(String.valueOf(c).concat(" : Binder has died.")));
    }
    e.clear();
  }
}

/* Location:
 * Qualified Name:     k7.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
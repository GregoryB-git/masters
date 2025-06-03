package m7;

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

public final class e
{
  public static final HashMap o = new HashMap();
  public final Context a;
  public final v b;
  public final String c;
  public final ArrayList d = new ArrayList();
  public final HashSet e = new HashSet();
  public final Object f = new Object();
  public boolean g;
  public final Intent h;
  public final b0 i;
  public final WeakReference j;
  public final x k = new x(this);
  public final AtomicInteger l = new AtomicInteger(0);
  public d m;
  public IInterface n;
  
  public e(Context paramContext, v paramv, String paramString, Intent paramIntent, b0 paramb0)
  {
    a = paramContext;
    b = paramv;
    c = paramString;
    h = paramIntent;
    i = paramb0;
    j = new WeakReference(null);
  }
  
  public final Handler a()
  {
    synchronized (o)
    {
      if (!???.containsKey(c))
      {
        HandlerThread localHandlerThread = new android/os/HandlerThread;
        localHandlerThread.<init>(c, 10);
        localHandlerThread.start();
        localObject1 = c;
        Handler localHandler = new android/os/Handler;
        localHandler.<init>(localHandlerThread.getLooper());
        ???.put(localObject1, localHandler);
      }
      Object localObject1 = (Handler)???.get(c);
      return (Handler)localObject1;
    }
  }
  
  public final void c(w paramw, TaskCompletionSource paramTaskCompletionSource)
  {
    paramw = new z(this, paramw.c(), paramTaskCompletionSource, paramw);
    a().post(paramw);
  }
  
  public final void d(TaskCompletionSource paramTaskCompletionSource)
  {
    synchronized (f)
    {
      e.remove(paramTaskCompletionSource);
      paramTaskCompletionSource = new c(this, 1);
      a().post(paramTaskCompletionSource);
      return;
    }
  }
  
  public final void e()
  {
    Iterator localIterator = e.iterator();
    while (localIterator.hasNext()) {
      ((TaskCompletionSource)localIterator.next()).trySetException(new RemoteException(String.valueOf(c).concat(" : Binder has died.")));
    }
    e.clear();
  }
}

/* Location:
 * Qualified Name:     m7.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
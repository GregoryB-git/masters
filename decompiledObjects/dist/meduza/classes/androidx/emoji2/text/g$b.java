package androidx.emoji2.text;

import a0.j;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import b0.e;
import b0.g;
import b0.n;
import f;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t0.a;

public final class g$b
  implements d.g
{
  public final Context a;
  public final g b;
  public final g.a c;
  public final Object d = new Object();
  public Handler e;
  public Executor f;
  public ThreadPoolExecutor g;
  public d.h h;
  
  public g$b(Context paramContext, g paramg)
  {
    if (paramContext != null)
    {
      a = paramContext.getApplicationContext();
      b = paramg;
      c = locala;
      return;
    }
    throw new NullPointerException("Context cannot be null");
  }
  
  public final void a(d.h paramh)
  {
    synchronized (d)
    {
      h = paramh;
      c();
      return;
    }
  }
  
  public final void b()
  {
    synchronized (d)
    {
      h = null;
      Object localObject2 = e;
      if (localObject2 != null) {
        ((Handler)localObject2).removeCallbacks(null);
      }
      e = null;
      localObject2 = g;
      if (localObject2 != null) {
        ((ThreadPoolExecutor)localObject2).shutdown();
      }
      f = null;
      g = null;
      return;
    }
  }
  
  public final void c()
  {
    synchronized (d)
    {
      if (h == null) {
        return;
      }
      if (f == null)
      {
        a locala = new t0/a;
        locala.<init>("emojiCompat", 0);
        localObject2 = new java/util/concurrent/ThreadPoolExecutor;
        localObject3 = TimeUnit.SECONDS;
        LinkedBlockingDeque localLinkedBlockingDeque = new java/util/concurrent/LinkedBlockingDeque;
        localLinkedBlockingDeque.<init>();
        ((ThreadPoolExecutor)localObject2).<init>(0, 1, 15L, (TimeUnit)localObject3, localLinkedBlockingDeque, locala);
        ((ThreadPoolExecutor)localObject2).allowCoreThreadTimeOut(true);
        g = ((ThreadPoolExecutor)localObject2);
        f = ((Executor)localObject2);
      }
      Object localObject2 = f;
      Object localObject3 = new b/m;
      ((b.m)localObject3).<init>(this, 3);
      ((Executor)localObject2).execute((Runnable)localObject3);
      return;
    }
  }
  
  public final n d()
  {
    try
    {
      g.a locala = c;
      Context localContext = a;
      Object localObject = b;
      locala.getClass();
      localObject = e.a(localContext, (g)localObject);
      if (a == 0)
      {
        localObject = b;
        if ((localObject != null) && (localObject.length != 0)) {
          return localObject[0];
        }
        throw new RuntimeException("fetchFonts failed (empty result)");
      }
      throw new RuntimeException(j.m(f.l("fetchFonts failed ("), a, ")"));
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new RuntimeException("provider not found", localNameNotFoundException);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.g.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
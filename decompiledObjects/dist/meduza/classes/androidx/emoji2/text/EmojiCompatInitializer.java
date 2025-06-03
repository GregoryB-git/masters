package androidx.emoji2.text;

import a0.n;
import android.content.Context;
import android.os.Trace;
import androidx.lifecycle.ProcessLifecycleInitializer;
import b1.k;
import b1.o;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t0.c;
import w1.b;

public class EmojiCompatInitializer
  implements b<Boolean>
{
  public final List<Class<? extends b<?>>> a()
  {
    return Collections.singletonList(ProcessLifecycleInitializer.class);
  }
  
  public final Boolean c(Context paramContext)
  {
    ??? = new a(paramContext);
    if (d.j == null) {
      synchronized (d.i)
      {
        if (d.j == null)
        {
          localObject3 = new androidx/emoji2/text/d;
          ((d)localObject3).<init>((a)???);
          d.j = (d)localObject3;
        }
      }
    }
    Object localObject3 = w1.a.c(paramContext);
    localObject3.getClass();
    synchronized (w1.a.e)
    {
      ??? = a.get(ProcessLifecycleInitializer.class);
      paramContext = (Context)???;
      if (??? == null)
      {
        paramContext = new java/util/HashSet;
        paramContext.<init>();
        paramContext = ((w1.a)localObject3).b(ProcessLifecycleInitializer.class, paramContext);
      }
    }
    paramContext = ((o)paramContext).getLifecycle();
    paramContext.a(new c(this, paramContext));
    return Boolean.TRUE;
  }
  
  public static final class a
    extends d.c
  {
    public a(Context paramContext)
    {
      super();
      b = 1;
    }
  }
  
  public static final class b
    implements d.g
  {
    public final Context a;
    
    public b(Context paramContext)
    {
      a = paramContext.getApplicationContext();
    }
    
    public final void a(d.h paramh)
    {
      Object localObject = new t0.a("EmojiCompatInitializer", 0);
      localObject = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), (ThreadFactory)localObject);
      ((ThreadPoolExecutor)localObject).allowCoreThreadTimeOut(true);
      ((ThreadPoolExecutor)localObject).execute(new t0.d(this, paramh, localObject, 0));
    }
  }
  
  public static final class c
    implements Runnable
  {
    public final void run()
    {
      try
      {
        i = n.a;
        Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
        if (d.j != null) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {
          d.a().c();
        }
        Trace.endSection();
        return;
      }
      finally
      {
        int i = n.a;
        Trace.endSection();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiCompatInitializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import b1.a0;
import b1.k.a;
import b1.l;
import b1.l.a;
import b1.o;
import b1.p;
import b1.z;
import ec.i;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sb.s;
import w1.a;
import w1.b;

public final class ProcessLifecycleInitializer
  implements b<o>
{
  public final List<Class<? extends b<?>>> a()
  {
    return s.a;
  }
  
  public final Object b(Context paramContext)
  {
    i.e(paramContext, "context");
    Object localObject = a.c(paramContext);
    i.d(localObject, "getInstance(context)");
    if (b.contains(ProcessLifecycleInitializer.class))
    {
      if (!l.a.getAndSet(true))
      {
        localObject = paramContext.getApplicationContext();
        i.c(localObject, "null cannot be cast to non-null type android.app.Application");
        ((Application)localObject).registerActivityLifecycleCallbacks(new l.a());
      }
      localObject = z.q;
      localObject.getClass();
      e = new Handler();
      f.f(k.a.ON_CREATE);
      paramContext = paramContext.getApplicationContext();
      i.c(paramContext, "null cannot be cast to non-null type android.app.Application");
      ((Application)paramContext).registerActivityLifecycleCallbacks(new a0((z)localObject));
      return localObject;
    }
    throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ProcessLifecycleInitializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
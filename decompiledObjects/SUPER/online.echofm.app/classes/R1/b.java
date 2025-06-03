package R1;

import Q1.c;
import Q1.c.a;
import Q1.k;
import android.app.ActivityManager;
import android.app.ActivityManager.ProcessErrorStateInfo;
import android.content.Context;
import android.os.Looper;
import android.os.Process;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class b
{
  public static final b a = new b();
  public static final int b = Process.myUid();
  public static final ScheduledExecutorService c = Executors.newSingleThreadScheduledExecutor();
  public static String d = "";
  public static final Runnable e = new a();
  
  public static final void b()
  {
    if (T1.a.d(b.class)) {
      return;
    }
    try
    {
      try
      {
        Object localObject1 = B.l().getSystemService("activity");
        if (localObject1 != null) {
          c((ActivityManager)localObject1);
        }
      }
      finally
      {
        break label48;
        NullPointerException localNullPointerException = new java/lang/NullPointerException;
        localNullPointerException.<init>("null cannot be cast to non-null type android.app.ActivityManager");
        throw localNullPointerException;
        label48:
        T1.a.b(localNullPointerException, b.class);
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public static final void c(ActivityManager paramActivityManager)
  {
    if (T1.a.d(b.class)) {
      return;
    }
    if (paramActivityManager != null) {
      try
      {
        paramActivityManager = paramActivityManager.getProcessesInErrorState();
        if (paramActivityManager != null)
        {
          paramActivityManager = ((Iterable)paramActivityManager).iterator();
          while (paramActivityManager.hasNext())
          {
            ActivityManager.ProcessErrorStateInfo localProcessErrorStateInfo = (ActivityManager.ProcessErrorStateInfo)paramActivityManager.next();
            if ((condition == 2) && (uid == b))
            {
              Object localObject = Looper.getMainLooper().getThread();
              Intrinsics.checkNotNullExpressionValue(localObject, "getMainLooper().thread");
              String str = k.g((Thread)localObject);
              if ((!Intrinsics.a(str, d)) && (k.k((Thread)localObject)))
              {
                d = str;
                localObject = c.a.a;
                c.a.a(shortMsg, str).g();
              }
            }
          }
        }
        return;
      }
      finally {}
    }
    T1.a.b(paramActivityManager, b.class);
  }
  
  public static final void d()
  {
    if (T1.a.d(b.class)) {
      return;
    }
    try
    {
      c.scheduleWithFixedDelay(e, 0L, 'Ǵ', TimeUnit.MILLISECONDS);
      return;
    }
    finally
    {
      T1.a.b(localThrowable, b.class);
    }
  }
}

/* Location:
 * Qualified Name:     R1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
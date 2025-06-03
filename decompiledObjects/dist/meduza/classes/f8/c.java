package f8;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.android.gms.tasks.TaskCompletionSource;
import j8.s;
import j8.w;
import java.util.Collections;
import java.util.Map;
import k8.b;
import k8.i;
import u7.f;
import x0.g;

public final class c
{
  public final s a;
  
  public c(s params)
  {
    a = params;
  }
  
  public static c a()
  {
    c localc = (c)f.e().c(c.class);
    if (localc != null) {
      return localc;
    }
    throw new NullPointerException("FirebaseCrashlytics component is not present.");
  }
  
  public final void b(Exception paramException)
  {
    s locals = a;
    Map localMap = Collections.emptyMap();
    p.a.a(new g(locals, paramException, localMap, 6));
  }
  
  public final void c(Boolean arg1)
  {
    w localw = a.b;
    if (??? != null) {
      try
      {
        f = false;
      }
      finally
      {
        break label176;
      }
    }
    if (??? != null)
    {
      localObject1 = ???;
    }
    else
    {
      localObject1 = b;
      ((f)localObject1).a();
      localObject1 = localw.a(a);
    }
    g = ((Boolean)localObject1);
    Object localObject1 = a.edit();
    if (??? != null) {
      ((SharedPreferences.Editor)localObject1).putBoolean("firebase_crashlytics_collection_enabled", ???.booleanValue());
    } else {
      ((SharedPreferences.Editor)localObject1).remove("firebase_crashlytics_collection_enabled");
    }
    ((SharedPreferences.Editor)localObject1).apply();
    synchronized (c)
    {
      if (localw.b())
      {
        if (!e)
        {
          d.trySetResult(null);
          e = true;
        }
      }
      else if (e)
      {
        localObject1 = new com/google/android/gms/tasks/TaskCompletionSource;
        ((TaskCompletionSource)localObject1).<init>();
        d = ((TaskCompletionSource)localObject1);
        e = false;
      }
      return;
    }
    label176:
    throw ???;
  }
}

/* Location:
 * Qualified Name:     f8.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
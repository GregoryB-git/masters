package com.google.firebase.crashlytics;

import android.util.Log;
import ca.e;
import com.google.firebase.components.ComponentRegistrar;
import d8.k;
import d8.t;
import fa.a.a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import u7.f;

public class CrashlyticsRegistrar
  implements ComponentRegistrar
{
  public final t<ExecutorService> a = new t(y7.a.class, ExecutorService.class);
  public final t<ExecutorService> b = new t(y7.b.class, ExecutorService.class);
  public final t<ExecutorService> c = new t(y7.c.class, ExecutorService.class);
  
  static
  {
    Object localObject1 = fa.b.a.a;
    Object localObject2 = fa.a.b;
    if (((Map)localObject2).containsKey(localObject1))
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Dependency ");
      ((StringBuilder)localObject2).append(localObject1);
      localObject1 = " already added.";
    }
    else
    {
      ((Map)localObject2).put(localObject1, new a.a(new vc.d(true)));
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Dependency to ");
      ((StringBuilder)localObject2).append(localObject1);
      localObject1 = " added.";
    }
    ((StringBuilder)localObject2).append((String)localObject1);
    Log.d("SessionsDependencies", ((StringBuilder)localObject2).toString());
  }
  
  public final List<d8.b<?>> getComponents()
  {
    d8.b.a locala = d8.b.b(f8.c.class);
    a = "fire-cls";
    locala.a(k.d(f.class));
    locala.a(k.d(u9.d.class));
    locala.a(k.c(a));
    locala.a(k.c(b));
    locala.a(k.c(c));
    locala.a(k.a(g8.a.class));
    locala.a(k.a(w7.a.class));
    locala.a(k.a(da.a.class));
    f = new d(this, 1);
    locala.c(2);
    return Arrays.asList(new d8.b[] { locala.b(), e.a("fire-cls", "19.4.0") });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.crashlytics.CrashlyticsRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
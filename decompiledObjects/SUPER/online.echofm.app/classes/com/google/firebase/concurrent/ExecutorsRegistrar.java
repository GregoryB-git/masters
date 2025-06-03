package com.google.firebase.concurrent;

import B3.F;
import B3.c.b;
import C3.o;
import C3.q;
import C3.r;
import C3.s;
import C3.t;
import C3.u;
import C3.v;
import C3.w;
import C3.y;
import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import y3.a;
import y3.d;

@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar
  implements ComponentRegistrar
{
  public static final B3.x a = new B3.x(new r());
  public static final B3.x b = new B3.x(new s());
  public static final B3.x c = new B3.x(new t());
  public static final B3.x d = new B3.x(new u());
  
  public static StrictMode.ThreadPolicy i()
  {
    StrictMode.ThreadPolicy.Builder localBuilder = new StrictMode.ThreadPolicy.Builder().detectNetwork();
    int i = Build.VERSION.SDK_INT;
    localBuilder.detectResourceMismatches();
    if (i >= 26) {
      q.a(localBuilder);
    }
    return localBuilder.penaltyLog().build();
  }
  
  public static ThreadFactory j(String paramString, int paramInt)
  {
    return new C3.b(paramString, paramInt, null);
  }
  
  public static ThreadFactory k(String paramString, int paramInt, StrictMode.ThreadPolicy paramThreadPolicy)
  {
    return new C3.b(paramString, paramInt, paramThreadPolicy);
  }
  
  public static StrictMode.ThreadPolicy t()
  {
    return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
  }
  
  public static ScheduledExecutorService u(ExecutorService paramExecutorService)
  {
    return new o(paramExecutorService, (ScheduledExecutorService)d.get());
  }
  
  public List getComponents()
  {
    return Arrays.asList(new B3.c[] { B3.c.d(F.a(a.class, ScheduledExecutorService.class), new F[] { F.a(a.class, ExecutorService.class), F.a(a.class, Executor.class) }).f(new v()).d(), B3.c.d(F.a(y3.b.class, ScheduledExecutorService.class), new F[] { F.a(y3.b.class, ExecutorService.class), F.a(y3.b.class, Executor.class) }).f(new w()).d(), B3.c.d(F.a(y3.c.class, ScheduledExecutorService.class), new F[] { F.a(y3.c.class, ExecutorService.class), F.a(y3.c.class, Executor.class) }).f(new C3.x()).d(), B3.c.c(F.a(d.class, Executor.class)).f(new y()).d() });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.concurrent.ExecutorsRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package Q4;

import V2.f;
import V2.g;
import V2.j;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class e
{
  public static final Map d = new HashMap();
  public static final Executor e = new r1.m();
  public final Executor a;
  public final p b;
  public j c;
  
  public e(Executor paramExecutor, p paramp)
  {
    a = paramExecutor;
    b = paramp;
    c = null;
  }
  
  public static Object c(j paramj, long paramLong, TimeUnit paramTimeUnit)
  {
    b localb = new b(null);
    Executor localExecutor = e;
    paramj.e(localExecutor, localb);
    paramj.d(localExecutor, localb);
    paramj.a(localExecutor, localb);
    if (localb.c(paramLong, paramTimeUnit))
    {
      if (paramj.n()) {
        return paramj.j();
      }
      throw new ExecutionException(paramj.i());
    }
    throw new TimeoutException("Task await timed out.");
  }
  
  public static e h(Executor paramExecutor, p paramp)
  {
    String str;
    Map localMap;
    try
    {
      str = paramp.b();
      localMap = d;
      if (!localMap.containsKey(str))
      {
        e locale = new Q4/e;
        locale.<init>(paramExecutor, paramp);
        localMap.put(str, locale);
      }
    }
    finally
    {
      break label67;
    }
    paramExecutor = (e)localMap.get(str);
    return paramExecutor;
    label67:
    throw paramExecutor;
  }
  
  public void d()
  {
    try
    {
      c = V2.m.e(null);
      b.a();
      return;
    }
    finally {}
  }
  
  public j e()
  {
    try
    {
      j localj = c;
      if (localj != null) {
        if ((!localj.m()) || (c.n())) {
          break label68;
        }
      }
    }
    finally
    {
      break label77;
    }
    Object localObject2 = a;
    p localp = b;
    Objects.requireNonNull(localp);
    b localb = new Q4/b;
    localb.<init>(localp);
    c = V2.m.c((Executor)localObject2, localb);
    label68:
    localObject2 = c;
    return (j)localObject2;
    label77:
    throw ((Throwable)localObject2);
  }
  
  public com.google.firebase.remoteconfig.internal.b f()
  {
    return g(5L);
  }
  
  public com.google.firebase.remoteconfig.internal.b g(long paramLong)
  {
    label76:
    try
    {
      Object localObject1 = c;
      if ((localObject1 != null) && (((j)localObject1).n()))
      {
        localObject1 = (com.google.firebase.remoteconfig.internal.b)c.j();
        return (com.google.firebase.remoteconfig.internal.b)localObject1;
      }
    }
    finally
    {
      break label76;
      try
      {
        com.google.firebase.remoteconfig.internal.b localb = (com.google.firebase.remoteconfig.internal.b)c(e(), paramLong, TimeUnit.SECONDS);
        return localb;
      }
      catch (TimeoutException localTimeoutException) {}catch (ExecutionException localExecutionException) {}catch (InterruptedException localInterruptedException) {}
      Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", localInterruptedException);
      return null;
    }
  }
  
  public j k(com.google.firebase.remoteconfig.internal.b paramb)
  {
    return l(paramb, true);
  }
  
  public j l(com.google.firebase.remoteconfig.internal.b paramb, boolean paramBoolean)
  {
    return V2.m.c(a, new c(this, paramb)).p(a, new d(this, paramBoolean, paramb));
  }
  
  public final void m(com.google.firebase.remoteconfig.internal.b paramb)
  {
    try
    {
      c = V2.m.e(paramb);
      return;
    }
    finally
    {
      paramb = finally;
      throw paramb;
    }
  }
  
  public static class b
    implements g, f, V2.d
  {
    public final CountDownLatch a = new CountDownLatch(1);
    
    public void a(Object paramObject)
    {
      a.countDown();
    }
    
    public void b()
    {
      a.countDown();
    }
    
    public boolean c(long paramLong, TimeUnit paramTimeUnit)
    {
      return a.await(paramLong, paramTimeUnit);
    }
    
    public void d(Exception paramException)
    {
      a.countDown();
    }
  }
}

/* Location:
 * Qualified Name:     Q4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
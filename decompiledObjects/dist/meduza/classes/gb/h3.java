package gb;

import java.util.IdentityHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import x6.b;

public final class h3
{
  public static final h3 d = new h3(new a());
  public final IdentityHashMap<c<?>, b> a = new IdentityHashMap();
  public final d b;
  public ScheduledExecutorService c;
  
  public h3(a parama)
  {
    b = parama;
  }
  
  public static <T> T a(c<T> paramc)
  {
    synchronized (d)
    {
      b localb1 = (b)a.get(paramc);
      b localb2 = localb1;
      if (localb1 == null)
      {
        localb2 = new gb/h3$b;
        localb2.<init>(paramc.a());
        a.put(paramc, localb2);
      }
      paramc = c;
      if (paramc != null)
      {
        paramc.cancel(false);
        c = null;
      }
      b += 1;
      paramc = a;
      return paramc;
    }
  }
  
  public static void b(c paramc, Executor paramExecutor)
  {
    synchronized (d)
    {
      Object localObject1 = (b)a.get(paramc);
      if (localObject1 != null)
      {
        Object localObject2 = a;
        boolean bool1 = false;
        boolean bool2;
        if (paramExecutor == localObject2) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        b.s("Releasing the wrong instance", bool2);
        if (b > 0) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        b.I(bool2, "Refcount has already reached zero");
        int i = b - 1;
        b = i;
        if (i == 0)
        {
          bool2 = bool1;
          if (c == null) {
            bool2 = true;
          }
          b.I(bool2, "Destroy task already scheduled");
          if (c == null)
          {
            ((a)b).getClass();
            c = Executors.newSingleThreadScheduledExecutor(v0.d("grpc-shared-destroyer-%d"));
          }
          ScheduledExecutorService localScheduledExecutorService = c;
          p1 localp1 = new gb/p1;
          localObject2 = new gb/i3;
          ((i3)localObject2).<init>(???, (b)localObject1, paramc, paramExecutor);
          localp1.<init>((Runnable)localObject2);
          c = localScheduledExecutorService.schedule(localp1, 1L, TimeUnit.SECONDS);
        }
        return;
      }
      localObject1 = new java/lang/IllegalArgumentException;
      paramExecutor = new java/lang/StringBuilder;
      paramExecutor.<init>();
      paramExecutor.append("No cached instance found for ");
      paramExecutor.append(paramc);
      ((IllegalArgumentException)localObject1).<init>(paramExecutor.toString());
      throw ((Throwable)localObject1);
    }
  }
  
  public final class a
    implements h3.d
  {}
  
  public static final class b
  {
    public final Object a;
    public int b;
    public ScheduledFuture<?> c;
    
    public b(Object paramObject)
    {
      a = paramObject;
    }
  }
  
  public static abstract interface c<T>
  {
    public abstract T a();
    
    public abstract void b(T paramT);
  }
  
  public static abstract interface d {}
}

/* Location:
 * Qualified Name:     gb.h3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
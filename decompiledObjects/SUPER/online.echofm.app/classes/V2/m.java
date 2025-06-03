package V2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class m
{
  public static Object a(j paramj)
  {
    A2.n.g();
    A2.n.j(paramj, "Task must not be null");
    if (paramj.m()) {
      return j(paramj);
    }
    p localp = new p(null);
    k(paramj, localp);
    localp.c();
    return j(paramj);
  }
  
  public static Object b(j paramj, long paramLong, TimeUnit paramTimeUnit)
  {
    A2.n.g();
    A2.n.j(paramj, "Task must not be null");
    A2.n.j(paramTimeUnit, "TimeUnit must not be null");
    if (paramj.m()) {
      return j(paramj);
    }
    p localp = new p(null);
    k(paramj, localp);
    if (localp.e(paramLong, paramTimeUnit)) {
      return j(paramj);
    }
    throw new TimeoutException("Timed out waiting for Task");
  }
  
  public static j c(Executor paramExecutor, Callable paramCallable)
  {
    A2.n.j(paramExecutor, "Executor must not be null");
    A2.n.j(paramCallable, "Callback must not be null");
    K localK = new K();
    paramExecutor.execute(new L(localK, paramCallable));
    return localK;
  }
  
  public static j d(Exception paramException)
  {
    K localK = new K();
    localK.q(paramException);
    return localK;
  }
  
  public static j e(Object paramObject)
  {
    K localK = new K();
    localK.r(paramObject);
    return localK;
  }
  
  public static j f(Collection paramCollection)
  {
    if ((paramCollection != null) && (!paramCollection.isEmpty()))
    {
      Object localObject = paramCollection.iterator();
      while (((Iterator)localObject).hasNext()) {
        if ((j)((Iterator)localObject).next() == null) {
          throw new NullPointerException("null tasks are not accepted");
        }
      }
      localObject = new K();
      r localr = new r(paramCollection.size(), (K)localObject);
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        k((j)paramCollection.next(), localr);
      }
      return (j)localObject;
    }
    return e(null);
  }
  
  public static j g(j... paramVarArgs)
  {
    if ((paramVarArgs != null) && (paramVarArgs.length != 0)) {
      return f(Arrays.asList(paramVarArgs));
    }
    return e(null);
  }
  
  public static j h(Collection paramCollection)
  {
    if ((paramCollection != null) && (!paramCollection.isEmpty()))
    {
      j localj = f(paramCollection);
      paramCollection = new n(paramCollection);
      return localj.h(l.a, paramCollection);
    }
    return e(Collections.emptyList());
  }
  
  public static j i(j... paramVarArgs)
  {
    if ((paramVarArgs != null) && (paramVarArgs.length != 0)) {
      return h(Arrays.asList(paramVarArgs));
    }
    return e(Collections.emptyList());
  }
  
  public static Object j(j paramj)
  {
    if (paramj.n()) {
      return paramj.j();
    }
    if (paramj.l()) {
      throw new CancellationException("Task is already canceled");
    }
    throw new ExecutionException(paramj.i());
  }
  
  public static void k(j paramj, q paramq)
  {
    Executor localExecutor = l.b;
    paramj.e(localExecutor, paramq);
    paramj.d(localExecutor, paramq);
    paramj.a(localExecutor, paramq);
  }
}

/* Location:
 * Qualified Name:     V2.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
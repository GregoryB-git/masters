package gb;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class v0$b
  implements h3.c<Executor>
{
  public final Object a()
  {
    return Executors.newCachedThreadPool(v0.d("grpc-default-executor-%d"));
  }
  
  public final void b(Object paramObject)
  {
    ((ExecutorService)paramObject).shutdown();
  }
  
  public final String toString()
  {
    return "grpc-default-executor";
  }
}

/* Location:
 * Qualified Name:     gb.v0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
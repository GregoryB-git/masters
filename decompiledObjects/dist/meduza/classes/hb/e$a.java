package hb;

import gb.h3.c;
import gb.v0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class e$a
  implements h3.c<Executor>
{
  public final Object a()
  {
    return Executors.newCachedThreadPool(v0.d("grpc-okhttp-%d"));
  }
  
  public final void b(Object paramObject)
  {
    ((ExecutorService)paramObject).shutdown();
  }
}

/* Location:
 * Qualified Name:     hb.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
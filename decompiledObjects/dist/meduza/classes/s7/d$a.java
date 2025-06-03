package s7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import n7.g;
import n7.g.a;
import n7.g.a.b;
import r4.c;
import t7.a;

public final class d$a<V>
  implements Runnable
{
  public final Future<V> a;
  public final c b;
  
  public d$a(e parame, c paramc)
  {
    a = parame;
    b = paramc;
  }
  
  public final void run()
  {
    Object localObject = a;
    if ((localObject instanceof a))
    {
      localObject = ((a)localObject).a();
      if (localObject != null)
      {
        b.f((Throwable)localObject);
        return;
      }
    }
    try
    {
      try
      {
        localObject = d.C(a);
        b.onSuccess(localObject);
        return;
      }
      catch (Error localError) {}catch (RuntimeException localRuntimeException) {}
      b.f(localRuntimeException);
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      b.f(localExecutionException.getCause());
    }
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    c localc = b;
    g.a.b localb = new g.a.b();
    c.c = localb;
    c = localb;
    b = localc;
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     s7.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
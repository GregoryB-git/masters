package F;

import H.a;
import android.os.Handler;
import java.util.concurrent.Callable;

public class h$b
  implements Runnable
{
  public Callable o;
  public a p;
  public Handler q;
  
  public h$b(Handler paramHandler, Callable paramCallable, a parama)
  {
    o = paramCallable;
    p = parama;
    q = paramHandler;
  }
  
  public void run()
  {
    final Object localObject2;
    try
    {
      Object localObject1 = o.call();
    }
    catch (Exception localException)
    {
      localObject2 = null;
    }
    final a locala = p;
    q.post(new a(locala, localObject2));
  }
  
  public class a
    implements Runnable
  {
    public a(a parama, Object paramObject) {}
    
    public void run()
    {
      locala.accept(localObject2);
    }
  }
}

/* Location:
 * Qualified Name:     F.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
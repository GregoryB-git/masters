package b0;

import android.os.Handler;
import d0.a;
import java.util.concurrent.Callable;

public final class p<T>
  implements Runnable
{
  public Callable<T> a;
  public a<T> b;
  public Handler c;
  
  public p(Handler paramHandler, j paramj, k paramk)
  {
    a = paramj;
    b = paramk;
    c = paramHandler;
  }
  
  public final void run()
  {
    final Object localObject2;
    try
    {
      Object localObject1 = a.call();
    }
    catch (Exception localException)
    {
      localObject2 = null;
    }
    a locala = b;
    c.post(new a(locala, localObject2));
  }
  
  public final class a
    implements Runnable
  {
    public a(Object paramObject) {}
    
    public final void run()
    {
      accept(localObject2);
    }
  }
}

/* Location:
 * Qualified Name:     b0.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
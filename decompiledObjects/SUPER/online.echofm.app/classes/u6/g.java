package u6;

import java.util.Collection;
import java.util.ServiceLoader;
import n6.c;
import p6.G;

public abstract class g
{
  public static final Collection a = (Collection)c.e(c.a(ServiceLoader.load(G.class, G.class.getClassLoader()).iterator()));
  
  public static final Collection a()
  {
    return a;
  }
  
  public static final void b(Throwable paramThrowable)
  {
    Thread localThread = Thread.currentThread();
    localThread.getUncaughtExceptionHandler().uncaughtException(localThread, paramThrowable);
  }
}

/* Location:
 * Qualified Name:     u6.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
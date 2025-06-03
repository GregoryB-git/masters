package k3;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import m3.b;

public final class o
  implements b<Executor>
{
  public final Object get()
  {
    return new q(Executors.newSingleThreadExecutor());
  }
  
  public static final class a
  {
    public static final o a = new o();
  }
}

/* Location:
 * Qualified Name:     k3.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
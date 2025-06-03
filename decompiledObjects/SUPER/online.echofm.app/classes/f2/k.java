package f2;

import h2.b;
import h2.d;
import java.util.concurrent.Executor;

public final class k
  implements b
{
  public static k a()
  {
    return a.a();
  }
  
  public static Executor b()
  {
    return (Executor)d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public Executor c()
  {
    return b();
  }
  
  public static final abstract class a
  {
    public static final k a = new k();
  }
}

/* Location:
 * Qualified Name:     f2.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
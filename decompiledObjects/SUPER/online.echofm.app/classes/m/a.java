package m;

import java.util.concurrent.Executor;

public class a
  extends d
{
  public static volatile a c;
  public static final Executor d = new a();
  public static final Executor e = new b();
  public d a;
  public d b;
  
  public a()
  {
    c localc = new c();
    b = localc;
    a = localc;
  }
  
  public static a d()
  {
    if (c != null) {
      return c;
    }
    try
    {
      if (c == null)
      {
        a locala = new m/a;
        locala.<init>();
        c = locala;
      }
    }
    finally
    {
      break label45;
    }
    return c;
    label45:
    throw ((Throwable)localObject);
  }
  
  public void a(Runnable paramRunnable)
  {
    a.a(paramRunnable);
  }
  
  public boolean b()
  {
    return a.b();
  }
  
  public void c(Runnable paramRunnable)
  {
    a.c(paramRunnable);
  }
  
  public static final class a
    implements Executor
  {
    public void execute(Runnable paramRunnable)
    {
      a.d().c(paramRunnable);
    }
  }
  
  public static final class b
    implements Executor
  {
    public void execute(Runnable paramRunnable)
    {
      a.d().a(paramRunnable);
    }
  }
}

/* Location:
 * Qualified Name:     m.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
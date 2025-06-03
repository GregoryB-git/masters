package gb;

import eb.p;

public abstract class z
  implements Runnable
{
  public final p a;
  
  public z(p paramp)
  {
    a = paramp;
  }
  
  public abstract void a();
  
  public final void run()
  {
    p localp = a.a();
    try
    {
      a();
      return;
    }
    finally
    {
      a.c(localp);
    }
  }
}

/* Location:
 * Qualified Name:     gb.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
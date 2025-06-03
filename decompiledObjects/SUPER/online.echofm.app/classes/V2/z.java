package V2;

import java.util.concurrent.Executor;

public final class z
  implements G
{
  public final Executor a;
  public final Object b = new Object();
  public e c;
  
  public z(Executor paramExecutor, e parame)
  {
    a = paramExecutor;
    c = parame;
  }
  
  public final void c(j paramj)
  {
    synchronized (b)
    {
      if (c == null) {
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     V2.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
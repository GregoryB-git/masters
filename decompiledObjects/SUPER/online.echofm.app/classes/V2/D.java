package V2;

import java.util.concurrent.Executor;

public final class D
  implements G
{
  public final Executor a;
  public final Object b = new Object();
  public g c;
  
  public D(Executor paramExecutor, g paramg)
  {
    a = paramExecutor;
    c = paramg;
  }
  
  public final void c(j paramj)
  {
    if (paramj.n()) {
      synchronized (b)
      {
        if (c == null) {
          return;
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     V2.D
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
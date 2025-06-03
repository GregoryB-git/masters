package V2;

import java.util.concurrent.Executor;

public final class B
  implements G
{
  public final Executor a;
  public final Object b = new Object();
  public f c;
  
  public B(Executor paramExecutor, f paramf)
  {
    a = paramExecutor;
    c = paramf;
  }
  
  public final void c(j paramj)
  {
    if ((!paramj.n()) && (!paramj.l())) {
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
 * Qualified Name:     V2.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
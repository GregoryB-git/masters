package V2;

import java.util.concurrent.Executor;

public final class x
  implements G
{
  public final Executor a;
  public final Object b = new Object();
  public d c;
  
  public x(Executor paramExecutor, d paramd)
  {
    a = paramExecutor;
    c = paramd;
  }
  
  public final void c(j arg1)
  {
    if (???.l()) {
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
 * Qualified Name:     V2.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
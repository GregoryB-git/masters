package V2;

import java.util.concurrent.Executor;

public final class t
  implements G
{
  public final Executor a;
  public final b b;
  public final K c;
  
  public t(Executor paramExecutor, b paramb, K paramK)
  {
    a = paramExecutor;
    b = paramb;
    c = paramK;
  }
  
  public final void c(j paramj)
  {
    a.execute(new s(this, paramj));
  }
}

/* Location:
 * Qualified Name:     V2.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
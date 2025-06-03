package V2;

import java.util.concurrent.Executor;

public final class F
  implements g, f, d, G
{
  public final Executor a;
  public final i b;
  public final K c;
  
  public F(Executor paramExecutor, i parami, K paramK)
  {
    a = paramExecutor;
    b = parami;
    c = paramK;
  }
  
  public final void a(Object paramObject)
  {
    c.r(paramObject);
  }
  
  public final void b()
  {
    c.s();
  }
  
  public final void c(j paramj)
  {
    a.execute(new E(this, paramj));
  }
  
  public final void d(Exception paramException)
  {
    c.q(paramException);
  }
}

/* Location:
 * Qualified Name:     V2.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
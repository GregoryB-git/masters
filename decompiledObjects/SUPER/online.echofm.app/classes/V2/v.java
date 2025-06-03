package V2;

import java.util.concurrent.Executor;

public final class v
  implements g, f, d, G
{
  public final Executor a;
  public final b b;
  public final K c;
  
  public v(Executor paramExecutor, b paramb, K paramK)
  {
    a = paramExecutor;
    b = paramb;
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
    a.execute(new u(this, paramj));
  }
  
  public final void d(Exception paramException)
  {
    c.q(paramException);
  }
}

/* Location:
 * Qualified Name:     V2.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
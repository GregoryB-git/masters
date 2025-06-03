package eb;

import java.util.concurrent.Executor;

public final class k$b
  extends b.a
{
  public final b.b a;
  public final Executor b;
  public final b.a c;
  public final p d;
  
  public k$b(k paramk, b.b paramb, Executor paramExecutor, b.a parama, p paramp)
  {
    a = paramb;
    b = paramExecutor;
    c = parama;
    x6.b.y(paramp, "context");
    d = paramp;
  }
  
  public final void a(s0 params0)
  {
    p localp = d.a();
    try
    {
      b localb = e.b;
      b.b localb1 = a;
      Executor localExecutor = b;
      k.a locala = new eb/k$a;
      locala.<init>(c, params0);
      localb.a(localb1, localExecutor, locala);
      return;
    }
    finally
    {
      d.c(localp);
    }
  }
  
  public final void b(e1 parame1)
  {
    c.b(parame1);
  }
}

/* Location:
 * Qualified Name:     eb.k.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
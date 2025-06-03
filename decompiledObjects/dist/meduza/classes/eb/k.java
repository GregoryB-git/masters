package eb;

import java.util.concurrent.Executor;

public final class k
  extends b
{
  public final b a;
  public final b b;
  
  public k(b paramb1, b paramb2)
  {
    x6.b.y(paramb1, "creds1");
    a = paramb1;
    b = paramb2;
  }
  
  public final void a(b.b paramb, Executor paramExecutor, b.a parama)
  {
    a.a(paramb, paramExecutor, new b(paramb, paramExecutor, parama, p.b()));
  }
  
  public static final class a
    extends b.a
  {
    public final b.a a;
    public final s0 b;
    
    public a(b.a parama, s0 params0)
    {
      a = parama;
      b = params0;
    }
    
    public final void a(s0 params0)
    {
      s0 locals0 = new s0();
      locals0.d(b);
      locals0.d(params0);
      a.a(locals0);
    }
    
    public final void b(e1 parame1)
    {
      a.b(parame1);
    }
  }
  
  public final class b
    extends b.a
  {
    public final b.b a;
    public final Executor b;
    public final b.a c;
    public final p d;
    
    public b(b.b paramb, Executor paramExecutor, b.a parama, p paramp)
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
        b localb = b;
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
}

/* Location:
 * Qualified Name:     eb.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
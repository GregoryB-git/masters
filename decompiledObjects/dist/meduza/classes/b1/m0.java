package b1;

import android.os.Handler;

public final class m0
{
  public final p a;
  public final Handler b;
  public a c;
  
  public m0(o paramo)
  {
    a = new p(paramo);
    b = new Handler();
  }
  
  public final void a(k.a parama)
  {
    a locala = c;
    if (locala != null) {
      locala.run();
    }
    parama = new a(a, parama);
    c = parama;
    b.postAtFrontOfQueue(parama);
  }
  
  public static final class a
    implements Runnable
  {
    public final p a;
    public final k.a b;
    public boolean c;
    
    public a(p paramp, k.a parama)
    {
      a = paramp;
      b = parama;
    }
    
    public final void run()
    {
      if (!c)
      {
        a.f(b);
        c = true;
      }
    }
  }
}

/* Location:
 * Qualified Name:     b1.m0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
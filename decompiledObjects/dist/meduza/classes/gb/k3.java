package gb;

import java.io.Closeable;

public final class k3
  extends q0
{
  public final i2.a a;
  public boolean b;
  
  public k3(y0 paramy0)
  {
    a = paramy0;
  }
  
  public final void a(n3.a parama)
  {
    if (b)
    {
      if ((parama instanceof Closeable)) {
        v0.b((Closeable)parama);
      }
      return;
    }
    a.a(parama);
  }
  
  public final void c(boolean paramBoolean)
  {
    b = true;
    a.c(paramBoolean);
  }
  
  public final void e(Throwable paramThrowable)
  {
    b = true;
    a.e(paramThrowable);
  }
}

/* Location:
 * Qualified Name:     gb.k3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
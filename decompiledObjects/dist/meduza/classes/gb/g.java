package gb;

import java.io.InputStream;
import java.util.ArrayDeque;

public final class g
  implements i2.a
{
  public final d a;
  public final i2.a b;
  public final ArrayDeque c = new ArrayDeque();
  
  public g(k3 paramk3, y0 paramy0)
  {
    b = paramk3;
    a = paramy0;
  }
  
  public final void a(n3.a parama)
  {
    for (;;)
    {
      InputStream localInputStream = parama.next();
      if (localInputStream == null) {
        break;
      }
      c.add(localInputStream);
    }
  }
  
  public final void c(final boolean paramBoolean)
  {
    a.f(new b(paramBoolean));
  }
  
  public final void d(final int paramInt)
  {
    a.f(new a(paramInt));
  }
  
  public final void e(final Throwable paramThrowable)
  {
    a.f(new c(paramThrowable));
  }
  
  public final class a
    implements Runnable
  {
    public a(int paramInt) {}
    
    public final void run()
    {
      b.d(paramInt);
    }
  }
  
  public final class b
    implements Runnable
  {
    public b(boolean paramBoolean) {}
    
    public final void run()
    {
      b.c(paramBoolean);
    }
  }
  
  public final class c
    implements Runnable
  {
    public c(Throwable paramThrowable) {}
    
    public final void run()
    {
      b.e(paramThrowable);
    }
  }
  
  public static abstract interface d
  {
    public abstract void f(Runnable paramRunnable);
  }
}

/* Location:
 * Qualified Name:     gb.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
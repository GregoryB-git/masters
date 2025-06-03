package F;

import android.graphics.Typeface;
import android.os.Handler;

public class a
{
  public final g.c a;
  public final Handler b;
  
  public a(g.c paramc, Handler paramHandler)
  {
    a = paramc;
    b = paramHandler;
  }
  
  public final void a(final int paramInt)
  {
    final g.c localc = a;
    b.post(new b(localc, paramInt));
  }
  
  public void b(f.e parame)
  {
    if (parame.a()) {
      c(a);
    } else {
      a(b);
    }
  }
  
  public final void c(final Typeface paramTypeface)
  {
    final g.c localc = a;
    b.post(new a(localc, paramTypeface));
  }
  
  public class a
    implements Runnable
  {
    public a(g.c paramc, Typeface paramTypeface) {}
    
    public void run()
    {
      localc.b(paramTypeface);
    }
  }
  
  public class b
    implements Runnable
  {
    public b(g.c paramc, int paramInt) {}
    
    public void run()
    {
      localc.a(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     F.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
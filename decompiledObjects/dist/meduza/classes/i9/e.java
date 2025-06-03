package i9;

import aa.m0;
import java.util.concurrent.TimeUnit;
import n7.q;
import n9.a.a;
import n9.a.c;

public final class e
{
  public static final long f = TimeUnit.SECONDS.toMillis(15L);
  public static final long g = TimeUnit.MINUTES.toMillis(1L);
  public final a a;
  public final e9.a b;
  public final q<f> c;
  public final q<h> d;
  public int e = 50;
  
  public e(e9.a parama, n9.a parama1, n paramn)
  {
    b = parama;
    a = new a(parama1);
    c = localm0;
    d = paramn;
  }
  
  public final class a
    implements k1
  {
    public a.a a;
    public final n9.a b;
    
    public a(n9.a parama)
    {
      b = parama;
    }
    
    public final void start()
    {
      long l = e.f;
      a = b.b(a.c.r, l, new u.a(this, 12));
    }
    
    public final void stop()
    {
      a.a locala = a;
      if (locala != null) {
        locala.a();
      }
    }
  }
}

/* Location:
 * Qualified Name:     i9.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
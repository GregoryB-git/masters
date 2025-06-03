package r0;

import B0.m;
import B0.m.c;
import android.net.Uri;
import java.io.IOException;
import x0.E.a;

public abstract interface k
{
  public abstract boolean a();
  
  public abstract g b();
  
  public abstract boolean c(Uri paramUri, long paramLong);
  
  public abstract boolean d(Uri paramUri);
  
  public abstract void e(Uri paramUri, E.a parama, e parame);
  
  public abstract void f();
  
  public abstract void g(Uri paramUri);
  
  public abstract void h(Uri paramUri);
  
  public abstract void i(Uri paramUri);
  
  public abstract void j(b paramb);
  
  public abstract f k(Uri paramUri, boolean paramBoolean);
  
  public abstract void l(b paramb);
  
  public abstract long m();
  
  public abstract void stop();
  
  public static abstract interface a
  {
    public abstract k a(q0.g paramg, m paramm, j paramj);
  }
  
  public static abstract interface b
  {
    public abstract void a();
    
    public abstract boolean e(Uri paramUri, m.c paramc, boolean paramBoolean);
  }
  
  public static final class c
    extends IOException
  {
    public final Uri o;
    
    public c(Uri paramUri)
    {
      o = paramUri;
    }
  }
  
  public static final class d
    extends IOException
  {
    public final Uri o;
    
    public d(Uri paramUri)
    {
      o = paramUri;
    }
  }
  
  public static abstract interface e
  {
    public abstract void b(f paramf);
  }
}

/* Location:
 * Qualified Name:     r0.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
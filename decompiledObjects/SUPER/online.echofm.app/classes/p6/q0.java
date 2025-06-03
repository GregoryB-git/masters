package p6;

import X5.g;
import X5.g.b;
import X5.g.b.a;
import X5.g.c;
import g6.l;
import g6.p;
import java.util.concurrent.CancellationException;

public abstract interface q0
  extends g.b
{
  public static final b n = b.o;
  
  public abstract boolean a();
  
  public abstract X e(l paraml);
  
  public abstract q0 getParent();
  
  public abstract r r(t paramt);
  
  public abstract CancellationException s();
  
  public abstract boolean start();
  
  public abstract X v(boolean paramBoolean1, boolean paramBoolean2, l paraml);
  
  public abstract void w(CancellationException paramCancellationException);
  
  public static final abstract class a
  {
    public static Object b(q0 paramq0, Object paramObject, p paramp)
    {
      return g.b.a.a(paramq0, paramObject, paramp);
    }
    
    public static g.b c(q0 paramq0, g.c paramc)
    {
      return g.b.a.b(paramq0, paramc);
    }
    
    public static g e(q0 paramq0, g.c paramc)
    {
      return g.b.a.c(paramq0, paramc);
    }
    
    public static g f(q0 paramq0, g paramg)
    {
      return g.b.a.d(paramq0, paramg);
    }
  }
  
  public static final class b
    implements g.c
  {}
}

/* Location:
 * Qualified Name:     p6.q0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
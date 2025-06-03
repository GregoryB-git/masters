package eb;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class j1
  extends p.b
{
  public static final Logger a = Logger.getLogger(j1.class.getName());
  public static final ThreadLocal<p> b = new ThreadLocal();
  
  public final p a()
  {
    p localp1 = (p)b.get();
    p localp2 = localp1;
    if (localp1 == null) {
      localp2 = p.b;
    }
    return localp2;
  }
  
  public final void b(p paramp1, p paramp2)
  {
    if (a() != paramp1) {
      a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
    }
    if (paramp2 != p.b)
    {
      paramp1 = b;
    }
    else
    {
      paramp1 = b;
      paramp2 = null;
    }
    paramp1.set(paramp2);
  }
  
  public final p c(p paramp)
  {
    p localp = a();
    b.set(paramp);
    return localp;
  }
}

/* Location:
 * Qualified Name:     eb.j1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
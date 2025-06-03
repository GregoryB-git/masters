package gb;

import eb.d;
import eb.d.a;
import eb.f0;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import x6.b;

public final class n
  extends d
{
  public final p a;
  public final o3 b;
  
  public n(p paramp, o3 paramo3)
  {
    a = paramp;
    b.y(paramo3, "time");
    b = paramo3;
  }
  
  public static Level c(d.a parama)
  {
    int i = parama.ordinal();
    if (i != 1)
    {
      if ((i != 2) && (i != 3)) {
        return Level.FINEST;
      }
      return Level.FINE;
    }
    return Level.FINER;
  }
  
  public final void a(d.a arg1, String paramString)
  {
    f0 localf0 = a.b;
    Level localLevel = c(???);
    if (p.c.isLoggable(localLevel)) {
      p.a(localf0, localLevel, paramString);
    }
    if (??? != d.a.a)
    {
      paramString = a;
      synchronized (a)
      {
        paramString.getClass();
      }
    }
  }
  
  public final void b(d.a parama, String paramString, Object... paramVarArgs)
  {
    Level localLevel = c(parama);
    if (parama != d.a.a)
    {
      p localp = a;
      synchronized (a)
      {
        localp.getClass();
      }
    }
    if (p.c.isLoggable(localLevel)) {
      paramString = MessageFormat.format(paramString, paramVarArgs);
    } else {
      paramString = null;
    }
    a(parama, paramString);
  }
}

/* Location:
 * Qualified Name:     gb.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
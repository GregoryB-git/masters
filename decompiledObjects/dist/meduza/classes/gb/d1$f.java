package gb;

import eb.d;
import eb.d.a;
import eb.f0;
import java.text.MessageFormat;
import java.util.logging.Logger;

public final class d1$f
  extends d
{
  public f0 a;
  
  public final void a(d.a parama, String paramString)
  {
    f0 localf0 = a;
    parama = n.c(parama);
    if (p.c.isLoggable(parama)) {
      p.a(localf0, parama, paramString);
    }
  }
  
  public final void b(d.a parama, String paramString, Object... paramVarArgs)
  {
    f0 localf0 = a;
    parama = n.c(parama);
    if (p.c.isLoggable(parama)) {
      p.a(localf0, parama, MessageFormat.format(paramString, paramVarArgs));
    }
  }
}

/* Location:
 * Qualified Name:     gb.d1.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
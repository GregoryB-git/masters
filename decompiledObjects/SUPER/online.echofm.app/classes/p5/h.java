package p5;

import java.util.HashMap;
import java.util.Map;
import n5.F;

public abstract class h
{
  public static Map a(e parame)
  {
    F localF = parame.d();
    if (localF != null)
    {
      parame = new HashMap();
      parame.put("sql", localF.c());
      parame.put("arguments", localF.b());
    }
    else
    {
      parame = null;
    }
    return parame;
  }
}

/* Location:
 * Qualified Name:     p5.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package g9;

import j9.g;
import java.util.ArrayList;
import ka.d0;

public final class y
  extends l
{
  public final ArrayList d;
  
  public y(j9.l paraml, d0 paramd0)
  {
    super(paraml, locala, paramd0);
    paraml = new ArrayList();
    d = paraml;
    paraml.addAll(x.h(locala, paramd0));
  }
  
  public final boolean d(g paramg)
  {
    return d.contains(paramg.getKey()) ^ true;
  }
}

/* Location:
 * Qualified Name:     g9.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
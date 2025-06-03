package y1;

import java.io.Serializable;
import java.util.HashMap;

public final class G$b
  implements Serializable
{
  public static final a p = new a(null);
  private static final long serialVersionUID = 20160629001L;
  public final HashMap o;
  
  public G$b(HashMap paramHashMap)
  {
    o = paramHashMap;
  }
  
  private final Object readResolve()
  {
    return new G(o);
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     y1.G.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
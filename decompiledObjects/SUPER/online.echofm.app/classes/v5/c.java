package v5;

import io.flutter.embedding.engine.b;
import java.util.HashMap;
import java.util.Map;

public class c
{
  public static volatile c b;
  public final Map a = new HashMap();
  
  public static c b()
  {
    if (b == null)
    {
      try
      {
        if (b == null)
        {
          c localc = new v5/c;
          localc.<init>();
          b = localc;
        }
      }
      finally
      {
        break label40;
      }
      break label45;
      label40:
      throw ((Throwable)localObject);
    }
    label45:
    return b;
  }
  
  public b a(String paramString)
  {
    return (b)a.get(paramString);
  }
}

/* Location:
 * Qualified Name:     v5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
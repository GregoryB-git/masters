package u3;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import r4.b;
import t3.c;

public class a
{
  public final Map a = new HashMap();
  public final Context b;
  public final b c;
  
  public a(Context paramContext, b paramb)
  {
    b = paramContext;
    c = paramb;
  }
  
  public c a(String paramString)
  {
    return new c(b, c, paramString);
  }
  
  public c b(String paramString)
  {
    try
    {
      if (!a.containsKey(paramString)) {
        a.put(paramString, a(paramString));
      }
    }
    finally
    {
      break label56;
    }
    paramString = (c)a.get(paramString);
    return paramString;
    label56:
    throw paramString;
  }
}

/* Location:
 * Qualified Name:     u3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
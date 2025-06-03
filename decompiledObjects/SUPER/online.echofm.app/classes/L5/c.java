package L5;

import E5.d.b;
import Q3.b;
import java.util.HashMap;
import java.util.Map;

public abstract class c
{
  public final d.b a;
  public final String b;
  
  public c(d.b paramb, String paramString)
  {
    a = paramb;
    b = paramString;
  }
  
  public Map g(String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("eventType", paramString1);
    if (paramString2 != null) {
      localHashMap.put("previousChildKey", paramString2);
    }
    return localHashMap;
  }
  
  public void h(String paramString1, b paramb, String paramString2)
  {
    if (!b.equals(paramString1)) {
      return;
    }
    paramb = new x(paramb);
    paramString1 = g(paramString1, paramString2);
    a.a(paramb.b(paramString1).a());
  }
}

/* Location:
 * Qualified Name:     L5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
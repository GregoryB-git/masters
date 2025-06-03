package L5;

import E5.k.d;
import V2.k;
import java.util.HashMap;
import java.util.Map;

public class C$a
  implements k.d
{
  public C$a(C paramC) {}
  
  public void a(Object paramObject)
  {
    C.b(a).c(paramObject);
  }
  
  public void b(String paramString1, String paramString2, Object paramObject)
  {
    HashMap localHashMap = new HashMap();
    String str = paramString2;
    if (paramString2 == null) {
      str = "An unknown error occurred";
    }
    paramString2 = localHashMap;
    if ((paramObject instanceof Map)) {
      paramString2 = (Map)paramObject;
    }
    paramString1 = new y(paramString1, str, paramString2);
    C.b(a).b(paramString1);
  }
  
  public void c() {}
}

/* Location:
 * Qualified Name:     L5.C.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
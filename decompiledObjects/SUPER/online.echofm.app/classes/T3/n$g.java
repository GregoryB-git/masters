package T3;

import java.util.List;
import java.util.Map;

public class n$g
  implements n.j
{
  public n$g(n paramn, n.n paramn1) {}
  
  public void a(Map paramMap)
  {
    String str = (String)paramMap.get("s");
    if (str.equals("ok"))
    {
      Object localObject = (Map)paramMap.get("d");
      if (((Map)localObject).containsKey("w"))
      {
        localObject = (List)((Map)localObject).get("w");
        n.K(b, (List)localObject, n.n.a(a));
      }
    }
    if ((n.n)n.L(b).get(a.d()) == a) {
      if (!str.equals("ok"))
      {
        n.M(b, a.d());
        paramMap = (String)paramMap.get("d");
        n.n.b(a).a(str, paramMap);
      }
      else
      {
        n.n.b(a).a(null, null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     T3.n.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
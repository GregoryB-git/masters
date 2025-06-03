package T3;

import java.util.Map;

public class n$c
  implements n.j
{
  public n$c(n paramn, p paramp) {}
  
  public void a(Map paramMap)
  {
    Object localObject1 = (String)paramMap.get("s");
    if (!((String)localObject1).equals("ok"))
    {
      localObject2 = (String)paramMap.get("d");
      paramMap = (Map)localObject1;
      localObject1 = localObject2;
    }
    else
    {
      paramMap = null;
      localObject1 = null;
    }
    Object localObject2 = a;
    if (localObject2 != null) {
      ((p)localObject2).a(paramMap, (String)localObject1);
    }
  }
}

/* Location:
 * Qualified Name:     T3.n.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
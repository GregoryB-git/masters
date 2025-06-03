package T3;

import c4.c;
import java.util.Map;

public class n$h
  implements n.j
{
  public n$h(n paramn) {}
  
  public void a(Map paramMap)
  {
    String str = (String)paramMap.get("s");
    if (!str.equals("ok"))
    {
      paramMap = (String)paramMap.get("d");
      if (n.E(a).f())
      {
        c localc = n.E(a);
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Failed to send stats: ");
        localStringBuilder.append(str);
        localStringBuilder.append(" (message: ");
        localStringBuilder.append(paramMap);
        localStringBuilder.append(")");
        localc.b(localStringBuilder.toString(), new Object[0]);
      }
    }
  }
}

/* Location:
 * Qualified Name:     T3.n.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package T3;

import c4.c;
import java.util.Map;

public class n$f
  implements n.j
{
  public n$f(n paramn, Long paramLong, n.m paramm) {}
  
  public void a(Map paramMap)
  {
    if ((n.m)n.J(c).get(a) == b)
    {
      n.J(c).remove(a);
      n.m.c(b).a(paramMap);
    }
    else if (n.E(c).f())
    {
      paramMap = n.E(c);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Ignoring on complete for get ");
      localStringBuilder.append(a);
      localStringBuilder.append(" because it was removed already.");
      paramMap.b(localStringBuilder.toString(), new Object[0]);
    }
  }
}

/* Location:
 * Qualified Name:     T3.n.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
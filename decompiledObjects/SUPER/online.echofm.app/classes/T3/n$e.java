package T3;

import c4.c;
import java.util.Map;

public class n$e
  implements n.j
{
  public n$e(n paramn, String paramString, long paramLong, n.o paramo, p paramp) {}
  
  public void a(Map paramMap)
  {
    Object localObject;
    if (n.E(e).f())
    {
      localObject = n.E(e);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(a);
      localStringBuilder.append(" response: ");
      localStringBuilder.append(paramMap);
      ((c)localObject).b(localStringBuilder.toString(), new Object[0]);
    }
    if ((n.o)n.H(e).get(Long.valueOf(b)) == c)
    {
      n.H(e).remove(Long.valueOf(b));
      if (d != null)
      {
        localObject = (String)paramMap.get("s");
        if (((String)localObject).equals("ok"))
        {
          d.a(null, null);
        }
        else
        {
          paramMap = (String)paramMap.get("d");
          d.a((String)localObject, paramMap);
        }
      }
    }
    else if (n.E(e).f())
    {
      localObject = n.E(e);
      paramMap = new StringBuilder();
      paramMap.append("Ignoring on complete for put ");
      paramMap.append(b);
      paramMap.append(" because it was removed already.");
      ((c)localObject).b(paramMap.toString(), new Object[0]);
    }
    n.I(e);
  }
}

/* Location:
 * Qualified Name:     T3.n.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
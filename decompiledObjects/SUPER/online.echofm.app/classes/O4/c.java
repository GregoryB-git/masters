package O4;

import B3.c.b;
import B3.r;
import java.util.Iterator;
import java.util.Set;

public class c
  implements i
{
  public final String a;
  public final d b;
  
  public c(Set paramSet, d paramd)
  {
    a = e(paramSet);
    b = paramd;
  }
  
  public static B3.c c()
  {
    return B3.c.e(i.class).b(r.n(f.class)).f(new b()).d();
  }
  
  public static String e(Set paramSet)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    paramSet = paramSet.iterator();
    while (paramSet.hasNext())
    {
      f localf = (f)paramSet.next();
      localStringBuilder.append(localf.b());
      localStringBuilder.append('/');
      localStringBuilder.append(localf.c());
      if (paramSet.hasNext()) {
        localStringBuilder.append(' ');
      }
    }
    return localStringBuilder.toString();
  }
  
  public String a()
  {
    if (b.b().isEmpty()) {
      return a;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(' ');
    localStringBuilder.append(e(b.b()));
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     O4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
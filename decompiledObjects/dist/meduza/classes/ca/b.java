package ca;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public final class b
  implements f
{
  public final String a;
  public final c b;
  
  public b(Set<d> paramSet, c paramc)
  {
    a = b(paramSet);
    b = paramc;
  }
  
  public static String b(Set<d> paramSet)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    paramSet = paramSet.iterator();
    while (paramSet.hasNext())
    {
      d locald = (d)paramSet.next();
      localStringBuilder.append(locald.a());
      localStringBuilder.append('/');
      localStringBuilder.append(locald.b());
      if (paramSet.hasNext()) {
        localStringBuilder.append(' ');
      }
    }
    return localStringBuilder.toString();
  }
  
  public final String a()
  {
    Object localObject1 = b;
    synchronized (a)
    {
      localObject1 = Collections.unmodifiableSet(a);
      if (((Set)localObject1).isEmpty()) {
        return a;
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append(a);
      ((StringBuilder)localObject1).append(' ');
      Object localObject4 = b;
      synchronized (a)
      {
        localObject4 = Collections.unmodifiableSet(a);
        ((StringBuilder)localObject1).append(b((Set)localObject4));
        return ((StringBuilder)localObject1).toString();
      }
    }
  }
}

/* Location:
 * Qualified Name:     ca.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
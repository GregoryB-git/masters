package Y3;

import d4.a;
import d4.b;
import d4.c;
import d4.f;
import d4.k;
import d4.l;
import d4.n;
import d4.t;
import java.util.Iterator;

public abstract class e
{
  public static long a(k paramk)
  {
    boolean bool = paramk instanceof f;
    long l = 8L;
    if ((!bool) && (!(paramk instanceof l))) {
      if ((paramk instanceof a))
      {
        l = 4L;
      }
      else
      {
        if (!(paramk instanceof t)) {
          break label96;
        }
        l = ((String)paramk.getValue()).length() + 2L;
      }
    }
    if (paramk.t().isEmpty()) {
      return l;
    }
    return l + 24L + a((k)paramk.t());
    label96:
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unknown leaf node type: ");
    localStringBuilder.append(paramk.getClass());
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static long b(n paramn)
  {
    if (paramn.isEmpty()) {
      return 4L;
    }
    if (paramn.B()) {
      return a((k)paramn);
    }
    boolean bool = paramn instanceof c;
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Unexpected node type: ");
    ((StringBuilder)localObject).append(paramn.getClass());
    m.g(bool, ((StringBuilder)localObject).toString());
    Iterator localIterator = paramn.iterator();
    for (long l1 = 1L; localIterator.hasNext(); l1 = l1 + ((d4.m)localObject).c().e().length() + 4L + b(((d4.m)localObject).d())) {
      localObject = (d4.m)localIterator.next();
    }
    long l2 = l1;
    if (!paramn.t().isEmpty()) {
      l2 = l1 + 12L + a((k)paramn.t());
    }
    return l2;
  }
  
  public static int c(n paramn)
  {
    boolean bool = paramn.isEmpty();
    int i = 0;
    if (bool) {
      return 0;
    }
    if (paramn.B()) {
      return 1;
    }
    bool = paramn instanceof c;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unexpected node type: ");
    localStringBuilder.append(paramn.getClass());
    m.g(bool, localStringBuilder.toString());
    paramn = paramn.iterator();
    while (paramn.hasNext()) {
      i += c(((d4.m)paramn.next()).d());
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     Y3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
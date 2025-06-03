package X2;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public final class z$a
  extends x.b
{
  public z a()
  {
    Set localSet = a.entrySet();
    Comparator localComparator = b;
    Object localObject = localSet;
    if (localComparator != null) {
      localObject = P.b(localComparator).e().c(localSet);
    }
    return z.m((Collection)localObject, c);
  }
}

/* Location:
 * Qualified Name:     X2.z.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
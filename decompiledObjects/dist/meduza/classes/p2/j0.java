package p2;

import java.util.List;
import o.a;
import o2.o;
import x2.s.c;

public final class j0
  implements a<List<s.c>, o>
{
  public final Object apply(Object paramObject)
  {
    paramObject = (List)paramObject;
    if ((paramObject != null) && (((List)paramObject).size() > 0)) {
      paramObject = ((s.c)((List)paramObject).get(0)).a();
    } else {
      paramObject = null;
    }
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     p2.j0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
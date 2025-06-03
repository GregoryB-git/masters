package o7;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class t$a<E>
  extends r.a<E>
{
  public final void c(Object paramObject)
  {
    paramObject.getClass();
    b(b + 1);
    Object[] arrayOfObject = a;
    int i = b;
    b = (i + 1);
    arrayOfObject[i] = paramObject;
  }
  
  public final void d(List paramList)
  {
    if ((paramList instanceof Collection))
    {
      int i = b;
      b(paramList.size() + i);
      if ((paramList instanceof r))
      {
        r localr = (r)paramList;
        paramList = a;
        b = localr.h(b, paramList);
        return;
      }
    }
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      c(paramList.next());
    }
  }
  
  public final l0 e()
  {
    c = true;
    Object[] arrayOfObject = a;
    return t.o(b, arrayOfObject);
  }
}

/* Location:
 * Qualified Name:     o7.t.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
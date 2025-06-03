package b;

import dc.l;
import ec.i;
import ec.j;
import java.util.AbstractList;
import java.util.ListIterator;
import rb.h;
import sb.f;

public final class q
  extends j
  implements l<b, h>
{
  public q(w paramw)
  {
    super(1);
  }
  
  public final Object invoke(Object paramObject)
  {
    b localb = (b)paramObject;
    i.e(localb, "backEvent");
    w localw = a;
    paramObject = c;
    ListIterator localListIterator = ((AbstractList)paramObject).listIterator(((f)paramObject).size());
    while (localListIterator.hasPrevious())
    {
      paramObject = localListIterator.previous();
      if (((p)paramObject).isEnabled()) {
        break label64;
      }
    }
    paramObject = null;
    label64:
    paramObject = (p)paramObject;
    d = ((p)paramObject);
    if (paramObject != null) {
      ((p)paramObject).handleOnBackStarted(localb);
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     b.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
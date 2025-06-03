package b;

import dc.l;
import ec.i;
import ec.j;
import java.util.AbstractList;
import java.util.ListIterator;
import rb.h;
import sb.f;

public final class r
  extends j
  implements l<b, h>
{
  public r(w paramw)
  {
    super(1);
  }
  
  public final Object invoke(Object paramObject)
  {
    b localb = (b)paramObject;
    i.e(localb, "backEvent");
    w localw = a;
    Object localObject = d;
    paramObject = localObject;
    if (localObject == null)
    {
      paramObject = c;
      localObject = ((AbstractList)paramObject).listIterator(((f)paramObject).size());
      while (((ListIterator)localObject).hasPrevious())
      {
        paramObject = ((ListIterator)localObject).previous();
        if (((p)paramObject).isEnabled()) {
          break label78;
        }
      }
      paramObject = null;
      label78:
      paramObject = (p)paramObject;
    }
    if (paramObject != null) {
      ((p)paramObject).handleOnBackProgressed(localb);
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     b.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
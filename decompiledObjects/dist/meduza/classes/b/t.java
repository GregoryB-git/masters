package b;

import dc.a;
import ec.j;
import java.util.AbstractList;
import java.util.ListIterator;
import rb.h;
import sb.f;

public final class t
  extends j
  implements a<h>
{
  public t(w paramw)
  {
    super(0);
  }
  
  public final Object invoke()
  {
    w localw = a;
    Object localObject1 = d;
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = c;
      localObject1 = ((AbstractList)localObject2).listIterator(((f)localObject2).size());
      while (((ListIterator)localObject1).hasPrevious())
      {
        localObject2 = ((ListIterator)localObject1).previous();
        if (((p)localObject2).isEnabled()) {
          break label61;
        }
      }
      localObject2 = null;
      label61:
      localObject2 = (p)localObject2;
    }
    d = null;
    if (localObject2 != null) {
      ((p)localObject2).handleOnBackCancelled();
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     b.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
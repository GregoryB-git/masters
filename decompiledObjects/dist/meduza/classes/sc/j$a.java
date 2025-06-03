package sc;

import ec.i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class j$a
  extends a<j>
{
  public final j b;
  public j c;
  
  public j$a(j paramj)
  {
    b = paramj;
  }
  
  public final void b(Object paramObject1, Object paramObject2)
  {
    j localj = (j)paramObject1;
    int i = 1;
    int j;
    if (paramObject2 == null) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0) {
      paramObject1 = b;
    } else {
      paramObject1 = c;
    }
    if (paramObject1 != null)
    {
      paramObject2 = j.a;
      while (!((AtomicReferenceFieldUpdater)paramObject2).compareAndSet(localj, this, paramObject1)) {
        if (((AtomicReferenceFieldUpdater)paramObject2).get(localj) != this) {
          i = 0;
        }
      }
      if ((i != 0) && (j != 0))
      {
        paramObject2 = b;
        paramObject1 = c;
        i.b(paramObject1);
        ((j)paramObject2).e((j)paramObject1);
      }
    }
  }
}

/* Location:
 * Qualified Name:     sc.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
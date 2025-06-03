package rc;

import ub.e;
import ub.h;
import wb.d;

public final class s<T>
  implements e<T>, d
{
  public final e<T> a;
  public final h b;
  
  public s(e<? super T> parame, h paramh)
  {
    a = parame;
    b = paramh;
  }
  
  public final d getCallerFrame()
  {
    Object localObject = a;
    if ((localObject instanceof d)) {
      localObject = (d)localObject;
    } else {
      localObject = null;
    }
    return (d)localObject;
  }
  
  public final h getContext()
  {
    return b;
  }
  
  public final void resumeWith(Object paramObject)
  {
    a.resumeWith(paramObject);
  }
}

/* Location:
 * Qualified Name:     rc.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
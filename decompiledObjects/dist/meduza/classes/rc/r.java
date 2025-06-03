package rc;

import pc.t;
import qc.f;
import rb.h;
import ub.e;
import vb.a;

public final class r<T>
  implements f<T>
{
  public final t<T> a;
  
  public r(t<? super T> paramt)
  {
    a = paramt;
  }
  
  public final Object emit(T paramT, e<? super h> parame)
  {
    paramT = a.k(paramT, parame);
    if (paramT == a.a) {
      return paramT;
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     rc.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
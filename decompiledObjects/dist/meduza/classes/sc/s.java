package sc;

import b.a0;
import eb.y;
import nc.a;
import p2.m0;
import ub.e;
import ub.h;
import wb.d;

public class s<T>
  extends a<T>
  implements d
{
  public final e<T> d;
  
  public s(e parame, h paramh)
  {
    super(paramh, true);
    d = parame;
  }
  
  public final boolean K()
  {
    return true;
  }
  
  public void Z(Object paramObject)
  {
    d.resumeWith(y.c(paramObject));
  }
  
  public final d getCallerFrame()
  {
    Object localObject = d;
    if ((localObject instanceof d)) {
      localObject = (d)localObject;
    } else {
      localObject = null;
    }
    return (d)localObject;
  }
  
  public void p(Object paramObject)
  {
    a0.D(m0.P(d), y.c(paramObject));
  }
}

/* Location:
 * Qualified Name:     sc.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
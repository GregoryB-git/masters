package ec;

import dc.a;
import nc.g0;
import sc.j.b;

public class l
  extends q
  implements a
{
  public l(Object paramObject)
  {
    super(paramObject, g0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
  }
  
  public final jc.b computeReflected()
  {
    t.a.getClass();
    return this;
  }
  
  public final Object invoke()
  {
    return receiver.getClass().getSimpleName();
  }
}

/* Location:
 * Qualified Name:     ec.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
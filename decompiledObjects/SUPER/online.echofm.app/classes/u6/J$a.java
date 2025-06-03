package u6;

import X5.g.b;
import g6.p;
import kotlin.jvm.internal.l;
import p6.K0;

public final class J$a
  extends l
  implements p
{
  public static final a o = new a();
  
  public J$a()
  {
    super(2);
  }
  
  public final Object a(Object paramObject, g.b paramb)
  {
    if ((paramb instanceof K0))
    {
      if ((paramObject instanceof Integer)) {
        paramObject = (Integer)paramObject;
      } else {
        paramObject = null;
      }
      int i;
      if (paramObject != null) {
        i = ((Integer)paramObject).intValue();
      } else {
        i = 1;
      }
      if (i != 0) {
        paramb = Integer.valueOf(i + 1);
      }
      return paramb;
    }
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     u6.J.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
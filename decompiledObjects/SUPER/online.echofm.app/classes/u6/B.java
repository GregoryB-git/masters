package u6;

import X5.d;
import X5.g;
import Y5.b;
import Z5.e;
import p6.D;
import p6.a;

public class B
  extends a
  implements e
{
  public final d r;
  
  public B(g paramg, d paramd)
  {
    super(paramg, true, true);
    r = paramd;
  }
  
  public void F(Object paramObject)
  {
    k.c(b.b(r), D.a(paramObject, r), null, 2, null);
  }
  
  public void G0(Object paramObject)
  {
    d locald = r;
    locald.resumeWith(D.a(paramObject, locald));
  }
  
  public final boolean g0()
  {
    return true;
  }
  
  public final e getCallerFrame()
  {
    Object localObject = r;
    if ((localObject instanceof e)) {
      localObject = (e)localObject;
    } else {
      localObject = null;
    }
    return (e)localObject;
  }
}

/* Location:
 * Qualified Name:     u6.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package kotlin.jvm.internal;

import m6.b;
import m6.g;
import m6.g.a;

public abstract class p
  extends r
  implements g
{
  public p(Class paramClass, String paramString1, String paramString2, int paramInt)
  {
    super(c.NO_RECEIVER, paramClass, paramString1, paramString2, paramInt);
  }
  
  public b computeReflected()
  {
    return v.e(this);
  }
  
  public g.a e()
  {
    ((g)b()).e();
    return null;
  }
  
  public Object invoke(Object paramObject1, Object paramObject2)
  {
    return f(paramObject1, paramObject2);
  }
}

/* Location:
 * Qualified Name:     kotlin.jvm.internal.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
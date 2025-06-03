package kotlin.jvm.internal;

import m6.b;
import m6.f;

public abstract class n
  extends r
  implements f
{
  public n(Object paramObject, Class paramClass, String paramString1, String paramString2, int paramInt)
  {
    super(paramObject, paramClass, paramString1, paramString2, paramInt);
  }
  
  public b computeReflected()
  {
    return v.d(this);
  }
  
  public Object invoke()
  {
    return get();
  }
}

/* Location:
 * Qualified Name:     kotlin.jvm.internal.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
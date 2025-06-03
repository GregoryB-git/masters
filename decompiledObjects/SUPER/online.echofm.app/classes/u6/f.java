package u6;

import X5.g;
import p6.I;

public final class f
  implements I
{
  public final g o;
  
  public f(g paramg)
  {
    o = paramg;
  }
  
  public g f()
  {
    return o;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CoroutineScope(coroutineContext=");
    localStringBuilder.append(f());
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     u6.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
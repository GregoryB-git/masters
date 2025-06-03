package sc;

import f;
import nc.d0;
import ub.h;

public final class d
  implements d0
{
  public final h a;
  
  public d(h paramh)
  {
    a = paramh;
  }
  
  public final h f()
  {
    return a;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("CoroutineScope(coroutineContext=");
    localStringBuilder.append(a);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     sc.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
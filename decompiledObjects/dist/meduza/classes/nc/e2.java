package nc;

import mc.c;
import sc.s;
import ub.e;

public final class e2<U, T extends U>
  extends s<T>
  implements Runnable
{
  public final long e;
  
  public e2(long paramLong, e<? super U> parame)
  {
    super(parame, parame.getContext());
    e = paramLong;
  }
  
  public final String N()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.N());
    localStringBuilder.append("(timeMillis=");
    localStringBuilder.append(e);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  public final void run()
  {
    long l = e;
    Object localObject = m0.b(c);
    if ((localObject instanceof n0)) {
      localObject = (n0)localObject;
    } else {
      localObject = null;
    }
    if (localObject != null)
    {
      int i = mc.a.d;
      p2.m0.d0(l, c.c);
      String str = ((n0)localObject).H();
      localObject = str;
      if (str != null) {}
    }
    else
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Timed out waiting for ");
      ((StringBuilder)localObject).append(l);
      ((StringBuilder)localObject).append(" ms");
      localObject = ((StringBuilder)localObject).toString();
    }
    r(new d2((String)localObject, this));
  }
}

/* Location:
 * Qualified Name:     nc.e2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
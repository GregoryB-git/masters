package gb;

import eb.c;
import eb.k0.g;
import eb.s0;
import eb.t0;
import f;
import java.util.Arrays;
import x6.b;

public final class s2
  extends k0.g
{
  public final c a;
  public final s0 b;
  public final t0<?, ?> c;
  
  public s2(t0<?, ?> paramt0, s0 params0, c paramc)
  {
    b.y(paramt0, "method");
    c = paramt0;
    b.y(params0, "headers");
    b = params0;
    b.y(paramc, "callOptions");
    a = paramc;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (s2.class == paramObject.getClass()))
    {
      paramObject = (s2)paramObject;
      if ((!b.Q(a, a)) || (!b.Q(b, b)) || (!b.Q(c, c))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, c });
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("[method=");
    localStringBuilder.append(c);
    localStringBuilder.append(" headers=");
    localStringBuilder.append(b);
    localStringBuilder.append(" callOptions=");
    localStringBuilder.append(a);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     gb.s2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
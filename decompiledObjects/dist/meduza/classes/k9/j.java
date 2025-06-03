package k9;

import f;
import j9.s;
import ka.d0;
import ka.d0.a;
import ma.w.a;
import u7.m;
import x6.b;

public final class j
  implements p
{
  public d0 a;
  
  public j(d0 paramd0)
  {
    boolean bool;
    if ((!s.j(paramd0)) && (!s.i(paramd0))) {
      bool = false;
    } else {
      bool = true;
    }
    b.Z("NumericIncrementTransformOperation expects a NumberValue operand", bool, new Object[0]);
    a = paramd0;
  }
  
  public final d0 a(d0 paramd01, d0 paramd02)
  {
    return paramd02;
  }
  
  public final d0 b(m paramm, d0 paramd0)
  {
    paramm = c(paramd0);
    if ((s.j(paramm)) && (s.j(a)))
    {
      long l1 = paramm.X();
      long l2;
      if (s.i(a))
      {
        l2 = a.V();
      }
      else
      {
        if (!s.j(a)) {
          break label131;
        }
        l2 = a.X();
      }
      long l3 = l1 + l2;
      if (((l1 ^ l3) & (l2 ^ l3)) >= 0L) {
        l2 = l3;
      } else if (l3 >= 0L) {
        l2 = Long.MIN_VALUE;
      } else {
        l2 = Long.MAX_VALUE;
      }
      paramm = d0.d0();
      paramm.s(l2);
      break label230;
      label131:
      paramm = f.l("Expected 'operand' to be of Number type, but was ");
      paramm.append(a.getClass().getCanonicalName());
      b.T(paramm.toString(), new Object[0]);
      throw null;
    }
    else
    {
      double d1;
      if (s.j(paramm))
      {
        d1 = paramm.X();
      }
      else
      {
        b.Z("Expected NumberValue to be of type DoubleValue, but was ", s.i(paramm), new Object[] { paramd0.getClass().getCanonicalName() });
        d1 = paramm.V();
      }
      double d2 = d();
      paramm = d0.d0();
      paramm.q(d2 + d1);
    }
    label230:
    return (d0)paramm.k();
  }
  
  public final d0 c(d0 paramd0)
  {
    int i;
    if ((!s.j(paramd0)) && (!s.i(paramd0))) {
      i = 0;
    } else {
      i = 1;
    }
    if (i == 0)
    {
      paramd0 = d0.d0();
      paramd0.s(0L);
      paramd0 = (d0)paramd0.k();
    }
    return paramd0;
  }
  
  public final double d()
  {
    if (s.i(a)) {
      return a.V();
    }
    if (s.j(a)) {
      return a.X();
    }
    StringBuilder localStringBuilder = f.l("Expected 'operand' to be of Number type, but was ");
    localStringBuilder.append(a.getClass().getCanonicalName());
    b.T(localStringBuilder.toString(), new Object[0]);
    throw null;
  }
}

/* Location:
 * Qualified Name:     k9.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package h9;

import f;
import j9.o;
import j9.s;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import ka.d0;
import ka.u;
import ma.n1;
import ma.w;
import oa.a;
import q0.g;

public final class b
{
  public static void a(d0 paramd0, m.e parame)
  {
    int i = g.c(paramd0.c0());
    int j = 5;
    Object localObject1;
    double d1;
    switch (i)
    {
    default: 
      parame = f.l("unknown index value type ");
      parame.append(f.s(paramd0.c0()));
      throw new IllegalArgumentException(parame.toString());
    case 10: 
      if (s.d.equals(paramd0.Y().J().get("__type__")))
      {
        j = Integer.MAX_VALUE;
      }
      else
      {
        boolean bool = s.l(paramd0);
        paramd0 = paramd0.Y();
        if (bool)
        {
          paramd0 = paramd0.J();
          parame.t(53);
          j = ((d0)paramd0.get("value")).R().L();
          parame.t(15);
          parame.t(j);
          parame.t(25);
          parame.u("value");
          a((d0)paramd0.get("value"), parame);
          return;
        }
        parame.t(55);
        localObject1 = paramd0.J().entrySet().iterator();
      }
    case 9: 
    case 8: 
    case 7: 
    case 6: 
    case 5: 
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
        paramd0 = (String)((Map.Entry)localObject2).getKey();
        localObject2 = (d0)((Map.Entry)localObject2).getValue();
        parame.t(25);
        parame.u(paramd0);
        a((d0)localObject2, parame);
        continue;
        paramd0 = paramd0.R();
        parame.t(50);
        paramd0 = paramd0.h().iterator();
        while (paramd0.hasNext())
        {
          a((d0)paramd0.next(), parame);
          continue;
          paramd0 = paramd0.W();
          parame.t(45);
          parame.q(paramd0.J());
          d1 = paramd0.K();
          break label572;
          paramd0 = paramd0.Z();
          parame.t(37);
          paramd0 = o.t(paramd0);
          i = paramd0.q();
          while (j < i)
          {
            localObject1 = paramd0.n(j);
            parame.t(60);
            parame.u((String)localObject1);
            j++;
          }
          parame.t(30);
          parame.p(paramd0.T());
          break;
          paramd0 = paramd0.a0();
          parame.t(25);
          parame.u(paramd0);
        }
      }
      parame.t(2L);
      break;
    case 4: 
      paramd0 = paramd0.b0();
      parame.t(20);
      parame.t(paramd0.K());
      l = paramd0.J();
      break;
    case 3: 
      double d2 = paramd0.V();
      if (Double.isNaN(d2))
      {
        j = 13;
        l = j;
        break label617;
      }
      parame.t(15);
      d1 = d2;
      if (d2 == 0.0D) {
        d1 = 0.0D;
      }
      break;
    case 2: 
      parame.t(15);
      d1 = paramd0.X();
      parame.q(d1);
      break;
    case 1: 
      label572:
      parame.t(10);
      if (paramd0.S()) {
        l = 1L;
      } else {
        l = 0L;
      }
      parame.t(l);
      break;
    }
    long l = 5;
    label617:
    parame.t(l);
  }
}

/* Location:
 * Qualified Name:     h9.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
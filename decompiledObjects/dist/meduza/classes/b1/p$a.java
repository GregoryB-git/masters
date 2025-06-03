package b1;

import ec.i;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;

public final class p$a
{
  public k.b a;
  public m b;
  
  public p$a(n paramn, k.b paramb)
  {
    i.b(paramn);
    Object localObject = s.a;
    boolean bool1 = paramn instanceof m;
    boolean bool2 = paramn instanceof d;
    if ((bool1) && (bool2))
    {
      paramn = new e((d)paramn, (m)paramn);
    }
    else if (bool2)
    {
      paramn = new e((d)paramn, null);
    }
    else if (bool1)
    {
      paramn = (m)paramn;
    }
    else
    {
      localObject = paramn.getClass();
      if (s.c((Class)localObject) == 2)
      {
        localObject = s.b.get(localObject);
        i.b(localObject);
        List localList = (List)localObject;
        int i = localList.size();
        int j = 0;
        if (i == 1)
        {
          paramn = new n0(s.a((Constructor)localList.get(0), paramn));
        }
        else
        {
          i = localList.size();
          g[] arrayOfg = new g[i];
          while (j < i)
          {
            localObject = s.a;
            arrayOfg[j] = s.a((Constructor)localList.get(j), paramn);
            j++;
          }
          paramn = new c(arrayOfg);
        }
      }
      else
      {
        paramn = new b0(paramn);
      }
    }
    b = paramn;
    a = paramb;
  }
  
  public final void a(o paramo, k.a parama)
  {
    k.b localb1 = parama.f();
    k.b localb2 = a;
    i.e(localb2, "state1");
    k.b localb3 = localb2;
    if (localb1.compareTo(localb2) < 0) {
      localb3 = localb1;
    }
    a = localb3;
    b.a(paramo, parama);
    a = localb1;
  }
}

/* Location:
 * Qualified Name:     b1.p.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
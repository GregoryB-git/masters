package L5;

import Q3.b;
import Q3.c;
import Q3.m;
import Q3.r;
import Q3.r.b;
import Q3.r.c;
import V2.j;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class D
  implements r.b
{
  public final E5.k a;
  public final V2.k b;
  public final int c;
  
  public D(E5.k paramk, int paramInt)
  {
    a = paramk;
    c = paramInt;
    b = new V2.k();
  }
  
  public r.c a(m paramm)
  {
    Object localObject1 = new HashMap();
    Object localObject2 = new HashMap();
    ((Map)localObject1).put("key", paramm.a());
    ((Map)localObject1).put("value", paramm.c());
    ((Map)localObject2).put("snapshot", localObject1);
    ((Map)localObject2).put("transactionKey", Integer.valueOf(c));
    try
    {
      localObject1 = new L5/C;
      ((C)localObject1).<init>(a);
      localObject2 = ((C)localObject1).c((Map)localObject2);
      Objects.requireNonNull(localObject2);
      localObject2 = (Map)localObject2;
      localObject1 = ((Map)localObject2).get("aborted");
      Objects.requireNonNull(localObject1);
      boolean bool1 = ((Boolean)localObject1).booleanValue();
      localObject1 = ((Map)localObject2).get("exception");
      Objects.requireNonNull(localObject1);
      boolean bool2 = ((Boolean)localObject1).booleanValue();
      if ((!bool1) && (!bool2))
      {
        paramm.d(((Map)localObject2).get("value"));
        return r.b(paramm);
      }
    }
    catch (Exception paramm)
    {
      break label182;
      paramm = r.a();
      return paramm;
      label182:
      Log.e("firebase_database", "An unexpected exception occurred for a transaction.", paramm);
    }
    return r.a();
  }
  
  public void b(c paramc, boolean paramBoolean, b paramb)
  {
    if (paramc != null)
    {
      b.b(y.a(paramc));
    }
    else if (paramb != null)
    {
      paramb = new x(paramb);
      paramc = new HashMap();
      paramc.put("committed", Boolean.valueOf(paramBoolean));
      b.c(paramb.b(paramc).a());
    }
  }
  
  public j c()
  {
    return b.a();
  }
}

/* Location:
 * Qualified Name:     L5.D
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
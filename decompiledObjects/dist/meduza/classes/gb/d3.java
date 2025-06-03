package gb;

import eb.e1;
import eb.u0.b;
import eb.u0.f;
import java.util.List;
import java.util.Map;

public final class d3
  extends u0.f
{
  public final boolean a;
  public final int b;
  public final int c;
  public final i d;
  
  public d3(boolean paramBoolean, int paramInt1, int paramInt2, i parami)
  {
    a = paramBoolean;
    b = paramInt1;
    c = paramInt2;
    d = parami;
  }
  
  public final u0.b a(Map<String, ?> paramMap)
  {
    try
    {
      i locali = d;
      locali.getClass();
      e1 locale1 = null;
      Object localObject;
      if (paramMap != null) {
        try
        {
          List localList = g3.d(g3.b(paramMap));
        }
        catch (RuntimeException localRuntimeException)
        {
          break label65;
        }
      } else {
        localObject = null;
      }
      if ((localObject != null) && (!((List)localObject).isEmpty()))
      {
        localObject = g3.c((List)localObject, a);
        break label93;
        label65:
        localObject = new u0.b(e1.g.g("can't parse load balancer configuration").f((Throwable)localObject));
      }
      else
      {
        localObject = null;
      }
      label93:
      if (localObject == null)
      {
        localObject = locale1;
      }
      else
      {
        locale1 = a;
        if (locale1 != null) {
          return new u0.b(locale1);
        }
        localObject = b;
      }
      paramMap = new u0.b(g2.a(paramMap, a, b, c, localObject));
      return paramMap;
    }
    catch (RuntimeException paramMap) {}
    return new u0.b(e1.g.g("failed to parse service config").f(paramMap));
  }
}

/* Location:
 * Qualified Name:     gb.d3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
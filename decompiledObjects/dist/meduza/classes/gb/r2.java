package gb;

import eb.e1;
import eb.k0;
import eb.k0.e;
import eb.l0;
import eb.u0.b;
import f;
import java.util.Map;
import n7.i;

public final class r2
  extends l0
{
  public static boolean b;
  
  static
  {
    boolean bool;
    if ((!i.a(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"))) && (Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")))) {
      bool = true;
    } else {
      bool = false;
    }
    b = bool;
  }
  
  public final k0 a(k0.e parame)
  {
    if (b) {
      return new p2(parame);
    }
    return new q2(parame);
  }
  
  public String b()
  {
    return "pick_first";
  }
  
  public int c()
  {
    return 5;
  }
  
  public boolean d()
  {
    return true;
  }
  
  public u0.b e(Map<String, ?> paramMap)
  {
    Object localObject;
    try
    {
      localObject = new gb/q2$b;
      ((q2.b)localObject).<init>(n1.b("shuffleAddressList", paramMap));
      paramMap = new u0.b(localObject);
      return paramMap;
    }
    catch (RuntimeException paramMap)
    {
      paramMap = e1.n.f(paramMap);
      localObject = f.l("Failed parsing configuration for ");
      ((StringBuilder)localObject).append(b());
    }
    return new u0.b(paramMap.g(((StringBuilder)localObject).toString()));
  }
}

/* Location:
 * Qualified Name:     gb.r2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
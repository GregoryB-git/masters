package O3;

import V2.i;
import V2.m;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class f$a
  implements i
{
  public f$a(f paramf) {}
  
  public V2.j b(Void paramVoid)
  {
    Object localObject = f.d(a).a(f.c(a), true);
    if (localObject != null)
    {
      paramVoid = f.e(a).b((JSONObject)localObject);
      f.f(a).c(c, (JSONObject)localObject);
      f.g(a, (JSONObject)localObject, "Loaded settings: ");
      localObject = a;
      f.h((f)localObject, cf);
      f.i(a).set(paramVoid);
      ((V2.k)f.j(a).get()).e(paramVoid);
    }
    return m.e(null);
  }
}

/* Location:
 * Qualified Name:     O3.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
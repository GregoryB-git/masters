package D5;

import E5.k.c;
import E5.k.d;
import java.util.HashMap;
import java.util.Map;

public class j$a
  implements k.c
{
  public Map a = new HashMap();
  
  public j$a(j paramj) {}
  
  public void onMethodCall(E5.j paramj, k.d paramd)
  {
    if (j.a(b) == null) {}
    for (;;)
    {
      paramd.a(a);
      break;
      paramj = a;
      paramj.hashCode();
      if (!paramj.equals("getKeyboardState"))
      {
        paramd.c();
        break;
      }
      try
      {
        a = j.a(b).a();
      }
      catch (IllegalStateException paramj)
      {
        paramd.b("error", paramj.getMessage(), null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     D5.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package D5;

import E5.j;
import E5.k.c;
import E5.k.d;
import java.util.ArrayList;

public class r$a
  implements k.c
{
  public r$a(r paramr) {}
  
  public void onMethodCall(j paramj, k.d paramd)
  {
    if (r.a(a) == null) {
      return;
    }
    String str1 = a;
    paramj = b;
    str1.hashCode();
    if (!str1.equals("ProcessText.processTextAction"))
    {
      if (!str1.equals("ProcessText.queryTextActions")) {
        paramd.c();
      } else {
        try
        {
          paramd.a(r.a(a).b());
        }
        catch (IllegalStateException paramj)
        {
          paramd.b("error", paramj.getMessage(), null);
        }
      }
    }
    else
    {
      paramj = (ArrayList)paramj;
      String str2 = (String)paramj.get(0);
      str1 = (String)paramj.get(1);
      boolean bool = ((Boolean)paramj.get(2)).booleanValue();
      r.a(a).c(str2, str1, bool, paramd);
    }
  }
}

/* Location:
 * Qualified Name:     D5.r.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
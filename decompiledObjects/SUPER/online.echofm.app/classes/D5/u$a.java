package D5;

import E5.j;
import E5.k.c;
import E5.k.d;
import java.util.ArrayList;
import t5.b;

public class u$a
  implements k.c
{
  public u$a(u paramu) {}
  
  public void onMethodCall(j paramj, k.d paramd)
  {
    if (u.a(a) == null)
    {
      b.f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
      return;
    }
    Object localObject1 = a;
    Object localObject2 = b;
    paramj = new StringBuilder();
    paramj.append("Received '");
    paramj.append((String)localObject1);
    paramj.append("' message.");
    b.f("SpellCheckChannel", paramj.toString());
    ((String)localObject1).hashCode();
    if (!((String)localObject1).equals("SpellCheck.initiateSpellCheck")) {
      paramd.c();
    } else {
      try
      {
        localObject1 = (ArrayList)localObject2;
        paramj = (String)((ArrayList)localObject1).get(0);
        localObject1 = (String)((ArrayList)localObject1).get(1);
        u.a(a).a(paramj, (String)localObject1, paramd);
      }
      catch (IllegalStateException paramj)
      {
        paramd.b("error", paramj.getMessage(), null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     D5.u.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
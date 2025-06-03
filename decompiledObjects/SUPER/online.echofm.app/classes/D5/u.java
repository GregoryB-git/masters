package D5;

import E5.j;
import E5.k;
import E5.k.c;
import E5.k.d;
import E5.q;
import java.util.ArrayList;
import t5.b;
import w5.a;

public class u
{
  public final k a;
  public b b;
  public final k.c c;
  
  public u(a parama)
  {
    a locala = new a();
    c = locala;
    parama = new k(parama, "flutter/spellcheck", q.b);
    a = parama;
    parama.e(locala);
  }
  
  public void b(b paramb)
  {
    b = paramb;
  }
  
  public class a
    implements k.c
  {
    public a() {}
    
    public void onMethodCall(j paramj, k.d paramd)
    {
      if (u.a(u.this) == null)
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
          u.a(u.this).a(paramj, (String)localObject1, paramd);
        }
        catch (IllegalStateException paramj)
        {
          paramd.b("error", paramj.getMessage(), null);
        }
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(String paramString1, String paramString2, k.d paramd);
  }
}

/* Location:
 * Qualified Name:     D5.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
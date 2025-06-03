package D5;

import E5.c;
import E5.k;
import E5.k.c;
import E5.k.d;
import E5.q;
import java.util.HashMap;
import java.util.Map;

public class j
{
  public final k a;
  public b b;
  public final k.c c;
  
  public j(c paramc)
  {
    a locala = new a();
    c = locala;
    paramc = new k(paramc, "flutter/keyboard", q.b);
    a = paramc;
    paramc.e(locala);
  }
  
  public void b(b paramb)
  {
    b = paramb;
  }
  
  public class a
    implements k.c
  {
    public Map a = new HashMap();
    
    public a() {}
    
    public void onMethodCall(E5.j paramj, k.d paramd)
    {
      if (j.a(j.this) == null) {}
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
          a = j.a(j.this).a();
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
    public abstract Map a();
  }
}

/* Location:
 * Qualified Name:     D5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
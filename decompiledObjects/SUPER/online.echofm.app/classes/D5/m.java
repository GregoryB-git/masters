package D5;

import E5.j;
import E5.k;
import E5.k.c;
import E5.k.d;
import E5.q;
import java.util.HashMap;
import t5.b;
import w5.a;

public class m
{
  public final k a;
  public b b;
  public final k.c c;
  
  public m(a parama)
  {
    a locala = new a();
    c = locala;
    parama = new k(parama, "flutter/mousecursor", q.b);
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
      if (m.a(m.this) == null) {
        return;
      }
      String str = a;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Received '");
      localStringBuilder.append(str);
      localStringBuilder.append("' message.");
      b.f("MouseCursorChannel", localStringBuilder.toString());
      try
      {
        if ((str.hashCode() == -1307105544) && (str.equals("activateSystemCursor"))) {
          paramj = (String)((HashMap)b).get("kind");
        }
        return;
      }
      catch (Exception localException1)
      {
        try
        {
          m.a(m.this).a(paramj);
          paramd.a(Boolean.TRUE);
        }
        catch (Exception localException2)
        {
          paramj = new java/lang/StringBuilder;
          paramj.<init>();
          paramj.append("Error when setting cursors: ");
          paramj.append(localException2.getMessage());
          paramd.b("error", paramj.toString(), null);
        }
        localException1 = localException1;
        paramj = new StringBuilder();
        paramj.append("Unhandled error: ");
        paramj.append(localException2.getMessage());
        paramd.b("error", paramj.toString(), null);
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(String paramString);
  }
}

/* Location:
 * Qualified Name:     D5.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
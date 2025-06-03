package D5;

import E5.j;
import E5.k;
import E5.k.c;
import E5.k.d;
import E5.q;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Map;
import w5.a;

public class r
{
  public final k a;
  public final PackageManager b;
  public b c;
  public final k.c d;
  
  public r(a parama, PackageManager paramPackageManager)
  {
    a locala = new a();
    d = locala;
    b = paramPackageManager;
    parama = new k(parama, "flutter/processtext", q.b);
    a = parama;
    parama.e(locala);
  }
  
  public void b(b paramb)
  {
    c = paramb;
  }
  
  public class a
    implements k.c
  {
    public a() {}
    
    public void onMethodCall(j paramj, k.d paramd)
    {
      if (r.a(r.this) == null) {
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
            paramd.a(r.a(r.this).b());
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
        r.a(r.this).c(str2, str1, bool, paramd);
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract Map b();
    
    public abstract void c(String paramString1, String paramString2, boolean paramBoolean, k.d paramd);
  }
}

/* Location:
 * Qualified Name:     D5.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
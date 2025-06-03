package D5;

import E5.g;
import E5.j;
import E5.k;
import E5.k.c;
import E5.k.d;
import java.util.HashMap;
import java.util.Map;
import t5.b;
import w5.a;

public class n
{
  public final k a;
  public final k.c b;
  
  public n(a parama)
  {
    a locala = new a();
    b = locala;
    parama = new k(parama, "flutter/navigation", g.a);
    a = parama;
    parama.e(locala);
  }
  
  public void a()
  {
    b.f("NavigationChannel", "Sending message to pop route.");
    a.c("popRoute", null);
  }
  
  public void b(String paramString)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Sending message to push route information '");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("'");
    b.f("NavigationChannel", ((StringBuilder)localObject).toString());
    localObject = new HashMap();
    ((Map)localObject).put("location", paramString);
    a.c("pushRouteInformation", localObject);
  }
  
  public void c(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Sending message to set initial route to '");
    localStringBuilder.append(paramString);
    localStringBuilder.append("'");
    b.f("NavigationChannel", localStringBuilder.toString());
    a.c("setInitialRoute", paramString);
  }
  
  public class a
    implements k.c
  {
    public a() {}
    
    public void onMethodCall(j paramj, k.d paramd)
    {
      paramd.a(null);
    }
  }
}

/* Location:
 * Qualified Name:     D5.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
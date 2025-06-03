package k5;

import A5.a;
import A5.a.b;
import E5.c;
import E5.j;
import E5.k;
import E5.k.c;
import E5.k.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class F
  implements a, k.c
{
  public static Map c;
  public static List d = new ArrayList();
  public k a;
  public E b;
  
  public final void a(String paramString, Object... paramVarArgs)
  {
    Iterator localIterator = d.iterator();
    while (localIterator.hasNext())
    {
      F localF = (F)localIterator.next();
      ArrayList localArrayList = new ArrayList(Arrays.asList(paramVarArgs));
      a.c(paramString, localArrayList);
    }
  }
  
  public void onAttachedToEngine(a.b paramb)
  {
    c localc = paramb.b();
    k localk = new k(localc, "com.ryanheise.audio_session");
    a = localk;
    localk.e(this);
    b = new E(paramb.a(), localc);
    d.add(this);
  }
  
  public void onDetachedFromEngine(a.b paramb)
  {
    a.e(null);
    a = null;
    b.b();
    b = null;
    d.remove(this);
  }
  
  public void onMethodCall(j paramj, k.d paramd)
  {
    List localList = (List)b;
    paramj = a;
    paramj.hashCode();
    if (!paramj.equals("setConfiguration"))
    {
      if (!paramj.equals("getConfiguration")) {
        paramd.c();
      } else {
        paramd.a(c);
      }
    }
    else
    {
      c = (Map)localList.get(0);
      paramd.a(null);
      a("onConfigurationChanged", new Object[] { c });
    }
  }
}

/* Location:
 * Qualified Name:     k5.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
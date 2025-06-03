package m5;

import E5.c;
import E5.j;
import E5.k.c;
import E5.k.d;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class g
  implements k.c
{
  public final Context a;
  public final c b;
  public final Map c = new HashMap();
  
  public g(Context paramContext, c paramc)
  {
    a = paramContext;
    b = paramc;
  }
  
  public void a()
  {
    Iterator localIterator = new ArrayList(c.values()).iterator();
    while (localIterator.hasNext()) {
      ((d)localIterator.next()).B0();
    }
    c.clear();
  }
  
  public void onMethodCall(j paramj, k.d paramd)
  {
    String str = a;
    str.hashCode();
    int i = str.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 2146443344: 
      if (str.equals("disposeAllPlayers")) {
        j = 2;
      }
      break;
    case 1999985120: 
      if (str.equals("disposePlayer")) {
        j = 1;
      }
      break;
    case 3237136: 
      if (str.equals("init")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramd.c();
      break;
    case 2: 
      a();
    case 1: 
      for (paramj = new HashMap();; paramj = new HashMap())
      {
        paramd.a(paramj);
        break;
        str = (String)paramj.a("id");
        paramj = (d)c.get(str);
        if (paramj != null)
        {
          paramj.B0();
          c.remove(str);
        }
      }
    case 0: 
      str = (String)paramj.a("id");
      if (c.containsKey(str))
      {
        paramj = new StringBuilder();
        paramj.append("Platform player ");
        paramj.append(str);
        paramj.append(" already exists");
        paramd.b(paramj.toString(), null, null);
      }
      else
      {
        List localList = (List)paramj.a("androidAudioEffects");
        c.put(str, new d(a, b, str, (Map)paramj.a("audioLoadConfiguration"), localList, (Boolean)paramj.a("androidOffloadSchedulingEnabled")));
        paramd.a(null);
      }
      break;
    }
  }
}

/* Location:
 * Qualified Name:     m5.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
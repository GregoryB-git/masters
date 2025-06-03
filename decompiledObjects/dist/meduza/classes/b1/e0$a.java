package b1;

import android.os.BaseBundle;
import android.os.Bundle;
import ec.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class e0$a
{
  public static e0 a(Bundle paramBundle1, Bundle paramBundle2)
  {
    Object localObject2;
    if (paramBundle1 == null)
    {
      if (paramBundle2 == null)
      {
        paramBundle1 = new e0();
      }
      else
      {
        localObject1 = new HashMap();
        paramBundle1 = paramBundle2.keySet().iterator();
        while (paramBundle1.hasNext())
        {
          localObject2 = (String)paramBundle1.next();
          i.d(localObject2, "key");
          ((HashMap)localObject1).put(localObject2, paramBundle2.get((String)localObject2));
        }
        paramBundle1 = new e0((HashMap)localObject1);
      }
      return paramBundle1;
    }
    paramBundle2 = e0.class.getClassLoader();
    i.b(paramBundle2);
    paramBundle1.setClassLoader(paramBundle2);
    paramBundle2 = paramBundle1.getParcelableArrayList("keys");
    Object localObject1 = paramBundle1.getParcelableArrayList("values");
    int i = 0;
    int j;
    if ((paramBundle2 != null) && (localObject1 != null) && (paramBundle2.size() == ((ArrayList)localObject1).size())) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      localObject2 = new LinkedHashMap();
      int k = paramBundle2.size();
      for (j = i; j < k; j++)
      {
        paramBundle1 = paramBundle2.get(j);
        i.c(paramBundle1, "null cannot be cast to non-null type kotlin.String");
        ((Map)localObject2).put((String)paramBundle1, ((ArrayList)localObject1).get(j));
      }
      return new e0((HashMap)localObject2);
    }
    throw new IllegalStateException("Invalid bundle passed as restored state".toString());
  }
}

/* Location:
 * Qualified Name:     b1.e0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
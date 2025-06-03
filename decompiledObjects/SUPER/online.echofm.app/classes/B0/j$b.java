package B0;

import android.content.Context;
import g0.M;
import g0.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class j$b
{
  public final Context a;
  public Map b;
  public int c;
  public c d;
  public boolean e;
  
  public j$b(Context paramContext)
  {
    Context localContext;
    if (paramContext == null) {
      localContext = null;
    } else {
      localContext = paramContext.getApplicationContext();
    }
    a = localContext;
    b = b(M.R(paramContext));
    c = 2000;
    d = c.a;
    e = true;
  }
  
  public static Map b(String paramString)
  {
    int[] arrayOfInt = j.k(paramString);
    HashMap localHashMap = new HashMap(8);
    localHashMap.put(Integer.valueOf(0), Long.valueOf(1000000L));
    paramString = j.p;
    localHashMap.put(Integer.valueOf(2), (Long)paramString.get(arrayOfInt[0]));
    localHashMap.put(Integer.valueOf(3), (Long)j.q.get(arrayOfInt[1]));
    localHashMap.put(Integer.valueOf(4), (Long)j.r.get(arrayOfInt[2]));
    localHashMap.put(Integer.valueOf(5), (Long)j.s.get(arrayOfInt[3]));
    localHashMap.put(Integer.valueOf(10), (Long)j.t.get(arrayOfInt[4]));
    localHashMap.put(Integer.valueOf(9), (Long)j.u.get(arrayOfInt[5]));
    localHashMap.put(Integer.valueOf(7), (Long)paramString.get(arrayOfInt[0]));
    return localHashMap;
  }
  
  public j a()
  {
    return new j(a, b, c, d, e, null);
  }
}

/* Location:
 * Qualified Name:     B0.j.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
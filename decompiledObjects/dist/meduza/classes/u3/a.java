package u3;

import android.util.SparseArray;
import f;
import h3.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class a
{
  public static SparseArray<e> a = new SparseArray();
  public static HashMap<e, Integer> b;
  
  static
  {
    Object localObject = new HashMap();
    b = (HashMap)localObject;
    ((HashMap)localObject).put(e.a, Integer.valueOf(0));
    b.put(e.b, Integer.valueOf(1));
    b.put(e.c, Integer.valueOf(2));
    Iterator localIterator = b.keySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (e)localIterator.next();
      a.append(((Integer)b.get(localObject)).intValue(), localObject);
    }
  }
  
  public static int a(e parame)
  {
    Object localObject = (Integer)b.get(parame);
    if (localObject != null) {
      return ((Integer)localObject).intValue();
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("PriorityMapping is missing known Priority value ");
    ((StringBuilder)localObject).append(parame);
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public static e b(int paramInt)
  {
    e locale = (e)a.get(paramInt);
    if (locale != null) {
      return locale;
    }
    throw new IllegalArgumentException(f.h("Unknown Priority for value ", paramInt));
  }
}

/* Location:
 * Qualified Name:     u3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
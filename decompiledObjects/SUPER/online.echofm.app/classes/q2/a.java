package q2;

import android.util.SparseArray;
import c2.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public abstract class a
{
  public static SparseArray a = new SparseArray();
  public static HashMap b;
  
  static
  {
    Object localObject = new HashMap();
    b = (HashMap)localObject;
    ((HashMap)localObject).put(d.o, Integer.valueOf(0));
    b.put(d.p, Integer.valueOf(1));
    b.put(d.q, Integer.valueOf(2));
    Iterator localIterator = b.keySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (d)localIterator.next();
      a.append(((Integer)b.get(localObject)).intValue(), localObject);
    }
  }
  
  public static int a(d paramd)
  {
    Object localObject = (Integer)b.get(paramd);
    if (localObject != null) {
      return ((Integer)localObject).intValue();
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("PriorityMapping is missing known Priority value ");
    ((StringBuilder)localObject).append(paramd);
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public static d b(int paramInt)
  {
    Object localObject = (d)a.get(paramInt);
    if (localObject != null) {
      return (d)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Unknown Priority for value ");
    ((StringBuilder)localObject).append(paramInt);
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
}

/* Location:
 * Qualified Name:     q2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
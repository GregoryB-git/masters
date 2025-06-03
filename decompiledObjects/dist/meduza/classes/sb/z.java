package sb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import rb.d;

public class z
  extends y
{
  public static final <K, V> Map<K, V> K0(d<? extends K, ? extends V>... paramVarArgs)
  {
    if (paramVarArgs.length > 0)
    {
      LinkedHashMap localLinkedHashMap = new LinkedHashMap(y.H0(paramVarArgs.length));
      int i = paramVarArgs.length;
      for (int j = 0;; j++)
      {
        localObject = localLinkedHashMap;
        if (j >= i) {
          break;
        }
        localObject = paramVarArgs[j];
        localLinkedHashMap.put(a, b);
      }
    }
    Object localObject = t.a;
    return (Map<K, V>)localObject;
  }
  
  public static final Map L0(ArrayList paramArrayList)
  {
    int i = paramArrayList.size();
    if (i != 0)
    {
      if (i != 1)
      {
        LinkedHashMap localLinkedHashMap = new LinkedHashMap(y.H0(paramArrayList.size()));
        M0(paramArrayList, localLinkedHashMap);
        paramArrayList = localLinkedHashMap;
      }
      else
      {
        paramArrayList = y.I0((d)paramArrayList.get(0));
      }
    }
    else {
      paramArrayList = t.a;
    }
    return paramArrayList;
  }
  
  public static final void M0(ArrayList paramArrayList, LinkedHashMap paramLinkedHashMap)
  {
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      d locald = (d)paramArrayList.next();
      paramLinkedHashMap.put(a, b);
    }
  }
}

/* Location:
 * Qualified Name:     sb.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
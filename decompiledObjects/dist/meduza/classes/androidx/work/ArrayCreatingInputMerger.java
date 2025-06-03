package androidx.work;

import ec.i;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import o2.f;

public final class ArrayCreatingInputMerger
  extends f
{
  public final c a(ArrayList paramArrayList)
  {
    c.a locala = new c.a();
    HashMap localHashMap = new HashMap();
    Iterator localIterator1 = paramArrayList.iterator();
    while (localIterator1.hasNext())
    {
      paramArrayList = Collections.unmodifiableMap(nexta);
      i.d(paramArrayList, "input.keyValueMap");
      Iterator localIterator2 = paramArrayList.entrySet().iterator();
      while (localIterator2.hasNext())
      {
        paramArrayList = (Map.Entry)localIterator2.next();
        String str = (String)paramArrayList.getKey();
        Object localObject1 = paramArrayList.getValue();
        if (localObject1 != null) {
          paramArrayList = localObject1.getClass();
        } else {
          paramArrayList = String.class;
        }
        Object localObject2 = localHashMap.get(str);
        i.d(str, "key");
        if (localObject2 == null)
        {
          if (paramArrayList.isArray())
          {
            paramArrayList = (ArrayList)localObject1;
          }
          else
          {
            paramArrayList = Array.newInstance(paramArrayList, 1);
            Array.set(paramArrayList, 0, localObject1);
            i.d(paramArrayList, "newArray");
          }
        }
        else {
          for (;;)
          {
            break;
            Class localClass = localObject2.getClass();
            int i;
            if (i.a(localClass, paramArrayList))
            {
              i.d(localObject1, "value");
              i = Array.getLength(localObject2);
              int j = Array.getLength(localObject1);
              paramArrayList = localObject2.getClass().getComponentType();
              i.b(paramArrayList);
              paramArrayList = Array.newInstance(paramArrayList, i + j);
              System.arraycopy(localObject2, 0, paramArrayList, 0, i);
              System.arraycopy(localObject1, 0, paramArrayList, i, j);
              i.d(paramArrayList, "newArray");
            }
            else
            {
              if (!i.a(localClass.getComponentType(), paramArrayList)) {
                break label342;
              }
              i = Array.getLength(localObject2);
              paramArrayList = Array.newInstance(paramArrayList, i + 1);
              System.arraycopy(localObject2, 0, paramArrayList, 0, i);
              Array.set(paramArrayList, i, localObject1);
              i.d(paramArrayList, "newArray");
            }
          }
        }
        i.d(paramArrayList, "if (existingValue == nul…      }\n                }");
        localHashMap.put(str, paramArrayList);
      }
      continue;
      label342:
      throw new IllegalArgumentException();
    }
    locala.a(localHashMap);
    paramArrayList = new c(a);
    c.e(paramArrayList);
    return paramArrayList;
  }
}

/* Location:
 * Qualified Name:     androidx.work.ArrayCreatingInputMerger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
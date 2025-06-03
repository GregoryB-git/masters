package androidx.work;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class c$a
{
  public HashMap a = new HashMap();
  
  public final void a(HashMap paramHashMap)
  {
    Object localObject1 = paramHashMap.entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
      paramHashMap = (String)((Map.Entry)localObject2).getKey();
      localObject2 = ((Map.Entry)localObject2).getValue();
      if (localObject2 == null)
      {
        a.put(paramHashMap, null);
      }
      else
      {
        Object localObject3 = localObject2.getClass();
        if ((localObject3 != Boolean.class) && (localObject3 != Byte.class) && (localObject3 != Integer.class) && (localObject3 != Long.class) && (localObject3 != Float.class) && (localObject3 != Double.class) && (localObject3 != String.class) && (localObject3 != Boolean[].class) && (localObject3 != Byte[].class) && (localObject3 != Integer[].class) && (localObject3 != Long[].class) && (localObject3 != Float[].class) && (localObject3 != Double[].class) && (localObject3 != String[].class))
        {
          int i = 0;
          int j = 0;
          int k = 0;
          int m = 0;
          int n = 0;
          int i1 = 0;
          Object localObject4;
          if (localObject3 == boolean[].class)
          {
            localObject3 = a;
            localObject2 = (boolean[])localObject2;
            localObject4 = c.b;
            localObject4 = new Boolean[localObject2.length];
            while (i1 < localObject2.length)
            {
              localObject4[i1] = Boolean.valueOf(localObject2[i1]);
              i1++;
            }
            ((HashMap)localObject3).put(paramHashMap, localObject4);
          }
          else if (localObject3 == byte[].class)
          {
            localObject3 = a;
            localObject2 = (byte[])localObject2;
            localObject4 = c.b;
            localObject4 = new Byte[localObject2.length];
            for (i1 = i; i1 < localObject2.length; i1++) {
              localObject4[i1] = Byte.valueOf(localObject2[i1]);
            }
            ((HashMap)localObject3).put(paramHashMap, localObject4);
          }
          else if (localObject3 == int[].class)
          {
            localObject3 = a;
            localObject2 = (int[])localObject2;
            localObject4 = c.b;
            localObject4 = new Integer[localObject2.length];
            for (i1 = j; i1 < localObject2.length; i1++) {
              localObject4[i1] = Integer.valueOf(localObject2[i1]);
            }
            ((HashMap)localObject3).put(paramHashMap, localObject4);
          }
          else if (localObject3 == long[].class)
          {
            localObject3 = a;
            localObject2 = (long[])localObject2;
            localObject4 = c.b;
            localObject4 = new Long[localObject2.length];
            for (i1 = k; i1 < localObject2.length; i1++) {
              localObject4[i1] = Long.valueOf(localObject2[i1]);
            }
            ((HashMap)localObject3).put(paramHashMap, localObject4);
          }
          else if (localObject3 == float[].class)
          {
            localObject3 = a;
            localObject2 = (float[])localObject2;
            localObject4 = c.b;
            localObject4 = new Float[localObject2.length];
            for (i1 = m; i1 < localObject2.length; i1++) {
              localObject4[i1] = Float.valueOf(localObject2[i1]);
            }
            ((HashMap)localObject3).put(paramHashMap, localObject4);
          }
          else if (localObject3 == double[].class)
          {
            localObject3 = a;
            localObject2 = (double[])localObject2;
            localObject4 = c.b;
            localObject4 = new Double[localObject2.length];
            for (i1 = n; i1 < localObject2.length; i1++) {
              localObject4[i1] = Double.valueOf(localObject2[i1]);
            }
            ((HashMap)localObject3).put(paramHashMap, localObject4);
          }
          else
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("Key ");
            ((StringBuilder)localObject1).append(paramHashMap);
            ((StringBuilder)localObject1).append(" has invalid type ");
            ((StringBuilder)localObject1).append(localObject3);
            throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
          }
        }
        else
        {
          a.put(paramHashMap, localObject2);
        }
      }
    }
  }
  
  public final void b(String paramString1, String paramString2)
  {
    a.put(paramString1, paramString2);
  }
}

/* Location:
 * Qualified Name:     androidx.work.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
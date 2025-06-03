package L0;

import F0.n;
import g0.z;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d
  extends e
{
  public long b = -9223372036854775807L;
  public long[] c = new long[0];
  public long[] d = new long[0];
  
  public d()
  {
    super(new n());
  }
  
  public static Boolean g(z paramz)
  {
    int i = paramz.G();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return Boolean.valueOf(bool);
  }
  
  public static Object h(z paramz, int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 8)
            {
              if (paramInt != 10)
              {
                if (paramInt != 11) {
                  return null;
                }
                return i(paramz);
              }
              return m(paramz);
            }
            return k(paramz);
          }
          return l(paramz);
        }
        return n(paramz);
      }
      return g(paramz);
    }
    return j(paramz);
  }
  
  public static Date i(z paramz)
  {
    Date localDate = new Date(j(paramz).doubleValue());
    paramz.U(2);
    return localDate;
  }
  
  public static Double j(z paramz)
  {
    return Double.valueOf(Double.longBitsToDouble(paramz.z()));
  }
  
  public static HashMap k(z paramz)
  {
    int i = paramz.K();
    HashMap localHashMap = new HashMap(i);
    for (int j = 0; j < i; j++)
    {
      String str = n(paramz);
      Object localObject = h(paramz, o(paramz));
      if (localObject != null) {
        localHashMap.put(str, localObject);
      }
    }
    return localHashMap;
  }
  
  public static HashMap l(z paramz)
  {
    HashMap localHashMap = new HashMap();
    for (;;)
    {
      String str = n(paramz);
      int i = o(paramz);
      if (i == 9) {
        return localHashMap;
      }
      Object localObject = h(paramz, i);
      if (localObject != null) {
        localHashMap.put(str, localObject);
      }
    }
  }
  
  public static ArrayList m(z paramz)
  {
    int i = paramz.K();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++)
    {
      Object localObject = h(paramz, o(paramz));
      if (localObject != null) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  public static String n(z paramz)
  {
    int i = paramz.M();
    int j = paramz.f();
    paramz.U(i);
    return new String(paramz.e(), j, i);
  }
  
  public static int o(z paramz)
  {
    return paramz.G();
  }
  
  public boolean b(z paramz)
  {
    return true;
  }
  
  public boolean c(z paramz, long paramLong)
  {
    if (o(paramz) != 2) {
      return false;
    }
    if (!"onMetaData".equals(n(paramz))) {
      return false;
    }
    if (paramz.a() == 0) {
      return false;
    }
    if (o(paramz) != 8) {
      return false;
    }
    paramz = k(paramz);
    Object localObject1 = paramz.get("duration");
    if ((localObject1 instanceof Double))
    {
      double d1 = ((Double)localObject1).doubleValue();
      if (d1 > 0.0D) {
        b = ((d1 * 1000000.0D));
      }
    }
    paramz = paramz.get("keyframes");
    if ((paramz instanceof Map))
    {
      localObject1 = (Map)paramz;
      paramz = ((Map)localObject1).get("filepositions");
      localObject1 = ((Map)localObject1).get("times");
      if (((paramz instanceof List)) && ((localObject1 instanceof List)))
      {
        paramz = (List)paramz;
        List localList = (List)localObject1;
        int i = localList.size();
        c = new long[i];
        d = new long[i];
        int j = 0;
        while (j < i)
        {
          localObject1 = paramz.get(j);
          Object localObject2 = localList.get(j);
          if (((localObject2 instanceof Double)) && ((localObject1 instanceof Double)))
          {
            c[j] = ((((Double)localObject2).doubleValue() * 1000000.0D));
            d[j] = ((Double)localObject1).longValue();
            j++;
          }
          else
          {
            c = new long[0];
            d = new long[0];
          }
        }
      }
    }
    return false;
  }
  
  public long d()
  {
    return b;
  }
  
  public long[] e()
  {
    return d;
  }
  
  public long[] f()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     L0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
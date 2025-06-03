package g4;

import c4.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v5.u;

public final class c
  extends d
{
  public long b = -9223372036854775807L;
  public long[] c = new long[0];
  public long[] d = new long[0];
  
  public c()
  {
    super(new g());
  }
  
  public static Serializable c(int paramInt, u paramu)
  {
    if (paramInt != 0)
    {
      boolean bool = false;
      int i = 0;
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          Object localObject1;
          if (paramInt != 3)
          {
            if (paramInt != 8)
            {
              if (paramInt != 10)
              {
                if (paramInt != 11) {
                  return null;
                }
                localObject1 = new Date(Double.valueOf(Double.longBitsToDouble(paramu.o())).doubleValue());
                paramu.H(2);
                return (Serializable)localObject1;
              }
              int j = paramu.y();
              localObject2 = new ArrayList(j);
              for (paramInt = i; paramInt < j; paramInt++)
              {
                localObject1 = c(paramu.v(), paramu);
                if (localObject1 != null) {
                  ((ArrayList)localObject2).add(localObject1);
                }
              }
              return (Serializable)localObject2;
            }
            return d(paramu);
          }
          Object localObject2 = new HashMap();
          for (;;)
          {
            localObject1 = e(paramu);
            paramInt = paramu.v();
            if (paramInt == 9) {
              return (Serializable)localObject2;
            }
            Serializable localSerializable = c(paramInt, paramu);
            if (localSerializable != null) {
              ((HashMap)localObject2).put(localObject1, localSerializable);
            }
          }
        }
        return e(paramu);
      }
      if (paramu.v() == 1) {
        bool = true;
      }
      return Boolean.valueOf(bool);
    }
    return Double.valueOf(Double.longBitsToDouble(paramu.o()));
  }
  
  public static HashMap<String, Object> d(u paramu)
  {
    int i = paramu.y();
    HashMap localHashMap = new HashMap(i);
    for (int j = 0; j < i; j++)
    {
      String str = e(paramu);
      Serializable localSerializable = c(paramu.v(), paramu);
      if (localSerializable != null) {
        localHashMap.put(str, localSerializable);
      }
    }
    return localHashMap;
  }
  
  public static String e(u paramu)
  {
    int i = paramu.A();
    int j = b;
    paramu.H(i);
    return new String(a, j, i);
  }
  
  public final boolean a(u paramu)
  {
    return true;
  }
  
  public final boolean b(long paramLong, u paramu)
  {
    if (paramu.v() != 2) {
      return false;
    }
    if (!"onMetaData".equals(e(paramu))) {
      return false;
    }
    if (c - b == 0) {
      return false;
    }
    if (paramu.v() != 8) {
      return false;
    }
    paramu = d(paramu);
    Object localObject1 = paramu.get("duration");
    if ((localObject1 instanceof Double))
    {
      double d1 = ((Double)localObject1).doubleValue();
      if (d1 > 0.0D) {
        b = ((d1 * 1000000.0D));
      }
    }
    paramu = paramu.get("keyframes");
    if ((paramu instanceof Map))
    {
      localObject1 = (Map)paramu;
      paramu = ((Map)localObject1).get("filepositions");
      localObject1 = ((Map)localObject1).get("times");
      if (((paramu instanceof List)) && ((localObject1 instanceof List)))
      {
        paramu = (List)paramu;
        List localList = (List)localObject1;
        int i = localList.size();
        c = new long[i];
        d = new long[i];
        int j = 0;
        while (j < i)
        {
          Object localObject2 = paramu.get(j);
          localObject1 = localList.get(j);
          if (((localObject1 instanceof Double)) && ((localObject2 instanceof Double)))
          {
            c[j] = ((((Double)localObject1).doubleValue() * 1000000.0D));
            d[j] = ((Double)localObject2).longValue();
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
}

/* Location:
 * Qualified Name:     g4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
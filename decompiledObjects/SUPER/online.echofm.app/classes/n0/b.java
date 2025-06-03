package n0;

import X2.B;
import android.os.SystemClock;
import android.util.Pair;
import g0.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public final class b
{
  public final Map a;
  public final Map b;
  public final Map c = new HashMap();
  public final Random d;
  
  public b()
  {
    this(new Random());
  }
  
  public b(Random paramRandom)
  {
    d = paramRandom;
    a = new HashMap();
    b = new HashMap();
  }
  
  public static void b(Object paramObject, long paramLong, Map paramMap)
  {
    long l = paramLong;
    if (paramMap.containsKey(paramObject)) {
      l = Math.max(paramLong, ((Long)M.i((Long)paramMap.get(paramObject))).longValue());
    }
    paramMap.put(paramObject, Long.valueOf(l));
  }
  
  public static int d(o0.b paramb1, o0.b paramb2)
  {
    int i = Integer.compare(c, c);
    if (i == 0) {
      i = b.compareTo(b);
    }
    return i;
  }
  
  public static int f(List paramList)
  {
    HashSet localHashSet = new HashSet();
    for (int i = 0; i < paramList.size(); i++) {
      localHashSet.add(Integer.valueOf(getc));
    }
    return localHashSet.size();
  }
  
  public static void h(long paramLong, Map paramMap)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((Long)localEntry.getValue()).longValue() <= paramLong) {
        localArrayList.add(localEntry.getKey());
      }
    }
    for (int i = 0; i < localArrayList.size(); i++) {
      paramMap.remove(localArrayList.get(i));
    }
  }
  
  public final List c(List paramList)
  {
    long l = SystemClock.elapsedRealtime();
    h(l, a);
    h(l, b);
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramList.size(); i++)
    {
      o0.b localb = (o0.b)paramList.get(i);
      if ((!a.containsKey(b)) && (!b.containsKey(Integer.valueOf(c)))) {
        localArrayList.add(localb);
      }
    }
    return localArrayList;
  }
  
  public void e(o0.b paramb, long paramLong)
  {
    paramLong = SystemClock.elapsedRealtime() + paramLong;
    b(b, paramLong, a);
    int i = c;
    if (i != Integer.MIN_VALUE) {
      b(Integer.valueOf(i), paramLong, b);
    }
  }
  
  public int g(List paramList)
  {
    HashSet localHashSet = new HashSet();
    paramList = c(paramList);
    for (int i = 0; i < paramList.size(); i++) {
      localHashSet.add(Integer.valueOf(getc));
    }
    return localHashSet.size();
  }
  
  public void i()
  {
    a.clear();
    b.clear();
    c.clear();
  }
  
  public o0.b j(List paramList)
  {
    List localList = c(paramList);
    if (localList.size() < 2)
    {
      paramList = B.c(localList, null);
      return (o0.b)paramList;
    }
    Collections.sort(localList, new a());
    ArrayList localArrayList = new ArrayList();
    int i = get0c;
    for (int j = 0;; j++)
    {
      if (j >= localList.size()) {
        break label148;
      }
      paramList = (o0.b)localList.get(j);
      if (i != c)
      {
        if (localArrayList.size() != 1) {
          break label148;
        }
        paramList = localList.get(0);
        break;
      }
      localArrayList.add(new Pair(b, Integer.valueOf(d)));
    }
    label148:
    o0.b localb = (o0.b)c.get(localArrayList);
    paramList = localb;
    if (localb == null)
    {
      paramList = k(localList.subList(0, localArrayList.size()));
      c.put(localArrayList, paramList);
    }
    return paramList;
  }
  
  public final o0.b k(List paramList)
  {
    int i = 0;
    int j = 0;
    int k = j;
    while (j < paramList.size())
    {
      k += getd;
      j++;
    }
    int m = d.nextInt(k);
    j = 0;
    for (k = i; k < paramList.size(); k++)
    {
      o0.b localb = (o0.b)paramList.get(k);
      j += d;
      if (m < j) {
        return localb;
      }
    }
    return (o0.b)B.d(paramList);
  }
}

/* Location:
 * Qualified Name:     n0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
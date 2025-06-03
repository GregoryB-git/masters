package c5;

import android.os.SystemClock;
import android.util.Pair;
import d5.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import o7.b0;
import o7.t;
import p2.m0;
import v4.d;
import v5.e0;

public final class a
{
  public final HashMap a;
  public final HashMap b;
  public final HashMap c = new HashMap();
  public final Random d;
  
  public a()
  {
    d = localRandom;
    a = new HashMap();
    b = new HashMap();
  }
  
  public static void a(Object paramObject, long paramLong, HashMap paramHashMap)
  {
    long l = paramLong;
    if (paramHashMap.containsKey(paramObject))
    {
      Long localLong = (Long)paramHashMap.get(paramObject);
      int i = e0.a;
      l = Math.max(paramLong, localLong.longValue());
    }
    paramHashMap.put(paramObject, Long.valueOf(l));
  }
  
  public static void c(long paramLong, HashMap paramHashMap)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((Long)localEntry.getValue()).longValue() <= paramLong) {
        localArrayList.add(localEntry.getKey());
      }
    }
    for (int i = 0; i < localArrayList.size(); i++) {
      paramHashMap.remove(localArrayList.get(i));
    }
  }
  
  public final ArrayList b(t paramt)
  {
    long l = SystemClock.elapsedRealtime();
    c(l, a);
    c(l, b);
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramt.size(); i++)
    {
      b localb = (b)paramt.get(i);
      if ((!a.containsKey(b)) && (!b.containsKey(Integer.valueOf(c)))) {
        localArrayList.add(localb);
      }
    }
    return localArrayList;
  }
  
  public final b d(t paramt)
  {
    ArrayList localArrayList1 = b(paramt);
    if (localArrayList1.size() < 2)
    {
      paramt = b0.a(localArrayList1.iterator(), null);
      return (b)paramt;
    }
    Collections.sort(localArrayList1, new d(1));
    ArrayList localArrayList2 = new ArrayList();
    int i = 0;
    int j = get0c;
    for (int k = 0;; k++)
    {
      if (k >= localArrayList1.size()) {
        break label141;
      }
      paramt = (b)localArrayList1.get(k);
      if (j != c)
      {
        if (localArrayList2.size() != 1) {
          break label141;
        }
        paramt = localArrayList1.get(0);
        break;
      }
      localArrayList2.add(new Pair(b, Integer.valueOf(d)));
    }
    label141:
    Object localObject = (b)c.get(localArrayList2);
    paramt = (t)localObject;
    if (localObject == null)
    {
      localObject = localArrayList1.subList(0, localArrayList2.size());
      k = 0;
      j = k;
      while (k < ((List)localObject).size())
      {
        j += getd;
        k++;
      }
      int m = d.nextInt(j);
      k = 0;
      for (j = i; j < ((List)localObject).size(); j++)
      {
        paramt = (b)((List)localObject).get(j);
        k += d;
        if (m < k) {
          break label295;
        }
      }
      paramt = (b)m0.K((Iterable)localObject);
      label295:
      c.put(localArrayList2, paramt);
    }
    return paramt;
  }
}

/* Location:
 * Qualified Name:     c5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
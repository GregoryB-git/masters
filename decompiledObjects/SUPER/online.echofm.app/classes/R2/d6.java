package R2;

import com.google.android.gms.internal.measurement.A6;
import com.google.android.gms.internal.measurement.W1;
import com.google.android.gms.internal.measurement.W1.a;
import com.google.android.gms.internal.measurement.X1;
import com.google.android.gms.internal.measurement.X1.a;
import com.google.android.gms.internal.measurement.Y3.b;
import com.google.android.gms.internal.measurement.f2;
import com.google.android.gms.internal.measurement.f2.a;
import com.google.android.gms.internal.measurement.g2;
import com.google.android.gms.internal.measurement.g2.a;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t.a;

public final class d6
{
  public String a;
  public boolean b;
  public f2 c;
  public BitSet d;
  public BitSet e;
  public Map f;
  public Map g;
  
  public d6(b6 paramb6, String paramString)
  {
    a = paramString;
    b = true;
    d = new BitSet();
    e = new BitSet();
    f = new a();
    g = new a();
  }
  
  public d6(b6 paramb6, String paramString, f2 paramf2, BitSet paramBitSet1, BitSet paramBitSet2, Map paramMap1, Map paramMap2)
  {
    a = paramString;
    d = paramBitSet1;
    e = paramBitSet2;
    f = paramMap1;
    g = new a();
    if (paramMap2 != null)
    {
      paramString = paramMap2.keySet().iterator();
      while (paramString.hasNext())
      {
        paramb6 = (Integer)paramString.next();
        paramBitSet1 = new ArrayList();
        paramBitSet1.add((Long)paramMap2.get(paramb6));
        g.put(paramb6, paramBitSet1);
      }
    }
    b = false;
    c = paramf2;
  }
  
  public final W1 a(int paramInt)
  {
    W1.a locala = W1.M();
    locala.w(paramInt);
    locala.z(b);
    Object localObject1 = c;
    if (localObject1 != null) {
      locala.y((f2)localObject1);
    }
    f2.a locala1 = f2.V().z(N5.M(d)).D(N5.M(e));
    ArrayList localArrayList;
    Iterator localIterator;
    if (f == null)
    {
      localObject1 = null;
    }
    else
    {
      localArrayList = new ArrayList(f.size());
      localIterator = f.keySet().iterator();
      for (;;)
      {
        localObject1 = localArrayList;
        if (!localIterator.hasNext()) {
          break;
        }
        localObject1 = (Integer)localIterator.next();
        paramInt = ((Integer)localObject1).intValue();
        localObject1 = (Long)f.get(localObject1);
        if (localObject1 != null) {
          localArrayList.add((X1)X1.L().w(paramInt).x(((Long)localObject1).longValue()).p());
        }
      }
    }
    if (localObject1 != null) {
      locala1.x((Iterable)localObject1);
    }
    if (g == null)
    {
      localObject1 = Collections.emptyList();
    }
    else
    {
      localArrayList = new ArrayList(g.size());
      localIterator = g.keySet().iterator();
      for (;;)
      {
        localObject1 = localArrayList;
        if (!localIterator.hasNext()) {
          break;
        }
        Object localObject2 = (Integer)localIterator.next();
        localObject1 = g2.M().w(((Integer)localObject2).intValue());
        localObject2 = (List)g.get(localObject2);
        if (localObject2 != null)
        {
          Collections.sort((List)localObject2);
          ((g2.a)localObject1).x((Iterable)localObject2);
        }
        localArrayList.add((g2)((Y3.b)localObject1).p());
      }
    }
    locala1.B((Iterable)localObject1);
    locala.x(locala1);
    return (W1)locala.p();
  }
  
  public final void c(d paramd)
  {
    int i = paramd.a();
    Object localObject = c;
    if (localObject != null) {
      e.set(i, ((Boolean)localObject).booleanValue());
    }
    localObject = d;
    if (localObject != null) {
      d.set(i, ((Boolean)localObject).booleanValue());
    }
    long l;
    if (e != null)
    {
      localObject = (Long)f.get(Integer.valueOf(i));
      l = e.longValue() / 1000L;
      if ((localObject == null) || (l > ((Long)localObject).longValue())) {
        f.put(Integer.valueOf(i), Long.valueOf(l));
      }
    }
    if (f != null)
    {
      List localList = (List)g.get(Integer.valueOf(i));
      localObject = localList;
      if (localList == null)
      {
        localObject = new ArrayList();
        g.put(Integer.valueOf(i), localObject);
      }
      if (paramd.j()) {
        ((List)localObject).clear();
      }
      if ((A6.a()) && (h.f().D(a, K.j0)) && (paramd.i())) {
        ((List)localObject).clear();
      }
      if ((A6.a()) && (h.f().D(a, K.j0)))
      {
        l = f.longValue() / 1000L;
        if (!((List)localObject).contains(Long.valueOf(l))) {
          ((List)localObject).add(Long.valueOf(l));
        }
        return;
      }
      ((List)localObject).add(Long.valueOf(f.longValue() / 1000L));
    }
  }
}

/* Location:
 * Qualified Name:     R2.d6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
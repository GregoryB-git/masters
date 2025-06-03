package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class t
  extends n
  implements m
{
  public final List q;
  public final List r;
  public f3 s;
  
  public t(t paramt)
  {
    super(o);
    ArrayList localArrayList = new ArrayList(q.size());
    q = localArrayList;
    localArrayList.addAll(q);
    localArrayList = new ArrayList(r.size());
    r = localArrayList;
    localArrayList.addAll(r);
    s = s;
  }
  
  public t(String paramString, List paramList1, List paramList2, f3 paramf3)
  {
    super(paramString);
    q = new ArrayList();
    s = paramf3;
    if (!paramList1.isEmpty())
    {
      paramString = paramList1.iterator();
      while (paramString.hasNext())
      {
        paramList1 = (s)paramString.next();
        q.add(paramList1.g());
      }
    }
    r = new ArrayList(paramList2);
  }
  
  public final s b(f3 paramf3, List paramList)
  {
    f3 localf3 = s.d();
    Object localObject1;
    for (int i = 0; i < q.size(); i++)
    {
      if (i < paramList.size()) {
        localObject1 = (String)q.get(i);
      }
      for (localObject2 = paramf3.b((s)paramList.get(i));; localObject2 = s.d)
      {
        localf3.e((String)localObject1, (s)localObject2);
        break;
        localObject1 = (String)q.get(i);
      }
    }
    Object localObject2 = r.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (s)((Iterator)localObject2).next();
      paramList = localf3.b((s)localObject1);
      paramf3 = paramList;
      if ((paramList instanceof v)) {
        paramf3 = localf3.b((s)localObject1);
      }
      if ((paramf3 instanceof l)) {
        return ((l)paramf3).a();
      }
    }
    return s.d;
  }
  
  public final s c()
  {
    return new t(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
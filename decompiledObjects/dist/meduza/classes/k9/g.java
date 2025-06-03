package k9;

import j9.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import x6.b;

public final class g
{
  public final int a;
  public final u7.m b;
  public final List<f> c;
  public final List<f> d;
  
  public g(int paramInt, u7.m paramm, ArrayList paramArrayList, List paramList)
  {
    b.Z("Cannot create an empty mutation batch", paramList.isEmpty() ^ true, new Object[0]);
    a = paramInt;
    b = paramm;
    c = paramArrayList;
    d = paramList;
  }
  
  public final d a(j9.m paramm, d paramd)
  {
    int i = 0;
    int j = 0;
    int k;
    d locald;
    f localf;
    for (;;)
    {
      k = i;
      locald = paramd;
      if (j >= c.size()) {
        break;
      }
      localf = (f)c.get(j);
      locald = paramd;
      if (a.equals(b)) {
        locald = localf.a(paramm, paramd, b);
      }
      j++;
      paramd = locald;
    }
    while (k < d.size())
    {
      localf = (f)d.get(k);
      paramd = locald;
      if (a.equals(b)) {
        paramd = localf.a(paramm, locald, b);
      }
      k++;
      locald = paramd;
    }
    return locald;
  }
  
  public final HashSet b()
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = d.iterator();
    while (localIterator.hasNext()) {
      localHashSet.add(nexta);
    }
    return localHashSet;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (g.class == paramObject.getClass()))
    {
      paramObject = (g)paramObject;
      if ((a != a) || (!b.equals(b)) || (!c.equals(c)) || (!d.equals(d))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a;
    int j = b.hashCode();
    int k = c.hashCode();
    return d.hashCode() + (k + (j + i * 31) * 31) * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("MutationBatch(batchId=");
    localStringBuilder.append(a);
    localStringBuilder.append(", localWriteTime=");
    localStringBuilder.append(b);
    localStringBuilder.append(", baseMutations=");
    localStringBuilder.append(c);
    localStringBuilder.append(", mutations=");
    localStringBuilder.append(d);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     k9.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
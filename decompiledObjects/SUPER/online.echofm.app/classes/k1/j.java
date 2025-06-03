package k1;

import c1.k;
import f0.a.b;
import g0.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class j
  implements k
{
  public final List o;
  public final long[] p;
  public final long[] q;
  
  public j(List paramList)
  {
    o = Collections.unmodifiableList(new ArrayList(paramList));
    p = new long[paramList.size() * 2];
    for (int i = 0; i < paramList.size(); i++)
    {
      d locald = (d)paramList.get(i);
      int j = i * 2;
      long[] arrayOfLong = p;
      arrayOfLong[j] = b;
      arrayOfLong[(j + 1)] = c;
    }
    paramList = p;
    paramList = Arrays.copyOf(paramList, paramList.length);
    q = paramList;
    Arrays.sort(paramList);
  }
  
  public int c(long paramLong)
  {
    int i = M.d(q, paramLong, false, false);
    if (i >= q.length) {
      i = -1;
    }
    return i;
  }
  
  public long e(int paramInt)
  {
    boolean bool1 = false;
    if (paramInt >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    g0.a.a(bool2);
    boolean bool2 = bool1;
    if (paramInt < q.length) {
      bool2 = true;
    }
    g0.a.a(bool2);
    return q[paramInt];
  }
  
  public List h(long paramLong)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    int i = 0;
    for (int j = 0; j < o.size(); j++)
    {
      Object localObject = p;
      int k = j * 2;
      if ((localObject[k] <= paramLong) && (paramLong < localObject[(k + 1)]))
      {
        localObject = (d)o.get(j);
        f0.a locala = a;
        if (e == -3.4028235E38F) {
          localArrayList2.add(localObject);
        } else {
          localArrayList1.add(locala);
        }
      }
    }
    Collections.sort(localArrayList2, new i());
    for (j = i; j < localArrayList2.size(); j++) {
      localArrayList1.add(geta.a().h(-1 - j, 1).a());
    }
    return localArrayList1;
  }
  
  public int j()
  {
    return q.length;
  }
}

/* Location:
 * Qualified Name:     k1.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
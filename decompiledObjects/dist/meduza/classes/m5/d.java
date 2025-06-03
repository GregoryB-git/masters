package m5;

import h5.a;
import h5.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v5.e0;
import x6.b;

public final class d
  implements g
{
  public final List<List<a>> a;
  public final List<Long> b;
  
  public d(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    a = paramArrayList1;
    b = paramArrayList2;
  }
  
  public final int f(long paramLong)
  {
    List localList = b;
    Long localLong = Long.valueOf(paramLong);
    int i = e0.a;
    i = Collections.binarySearch(localList, localLong);
    if (i < 0)
    {
      i = i;
    }
    else
    {
      int j = localList.size();
      do
      {
        i++;
      } while ((i < j) && (((Comparable)localList.get(i)).compareTo(localLong) == 0));
    }
    if (i >= b.size()) {
      i = -1;
    }
    return i;
  }
  
  public final long g(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    b.q(bool2);
    if (paramInt < b.size()) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    b.q(bool2);
    return ((Long)b.get(paramInt)).longValue();
  }
  
  public final List<a> h(long paramLong)
  {
    int i = e0.c(b, Long.valueOf(paramLong), false);
    if (i == -1) {
      return Collections.emptyList();
    }
    return (List)a.get(i);
  }
  
  public final int i()
  {
    return b.size();
  }
}

/* Location:
 * Qualified Name:     m5.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
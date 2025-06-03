package d1;

import c1.k;
import g0.a;
import java.util.Collections;
import java.util.List;

public final class f
  implements k
{
  public final List o;
  
  public f(List paramList)
  {
    o = paramList;
  }
  
  public int c(long paramLong)
  {
    int i;
    if (paramLong < 0L) {
      i = 0;
    } else {
      i = -1;
    }
    return i;
  }
  
  public long e(int paramInt)
  {
    boolean bool;
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    return 0L;
  }
  
  public List h(long paramLong)
  {
    List localList;
    if (paramLong >= 0L) {
      localList = o;
    } else {
      localList = Collections.emptyList();
    }
    return localList;
  }
  
  public int j()
  {
    return 1;
  }
}

/* Location:
 * Qualified Name:     d1.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
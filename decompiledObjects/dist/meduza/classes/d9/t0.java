package d9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k9.d;
import x6.b;

public final class t0
{
  public static final t0 c = new t0(false, null);
  public static final t0 d = new t0(true, null);
  public final boolean a;
  public final d b;
  
  public t0(boolean paramBoolean, d paramd)
  {
    boolean bool;
    if ((paramd != null) && (!paramBoolean)) {
      bool = false;
    } else {
      bool = true;
    }
    b.p("Cannot specify a fieldMask for non-merge sets()", bool, new Object[0]);
    a = paramBoolean;
    b = paramd;
  }
  
  public static t0 a(List<n> paramList)
  {
    HashSet localHashSet = new HashSet();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localHashSet.add(nexta);
    }
    return new t0(true, new d(localHashSet));
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (t0.class == paramObject.getClass()))
    {
      Object localObject = (t0)paramObject;
      if (a != a) {
        return false;
      }
      paramObject = b;
      localObject = b;
      if (paramObject != null) {
        bool = ((d)paramObject).equals(localObject);
      } else if (localObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    boolean bool = a;
    d locald = b;
    int i;
    if (locald != null) {
      i = locald.hashCode();
    } else {
      i = 0;
    }
    return bool * true + i;
  }
}

/* Location:
 * Qualified Name:     d9.t0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
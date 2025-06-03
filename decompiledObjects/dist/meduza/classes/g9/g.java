package g9;

import a0.j;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class g
  extends m
{
  public final ArrayList a;
  public final int b;
  public ArrayList c;
  
  public g(List<m> paramList, Object paramObject)
  {
    a = new ArrayList(paramList);
    b = paramObject;
  }
  
  public final String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = a.iterator();
    int i;
    do
    {
      boolean bool = ((Iterator)localObject).hasNext();
      i = 0;
      if (!bool) {
        break;
      }
    } while (!((m)((Iterator)localObject).next() instanceof g));
    int j = 0;
    break label54;
    j = 1;
    label54:
    int k = i;
    if (j != 0)
    {
      k = i;
      if (e()) {
        k = 1;
      }
    }
    if (k != 0)
    {
      localObject = a.iterator();
      while (((Iterator)localObject).hasNext()) {
        localStringBuilder.append(((m)((Iterator)localObject).next()).a());
      }
      return localStringBuilder.toString();
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(j.c(b));
    ((StringBuilder)localObject).append("(");
    localStringBuilder.append(((StringBuilder)localObject).toString());
    localStringBuilder.append(TextUtils.join(",", a));
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public final List<m> b()
  {
    return Collections.unmodifiableList(a);
  }
  
  public final List<l> c()
  {
    Object localObject = c;
    if (localObject != null) {
      return Collections.unmodifiableList((List)localObject);
    }
    c = new ArrayList();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      localObject = (m)localIterator.next();
      c.addAll(((m)localObject).c());
    }
    return Collections.unmodifiableList(c);
  }
  
  public final boolean d(j9.g paramg)
  {
    if (e())
    {
      localIterator = a.iterator();
      while (localIterator.hasNext()) {
        if (!((m)localIterator.next()).d(paramg)) {
          return false;
        }
      }
      return true;
    }
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      if (((m)localIterator.next()).d(paramg)) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean e()
  {
    int i = b;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof g)))
    {
      paramObject = (g)paramObject;
      if ((b == b) && (a.equals(a))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public final int hashCode()
  {
    int i = q0.g.c(b);
    return a.hashCode() + (i + 1147) * 31;
  }
  
  public final String toString()
  {
    return a();
  }
}

/* Location:
 * Qualified Name:     g9.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
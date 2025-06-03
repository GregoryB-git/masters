package nb;

import eb.k0.f;
import eb.k0.g;
import eb.k0.j;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import n7.g.a;
import x6.b;

public final class k$b
  extends k0.j
{
  public final List<k0.j> a;
  public final AtomicInteger b;
  public final int c;
  
  public k$b(ArrayList paramArrayList, AtomicInteger paramAtomicInteger)
  {
    b.s("empty list", paramArrayList.isEmpty() ^ true);
    a = paramArrayList;
    b.y(paramAtomicInteger, "index");
    b = paramAtomicInteger;
    paramArrayList = paramArrayList.iterator();
    int i = 0;
    while (paramArrayList.hasNext()) {
      i += ((k0.j)paramArrayList.next()).hashCode();
    }
    c = i;
  }
  
  public final k0.f a(k0.g paramg)
  {
    return ((k0.j)a.get((b.getAndIncrement() & 0x7FFFFFFF) % a.size())).a(paramg);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof b;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (b)paramObject;
    if (paramObject == this) {
      return true;
    }
    bool1 = bool2;
    if (c == c)
    {
      bool1 = bool2;
      if (b == b)
      {
        bool1 = bool2;
        if (a.size() == a.size())
        {
          bool1 = bool2;
          if (new HashSet(a).containsAll(a)) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    return c;
  }
  
  public final String toString()
  {
    g.a locala = new g.a(b.class.getSimpleName());
    locala.a(a, "subchannelPickers");
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     nb.k.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
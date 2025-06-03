package gb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import x6.b;

public final class y2$y
{
  public final boolean a;
  public final List<y2.q> b;
  public final Collection<y2.a0> c;
  public final Collection<y2.a0> d;
  public final int e;
  public final y2.a0 f;
  public final boolean g;
  public final boolean h;
  
  public y2$y(List<y2.q> paramList, Collection<y2.a0> paramCollection1, Collection<y2.a0> paramCollection2, y2.a0 parama0, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt)
  {
    b = paramList;
    b.y(paramCollection1, "drainedSubstreams");
    c = paramCollection1;
    f = parama0;
    d = paramCollection2;
    g = paramBoolean1;
    a = paramBoolean2;
    h = paramBoolean3;
    e = paramInt;
    boolean bool = false;
    if ((paramBoolean2) && (paramList != null)) {
      paramBoolean3 = false;
    } else {
      paramBoolean3 = true;
    }
    b.I(paramBoolean3, "passThrough should imply buffer is null");
    if ((paramBoolean2) && (parama0 == null)) {
      paramBoolean3 = false;
    } else {
      paramBoolean3 = true;
    }
    b.I(paramBoolean3, "passThrough should imply winningSubstream != null");
    if ((paramBoolean2) && ((paramCollection1.size() != 1) || (!paramCollection1.contains(parama0))) && ((paramCollection1.size() != 0) || (!b))) {
      paramBoolean2 = false;
    } else {
      paramBoolean2 = true;
    }
    b.I(paramBoolean2, "passThrough should imply winningSubstream is drained");
    if (paramBoolean1)
    {
      paramBoolean1 = bool;
      if (parama0 == null) {}
    }
    else
    {
      paramBoolean1 = true;
    }
    b.I(paramBoolean1, "cancelled should imply committed");
  }
  
  public final y a(y2.a0 parama0)
  {
    b.I(h ^ true, "hedging frozen");
    boolean bool;
    if (f == null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "already committed");
    if (d == null)
    {
      parama0 = Collections.singleton(parama0);
    }
    else
    {
      ArrayList localArrayList = new ArrayList(d);
      localArrayList.add(parama0);
      parama0 = Collections.unmodifiableCollection(localArrayList);
    }
    int i = e;
    return new y(b, c, parama0, f, g, a, h, i + 1);
  }
  
  public final y b(y2.a0 parama0)
  {
    ArrayList localArrayList = new ArrayList(d);
    localArrayList.remove(parama0);
    parama0 = Collections.unmodifiableCollection(localArrayList);
    return new y(b, c, parama0, f, g, a, h, e);
  }
  
  public final y c(y2.a0 parama01, y2.a0 parama02)
  {
    ArrayList localArrayList = new ArrayList(d);
    localArrayList.remove(parama01);
    localArrayList.add(parama02);
    parama01 = Collections.unmodifiableCollection(localArrayList);
    return new y(b, c, parama01, f, g, a, h, e);
  }
  
  public final y d(y2.a0 parama0)
  {
    b = true;
    if (c.contains(parama0))
    {
      ArrayList localArrayList = new ArrayList(c);
      localArrayList.remove(parama0);
      parama0 = Collections.unmodifiableCollection(localArrayList);
      return new y(b, parama0, d, f, g, a, h, e);
    }
    return this;
  }
  
  public final y e(y2.a0 parama0)
  {
    boolean bool1 = a;
    boolean bool2 = true;
    b.I(bool1 ^ true, "Already passThrough");
    Object localObject;
    if (b) {
      localObject = c;
    }
    for (;;)
    {
      break;
      if (c.isEmpty())
      {
        localObject = Collections.singletonList(parama0);
      }
      else
      {
        localObject = new ArrayList(c);
        ((ArrayList)localObject).add(parama0);
        localObject = Collections.unmodifiableCollection((Collection)localObject);
      }
    }
    y2.a0 locala0 = f;
    if (locala0 != null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    List localList = b;
    if (bool1)
    {
      if (locala0 != parama0) {
        bool2 = false;
      }
      b.I(bool2, "Another RPC attempt has already committed");
      localList = null;
    }
    return new y(localList, (Collection)localObject, d, f, g, bool1, h, e);
  }
}

/* Location:
 * Qualified Name:     gb.y2.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package j9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class k
{
  public static c a = new c(0L, a.a);
  public static final r5.c b = new r5.c(7);
  
  public final c a()
  {
    Iterator localIterator = f().iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      if (q0.g.b(localc.g(), 3)) {
        return localc;
      }
    }
    return null;
  }
  
  public abstract String b();
  
  public final ArrayList c()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = f().iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      if (!q0.g.b(localc.g(), 3)) {
        localArrayList.add(localc);
      }
    }
    return localArrayList;
  }
  
  public abstract int d();
  
  public abstract b e();
  
  public abstract List<c> f();
  
  public static abstract class a
    implements Comparable<a>
  {
    public static final b a = new b(q.b, i.g(), -1);
    public static final q5.i b = new q5.i(6);
    
    public static b g(g paramg)
    {
      return new b(paramg.f(), paramg.getKey(), -1);
    }
    
    public final int f(a parama)
    {
      int i = l().f(parama.l());
      if (i != 0) {
        return i;
      }
      i = h().f(parama.h());
      if (i != 0) {
        return i;
      }
      return Integer.compare(i(), parama.i());
    }
    
    public abstract i h();
    
    public abstract int i();
    
    public abstract q l();
  }
  
  public static abstract class b
  {
    public abstract k.a a();
    
    public abstract long b();
  }
  
  public static abstract class c
    implements Comparable<c>
  {
    public final int compareTo(Object paramObject)
    {
      paramObject = (c)paramObject;
      int i = f().i(((c)paramObject).f());
      if (i == 0) {
        i = q0.g.a(g(), ((c)paramObject).g());
      }
      return i;
    }
    
    public abstract l f();
    
    public abstract int g();
  }
}

/* Location:
 * Qualified Name:     j9.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
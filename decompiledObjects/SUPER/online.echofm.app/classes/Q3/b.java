package Q3;

import d4.i;
import d4.m;
import d4.n;
import java.util.Iterator;

public class b
{
  public final i a;
  public final e b;
  
  public b(e parame, i parami)
  {
    a = parami;
    b = parame;
  }
  
  public boolean b()
  {
    return a.k().isEmpty() ^ true;
  }
  
  public Iterable c()
  {
    return new a(a.iterator());
  }
  
  public long d()
  {
    return a.k().E();
  }
  
  public String e()
  {
    return b.X();
  }
  
  public Object f()
  {
    Object localObject1 = a.k().t().getValue();
    Object localObject2 = localObject1;
    if ((localObject1 instanceof Long)) {
      localObject2 = Double.valueOf(((Long)localObject1).longValue());
    }
    return localObject2;
  }
  
  public e g()
  {
    return b;
  }
  
  public Object h()
  {
    return a.k().getValue();
  }
  
  public Object i(boolean paramBoolean)
  {
    return a.k().L(paramBoolean);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DataSnapshot { key = ");
    localStringBuilder.append(b.X());
    localStringBuilder.append(", value = ");
    localStringBuilder.append(a.k().L(true));
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
  
  public class a
    implements Iterable
  {
    public a(Iterator paramIterator) {}
    
    public Iterator iterator()
    {
      return new a();
    }
    
    public class a
      implements Iterator
    {
      public a() {}
      
      public b b()
      {
        m localm = (m)o.next();
        return new b(b.a(b.this).W(localm.c().e()), i.d(localm.d()));
      }
      
      public boolean hasNext()
      {
        return o.hasNext();
      }
      
      public void remove()
      {
        throw new UnsupportedOperationException("remove called on immutable collection");
      }
    }
  }
}

/* Location:
 * Qualified Name:     Q3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
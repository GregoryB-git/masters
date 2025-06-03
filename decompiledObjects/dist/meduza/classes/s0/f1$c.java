package s0;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class f1$c
  implements Iterator<Map.Entry<K, V>>
{
  public int a = -1;
  public boolean b;
  public Iterator<Map.Entry<K, V>> c;
  
  public f1$c(f1 paramf1) {}
  
  public final Iterator<Map.Entry<K, V>> a()
  {
    if (c == null) {
      c = d.c.entrySet().iterator();
    }
    return c;
  }
  
  public final boolean hasNext()
  {
    int i = a;
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (i + 1 >= d.b.size()) {
      if ((!d.c.isEmpty()) && (a().hasNext())) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public final Object next()
  {
    b = true;
    int i = a + 1;
    a = i;
    Object localObject;
    if (i < d.b.size()) {
      localObject = d.b.get(a);
    } else {
      localObject = a().next();
    }
    return (Map.Entry)localObject;
  }
  
  public final void remove()
  {
    if (b)
    {
      b = false;
      f1 localf1 = d;
      int i = f1.o;
      localf1.c();
      if (a < d.b.size())
      {
        localf1 = d;
        i = a;
        a = (i - 1);
        localf1.j(i);
      }
      else
      {
        a().remove();
      }
      return;
    }
    throw new IllegalStateException("remove() was called before next()");
  }
}

/* Location:
 * Qualified Name:     s0.f1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
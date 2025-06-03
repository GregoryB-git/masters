package n;

import java.util.Iterator;
import java.util.Map.Entry;

public abstract class b$e<K, V>
  extends b.f<K, V>
  implements Iterator<Map.Entry<K, V>>
{
  public b.c<K, V> a;
  public b.c<K, V> b;
  
  public b$e(b.c<K, V> paramc1, b.c<K, V> paramc2)
  {
    a = paramc2;
    b = paramc1;
  }
  
  public final void a(b.c<K, V> paramc)
  {
    b.c localc1 = a;
    Object localObject = null;
    if ((localc1 == paramc) && (paramc == b))
    {
      b = null;
      a = null;
    }
    localc1 = a;
    if (localc1 == paramc) {
      a = b(localc1);
    }
    localc1 = b;
    if (localc1 == paramc)
    {
      b.c localc2 = a;
      paramc = (b.c<K, V>)localObject;
      if (localc1 != localc2) {
        if (localc2 == null) {
          paramc = (b.c<K, V>)localObject;
        } else {
          paramc = c(localc1);
        }
      }
      b = paramc;
    }
  }
  
  public abstract b.c<K, V> b(b.c<K, V> paramc);
  
  public abstract b.c<K, V> c(b.c<K, V> paramc);
  
  public final boolean hasNext()
  {
    boolean bool;
    if (b != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Object next()
  {
    b.c localc1 = b;
    b.c localc2 = a;
    if ((localc1 != localc2) && (localc2 != null)) {
      localc2 = c(localc1);
    } else {
      localc2 = null;
    }
    b = localc2;
    return localc1;
  }
}

/* Location:
 * Qualified Name:     n.b.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
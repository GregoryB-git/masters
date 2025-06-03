package rb;

import dc.a;
import ec.i;
import java.io.Serializable;
import p2.m0;

public final class g<T>
  implements c<T>, Serializable
{
  public a<? extends T> a;
  public volatile Object b;
  public final Object c;
  
  public g(a parama)
  {
    a = parama;
    b = m0.B;
    c = this;
  }
  
  public final T getValue()
  {
    Object localObject1 = b;
    m0 localm0 = m0.B;
    if (localObject1 != localm0) {
      return (T)localObject1;
    }
    synchronized (c)
    {
      localObject1 = b;
      if (localObject1 == localm0)
      {
        localObject1 = a;
        i.b(localObject1);
        localObject1 = ((a)localObject1).invoke();
        b = localObject1;
        a = null;
      }
      return (T)localObject1;
    }
  }
  
  public final String toString()
  {
    int i;
    if (b != m0.B) {
      i = 1;
    } else {
      i = 0;
    }
    String str;
    if (i != 0) {
      str = String.valueOf(getValue());
    } else {
      str = "Lazy value not initialized yet.";
    }
    return str;
  }
}

/* Location:
 * Qualified Name:     rb.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
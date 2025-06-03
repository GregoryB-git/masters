package tb;

import ec.i;
import java.util.Map.Entry;
import sb.g;

public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V>
  extends g<E>
{
  public final boolean contains(Object paramObject)
  {
    if (!(paramObject instanceof Map.Entry)) {
      return false;
    }
    paramObject = (Map.Entry)paramObject;
    i.e(paramObject, "element");
    return a.f((Map.Entry)paramObject);
  }
  
  public final boolean remove(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Map.Entry;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (Map.Entry)paramObject;
    Object localObject = (d)this;
    i.e(paramObject, "element");
    c localc = a;
    localc.getClass();
    localc.c();
    int i = localc.h(((Map.Entry)paramObject).getKey());
    if (i >= 0)
    {
      localObject = b;
      i.b(localObject);
      if (i.a(localObject[i], ((Map.Entry)paramObject).getValue()))
      {
        localc.k(i);
        bool2 = true;
      }
    }
    return bool2;
  }
}

/* Location:
 * Qualified Name:     tb.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package o7;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;
import java.util.Objects;
import x6.b;

public final class m0$a$a
  extends t<Map.Entry<K, V>>
{
  public m0$a$a(m0.a parama) {}
  
  public final Object get(int paramInt)
  {
    b.v(paramInt, c.o);
    Object localObject1 = c;
    Object localObject2 = e;
    paramInt *= 2;
    localObject2 = localObject2[(f + paramInt)];
    Objects.requireNonNull(localObject2);
    localObject1 = c;
    localObject1 = e[(paramInt + (f ^ 0x1))];
    Objects.requireNonNull(localObject1);
    return new AbstractMap.SimpleImmutableEntry(localObject2, localObject1);
  }
  
  public final boolean m()
  {
    return true;
  }
  
  public final int size()
  {
    return c.o;
  }
}

/* Location:
 * Qualified Name:     o7.m0.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
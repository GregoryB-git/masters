package X2;

import W2.m;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;
import java.util.Objects;

public class T$a$a
  extends v
{
  public T$a$a(T.a parama) {}
  
  public Map.Entry j0(int paramInt)
  {
    m.h(paramInt, T.a.e0(q));
    Object localObject1 = T.a.f0(q);
    paramInt *= 2;
    Object localObject2 = localObject1[(T.a.g0(q) + paramInt)];
    Objects.requireNonNull(localObject2);
    localObject1 = T.a.f0(q)[(paramInt + (T.a.g0(q) ^ 0x1))];
    Objects.requireNonNull(localObject1);
    return new AbstractMap.SimpleImmutableEntry(localObject2, localObject1);
  }
  
  public boolean k()
  {
    return true;
  }
  
  public int size()
  {
    return T.a.e0(q);
  }
  
  public Object writeReplace()
  {
    return super.writeReplace();
  }
}

/* Location:
 * Qualified Name:     X2.T.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package rb;

import ec.i;
import java.io.Serializable;

public final class d<A, B>
  implements Serializable
{
  public final A a;
  public final B b;
  
  public d(A paramA, B paramB)
  {
    a = paramA;
    b = paramB;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof d)) {
      return false;
    }
    paramObject = (d)paramObject;
    if (!i.a(a, a)) {
      return false;
    }
    return i.a(b, b);
  }
  
  public final int hashCode()
  {
    Object localObject = a;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    localObject = b;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return j * 31 + i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('(');
    localStringBuilder.append(a);
    localStringBuilder.append(", ");
    localStringBuilder.append(b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     rb.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
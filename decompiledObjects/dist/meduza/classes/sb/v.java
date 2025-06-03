package sb;

import ec.i;
import f;

public final class v<T>
{
  public final int a;
  public final T b;
  
  public v(int paramInt, T paramT)
  {
    a = paramInt;
    b = paramT;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof v)) {
      return false;
    }
    paramObject = (v)paramObject;
    if (a != a) {
      return false;
    }
    return i.a(b, b);
  }
  
  public final int hashCode()
  {
    int i = a;
    Object localObject = b;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    return i * 31 + j;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("IndexedValue(index=");
    localStringBuilder.append(a);
    localStringBuilder.append(", value=");
    localStringBuilder.append(b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     sb.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
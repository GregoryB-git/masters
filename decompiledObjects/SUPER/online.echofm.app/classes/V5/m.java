package V5;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class m
  implements Serializable
{
  public final Object o;
  public final Object p;
  
  public m(Object paramObject1, Object paramObject2)
  {
    o = paramObject1;
    p = paramObject2;
  }
  
  public final Object a()
  {
    return o;
  }
  
  public final Object b()
  {
    return p;
  }
  
  public final Object c()
  {
    return o;
  }
  
  public final Object d()
  {
    return p;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof m)) {
      return false;
    }
    paramObject = (m)paramObject;
    if (!Intrinsics.a(o, o)) {
      return false;
    }
    return Intrinsics.a(p, p);
  }
  
  public int hashCode()
  {
    Object localObject = o;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    localObject = p;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('(');
    localStringBuilder.append(o);
    localStringBuilder.append(", ");
    localStringBuilder.append(p);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     V5.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package p6;

import g6.l;
import kotlin.jvm.internal.Intrinsics;

public final class A
{
  public final Object a;
  public final l b;
  
  public A(Object paramObject, l paraml)
  {
    a = paramObject;
    b = paraml;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof A)) {
      return false;
    }
    paramObject = (A)paramObject;
    if (!Intrinsics.a(a, a)) {
      return false;
    }
    return Intrinsics.a(b, b);
  }
  
  public int hashCode()
  {
    Object localObject = a;
    int i;
    if (localObject == null) {
      i = 0;
    } else {
      i = localObject.hashCode();
    }
    return i * 31 + b.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CompletedWithCancellation(result=");
    localStringBuilder.append(a);
    localStringBuilder.append(", onCancellation=");
    localStringBuilder.append(b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     p6.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
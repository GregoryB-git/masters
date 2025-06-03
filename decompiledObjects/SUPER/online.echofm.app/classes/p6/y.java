package p6;

import g6.l;
import kotlin.jvm.internal.Intrinsics;

public final class y
{
  public final Object a;
  public final j b;
  public final l c;
  public final Object d;
  public final Throwable e;
  
  public y(Object paramObject1, j paramj, l paraml, Object paramObject2, Throwable paramThrowable)
  {
    a = paramObject1;
    b = paramj;
    c = paraml;
    d = paramObject2;
    e = paramThrowable;
  }
  
  public final y a(Object paramObject1, j paramj, l paraml, Object paramObject2, Throwable paramThrowable)
  {
    return new y(paramObject1, paramj, paraml, paramObject2, paramThrowable);
  }
  
  public final boolean c()
  {
    boolean bool;
    if (e != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void d(m paramm, Throwable paramThrowable)
  {
    Object localObject = b;
    if (localObject != null) {
      paramm.l((j)localObject, paramThrowable);
    }
    localObject = c;
    if (localObject != null) {
      paramm.m((l)localObject, paramThrowable);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof y)) {
      return false;
    }
    paramObject = (y)paramObject;
    if (!Intrinsics.a(a, a)) {
      return false;
    }
    if (!Intrinsics.a(b, b)) {
      return false;
    }
    if (!Intrinsics.a(c, c)) {
      return false;
    }
    if (!Intrinsics.a(d, d)) {
      return false;
    }
    return Intrinsics.a(e, e);
  }
  
  public int hashCode()
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
    int k;
    if (localObject == null) {
      k = 0;
    } else {
      k = localObject.hashCode();
    }
    localObject = c;
    int m;
    if (localObject == null) {
      m = 0;
    } else {
      m = localObject.hashCode();
    }
    localObject = d;
    int n;
    if (localObject == null) {
      n = 0;
    } else {
      n = localObject.hashCode();
    }
    localObject = e;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return (((j * 31 + k) * 31 + m) * 31 + n) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CompletedContinuation(result=");
    localStringBuilder.append(a);
    localStringBuilder.append(", cancelHandler=");
    localStringBuilder.append(b);
    localStringBuilder.append(", onCancellation=");
    localStringBuilder.append(c);
    localStringBuilder.append(", idempotentResume=");
    localStringBuilder.append(d);
    localStringBuilder.append(", cancelCause=");
    localStringBuilder.append(e);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     p6.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
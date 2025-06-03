package nc;

import dc.l;
import ec.i;
import f;
import rb.h;

public final class v
{
  public final Object a;
  public final l<Throwable, h> b;
  
  public v(Object paramObject, l<? super Throwable, h> paraml)
  {
    a = paramObject;
    b = paraml;
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
    if (!i.a(a, a)) {
      return false;
    }
    return i.a(b, b);
  }
  
  public final int hashCode()
  {
    Object localObject = a;
    int i;
    if (localObject == null) {
      i = 0;
    } else {
      i = localObject.hashCode();
    }
    return b.hashCode() + i * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("CompletedWithCancellation(result=");
    localStringBuilder.append(a);
    localStringBuilder.append(", onCancellation=");
    localStringBuilder.append(b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     nc.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
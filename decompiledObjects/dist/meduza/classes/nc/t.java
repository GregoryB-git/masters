package nc;

import dc.l;
import f;
import java.util.concurrent.CancellationException;
import rb.h;

public final class t
{
  public final Object a;
  public final i b;
  public final l<Throwable, h> c;
  public final Object d;
  public final Throwable e;
  
  public t(Object paramObject1, i parami, l<? super Throwable, h> paraml, Object paramObject2, Throwable paramThrowable)
  {
    a = paramObject1;
    b = parami;
    c = paraml;
    d = paramObject2;
    e = paramThrowable;
  }
  
  public static t a(t paramt, i parami, CancellationException paramCancellationException, int paramInt)
  {
    Object localObject1 = null;
    Object localObject2;
    if ((paramInt & 0x1) != 0) {
      localObject2 = a;
    } else {
      localObject2 = null;
    }
    if ((paramInt & 0x2) != 0) {
      parami = b;
    }
    l locall;
    if ((paramInt & 0x4) != 0) {
      locall = c;
    } else {
      locall = null;
    }
    if ((paramInt & 0x8) != 0) {
      localObject1 = d;
    }
    if ((paramInt & 0x10) != 0) {
      paramCancellationException = e;
    }
    paramt.getClass();
    return new t(localObject2, parami, locall, localObject1, paramCancellationException);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof t)) {
      return false;
    }
    paramObject = (t)paramObject;
    if (!ec.i.a(a, a)) {
      return false;
    }
    if (!ec.i.a(b, b)) {
      return false;
    }
    if (!ec.i.a(c, c)) {
      return false;
    }
    if (!ec.i.a(d, d)) {
      return false;
    }
    return ec.i.a(e, e);
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
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("CompletedContinuation(result=");
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
 * Qualified Name:     nc.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
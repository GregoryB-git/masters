package p6;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

public final class r0
  extends CancellationException
{
  public final transient q0 o;
  
  public r0(String paramString, Throwable paramThrowable, q0 paramq0)
  {
    super(paramString);
    o = paramq0;
    if (paramThrowable != null) {
      initCause(paramThrowable);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject != this) {
      if ((paramObject instanceof r0))
      {
        paramObject = (r0)paramObject;
        if ((Intrinsics.a(((Throwable)paramObject).getMessage(), getMessage())) && (Intrinsics.a(o, o)) && (Intrinsics.a(((Throwable)paramObject).getCause(), getCause()))) {}
      }
      else
      {
        return false;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public Throwable fillInStackTrace()
  {
    setStackTrace(new StackTraceElement[0]);
    return this;
  }
  
  public int hashCode()
  {
    Object localObject = getMessage();
    Intrinsics.b(localObject);
    int i = ((String)localObject).hashCode();
    int j = o.hashCode();
    localObject = getCause();
    int k;
    if (localObject != null) {
      k = localObject.hashCode();
    } else {
      k = 0;
    }
    return (i * 31 + j) * 31 + k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    localStringBuilder.append("; job=");
    localStringBuilder.append(o);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     p6.r0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
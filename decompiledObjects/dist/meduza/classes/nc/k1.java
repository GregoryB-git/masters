package nc;

import ec.i;
import java.util.concurrent.CancellationException;

public final class k1
  extends CancellationException
{
  public final transient j1 a;
  
  public k1(String paramString, Throwable paramThrowable, j1 paramj1)
  {
    super(paramString);
    a = paramj1;
    if (paramThrowable != null) {
      initCause(paramThrowable);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject != this) {
      if ((paramObject instanceof k1))
      {
        paramObject = (k1)paramObject;
        if ((i.a(((Throwable)paramObject).getMessage(), getMessage())) && (i.a(a, a)) && (i.a(((Throwable)paramObject).getCause(), getCause()))) {}
      }
      else
      {
        return false;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public final Throwable fillInStackTrace()
  {
    setStackTrace(new StackTraceElement[0]);
    return this;
  }
  
  public final int hashCode()
  {
    Object localObject = getMessage();
    i.b(localObject);
    int i = ((String)localObject).hashCode();
    int j = a.hashCode();
    localObject = getCause();
    int k;
    if (localObject != null) {
      k = localObject.hashCode();
    } else {
      k = 0;
    }
    return (j + i * 31) * 31 + k;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    localStringBuilder.append("; job=");
    localStringBuilder.append(a);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     nc.k1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
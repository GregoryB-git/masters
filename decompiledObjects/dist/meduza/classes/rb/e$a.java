package rb;

import ec.i;
import f;
import java.io.Serializable;

public final class e$a
  implements Serializable
{
  public final Throwable a;
  
  public e$a(Throwable paramThrowable)
  {
    a = paramThrowable;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof a)) && (i.a(a, a))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Failure(");
    localStringBuilder.append(a);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     rb.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
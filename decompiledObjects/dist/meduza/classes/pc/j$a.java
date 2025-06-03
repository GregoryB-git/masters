package pc;

import ec.i;
import f;

public final class j$a
  extends j.b
{
  public final Throwable a;
  
  public j$a(Throwable paramThrowable)
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
    Throwable localThrowable = a;
    int i;
    if (localThrowable != null) {
      i = localThrowable.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Closed(");
    localStringBuilder.append(a);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     pc.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
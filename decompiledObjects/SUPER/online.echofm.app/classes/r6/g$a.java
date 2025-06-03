package r6;

import kotlin.jvm.internal.Intrinsics;

public final class g$a
  extends g.c
{
  public final Throwable a;
  
  public g$a(Throwable paramThrowable)
  {
    a = paramThrowable;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof a)) && (Intrinsics.a(a, a))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
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
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Closed(");
    localStringBuilder.append(a);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     r6.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
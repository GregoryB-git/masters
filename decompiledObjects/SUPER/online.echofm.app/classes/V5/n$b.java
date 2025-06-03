package V5;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class n$b
  implements Serializable
{
  public final Throwable o;
  
  public n$b(Throwable paramThrowable)
  {
    o = paramThrowable;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof b)) && (Intrinsics.a(o, o))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return o.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Failure(");
    localStringBuilder.append(o);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     V5.n.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
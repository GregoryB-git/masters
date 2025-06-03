package V5;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public abstract class n
  implements Serializable
{
  public static final a o = new a(null);
  
  public static Object a(Object paramObject)
  {
    return paramObject;
  }
  
  public static final Throwable b(Object paramObject)
  {
    if ((paramObject instanceof b)) {
      paramObject = o;
    } else {
      paramObject = null;
    }
    return (Throwable)paramObject;
  }
  
  public static final boolean c(Object paramObject)
  {
    return paramObject instanceof b;
  }
  
  public static final class a {}
  
  public static final class b
    implements Serializable
  {
    public final Throwable o;
    
    public b(Throwable paramThrowable)
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
}

/* Location:
 * Qualified Name:     V5.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
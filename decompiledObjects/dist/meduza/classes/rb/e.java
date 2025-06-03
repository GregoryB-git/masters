package rb;

import ec.i;
import f;
import java.io.Serializable;

public final class e<T>
  implements Serializable
{
  public final Object a;
  
  public static final Throwable a(Object paramObject)
  {
    if ((paramObject instanceof a)) {
      paramObject = a;
    } else {
      paramObject = null;
    }
    return (Throwable)paramObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    Object localObject = a;
    boolean bool1 = paramObject instanceof e;
    boolean bool2 = false;
    if ((bool1) && (i.a(localObject, a))) {
      bool2 = true;
    }
    return bool2;
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
    return i;
  }
  
  public final String toString()
  {
    Object localObject = a;
    if ((localObject instanceof a))
    {
      localObject = ((a)localObject).toString();
    }
    else
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Success(");
      localStringBuilder.append(localObject);
      localStringBuilder.append(')');
      localObject = localStringBuilder.toString();
    }
    return (String)localObject;
  }
  
  public static final class a
    implements Serializable
  {
    public final Throwable a;
    
    public a(Throwable paramThrowable)
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
}

/* Location:
 * Qualified Name:     rb.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
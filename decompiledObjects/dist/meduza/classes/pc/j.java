package pc;

import ec.i;
import f;

public final class j<T>
{
  public static final b b = new b();
  public final Object a;
  
  public final boolean equals(Object paramObject)
  {
    Object localObject = a;
    boolean bool1 = paramObject instanceof j;
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
    Object localObject1 = a;
    Object localObject2;
    if ((localObject1 instanceof a))
    {
      localObject2 = ((a)localObject1).toString();
    }
    else
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Value(");
      ((StringBuilder)localObject2).append(localObject1);
      ((StringBuilder)localObject2).append(')');
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    return (String)localObject2;
  }
  
  public static final class a
    extends j.b
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
  
  public static class b
  {
    public String toString()
    {
      return "Failed";
    }
  }
}

/* Location:
 * Qualified Name:     pc.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
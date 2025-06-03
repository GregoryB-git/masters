package r6;

import kotlin.jvm.internal.Intrinsics;

public abstract class g
{
  public static final b a = new b(null);
  public static final c b = new c();
  
  public static Object b(Object paramObject)
  {
    return paramObject;
  }
  
  public static final Throwable c(Object paramObject)
  {
    boolean bool = paramObject instanceof a;
    Throwable localThrowable = null;
    if (bool) {
      paramObject = (a)paramObject;
    } else {
      paramObject = null;
    }
    if (paramObject != null) {
      localThrowable = a;
    }
    return localThrowable;
  }
  
  public static final Object d(Object paramObject)
  {
    if ((paramObject instanceof c)) {
      paramObject = null;
    }
    return paramObject;
  }
  
  public static final boolean e(Object paramObject)
  {
    return paramObject instanceof a;
  }
  
  public static final boolean f(Object paramObject)
  {
    return paramObject instanceof c ^ true;
  }
  
  public static final class a
    extends g.c
  {
    public final Throwable a;
    
    public a(Throwable paramThrowable)
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
  
  public static final class b
  {
    public final Object a(Throwable paramThrowable)
    {
      return g.b(new g.a(paramThrowable));
    }
    
    public final Object b()
    {
      return g.b(g.a());
    }
    
    public final Object c(Object paramObject)
    {
      return g.b(paramObject);
    }
  }
  
  public static class c
  {
    public String toString()
    {
      return "Failed";
    }
  }
}

/* Location:
 * Qualified Name:     r6.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
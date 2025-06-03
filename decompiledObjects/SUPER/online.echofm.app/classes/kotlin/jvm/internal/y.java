package kotlin.jvm.internal;

import V5.c;
import g6.l;
import g6.p;
import g6.q;
import h6.b;
import java.util.List;

public abstract class y
{
  public static List a(Object paramObject)
  {
    if (((paramObject instanceof h6.a)) && (!(paramObject instanceof b))) {
      h(paramObject, "kotlin.collections.MutableList");
    }
    return c(paramObject);
  }
  
  public static Object b(Object paramObject, int paramInt)
  {
    if ((paramObject != null) && (!e(paramObject, paramInt)))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("kotlin.jvm.functions.Function");
      localStringBuilder.append(paramInt);
      h(paramObject, localStringBuilder.toString());
    }
    return paramObject;
  }
  
  public static List c(Object paramObject)
  {
    try
    {
      paramObject = (List)paramObject;
      return (List)paramObject;
    }
    catch (ClassCastException paramObject)
    {
      throw g((ClassCastException)paramObject);
    }
  }
  
  public static int d(Object paramObject)
  {
    if ((paramObject instanceof h)) {
      return ((h)paramObject).getArity();
    }
    if ((paramObject instanceof g6.a)) {
      return 0;
    }
    if ((paramObject instanceof l)) {
      return 1;
    }
    if ((paramObject instanceof p)) {
      return 2;
    }
    if ((paramObject instanceof q)) {
      return 3;
    }
    return -1;
  }
  
  public static boolean e(Object paramObject, int paramInt)
  {
    boolean bool;
    if (((paramObject instanceof c)) && (d(paramObject) == paramInt)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static Throwable f(Throwable paramThrowable)
  {
    return Intrinsics.h(paramThrowable, y.class.getName());
  }
  
  public static ClassCastException g(ClassCastException paramClassCastException)
  {
    throw ((ClassCastException)f(paramClassCastException));
  }
  
  public static void h(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      paramObject = "null";
    } else {
      paramObject = paramObject.getClass().getName();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append((String)paramObject);
    localStringBuilder.append(" cannot be cast to ");
    localStringBuilder.append(paramString);
    i(localStringBuilder.toString());
  }
  
  public static void i(String paramString)
  {
    throw g(new ClassCastException(paramString));
  }
}

/* Location:
 * Qualified Name:     kotlin.jvm.internal.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
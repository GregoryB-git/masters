package H;

import java.util.Objects;

public abstract class c
{
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    return a.a(paramObject1, paramObject2);
  }
  
  public static int b(Object... paramVarArgs)
  {
    return a.b(paramVarArgs);
  }
  
  public static Object c(Object paramObject)
  {
    paramObject.getClass();
    return paramObject;
  }
  
  public static Object d(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return paramObject;
    }
    throw new NullPointerException(paramString);
  }
  
  public static abstract class a
  {
    public static boolean a(Object paramObject1, Object paramObject2)
    {
      return Objects.equals(paramObject1, paramObject2);
    }
    
    public static int b(Object... paramVarArgs)
    {
      return Objects.hash(paramVarArgs);
    }
  }
}

/* Location:
 * Qualified Name:     H.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
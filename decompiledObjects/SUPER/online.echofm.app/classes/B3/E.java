package B3;

public abstract class E
{
  public static void a(boolean paramBoolean, String paramString)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(paramString);
  }
  
  public static Object b(Object paramObject)
  {
    paramObject.getClass();
    return paramObject;
  }
  
  public static Object c(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return paramObject;
    }
    throw new NullPointerException(paramString);
  }
  
  public static void d(boolean paramBoolean, String paramString)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException(paramString);
  }
}

/* Location:
 * Qualified Name:     B3.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
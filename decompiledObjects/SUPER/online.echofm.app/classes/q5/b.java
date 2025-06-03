package q5;

public abstract class b
{
  public static void a(Object paramObject, Class paramClass)
  {
    if (paramObject != null) {
      return;
    }
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append(paramClass.getCanonicalName());
    ((StringBuilder)paramObject).append(" must be set");
    throw new IllegalStateException(((StringBuilder)paramObject).toString());
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
}

/* Location:
 * Qualified Name:     q5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
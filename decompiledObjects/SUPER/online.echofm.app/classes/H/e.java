package H;

public abstract class e
{
  public static int a(int paramInt)
  {
    if (paramInt >= 0) {
      return paramInt;
    }
    throw new IllegalArgumentException();
  }
  
  public static Object b(Object paramObject)
  {
    paramObject.getClass();
    return paramObject;
  }
  
  public static Object c(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != null) {
      return paramObject1;
    }
    throw new NullPointerException(String.valueOf(paramObject2));
  }
}

/* Location:
 * Qualified Name:     H.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
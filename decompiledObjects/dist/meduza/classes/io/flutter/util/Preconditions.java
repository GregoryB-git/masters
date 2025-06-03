package io.flutter.util;

public final class Preconditions
{
  public static <T> T checkNotNull(T paramT)
  {
    paramT.getClass();
    return paramT;
  }
  
  public static void checkState(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException();
  }
  
  public static void checkState(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException(String.valueOf(paramObject));
  }
}

/* Location:
 * Qualified Name:     io.flutter.util.Preconditions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
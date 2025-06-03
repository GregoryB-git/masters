package v;

import android.content.Context;

public final class a$b
{
  public static int a(Context paramContext, int paramInt)
  {
    return paramContext.getColor(paramInt);
  }
  
  public static <T> T b(Context paramContext, Class<T> paramClass)
  {
    return (T)paramContext.getSystemService(paramClass);
  }
  
  public static String c(Context paramContext, Class<?> paramClass)
  {
    return paramContext.getSystemServiceName(paramClass);
  }
}

/* Location:
 * Qualified Name:     v.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
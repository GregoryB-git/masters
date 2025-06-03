package androidx.core.content;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class ContextCompat$Api23Impl
{
  @DoNotInline
  public static int getColor(Context paramContext, int paramInt)
  {
    return paramContext.getColor(paramInt);
  }
  
  @DoNotInline
  public static <T> T getSystemService(Context paramContext, Class<T> paramClass)
  {
    return (T)paramContext.getSystemService(paramClass);
  }
  
  @DoNotInline
  public static String getSystemServiceName(Context paramContext, Class<?> paramClass)
  {
    return paramContext.getSystemServiceName(paramClass);
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.ContextCompat.Api23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
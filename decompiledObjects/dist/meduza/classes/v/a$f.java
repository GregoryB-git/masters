package v;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Display;
import d3.a;
import e0.f0;
import e0.g0;

public final class a$f
{
  public static Context a(Context paramContext, String paramString)
  {
    return g0.b(paramContext, paramString);
  }
  
  public static String b(Context paramContext)
  {
    return f0.c(paramContext);
  }
  
  public static Display c(Context paramContext)
  {
    try
    {
      Display localDisplay = a.b(paramContext);
      return localDisplay;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("The context:");
      localStringBuilder.append(paramContext);
      localStringBuilder.append(" is not associated with any display. Return a fallback display instead.");
      Log.w("ContextCompat", localStringBuilder.toString());
    }
    return ((DisplayManager)paramContext.getSystemService(DisplayManager.class)).getDisplay(0);
  }
}

/* Location:
 * Qualified Name:     v.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
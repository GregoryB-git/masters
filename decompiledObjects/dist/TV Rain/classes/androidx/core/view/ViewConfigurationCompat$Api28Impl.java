package androidx.core.view;

import android.view.ViewConfiguration;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import m5;

@RequiresApi(28)
class ViewConfigurationCompat$Api28Impl
{
  @DoNotInline
  public static int getScaledHoverSlop(ViewConfiguration paramViewConfiguration)
  {
    return m5.c(paramViewConfiguration);
  }
  
  @DoNotInline
  public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration paramViewConfiguration)
  {
    return m5.n(paramViewConfiguration);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewConfigurationCompat.Api28Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
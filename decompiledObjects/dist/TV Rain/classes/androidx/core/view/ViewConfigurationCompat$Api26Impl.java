package androidx.core.view;

import android.view.ViewConfiguration;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import l5;

@RequiresApi(26)
class ViewConfigurationCompat$Api26Impl
{
  @DoNotInline
  public static float getScaledHorizontalScrollFactor(ViewConfiguration paramViewConfiguration)
  {
    return l5.j(paramViewConfiguration);
  }
  
  @DoNotInline
  public static float getScaledVerticalScrollFactor(ViewConfiguration paramViewConfiguration)
  {
    return l5.a(paramViewConfiguration);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewConfigurationCompat.Api26Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
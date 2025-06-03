package androidx.core.view.accessibility;

import android.graphics.Region;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import b;
import d;

@RequiresApi(33)
class AccessibilityWindowInfoCompat$Api33Impl
{
  @DoNotInline
  public static int getDisplayId(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return d.b(paramAccessibilityWindowInfo);
  }
  
  @DoNotInline
  public static void getRegionInScreen(AccessibilityWindowInfo paramAccessibilityWindowInfo, Region paramRegion)
  {
    d.u(paramAccessibilityWindowInfo, paramRegion);
  }
  
  @DoNotInline
  public static boolean isInPictureInPictureMode(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return b.v(paramAccessibilityWindowInfo);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api33Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
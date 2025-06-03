package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
class AccessibilityEventCompat$Api19Impl
{
  @DoNotInline
  public static int getContentChangeTypes(AccessibilityEvent paramAccessibilityEvent)
  {
    return paramAccessibilityEvent.getContentChangeTypes();
  }
  
  @DoNotInline
  public static void setContentChangeTypes(AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    paramAccessibilityEvent.setContentChangeTypes(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityEventCompat.Api19Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
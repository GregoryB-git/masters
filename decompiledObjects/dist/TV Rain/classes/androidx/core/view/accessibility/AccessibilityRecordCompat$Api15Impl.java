package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(15)
class AccessibilityRecordCompat$Api15Impl
{
  @DoNotInline
  public static int getMaxScrollX(AccessibilityRecord paramAccessibilityRecord)
  {
    return paramAccessibilityRecord.getMaxScrollX();
  }
  
  @DoNotInline
  public static int getMaxScrollY(AccessibilityRecord paramAccessibilityRecord)
  {
    return paramAccessibilityRecord.getMaxScrollY();
  }
  
  @DoNotInline
  public static void setMaxScrollX(AccessibilityRecord paramAccessibilityRecord, int paramInt)
  {
    paramAccessibilityRecord.setMaxScrollX(paramInt);
  }
  
  @DoNotInline
  public static void setMaxScrollY(AccessibilityRecord paramAccessibilityRecord, int paramInt)
  {
    paramAccessibilityRecord.setMaxScrollY(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityRecordCompat.Api15Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
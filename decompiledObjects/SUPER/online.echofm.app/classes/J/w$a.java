package J;

import android.view.accessibility.AccessibilityRecord;

public abstract class w$a
{
  public static int a(AccessibilityRecord paramAccessibilityRecord)
  {
    return paramAccessibilityRecord.getMaxScrollX();
  }
  
  public static int b(AccessibilityRecord paramAccessibilityRecord)
  {
    return paramAccessibilityRecord.getMaxScrollY();
  }
  
  public static void c(AccessibilityRecord paramAccessibilityRecord, int paramInt)
  {
    paramAccessibilityRecord.setMaxScrollX(paramInt);
  }
  
  public static void d(AccessibilityRecord paramAccessibilityRecord, int paramInt)
  {
    paramAccessibilityRecord.setMaxScrollY(paramInt);
  }
}

/* Location:
 * Qualified Name:     J.w.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
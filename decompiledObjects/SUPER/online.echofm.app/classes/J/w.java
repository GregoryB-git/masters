package J;

import android.view.accessibility.AccessibilityRecord;

public abstract class w
{
  public static void a(AccessibilityRecord paramAccessibilityRecord, int paramInt)
  {
    a.c(paramAccessibilityRecord, paramInt);
  }
  
  public static void b(AccessibilityRecord paramAccessibilityRecord, int paramInt)
  {
    a.d(paramAccessibilityRecord, paramInt);
  }
  
  public static abstract class a
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
}

/* Location:
 * Qualified Name:     J.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo.RangeInfo;

public class AccessibilityNodeInfoCompat$RangeInfoCompat
{
  public static final int RANGE_TYPE_FLOAT = 1;
  public static final int RANGE_TYPE_INT = 0;
  public static final int RANGE_TYPE_PERCENT = 2;
  public final Object mInfo;
  
  public AccessibilityNodeInfoCompat$RangeInfoCompat(Object paramObject)
  {
    mInfo = paramObject;
  }
  
  public static RangeInfoCompat obtain(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return new RangeInfoCompat(AccessibilityNodeInfo.RangeInfo.obtain(paramInt, paramFloat1, paramFloat2, paramFloat3));
  }
  
  public float getCurrent()
  {
    return ((AccessibilityNodeInfo.RangeInfo)mInfo).getCurrent();
  }
  
  public float getMax()
  {
    return ((AccessibilityNodeInfo.RangeInfo)mInfo).getMax();
  }
  
  public float getMin()
  {
    return ((AccessibilityNodeInfo.RangeInfo)mInfo).getMin();
  }
  
  public int getType()
  {
    return ((AccessibilityNodeInfo.RangeInfo)mInfo).getType();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
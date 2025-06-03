package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;

public class AccessibilityNodeInfoCompat$CollectionInfoCompat
{
  public static final int SELECTION_MODE_MULTIPLE = 2;
  public static final int SELECTION_MODE_NONE = 0;
  public static final int SELECTION_MODE_SINGLE = 1;
  public final Object mInfo;
  
  public AccessibilityNodeInfoCompat$CollectionInfoCompat(Object paramObject)
  {
    mInfo = paramObject;
  }
  
  public static CollectionInfoCompat obtain(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, paramBoolean));
  }
  
  public static CollectionInfoCompat obtain(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, paramBoolean, paramInt3));
  }
  
  public int getColumnCount()
  {
    return ((AccessibilityNodeInfo.CollectionInfo)mInfo).getColumnCount();
  }
  
  public int getRowCount()
  {
    return ((AccessibilityNodeInfo.CollectionInfo)mInfo).getRowCount();
  }
  
  public int getSelectionMode()
  {
    return ((AccessibilityNodeInfo.CollectionInfo)mInfo).getSelectionMode();
  }
  
  public boolean isHierarchical()
  {
    return ((AccessibilityNodeInfo.CollectionInfo)mInfo).isHierarchical();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
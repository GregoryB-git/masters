package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

public class AccessibilityNodeInfoCompat$CollectionItemInfoCompat
{
  public final Object mInfo;
  
  public AccessibilityNodeInfoCompat$CollectionItemInfoCompat(Object paramObject)
  {
    mInfo = paramObject;
  }
  
  public static CollectionItemInfoCompat obtain(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean));
  }
  
  public static CollectionItemInfoCompat obtain(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
  {
    return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean1, paramBoolean2));
  }
  
  public int getColumnIndex()
  {
    return ((AccessibilityNodeInfo.CollectionItemInfo)mInfo).getColumnIndex();
  }
  
  public int getColumnSpan()
  {
    return ((AccessibilityNodeInfo.CollectionItemInfo)mInfo).getColumnSpan();
  }
  
  public int getRowIndex()
  {
    return ((AccessibilityNodeInfo.CollectionItemInfo)mInfo).getRowIndex();
  }
  
  public int getRowSpan()
  {
    return ((AccessibilityNodeInfo.CollectionItemInfo)mInfo).getRowSpan();
  }
  
  @Deprecated
  public boolean isHeading()
  {
    return ((AccessibilityNodeInfo.CollectionItemInfo)mInfo).isHeading();
  }
  
  public boolean isSelected()
  {
    return ((AccessibilityNodeInfo.CollectionItemInfo)mInfo).isSelected();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
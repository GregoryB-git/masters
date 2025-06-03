package f0;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder;
import android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo;
import d3.a;

public final class b$c
{
  public static b.e a(boolean paramBoolean1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean2, String paramString1, String paramString2)
  {
    return new b.e(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(paramBoolean1).setColumnIndex(paramInt1).setRowIndex(paramInt2).setColumnSpan(paramInt3).setRowSpan(paramInt4).setSelected(paramBoolean2).setRowTitle(paramString1).setColumnTitle(paramString2).build());
  }
  
  public static b b(AccessibilityNodeInfo paramAccessibilityNodeInfo, int paramInt1, int paramInt2)
  {
    return b.d(paramAccessibilityNodeInfo.getChild(paramInt1, paramInt2));
  }
  
  public static String c(Object paramObject)
  {
    return ((AccessibilityNodeInfo.CollectionItemInfo)paramObject).getColumnTitle();
  }
  
  public static String d(Object paramObject)
  {
    return ((AccessibilityNodeInfo.CollectionItemInfo)paramObject).getRowTitle();
  }
  
  public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return a.d(paramAccessibilityNodeInfo);
  }
  
  public static b f(AccessibilityNodeInfo paramAccessibilityNodeInfo, int paramInt)
  {
    return b.d(paramAccessibilityNodeInfo.getParent(paramInt));
  }
  
  public static String g(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return paramAccessibilityNodeInfo.getUniqueId();
  }
  
  public static boolean h(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return paramAccessibilityNodeInfo.isTextSelectable();
  }
  
  public static void i(AccessibilityNodeInfo paramAccessibilityNodeInfo, boolean paramBoolean)
  {
    paramAccessibilityNodeInfo.setTextSelectable(paramBoolean);
  }
  
  public static void j(AccessibilityNodeInfo paramAccessibilityNodeInfo, String paramString)
  {
    paramAccessibilityNodeInfo.setUniqueId(paramString);
  }
}

/* Location:
 * Qualified Name:     f0.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
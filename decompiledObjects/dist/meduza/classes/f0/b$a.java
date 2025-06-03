package f0;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import f;

public final class b$a
{
  public static final a d;
  public static final a e;
  public static final a f;
  public static final a g;
  public final Object a;
  public final int b;
  public final Class<? extends d.a> c;
  
  static
  {
    new a(null, 1, null);
    new a(null, 2, null);
    new a(null, 4, null);
    new a(null, 8, null);
    new a(null, 16, null);
    new a(null, 32, null);
    new a(null, 64, null);
    new a(null, 128, null);
    new a(null, 256, d.b.class);
    new a(null, 512, d.b.class);
    new a(null, 1024, d.c.class);
    new a(null, 2048, d.c.class);
    d = new a(null, 4096, null);
    e = new a(null, 8192, null);
    new a(null, 16384, null);
    new a(null, 32768, null);
    new a(null, 65536, null);
    new a(null, 131072, d.g.class);
    new a(null, 262144, null);
    new a(null, 524288, null);
    new a(null, 1048576, null);
    new a(null, 2097152, d.h.class);
    int i = Build.VERSION.SDK_INT;
    new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null);
    new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, d.e.class);
    f = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null);
    new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null);
    g = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null);
    new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null);
    AccessibilityNodeInfo.AccessibilityAction localAccessibilityAction;
    if (i >= 29) {
      localAccessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
    } else {
      localAccessibilityAction = null;
    }
    new a(localAccessibilityAction, 16908358, null);
    if (i >= 29) {
      localAccessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
    } else {
      localAccessibilityAction = null;
    }
    new a(localAccessibilityAction, 16908359, null);
    if (i >= 29) {
      localAccessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
    } else {
      localAccessibilityAction = null;
    }
    new a(localAccessibilityAction, 16908360, null);
    if (i >= 29) {
      localAccessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
    } else {
      localAccessibilityAction = null;
    }
    new a(localAccessibilityAction, 16908361, null);
    new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null);
    if (i >= 24) {
      localAccessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
    } else {
      localAccessibilityAction = null;
    }
    new a(localAccessibilityAction, 16908349, d.f.class);
    if (i >= 26) {
      localAccessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
    } else {
      localAccessibilityAction = null;
    }
    new a(localAccessibilityAction, 16908354, d.d.class);
    if (i >= 28) {
      localAccessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
    } else {
      localAccessibilityAction = null;
    }
    new a(localAccessibilityAction, 16908356, null);
    if (i >= 28) {
      localAccessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
    } else {
      localAccessibilityAction = null;
    }
    new a(localAccessibilityAction, 16908357, null);
    if (i >= 30) {
      localAccessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
    } else {
      localAccessibilityAction = null;
    }
    new a(localAccessibilityAction, 16908362, null);
    if (i >= 30) {
      localAccessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
    } else {
      localAccessibilityAction = null;
    }
    new a(localAccessibilityAction, 16908372, null);
    if (i >= 32) {
      localAccessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
    } else {
      localAccessibilityAction = null;
    }
    new a(localAccessibilityAction, 16908373, null);
    if (i >= 32) {
      localAccessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
    } else {
      localAccessibilityAction = null;
    }
    new a(localAccessibilityAction, 16908374, null);
    if (i >= 32) {
      localAccessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
    } else {
      localAccessibilityAction = null;
    }
    new a(localAccessibilityAction, 16908375, null);
    if (i >= 33) {
      localAccessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
    } else {
      localAccessibilityAction = null;
    }
    new a(localAccessibilityAction, 16908376, null);
    if (i >= 34) {
      localAccessibilityAction = b.d.a();
    } else {
      localAccessibilityAction = null;
    }
    new a(localAccessibilityAction, 16908382, null);
  }
  
  public b$a(Object paramObject, int paramInt, Class paramClass)
  {
    b = paramInt;
    Object localObject = paramObject;
    if (paramObject == null) {
      localObject = new AccessibilityNodeInfo.AccessibilityAction(paramInt, null);
    }
    a = localObject;
    c = paramClass;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    Object localObject = (a)paramObject;
    paramObject = a;
    localObject = a;
    if (paramObject == null)
    {
      if (localObject != null) {
        return false;
      }
    }
    else if (!paramObject.equals(localObject)) {
      return false;
    }
    return true;
  }
  
  public final int hashCode()
  {
    Object localObject = a;
    int i;
    if (localObject != null) {
      i = localObject.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("AccessibilityActionCompat: ");
    String str1 = b.b(b);
    String str2 = str1;
    if (str1.equals("ACTION_UNKNOWN"))
    {
      str2 = str1;
      if (((AccessibilityNodeInfo.AccessibilityAction)a).getLabel() != null) {
        str2 = ((AccessibilityNodeInfo.AccessibilityAction)a).getLabel().toString();
      }
    }
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     f0.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
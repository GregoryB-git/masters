package f0;

import a0.d;
import android.graphics.Rect;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder;
import android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo;
import android.view.accessibility.AccessibilityNodeInfo.RangeInfo;
import d2.k;
import e0.f0;
import e0.g0;
import f;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class b
{
  public static int b;
  public final AccessibilityNodeInfo a;
  
  public b(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    a = paramAccessibilityNodeInfo;
  }
  
  @Deprecated
  public b(AccessibilityNodeInfo paramAccessibilityNodeInfo, int paramInt)
  {
    a = paramAccessibilityNodeInfo;
  }
  
  public static String b(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        switch (paramInt)
        {
        default: 
          switch (paramInt)
          {
          default: 
            switch (paramInt)
            {
            default: 
              switch (paramInt)
              {
              default: 
                return "ACTION_UNKNOWN";
              case 16908375: 
                return "ACTION_DRAG_CANCEL";
              case 16908374: 
                return "ACTION_DRAG_DROP";
              case 16908373: 
                return "ACTION_DRAG_START";
              }
              return "ACTION_IME_ENTER";
            case 16908362: 
              return "ACTION_PRESS_AND_HOLD";
            case 16908361: 
              return "ACTION_PAGE_RIGHT";
            case 16908360: 
              return "ACTION_PAGE_LEFT";
            case 16908359: 
              return "ACTION_PAGE_DOWN";
            case 16908358: 
              return "ACTION_PAGE_UP";
            case 16908357: 
              return "ACTION_HIDE_TOOLTIP";
            }
            return "ACTION_SHOW_TOOLTIP";
          case 16908349: 
            return "ACTION_SET_PROGRESS";
          case 16908348: 
            return "ACTION_CONTEXT_CLICK";
          case 16908347: 
            return "ACTION_SCROLL_RIGHT";
          case 16908346: 
            return "ACTION_SCROLL_DOWN";
          case 16908345: 
            return "ACTION_SCROLL_LEFT";
          case 16908344: 
            return "ACTION_SCROLL_UP";
          case 16908343: 
            return "ACTION_SCROLL_TO_POSITION";
          }
          return "ACTION_SHOW_ON_SCREEN";
        case 16908382: 
          return "ACTION_SCROLL_IN_DIRECTION";
        case 16908354: 
          return "ACTION_MOVE_WINDOW";
        case 2097152: 
          return "ACTION_SET_TEXT";
        case 524288: 
          return "ACTION_COLLAPSE";
        case 262144: 
          return "ACTION_EXPAND";
        case 131072: 
          return "ACTION_SET_SELECTION";
        case 65536: 
          return "ACTION_CUT";
        case 32768: 
          return "ACTION_PASTE";
        case 16384: 
          return "ACTION_COPY";
        case 8192: 
          return "ACTION_SCROLL_BACKWARD";
        case 4096: 
          return "ACTION_SCROLL_FORWARD";
        case 2048: 
          return "ACTION_PREVIOUS_HTML_ELEMENT";
        case 1024: 
          return "ACTION_NEXT_HTML_ELEMENT";
        case 512: 
          return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
        case 256: 
          return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
        case 128: 
          return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
        case 64: 
          return "ACTION_ACCESSIBILITY_FOCUS";
        case 32: 
          return "ACTION_LONG_CLICK";
        case 16: 
          return "ACTION_CLICK";
        case 8: 
          return "ACTION_CLEAR_SELECTION";
        }
        return "ACTION_SELECT";
      }
      return "ACTION_CLEAR_FOCUS";
    }
    return "ACTION_FOCUS";
  }
  
  public static b d(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    if (paramAccessibilityNodeInfo != null) {
      return new b(paramAccessibilityNodeInfo, 0);
    }
    return null;
  }
  
  public final ArrayList a(String paramString)
  {
    ArrayList localArrayList1 = a.getExtras().getIntegerArrayList(paramString);
    ArrayList localArrayList2 = localArrayList1;
    if (localArrayList1 == null)
    {
      localArrayList2 = new ArrayList();
      a.getExtras().putIntegerArrayList(paramString, localArrayList2);
    }
    return localArrayList2;
  }
  
  public final boolean c(int paramInt)
  {
    Bundle localBundle = a.getExtras();
    boolean bool = false;
    if (localBundle == null) {
      return false;
    }
    if ((localBundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & paramInt) == paramInt) {
      bool = true;
    }
    return bool;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    Object localObject = (b)paramObject;
    paramObject = a;
    localObject = a;
    if (paramObject == null)
    {
      if (localObject != null) {
        return false;
      }
    }
    else if (!((AccessibilityNodeInfo)paramObject).equals(localObject)) {
      return false;
    }
    return true;
  }
  
  public final int hashCode()
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = a;
    int i;
    if (localAccessibilityNodeInfo == null) {
      i = 0;
    } else {
      i = localAccessibilityNodeInfo.hashCode();
    }
    return i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    Object localObject1 = new Rect();
    a.getBoundsInParent((Rect)localObject1);
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("; boundsInParent: ");
    ((StringBuilder)localObject2).append(localObject1);
    localStringBuilder.append(((StringBuilder)localObject2).toString());
    a.getBoundsInScreen((Rect)localObject1);
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("; boundsInScreen: ");
    ((StringBuilder)localObject2).append(localObject1);
    localStringBuilder.append(((StringBuilder)localObject2).toString());
    if (Build.VERSION.SDK_INT >= 34)
    {
      d.b(a, (Rect)localObject1);
    }
    else
    {
      localObject2 = (Rect)a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
      if (localObject2 != null) {
        ((Rect)localObject1).set(left, top, right, bottom);
      }
    }
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("; boundsInWindow: ");
    ((StringBuilder)localObject2).append(localObject1);
    localStringBuilder.append(((StringBuilder)localObject2).toString());
    localStringBuilder.append("; packageName: ");
    localStringBuilder.append(a.getPackageName());
    localStringBuilder.append("; className: ");
    localStringBuilder.append(a.getClassName());
    localStringBuilder.append("; text: ");
    boolean bool = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    int i = 0;
    Object localObject4;
    if ((bool ^ true))
    {
      ArrayList localArrayList1 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
      localObject3 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
      localObject4 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
      ArrayList localArrayList2 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
      localObject2 = new SpannableString(TextUtils.substring(a.getText(), 0, a.getText().length()));
      for (j = 0;; j++)
      {
        localObject1 = localObject2;
        if (j >= localArrayList1.size()) {
          break;
        }
        ((SpannableString)localObject2).setSpan(new a(((Integer)localArrayList2.get(j)).intValue(), this, a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer)localArrayList1.get(j)).intValue(), ((Integer)((List)localObject3).get(j)).intValue(), ((Integer)((List)localObject4).get(j)).intValue());
      }
    }
    localObject1 = a.getText();
    localStringBuilder.append((CharSequence)localObject1);
    localStringBuilder.append("; error: ");
    localStringBuilder.append(a.getError());
    localStringBuilder.append("; maxTextLength: ");
    localStringBuilder.append(a.getMaxTextLength());
    localStringBuilder.append("; stateDescription: ");
    int j = Build.VERSION.SDK_INT;
    if (j >= 30) {
      localObject1 = b.b(a);
    } else {
      localObject1 = a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }
    localStringBuilder.append((CharSequence)localObject1);
    localStringBuilder.append("; contentDescription: ");
    localStringBuilder.append(a.getContentDescription());
    localStringBuilder.append("; tooltipText: ");
    if (j >= 28) {
      localObject1 = k.f(a);
    } else {
      localObject1 = a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }
    localStringBuilder.append((CharSequence)localObject1);
    localStringBuilder.append("; viewIdResName: ");
    localStringBuilder.append(a.getViewIdResourceName());
    localStringBuilder.append("; uniqueId: ");
    localObject1 = a;
    if (j >= 33) {
      localObject1 = c.g((AccessibilityNodeInfo)localObject1);
    } else {
      localObject1 = ((AccessibilityNodeInfo)localObject1).getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append("; checkable: ");
    localStringBuilder.append(a.isCheckable());
    localStringBuilder.append("; checked: ");
    localStringBuilder.append(a.isChecked());
    localStringBuilder.append("; focusable: ");
    localStringBuilder.append(a.isFocusable());
    localStringBuilder.append("; focused: ");
    localStringBuilder.append(a.isFocused());
    localStringBuilder.append("; selected: ");
    localStringBuilder.append(a.isSelected());
    localStringBuilder.append("; clickable: ");
    localStringBuilder.append(a.isClickable());
    localStringBuilder.append("; longClickable: ");
    localStringBuilder.append(a.isLongClickable());
    localStringBuilder.append("; contextClickable: ");
    localStringBuilder.append(a.isContextClickable());
    localStringBuilder.append("; enabled: ");
    localStringBuilder.append(a.isEnabled());
    localStringBuilder.append("; password: ");
    localStringBuilder.append(a.isPassword());
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("; scrollable: ");
    ((StringBuilder)localObject1).append(a.isScrollable());
    localStringBuilder.append(((StringBuilder)localObject1).toString());
    localStringBuilder.append("; containerTitle: ");
    localObject1 = a;
    if (j >= 34) {
      localObject1 = d.c((AccessibilityNodeInfo)localObject1);
    } else {
      localObject1 = ((AccessibilityNodeInfo)localObject1).getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }
    localStringBuilder.append((CharSequence)localObject1);
    localStringBuilder.append("; granularScrollingSupported: ");
    localStringBuilder.append(c(67108864));
    localStringBuilder.append("; importantForAccessibility: ");
    if (j >= 24) {
      bool = d.l(a);
    } else {
      bool = true;
    }
    localStringBuilder.append(bool);
    localStringBuilder.append("; visible: ");
    localStringBuilder.append(a.isVisibleToUser());
    localStringBuilder.append("; isTextSelectable: ");
    if (j >= 33) {
      bool = c.h(a);
    } else {
      bool = c(8388608);
    }
    localStringBuilder.append(bool);
    localStringBuilder.append("; accessibilityDataSensitive: ");
    if (j >= 34) {
      bool = d.f(a);
    } else {
      bool = c(64);
    }
    localStringBuilder.append(bool);
    localStringBuilder.append("; [");
    Object localObject3 = a.getActionList();
    if (localObject3 != null)
    {
      localObject2 = new ArrayList();
      int k = ((List)localObject3).size();
      for (j = 0;; j++)
      {
        localObject1 = localObject2;
        m = i;
        if (j >= k) {
          break;
        }
        ((ArrayList)localObject2).add(new a(((List)localObject3).get(j), 0, null));
      }
    }
    localObject1 = Collections.emptyList();
    for (int m = i; m < ((List)localObject1).size(); m++)
    {
      localObject4 = (a)((List)localObject1).get(m);
      localObject3 = b(((AccessibilityNodeInfo.AccessibilityAction)a).getId());
      localObject2 = localObject3;
      if (((String)localObject3).equals("ACTION_UNKNOWN"))
      {
        localObject2 = localObject3;
        if (((AccessibilityNodeInfo.AccessibilityAction)a).getLabel() != null) {
          localObject2 = ((AccessibilityNodeInfo.AccessibilityAction)a).getLabel().toString();
        }
      }
      localStringBuilder.append((String)localObject2);
      if (m != ((List)localObject1).size() - 1) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public static final class a
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
    
    public a(Object paramObject, int paramInt, Class paramClass)
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
  
  public static final class b
  {
    public static Object a(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
    {
      return new AccessibilityNodeInfo.RangeInfo(paramInt, paramFloat1, paramFloat2, paramFloat3);
    }
    
    public static CharSequence b(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      return g0.e(paramAccessibilityNodeInfo);
    }
    
    public static void c(AccessibilityNodeInfo paramAccessibilityNodeInfo, CharSequence paramCharSequence)
    {
      f0.g(paramAccessibilityNodeInfo, paramCharSequence);
    }
  }
  
  public static final class c
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
      return d3.a.d(paramAccessibilityNodeInfo);
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
  
  public static final class d
  {
    public static AccessibilityNodeInfo.AccessibilityAction a()
    {
      return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }
    
    public static void b(AccessibilityNodeInfo paramAccessibilityNodeInfo, Rect paramRect)
    {
      paramAccessibilityNodeInfo.getBoundsInWindow(paramRect);
    }
    
    public static CharSequence c(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      return paramAccessibilityNodeInfo.getContainerTitle();
    }
    
    public static long d(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      return paramAccessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
    }
    
    public static boolean e(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      return paramAccessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
    }
    
    public static boolean f(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      return paramAccessibilityNodeInfo.isAccessibilityDataSensitive();
    }
    
    public static void g(AccessibilityNodeInfo paramAccessibilityNodeInfo, boolean paramBoolean)
    {
      paramAccessibilityNodeInfo.setAccessibilityDataSensitive(paramBoolean);
    }
    
    public static void h(AccessibilityNodeInfo paramAccessibilityNodeInfo, Rect paramRect)
    {
      paramAccessibilityNodeInfo.setBoundsInWindow(paramRect);
    }
    
    public static void i(AccessibilityNodeInfo paramAccessibilityNodeInfo, CharSequence paramCharSequence)
    {
      paramAccessibilityNodeInfo.setContainerTitle(paramCharSequence);
    }
    
    public static void j(AccessibilityNodeInfo paramAccessibilityNodeInfo, long paramLong)
    {
      paramAccessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(paramLong));
    }
    
    public static void k(AccessibilityNodeInfo paramAccessibilityNodeInfo, View paramView, boolean paramBoolean)
    {
      paramAccessibilityNodeInfo.setQueryFromAppProcessEnabled(paramView, paramBoolean);
    }
    
    public static void l(AccessibilityNodeInfo paramAccessibilityNodeInfo, boolean paramBoolean)
    {
      paramAccessibilityNodeInfo.setRequestInitialAccessibilityFocus(paramBoolean);
    }
  }
  
  public static final class e
  {
    public final Object a;
    
    public e(AccessibilityNodeInfo.CollectionItemInfo paramCollectionItemInfo)
    {
      a = paramCollectionItemInfo;
    }
  }
}

/* Location:
 * Qualified Name:     f0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package J;

import android.graphics.Rect;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class u
{
  public static int d;
  public final AccessibilityNodeInfo a;
  public int b = -1;
  public int c = -1;
  
  public u(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    a = paramAccessibilityNodeInfo;
  }
  
  public static u P(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return new u(paramAccessibilityNodeInfo);
  }
  
  public static String g(int paramInt)
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
  
  public static ClickableSpan[] k(CharSequence paramCharSequence)
  {
    if ((paramCharSequence instanceof Spanned)) {
      return (ClickableSpan[])((Spanned)paramCharSequence).getSpans(0, paramCharSequence.length(), ClickableSpan.class);
    }
    return null;
  }
  
  public boolean A()
  {
    return a.isFocused();
  }
  
  public boolean B()
  {
    return a.isLongClickable();
  }
  
  public boolean C()
  {
    return a.isPassword();
  }
  
  public boolean D()
  {
    return a.isScrollable();
  }
  
  public boolean E()
  {
    return a.isSelected();
  }
  
  public boolean F(int paramInt, Bundle paramBundle)
  {
    return a.performAction(paramInt, paramBundle);
  }
  
  public final void G(View paramView)
  {
    SparseArray localSparseArray = p(paramView);
    if (localSparseArray != null)
    {
      paramView = new ArrayList();
      int i = 0;
      int k;
      for (int j = 0;; j++)
      {
        k = i;
        if (j >= localSparseArray.size()) {
          break;
        }
        if (((WeakReference)localSparseArray.valueAt(j)).get() == null) {
          paramView.add(Integer.valueOf(j));
        }
      }
      while (k < paramView.size())
      {
        localSparseArray.remove(((Integer)paramView.get(k)).intValue());
        k++;
      }
    }
  }
  
  public final void H(int paramInt, boolean paramBoolean)
  {
    Bundle localBundle = m();
    if (localBundle != null)
    {
      int i = localBundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
      int j;
      if (paramBoolean) {
        j = paramInt;
      } else {
        j = 0;
      }
      localBundle.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", j | i & paramInt);
    }
  }
  
  public void I(CharSequence paramCharSequence)
  {
    a.setClassName(paramCharSequence);
  }
  
  public void J(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      d.a(a, paramBoolean);
    } else {
      H(2, paramBoolean);
    }
  }
  
  public void K(CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      c.a(a, paramCharSequence);
    } else {
      b.a(a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", paramCharSequence);
    }
  }
  
  public void L(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      b.a(a, paramBoolean);
    } else {
      H(1, paramBoolean);
    }
  }
  
  public void M(boolean paramBoolean)
  {
    a.setScrollable(paramBoolean);
  }
  
  public void N(CharSequence paramCharSequence)
  {
    if (E.b.b()) {
      e.a(a, paramCharSequence);
    } else {
      b.a(a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", paramCharSequence);
    }
  }
  
  public AccessibilityNodeInfo O()
  {
    return a;
  }
  
  public void a(a parama)
  {
    a.addAction((AccessibilityNodeInfo.AccessibilityAction)a);
  }
  
  public final void b(ClickableSpan paramClickableSpan, Spanned paramSpanned, int paramInt)
  {
    e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(paramSpanned.getSpanStart(paramClickableSpan)));
    e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(paramSpanned.getSpanEnd(paramClickableSpan)));
    e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(paramSpanned.getSpanFlags(paramClickableSpan)));
    e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(paramInt));
  }
  
  public void c(CharSequence paramCharSequence, View paramView)
  {
    if (Build.VERSION.SDK_INT < 26)
    {
      d();
      G(paramView);
      ClickableSpan[] arrayOfClickableSpan = k(paramCharSequence);
      if ((arrayOfClickableSpan != null) && (arrayOfClickableSpan.length > 0))
      {
        m().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", v.c.a);
        paramView = n(paramView);
        for (int i = 0; i < arrayOfClickableSpan.length; i++)
        {
          int j = u(arrayOfClickableSpan[i], paramView);
          paramView.put(j, new WeakReference(arrayOfClickableSpan[i]));
          b(arrayOfClickableSpan[i], (Spanned)paramCharSequence, j);
        }
      }
    }
  }
  
  public final void d()
  {
    b.a(a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
    b.a(a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
    b.a(a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
    b.a(a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
  }
  
  public final List e(String paramString)
  {
    ArrayList localArrayList1 = b.a(a).getIntegerArrayList(paramString);
    ArrayList localArrayList2 = localArrayList1;
    if (localArrayList1 == null)
    {
      localArrayList2 = new ArrayList();
      b.a(a).putIntegerArrayList(paramString, localArrayList2);
    }
    return localArrayList2;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof u)) {
      return false;
    }
    u localu = (u)paramObject;
    paramObject = a;
    if (paramObject == null)
    {
      if (a != null) {
        return false;
      }
    }
    else if (!((AccessibilityNodeInfo)paramObject).equals(a)) {
      return false;
    }
    if (c != c) {
      return false;
    }
    return b == b;
  }
  
  public List f()
  {
    List localList = a.getActionList();
    if (localList != null)
    {
      ArrayList localArrayList = new ArrayList();
      int i = localList.size();
      for (int j = 0; j < i; j++) {
        localArrayList.add(new a(localList.get(j)));
      }
      return localArrayList;
    }
    return Collections.emptyList();
  }
  
  public void h(Rect paramRect)
  {
    a.getBoundsInParent(paramRect);
  }
  
  public int hashCode()
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
  
  public void i(Rect paramRect)
  {
    a.getBoundsInScreen(paramRect);
  }
  
  public CharSequence j()
  {
    return a.getClassName();
  }
  
  public CharSequence l()
  {
    return a.getContentDescription();
  }
  
  public Bundle m()
  {
    return b.a(a);
  }
  
  public final SparseArray n(View paramView)
  {
    SparseArray localSparseArray1 = p(paramView);
    SparseArray localSparseArray2 = localSparseArray1;
    if (localSparseArray1 == null)
    {
      localSparseArray2 = new SparseArray();
      paramView.setTag(v.c.I, localSparseArray2);
    }
    return localSparseArray2;
  }
  
  public CharSequence o()
  {
    return a.getPackageName();
  }
  
  public final SparseArray p(View paramView)
  {
    return (SparseArray)paramView.getTag(v.c.I);
  }
  
  public CharSequence q()
  {
    if (t())
    {
      List localList1 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
      List localList2 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
      List localList3 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
      List localList4 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
      Object localObject = a.getText();
      int i = a.getText().length();
      int j = 0;
      localObject = new SpannableString(TextUtils.substring((CharSequence)localObject, 0, i));
      while (j < localList1.size())
      {
        ((Spannable)localObject).setSpan(new a(((Integer)localList4.get(j)).intValue(), this, m().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer)localList1.get(j)).intValue(), ((Integer)localList2.get(j)).intValue(), ((Integer)localList3.get(j)).intValue());
        j++;
      }
      return (CharSequence)localObject;
    }
    return a.getText();
  }
  
  public String r()
  {
    if (E.b.c()) {
      return f.a(a);
    }
    return b.a(a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
  }
  
  public String s()
  {
    return a.getViewIdResourceName();
  }
  
  public final boolean t()
  {
    return e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty() ^ true;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    Object localObject1 = new Rect();
    h((Rect)localObject1);
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("; boundsInParent: ");
    ((StringBuilder)localObject2).append(localObject1);
    localStringBuilder.append(((StringBuilder)localObject2).toString());
    i((Rect)localObject1);
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("; boundsInScreen: ");
    ((StringBuilder)localObject2).append(localObject1);
    localStringBuilder.append(((StringBuilder)localObject2).toString());
    localStringBuilder.append("; packageName: ");
    localStringBuilder.append(o());
    localStringBuilder.append("; className: ");
    localStringBuilder.append(j());
    localStringBuilder.append("; text: ");
    localStringBuilder.append(q());
    localStringBuilder.append("; contentDescription: ");
    localStringBuilder.append(l());
    localStringBuilder.append("; viewId: ");
    localStringBuilder.append(s());
    localStringBuilder.append("; uniqueId: ");
    localStringBuilder.append(r());
    localStringBuilder.append("; checkable: ");
    localStringBuilder.append(v());
    localStringBuilder.append("; checked: ");
    localStringBuilder.append(w());
    localStringBuilder.append("; focusable: ");
    localStringBuilder.append(z());
    localStringBuilder.append("; focused: ");
    localStringBuilder.append(A());
    localStringBuilder.append("; selected: ");
    localStringBuilder.append(E());
    localStringBuilder.append("; clickable: ");
    localStringBuilder.append(x());
    localStringBuilder.append("; longClickable: ");
    localStringBuilder.append(B());
    localStringBuilder.append("; enabled: ");
    localStringBuilder.append(y());
    localStringBuilder.append("; password: ");
    localStringBuilder.append(C());
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("; scrollable: ");
    ((StringBuilder)localObject1).append(D());
    localStringBuilder.append(((StringBuilder)localObject1).toString());
    localStringBuilder.append("; [");
    List localList = f();
    for (int i = 0; i < localList.size(); i++)
    {
      a locala = (a)localList.get(i);
      localObject2 = g(locala.a());
      localObject1 = localObject2;
      if (((String)localObject2).equals("ACTION_UNKNOWN"))
      {
        localObject1 = localObject2;
        if (locala.b() != null) {
          localObject1 = locala.b().toString();
        }
      }
      localStringBuilder.append((String)localObject1);
      if (i != localList.size() - 1) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public final int u(ClickableSpan paramClickableSpan, SparseArray paramSparseArray)
  {
    if (paramSparseArray != null) {
      for (i = 0; i < paramSparseArray.size(); i++) {
        if (paramClickableSpan.equals((ClickableSpan)((WeakReference)paramSparseArray.valueAt(i)).get())) {
          return paramSparseArray.keyAt(i);
        }
      }
    }
    int i = d;
    d = i + 1;
    return i;
  }
  
  public boolean v()
  {
    return a.isCheckable();
  }
  
  public boolean w()
  {
    return a.isChecked();
  }
  
  public boolean x()
  {
    return a.isClickable();
  }
  
  public boolean y()
  {
    return a.isEnabled();
  }
  
  public boolean z()
  {
    return a.isFocusable();
  }
  
  public static class a
  {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a E;
    public static final a F;
    public static final a G;
    public static final a H;
    public static final a I;
    public static final a J;
    public static final a K;
    public static final a L;
    public static final a M;
    public static final a N;
    public static final a O;
    public static final a P;
    public static final a Q;
    public static final a R;
    public static final a S;
    public static final a T;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;
    public static final a o;
    public static final a p;
    public static final a q;
    public static final a r;
    public static final a s;
    public static final a t;
    public static final a u;
    public static final a v;
    public static final a w;
    public static final a x;
    public static final a y;
    public static final a z;
    public final Object a;
    public final int b;
    public final Class c;
    
    static
    {
      Object localObject1 = null;
      d = new a(1, null);
      e = new a(2, null);
      f = new a(4, null);
      g = new a(8, null);
      h = new a(16, null);
      i = new a(32, null);
      j = new a(64, null);
      k = new a(128, null);
      l = new a(256, null, x.b.class);
      m = new a(512, null, x.b.class);
      n = new a(1024, null, x.c.class);
      o = new a(2048, null, x.c.class);
      p = new a(4096, null);
      q = new a(8192, null);
      r = new a(16384, null);
      s = new a(32768, null);
      t = new a(65536, null);
      u = new a(131072, null, x.g.class);
      v = new a(262144, null);
      w = new a(524288, null);
      x = new a(1048576, null);
      y = new a(2097152, null, x.h.class);
      int i1 = Build.VERSION.SDK_INT;
      z = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
      A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, x.e.class);
      B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
      C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
      D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
      E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
      if (i1 >= 29) {
        localObject2 = g.a();
      } else {
        localObject2 = null;
      }
      F = new a(localObject2, 16908358, null, null, null);
      if (i1 >= 29) {
        localObject2 = p.a();
      } else {
        localObject2 = null;
      }
      G = new a(localObject2, 16908359, null, null, null);
      if (i1 >= 29) {
        localObject2 = q.a();
      } else {
        localObject2 = null;
      }
      H = new a(localObject2, 16908360, null, null, null);
      if (i1 >= 29) {
        localObject2 = r.a();
      } else {
        localObject2 = null;
      }
      I = new a(localObject2, 16908361, null, null, null);
      J = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
      if (i1 >= 24) {
        localObject2 = s.a();
      } else {
        localObject2 = null;
      }
      K = new a(localObject2, 16908349, null, null, x.f.class);
      if (i1 >= 26) {
        localObject2 = t.a();
      } else {
        localObject2 = null;
      }
      L = new a(localObject2, 16908354, null, null, x.d.class);
      if (i1 >= 28) {
        localObject2 = h.a();
      } else {
        localObject2 = null;
      }
      M = new a(localObject2, 16908356, null, null, null);
      if (i1 >= 28) {
        localObject2 = i.a();
      } else {
        localObject2 = null;
      }
      N = new a(localObject2, 16908357, null, null, null);
      if (i1 >= 30) {
        localObject2 = j.a();
      } else {
        localObject2 = null;
      }
      O = new a(localObject2, 16908362, null, null, null);
      if (i1 >= 30) {
        localObject2 = k.a();
      } else {
        localObject2 = null;
      }
      P = new a(localObject2, 16908372, null, null, null);
      if (i1 >= 32) {
        localObject2 = l.a();
      } else {
        localObject2 = null;
      }
      Q = new a(localObject2, 16908373, null, null, null);
      if (i1 >= 32) {
        localObject2 = m.a();
      } else {
        localObject2 = null;
      }
      R = new a(localObject2, 16908374, null, null, null);
      if (i1 >= 32) {
        localObject2 = n.a();
      } else {
        localObject2 = null;
      }
      S = new a(localObject2, 16908375, null, null, null);
      Object localObject2 = localObject1;
      if (i1 >= 33) {
        localObject2 = o.a();
      }
      T = new a(localObject2, 16908376, null, null, null);
    }
    
    public a(int paramInt, CharSequence paramCharSequence)
    {
      this(null, paramInt, paramCharSequence, null, null);
    }
    
    public a(int paramInt, CharSequence paramCharSequence, Class paramClass)
    {
      this(null, paramInt, paramCharSequence, null, paramClass);
    }
    
    public a(Object paramObject)
    {
      this(paramObject, 0, null, null, null);
    }
    
    public a(Object paramObject, int paramInt, CharSequence paramCharSequence, x paramx, Class paramClass)
    {
      b = paramInt;
      paramx = (x)paramObject;
      if (paramObject == null) {
        paramx = new AccessibilityNodeInfo.AccessibilityAction(paramInt, paramCharSequence);
      }
      a = paramx;
      c = paramClass;
    }
    
    public int a()
    {
      return ((AccessibilityNodeInfo.AccessibilityAction)a).getId();
    }
    
    public CharSequence b()
    {
      return ((AccessibilityNodeInfo.AccessibilityAction)a).getLabel();
    }
    
    public boolean c(View paramView, Bundle paramBundle)
    {
      return false;
    }
    
    public boolean equals(Object paramObject)
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
    
    public int hashCode()
    {
      Object localObject = a;
      int i1;
      if (localObject != null) {
        i1 = localObject.hashCode();
      } else {
        i1 = 0;
      }
      return i1;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("AccessibilityActionCompat: ");
      String str1 = u.g(b);
      String str2 = str1;
      if (str1.equals("ACTION_UNKNOWN"))
      {
        str2 = str1;
        if (b() != null) {
          str2 = b().toString();
        }
      }
      localStringBuilder.append(str2);
      return localStringBuilder.toString();
    }
  }
  
  public static abstract class b
  {
    public static Bundle a(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      return paramAccessibilityNodeInfo.getExtras();
    }
  }
}

/* Location:
 * Qualified Name:     J.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
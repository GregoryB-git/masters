package I;

import J.u;
import J.u.a;
import J.v;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import v.c;

public class a
{
  public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
  public final View.AccessibilityDelegate a;
  public final View.AccessibilityDelegate b;
  
  public a()
  {
    this(c);
  }
  
  public a(View.AccessibilityDelegate paramAccessibilityDelegate)
  {
    a = paramAccessibilityDelegate;
    b = new a(this);
  }
  
  public static List c(View paramView)
  {
    List localList = (List)paramView.getTag(c.H);
    paramView = localList;
    if (localList == null) {
      paramView = Collections.emptyList();
    }
    return paramView;
  }
  
  public boolean a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return a.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public v b(View paramView)
  {
    paramView = b.a(a, paramView);
    if (paramView != null) {
      return new v(paramView);
    }
    return null;
  }
  
  public View.AccessibilityDelegate d()
  {
    return b;
  }
  
  public final boolean e(ClickableSpan paramClickableSpan, View paramView)
  {
    if (paramClickableSpan != null)
    {
      paramView = u.k(paramView.createAccessibilityNodeInfo().getText());
      for (int i = 0; (paramView != null) && (i < paramView.length); i++) {
        if (paramClickableSpan.equals(paramView[i])) {
          return true;
        }
      }
    }
    return false;
  }
  
  public void f(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void g(View paramView, u paramu)
  {
    a.onInitializeAccessibilityNodeInfo(paramView, paramu.O());
  }
  
  public void h(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public boolean i(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return a.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public boolean j(View paramView, int paramInt, Bundle paramBundle)
  {
    List localList = c(paramView);
    boolean bool1 = false;
    for (int i = 0;; i++)
    {
      bool2 = bool1;
      if (i >= localList.size()) {
        break;
      }
      u.a locala = (u.a)localList.get(i);
      if (locala.a() == paramInt)
      {
        bool2 = locala.c(paramView, paramBundle);
        break;
      }
    }
    bool1 = bool2;
    if (!bool2) {
      bool1 = b.b(a, paramView, paramInt, paramBundle);
    }
    boolean bool2 = bool1;
    if (!bool1)
    {
      bool2 = bool1;
      if (paramInt == c.a)
      {
        bool2 = bool1;
        if (paramBundle != null) {
          bool2 = k(paramBundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), paramView);
        }
      }
    }
    return bool2;
  }
  
  public final boolean k(int paramInt, View paramView)
  {
    Object localObject = (SparseArray)paramView.getTag(c.I);
    if (localObject != null)
    {
      localObject = (WeakReference)((SparseArray)localObject).get(paramInt);
      if (localObject != null)
      {
        localObject = (ClickableSpan)((Reference)localObject).get();
        if (e((ClickableSpan)localObject, paramView))
        {
          ((ClickableSpan)localObject).onClick(paramView);
          return true;
        }
      }
    }
    return false;
  }
  
  public void l(View paramView, int paramInt)
  {
    a.sendAccessibilityEvent(paramView, paramInt);
  }
  
  public void m(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
  }
  
  public static final class a
    extends View.AccessibilityDelegate
  {
    public final a a;
    
    public a(a parama)
    {
      a = parama;
    }
    
    public boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      return a.a(paramView, paramAccessibilityEvent);
    }
    
    public AccessibilityNodeProvider getAccessibilityNodeProvider(View paramView)
    {
      paramView = a.b(paramView);
      if (paramView != null) {
        paramView = (AccessibilityNodeProvider)paramView.a();
      } else {
        paramView = null;
      }
      return paramView;
    }
    
    public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      a.f(paramView, paramAccessibilityEvent);
    }
    
    public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      u localu = u.P(paramAccessibilityNodeInfo);
      localu.L(s.u(paramView));
      localu.J(s.s(paramView));
      localu.K(s.i(paramView));
      localu.N(s.p(paramView));
      a.g(paramView, localu);
      localu.c(paramAccessibilityNodeInfo.getText(), paramView);
      paramView = a.c(paramView);
      for (int i = 0; i < paramView.size(); i++) {
        localu.a((u.a)paramView.get(i));
      }
    }
    
    public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      a.h(paramView, paramAccessibilityEvent);
    }
    
    public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      return a.i(paramViewGroup, paramView, paramAccessibilityEvent);
    }
    
    public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
    {
      return a.j(paramView, paramInt, paramBundle);
    }
    
    public void sendAccessibilityEvent(View paramView, int paramInt)
    {
      a.l(paramView, paramInt);
    }
    
    public void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      a.m(paramView, paramAccessibilityEvent);
    }
  }
  
  public static abstract class b
  {
    public static AccessibilityNodeProvider a(View.AccessibilityDelegate paramAccessibilityDelegate, View paramView)
    {
      return paramAccessibilityDelegate.getAccessibilityNodeProvider(paramView);
    }
    
    public static boolean b(View.AccessibilityDelegate paramAccessibilityDelegate, View paramView, int paramInt, Bundle paramBundle)
    {
      return paramAccessibilityDelegate.performAccessibilityAction(paramView, paramInt, paramBundle);
    }
  }
}

/* Location:
 * Qualified Name:     I.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
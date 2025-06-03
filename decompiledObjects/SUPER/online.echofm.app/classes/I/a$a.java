package I;

import J.u;
import J.u.a;
import J.v;
import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public final class a$a
  extends View.AccessibilityDelegate
{
  public final a a;
  
  public a$a(a parama)
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

/* Location:
 * Qualified Name:     I.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
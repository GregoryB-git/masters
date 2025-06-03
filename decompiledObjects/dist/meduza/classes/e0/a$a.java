package e0;

import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeProvider;
import f0.b.a;
import f0.b.b;
import f0.c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a$a
  extends View.AccessibilityDelegate
{
  public final a a;
  
  public a$a(a parama)
  {
    a = parama;
  }
  
  public final boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return a.a(paramView, paramAccessibilityEvent);
  }
  
  public final AccessibilityNodeProvider getAccessibilityNodeProvider(View paramView)
  {
    paramView = a.b(paramView);
    if (paramView != null) {
      paramView = (AccessibilityNodeProvider)a;
    } else {
      paramView = null;
    }
    return paramView;
  }
  
  public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.c(paramView, paramAccessibilityEvent);
  }
  
  public final void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    f0.b localb = new f0.b(paramAccessibilityNodeInfo);
    Object localObject1 = d0.a;
    int i = Build.VERSION.SDK_INT;
    int j = 1;
    if (i >= 28) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject2 = null;
    if (i != 0)
    {
      localObject1 = Boolean.valueOf(d0.g.d(paramView));
    }
    else
    {
      localObject1 = paramView.getTag(2131362039);
      if (!Boolean.class.isInstance(localObject1)) {
        localObject1 = null;
      }
    }
    localObject1 = (Boolean)localObject1;
    int k;
    if ((localObject1 != null) && (((Boolean)localObject1).booleanValue())) {
      k = 1;
    } else {
      k = 0;
    }
    int m = Build.VERSION.SDK_INT;
    if (m >= 28)
    {
      android.support.v4.media.session.b.m(paramAccessibilityNodeInfo, k);
    }
    else
    {
      localObject1 = paramAccessibilityNodeInfo.getExtras();
      if (localObject1 != null) {
        ((BaseBundle)localObject1).putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", k | ((BaseBundle)localObject1).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 0xFFFFFFFE);
      }
    }
    if (Build.VERSION.SDK_INT >= 28) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      localObject1 = Boolean.valueOf(d0.g.c(paramView));
    }
    else
    {
      localObject1 = paramView.getTag(2131362034);
      if (!Boolean.class.isInstance(localObject1)) {
        localObject1 = null;
      }
    }
    localObject1 = (Boolean)localObject1;
    boolean bool;
    if ((localObject1 != null) && (((Boolean)localObject1).booleanValue())) {
      bool = true;
    } else {
      bool = false;
    }
    if (m >= 28)
    {
      android.support.v4.media.session.b.s(paramAccessibilityNodeInfo, bool);
    }
    else
    {
      i = 2;
      localObject1 = paramAccessibilityNodeInfo.getExtras();
      if (localObject1 != null)
      {
        int n = ((BaseBundle)localObject1).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
        if (!bool) {
          i = 0;
        }
        ((BaseBundle)localObject1).putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | n & 0xFFFFFFFD);
      }
    }
    if (m >= 28) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      localObject1 = d0.g.b(paramView);
    }
    else
    {
      localObject1 = paramView.getTag(2131362035);
      if (!CharSequence.class.isInstance(localObject1)) {
        localObject1 = null;
      }
    }
    localObject1 = (CharSequence)localObject1;
    if (m >= 28) {
      com.google.android.recaptcha.internal.a.o(paramAccessibilityNodeInfo, (CharSequence)localObject1);
    } else {
      paramAccessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", (CharSequence)localObject1);
    }
    if (m >= 30) {
      i = j;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      localObject1 = d0.i.b(paramView);
    }
    else
    {
      localObject1 = paramView.getTag(2131362040);
      if (!CharSequence.class.isInstance(localObject1)) {
        localObject1 = null;
      }
    }
    localObject1 = (CharSequence)localObject1;
    if (m >= 30) {
      b.b.c(paramAccessibilityNodeInfo, (CharSequence)localObject1);
    } else {
      paramAccessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", (CharSequence)localObject1);
    }
    a.d(paramView, localb);
    CharSequence localCharSequence = paramAccessibilityNodeInfo.getText();
    if (m < 26)
    {
      paramAccessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
      paramAccessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
      paramAccessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
      paramAccessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
      paramAccessibilityNodeInfo = (SparseArray)paramView.getTag(2131362033);
      if (paramAccessibilityNodeInfo != null)
      {
        localObject1 = new ArrayList();
        for (i = 0; i < paramAccessibilityNodeInfo.size(); i++) {
          if (((WeakReference)paramAccessibilityNodeInfo.valueAt(i)).get() == null) {
            ((ArrayList)localObject1).add(Integer.valueOf(i));
          }
        }
        for (i = 0; i < ((ArrayList)localObject1).size(); i++) {
          paramAccessibilityNodeInfo.remove(((Integer)((ArrayList)localObject1).get(i)).intValue());
        }
      }
      paramAccessibilityNodeInfo = (AccessibilityNodeInfo)localObject2;
      if ((localCharSequence instanceof Spanned)) {
        paramAccessibilityNodeInfo = (ClickableSpan[])((Spanned)localCharSequence).getSpans(0, localCharSequence.length(), ClickableSpan.class);
      }
      if ((paramAccessibilityNodeInfo != null) && (paramAccessibilityNodeInfo.length > 0))
      {
        a.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", 2131361798);
        localObject2 = (SparseArray)paramView.getTag(2131362033);
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = new SparseArray();
          paramView.setTag(2131362033, localObject1);
        }
        for (i = 0; i < paramAccessibilityNodeInfo.length; i++)
        {
          localObject2 = paramAccessibilityNodeInfo[i];
          for (j = 0; j < ((SparseArray)localObject1).size(); j++) {
            if (localObject2.equals((ClickableSpan)((WeakReference)((SparseArray)localObject1).valueAt(j)).get()))
            {
              j = ((SparseArray)localObject1).keyAt(j);
              break label833;
            }
          }
          j = f0.b.b;
          f0.b.b = j + 1;
          label833:
          ((SparseArray)localObject1).put(j, new WeakReference(paramAccessibilityNodeInfo[i]));
          Object localObject3 = paramAccessibilityNodeInfo[i];
          localObject2 = (Spanned)localCharSequence;
          localb.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(((Spanned)localObject2).getSpanStart(localObject3)));
          localb.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(((Spanned)localObject2).getSpanEnd(localObject3)));
          localb.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(((Spanned)localObject2).getSpanFlags(localObject3)));
          localb.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(j));
        }
      }
    }
    paramAccessibilityNodeInfo = (List)paramView.getTag(2131362032);
    paramView = paramAccessibilityNodeInfo;
    if (paramAccessibilityNodeInfo == null) {
      paramView = Collections.emptyList();
    }
    for (i = 0; i < paramView.size(); i++)
    {
      paramAccessibilityNodeInfo = (b.a)paramView.get(i);
      a.addAction((AccessibilityNodeInfo.AccessibilityAction)a);
    }
  }
  
  public final void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.e(paramView, paramAccessibilityEvent);
  }
  
  public final boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return a.f(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    return a.g(paramView, paramInt, paramBundle);
  }
  
  public final void sendAccessibilityEvent(View paramView, int paramInt)
  {
    a.h(paramView, paramInt);
  }
  
  public final void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.i(paramView, paramAccessibilityEvent);
  }
}

/* Location:
 * Qualified Name:     e0.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.core.view;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.List;

final class AccessibilityDelegateCompat$AccessibilityDelegateAdapter
  extends View.AccessibilityDelegate
{
  public final AccessibilityDelegateCompat mCompat;
  
  public AccessibilityDelegateCompat$AccessibilityDelegateAdapter(AccessibilityDelegateCompat paramAccessibilityDelegateCompat)
  {
    mCompat = paramAccessibilityDelegateCompat;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return mCompat.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  @RequiresApi(16)
  public AccessibilityNodeProvider getAccessibilityNodeProvider(View paramView)
  {
    paramView = mCompat.getAccessibilityNodeProvider(paramView);
    if (paramView != null) {
      paramView = (AccessibilityNodeProvider)paramView.getProvider();
    } else {
      paramView = null;
    }
    return paramView;
  }
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    mCompat.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = AccessibilityNodeInfoCompat.wrap(paramAccessibilityNodeInfo);
    localAccessibilityNodeInfoCompat.setScreenReaderFocusable(ViewCompat.isScreenReaderFocusable(paramView));
    localAccessibilityNodeInfoCompat.setHeading(ViewCompat.isAccessibilityHeading(paramView));
    localAccessibilityNodeInfoCompat.setPaneTitle(ViewCompat.getAccessibilityPaneTitle(paramView));
    localAccessibilityNodeInfoCompat.setStateDescription(ViewCompat.getStateDescription(paramView));
    mCompat.onInitializeAccessibilityNodeInfo(paramView, localAccessibilityNodeInfoCompat);
    localAccessibilityNodeInfoCompat.addSpansToExtras(paramAccessibilityNodeInfo.getText(), paramView);
    paramView = AccessibilityDelegateCompat.getActionList(paramView);
    for (int i = 0; i < paramView.size(); i++) {
      localAccessibilityNodeInfoCompat.addAction((AccessibilityNodeInfoCompat.AccessibilityActionCompat)paramView.get(i));
    }
  }
  
  public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    mCompat.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return mCompat.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    return mCompat.performAccessibilityAction(paramView, paramInt, paramBundle);
  }
  
  public void sendAccessibilityEvent(View paramView, int paramInt)
  {
    mCompat.sendAccessibilityEvent(paramView, paramInt);
  }
  
  public void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    mCompat.sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
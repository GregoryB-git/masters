package androidx.core.view;

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
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.R.id;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class AccessibilityDelegateCompat
{
  private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
  private final View.AccessibilityDelegate mBridge;
  private final View.AccessibilityDelegate mOriginalDelegate;
  
  public AccessibilityDelegateCompat()
  {
    this(DEFAULT_DELEGATE);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public AccessibilityDelegateCompat(@NonNull View.AccessibilityDelegate paramAccessibilityDelegate)
  {
    mOriginalDelegate = paramAccessibilityDelegate;
    mBridge = new AccessibilityDelegateAdapter(this);
  }
  
  public static List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList(View paramView)
  {
    List localList = (List)paramView.getTag(R.id.tag_accessibility_actions);
    paramView = localList;
    if (localList == null) {
      paramView = Collections.emptyList();
    }
    return paramView;
  }
  
  private boolean isSpanStillValid(ClickableSpan paramClickableSpan, View paramView)
  {
    if (paramClickableSpan != null)
    {
      paramView = AccessibilityNodeInfoCompat.getClickableSpans(paramView.createAccessibilityNodeInfo().getText());
      for (int i = 0; (paramView != null) && (i < paramView.length); i++) {
        if (paramClickableSpan.equals(paramView[i])) {
          return true;
        }
      }
    }
    return false;
  }
  
  private boolean performClickableSpanAction(int paramInt, View paramView)
  {
    Object localObject = (SparseArray)paramView.getTag(R.id.tag_accessibility_clickable_spans);
    if (localObject != null)
    {
      localObject = (WeakReference)((SparseArray)localObject).get(paramInt);
      if (localObject != null)
      {
        localObject = (ClickableSpan)((Reference)localObject).get();
        if (isSpanStillValid((ClickableSpan)localObject, paramView))
        {
          ((ClickableSpan)localObject).onClick(paramView);
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(@NonNull View paramView, @NonNull AccessibilityEvent paramAccessibilityEvent)
  {
    return mOriginalDelegate.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  @Nullable
  public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NonNull View paramView)
  {
    paramView = Api16Impl.getAccessibilityNodeProvider(mOriginalDelegate, paramView);
    if (paramView != null) {
      return new AccessibilityNodeProviderCompat(paramView);
    }
    return null;
  }
  
  public View.AccessibilityDelegate getBridge()
  {
    return mBridge;
  }
  
  public void onInitializeAccessibilityEvent(@NonNull View paramView, @NonNull AccessibilityEvent paramAccessibilityEvent)
  {
    mOriginalDelegate.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void onInitializeAccessibilityNodeInfo(@NonNull View paramView, @NonNull AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    mOriginalDelegate.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat.unwrap());
  }
  
  public void onPopulateAccessibilityEvent(@NonNull View paramView, @NonNull AccessibilityEvent paramAccessibilityEvent)
  {
    mOriginalDelegate.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public boolean onRequestSendAccessibilityEvent(@NonNull ViewGroup paramViewGroup, @NonNull View paramView, @NonNull AccessibilityEvent paramAccessibilityEvent)
  {
    return mOriginalDelegate.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public boolean performAccessibilityAction(@NonNull View paramView, int paramInt, @Nullable Bundle paramBundle)
  {
    List localList = getActionList(paramView);
    boolean bool1 = false;
    for (int i = 0;; i++)
    {
      bool2 = bool1;
      if (i >= localList.size()) {
        break;
      }
      AccessibilityNodeInfoCompat.AccessibilityActionCompat localAccessibilityActionCompat = (AccessibilityNodeInfoCompat.AccessibilityActionCompat)localList.get(i);
      if (localAccessibilityActionCompat.getId() == paramInt)
      {
        bool2 = localAccessibilityActionCompat.perform(paramView, paramBundle);
        break;
      }
    }
    bool1 = bool2;
    if (!bool2) {
      bool1 = Api16Impl.performAccessibilityAction(mOriginalDelegate, paramView, paramInt, paramBundle);
    }
    boolean bool2 = bool1;
    if (!bool1)
    {
      bool2 = bool1;
      if (paramInt == R.id.accessibility_action_clickable_span)
      {
        bool2 = bool1;
        if (paramBundle != null) {
          bool2 = performClickableSpanAction(paramBundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), paramView);
        }
      }
    }
    return bool2;
  }
  
  public void sendAccessibilityEvent(@NonNull View paramView, int paramInt)
  {
    mOriginalDelegate.sendAccessibilityEvent(paramView, paramInt);
  }
  
  public void sendAccessibilityEventUnchecked(@NonNull View paramView, @NonNull AccessibilityEvent paramAccessibilityEvent)
  {
    mOriginalDelegate.sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
  }
  
  public static final class AccessibilityDelegateAdapter
    extends View.AccessibilityDelegate
  {
    public final AccessibilityDelegateCompat mCompat;
    
    public AccessibilityDelegateAdapter(AccessibilityDelegateCompat paramAccessibilityDelegateCompat)
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
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    @DoNotInline
    public static AccessibilityNodeProvider getAccessibilityNodeProvider(View.AccessibilityDelegate paramAccessibilityDelegate, View paramView)
    {
      return paramAccessibilityDelegate.getAccessibilityNodeProvider(paramView);
    }
    
    @DoNotInline
    public static boolean performAccessibilityAction(View.AccessibilityDelegate paramAccessibilityDelegate, View paramView, int paramInt, Bundle paramBundle)
    {
      return paramAccessibilityDelegate.performAccessibilityAction(paramView, paramInt, paramBundle);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.AccessibilityDelegateCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
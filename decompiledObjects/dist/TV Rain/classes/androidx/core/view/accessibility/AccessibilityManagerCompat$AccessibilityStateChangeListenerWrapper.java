package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import androidx.annotation.NonNull;

class AccessibilityManagerCompat$AccessibilityStateChangeListenerWrapper
  implements AccessibilityManager.AccessibilityStateChangeListener
{
  public AccessibilityManagerCompat.AccessibilityStateChangeListener mListener;
  
  public AccessibilityManagerCompat$AccessibilityStateChangeListenerWrapper(@NonNull AccessibilityManagerCompat.AccessibilityStateChangeListener paramAccessibilityStateChangeListener)
  {
    mListener = paramAccessibilityStateChangeListener;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof AccessibilityStateChangeListenerWrapper)) {
      return false;
    }
    paramObject = (AccessibilityStateChangeListenerWrapper)paramObject;
    return mListener.equals(mListener);
  }
  
  public int hashCode()
  {
    return mListener.hashCode();
  }
  
  public void onAccessibilityStateChanged(boolean paramBoolean)
  {
    mListener.onAccessibilityStateChanged(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
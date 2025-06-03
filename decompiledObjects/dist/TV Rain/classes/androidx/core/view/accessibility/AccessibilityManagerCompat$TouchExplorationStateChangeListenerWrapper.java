package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
final class AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper
  implements AccessibilityManager.TouchExplorationStateChangeListener
{
  public final AccessibilityManagerCompat.TouchExplorationStateChangeListener mListener;
  
  public AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper(@NonNull AccessibilityManagerCompat.TouchExplorationStateChangeListener paramTouchExplorationStateChangeListener)
  {
    mListener = paramTouchExplorationStateChangeListener;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof TouchExplorationStateChangeListenerWrapper)) {
      return false;
    }
    paramObject = (TouchExplorationStateChangeListenerWrapper)paramObject;
    return mListener.equals(mListener);
  }
  
  public int hashCode()
  {
    return mListener.hashCode();
  }
  
  public void onTouchExplorationStateChanged(boolean paramBoolean)
  {
    mListener.onTouchExplorationStateChanged(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListenerWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
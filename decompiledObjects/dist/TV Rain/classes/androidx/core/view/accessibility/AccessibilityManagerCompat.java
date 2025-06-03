package androidx.core.view.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.List;

public final class AccessibilityManagerCompat
{
  @Deprecated
  public static boolean addAccessibilityStateChangeListener(AccessibilityManager paramAccessibilityManager, AccessibilityStateChangeListener paramAccessibilityStateChangeListener)
  {
    if (paramAccessibilityStateChangeListener == null) {
      return false;
    }
    return paramAccessibilityManager.addAccessibilityStateChangeListener(new AccessibilityStateChangeListenerWrapper(paramAccessibilityStateChangeListener));
  }
  
  public static boolean addTouchExplorationStateChangeListener(@NonNull AccessibilityManager paramAccessibilityManager, @NonNull TouchExplorationStateChangeListener paramTouchExplorationStateChangeListener)
  {
    return Api19Impl.addTouchExplorationStateChangeListenerWrapper(paramAccessibilityManager, paramTouchExplorationStateChangeListener);
  }
  
  @Deprecated
  public static List<AccessibilityServiceInfo> getEnabledAccessibilityServiceList(AccessibilityManager paramAccessibilityManager, int paramInt)
  {
    return paramAccessibilityManager.getEnabledAccessibilityServiceList(paramInt);
  }
  
  @Deprecated
  public static List<AccessibilityServiceInfo> getInstalledAccessibilityServiceList(AccessibilityManager paramAccessibilityManager)
  {
    return paramAccessibilityManager.getInstalledAccessibilityServiceList();
  }
  
  @Deprecated
  public static boolean isTouchExplorationEnabled(AccessibilityManager paramAccessibilityManager)
  {
    return paramAccessibilityManager.isTouchExplorationEnabled();
  }
  
  @Deprecated
  public static boolean removeAccessibilityStateChangeListener(AccessibilityManager paramAccessibilityManager, AccessibilityStateChangeListener paramAccessibilityStateChangeListener)
  {
    if (paramAccessibilityStateChangeListener == null) {
      return false;
    }
    return paramAccessibilityManager.removeAccessibilityStateChangeListener(new AccessibilityStateChangeListenerWrapper(paramAccessibilityStateChangeListener));
  }
  
  public static boolean removeTouchExplorationStateChangeListener(@NonNull AccessibilityManager paramAccessibilityManager, @NonNull TouchExplorationStateChangeListener paramTouchExplorationStateChangeListener)
  {
    return Api19Impl.removeTouchExplorationStateChangeListenerWrapper(paramAccessibilityManager, paramTouchExplorationStateChangeListener);
  }
  
  @Deprecated
  public static abstract interface AccessibilityStateChangeListener
  {
    @Deprecated
    public abstract void onAccessibilityStateChanged(boolean paramBoolean);
  }
  
  @Deprecated
  public static abstract class AccessibilityStateChangeListenerCompat
    implements AccessibilityManagerCompat.AccessibilityStateChangeListener
  {}
  
  public static class AccessibilityStateChangeListenerWrapper
    implements AccessibilityManager.AccessibilityStateChangeListener
  {
    public AccessibilityManagerCompat.AccessibilityStateChangeListener mListener;
    
    public AccessibilityStateChangeListenerWrapper(@NonNull AccessibilityManagerCompat.AccessibilityStateChangeListener paramAccessibilityStateChangeListener)
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
  
  @RequiresApi(19)
  public static class Api19Impl
  {
    @DoNotInline
    public static boolean addTouchExplorationStateChangeListenerWrapper(AccessibilityManager paramAccessibilityManager, AccessibilityManagerCompat.TouchExplorationStateChangeListener paramTouchExplorationStateChangeListener)
    {
      return paramAccessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerCompat.TouchExplorationStateChangeListenerWrapper(paramTouchExplorationStateChangeListener));
    }
    
    @DoNotInline
    public static boolean removeTouchExplorationStateChangeListenerWrapper(AccessibilityManager paramAccessibilityManager, AccessibilityManagerCompat.TouchExplorationStateChangeListener paramTouchExplorationStateChangeListener)
    {
      return paramAccessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerCompat.TouchExplorationStateChangeListenerWrapper(paramTouchExplorationStateChangeListener));
    }
  }
  
  public static abstract interface TouchExplorationStateChangeListener
  {
    public abstract void onTouchExplorationStateChanged(boolean paramBoolean);
  }
  
  @RequiresApi(19)
  public static final class TouchExplorationStateChangeListenerWrapper
    implements AccessibilityManager.TouchExplorationStateChangeListener
  {
    public final AccessibilityManagerCompat.TouchExplorationStateChangeListener mListener;
    
    public TouchExplorationStateChangeListenerWrapper(@NonNull AccessibilityManagerCompat.TouchExplorationStateChangeListener paramTouchExplorationStateChangeListener)
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
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityManagerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
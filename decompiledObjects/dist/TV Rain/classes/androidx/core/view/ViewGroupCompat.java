package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class ViewGroupCompat
{
  public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
  public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;
  
  public static int getLayoutMode(@NonNull ViewGroup paramViewGroup)
  {
    return Api18Impl.getLayoutMode(paramViewGroup);
  }
  
  public static int getNestedScrollAxes(@NonNull ViewGroup paramViewGroup)
  {
    return Api21Impl.getNestedScrollAxes(paramViewGroup);
  }
  
  public static boolean isTransitionGroup(@NonNull ViewGroup paramViewGroup)
  {
    return Api21Impl.isTransitionGroup(paramViewGroup);
  }
  
  @Deprecated
  public static boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return paramViewGroup.onRequestSendAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public static void setLayoutMode(@NonNull ViewGroup paramViewGroup, int paramInt)
  {
    Api18Impl.setLayoutMode(paramViewGroup, paramInt);
  }
  
  @Deprecated
  public static void setMotionEventSplittingEnabled(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    paramViewGroup.setMotionEventSplittingEnabled(paramBoolean);
  }
  
  public static void setTransitionGroup(@NonNull ViewGroup paramViewGroup, boolean paramBoolean)
  {
    Api21Impl.setTransitionGroup(paramViewGroup, paramBoolean);
  }
  
  @RequiresApi(18)
  public static class Api18Impl
  {
    @DoNotInline
    public static int getLayoutMode(ViewGroup paramViewGroup)
    {
      return paramViewGroup.getLayoutMode();
    }
    
    @DoNotInline
    public static void setLayoutMode(ViewGroup paramViewGroup, int paramInt)
    {
      paramViewGroup.setLayoutMode(paramInt);
    }
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static int getNestedScrollAxes(ViewGroup paramViewGroup)
    {
      return paramViewGroup.getNestedScrollAxes();
    }
    
    @DoNotInline
    public static boolean isTransitionGroup(ViewGroup paramViewGroup)
    {
      return paramViewGroup.isTransitionGroup();
    }
    
    @DoNotInline
    public static void setTransitionGroup(ViewGroup paramViewGroup, boolean paramBoolean)
    {
      paramViewGroup.setTransitionGroup(paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewGroupCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
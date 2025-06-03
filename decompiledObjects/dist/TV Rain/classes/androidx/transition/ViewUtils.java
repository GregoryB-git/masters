package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

class ViewUtils
{
  public static final Property<View, Rect> CLIP_BOUNDS = new Property(Rect.class, "clipBounds")
  {
    public Rect get(View paramAnonymousView)
    {
      return ViewCompat.getClipBounds(paramAnonymousView);
    }
    
    public void set(View paramAnonymousView, Rect paramAnonymousRect)
    {
      ViewCompat.setClipBounds(paramAnonymousView, paramAnonymousRect);
    }
  };
  private static final ViewUtilsBase IMPL;
  private static final String TAG = "ViewUtils";
  public static final Property<View, Float> TRANSITION_ALPHA;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 29) {
      IMPL = new ViewUtilsApi29();
    } else {
      IMPL = new ViewUtilsApi23();
    }
    TRANSITION_ALPHA = new Property(Float.class, "translationAlpha")
    {
      public Float get(View paramAnonymousView)
      {
        return Float.valueOf(ViewUtils.getTransitionAlpha(paramAnonymousView));
      }
      
      public void set(View paramAnonymousView, Float paramAnonymousFloat)
      {
        ViewUtils.setTransitionAlpha(paramAnonymousView, paramAnonymousFloat.floatValue());
      }
    };
  }
  
  public static void clearNonTransitionAlpha(@NonNull View paramView)
  {
    IMPL.clearNonTransitionAlpha(paramView);
  }
  
  public static ViewOverlayImpl getOverlay(@NonNull View paramView)
  {
    return new ViewOverlayApi18(paramView);
  }
  
  public static float getTransitionAlpha(@NonNull View paramView)
  {
    return IMPL.getTransitionAlpha(paramView);
  }
  
  public static WindowIdImpl getWindowId(@NonNull View paramView)
  {
    return new WindowIdApi18(paramView);
  }
  
  public static void saveNonTransitionAlpha(@NonNull View paramView)
  {
    IMPL.saveNonTransitionAlpha(paramView);
  }
  
  public static void setAnimationMatrix(@NonNull View paramView, @Nullable Matrix paramMatrix)
  {
    IMPL.setAnimationMatrix(paramView, paramMatrix);
  }
  
  public static void setLeftTopRightBottom(@NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    IMPL.setLeftTopRightBottom(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void setTransitionAlpha(@NonNull View paramView, float paramFloat)
  {
    IMPL.setTransitionAlpha(paramView, paramFloat);
  }
  
  public static void setTransitionVisibility(@NonNull View paramView, int paramInt)
  {
    IMPL.setTransitionVisibility(paramView, paramInt);
  }
  
  public static void transformMatrixToGlobal(@NonNull View paramView, @NonNull Matrix paramMatrix)
  {
    IMPL.transformMatrixToGlobal(paramView, paramMatrix);
  }
  
  public static void transformMatrixToLocal(@NonNull View paramView, @NonNull Matrix paramMatrix)
  {
    IMPL.transformMatrixToLocal(paramView, paramMatrix);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ViewUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
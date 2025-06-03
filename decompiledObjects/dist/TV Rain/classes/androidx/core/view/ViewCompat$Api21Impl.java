package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.R.id;

@RequiresApi(21)
class ViewCompat$Api21Impl
{
  @DoNotInline
  public static void callCompatInsetAnimationCallback(@NonNull WindowInsets paramWindowInsets, @NonNull View paramView)
  {
    View.OnApplyWindowInsetsListener localOnApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener)paramView.getTag(R.id.tag_window_insets_animation_callback);
    if (localOnApplyWindowInsetsListener != null) {
      localOnApplyWindowInsetsListener.onApplyWindowInsets(paramView, paramWindowInsets);
    }
  }
  
  @DoNotInline
  public static WindowInsetsCompat computeSystemWindowInsets(@NonNull View paramView, @NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull Rect paramRect)
  {
    WindowInsets localWindowInsets = paramWindowInsetsCompat.toWindowInsets();
    if (localWindowInsets != null) {
      return WindowInsetsCompat.toWindowInsetsCompat(paramView.computeSystemWindowInsets(localWindowInsets, paramRect), paramView);
    }
    paramRect.setEmpty();
    return paramWindowInsetsCompat;
  }
  
  @DoNotInline
  public static boolean dispatchNestedFling(@NonNull View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return paramView.dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }
  
  @DoNotInline
  public static boolean dispatchNestedPreFling(@NonNull View paramView, float paramFloat1, float paramFloat2)
  {
    return paramView.dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  @DoNotInline
  public static boolean dispatchNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return paramView.dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  @DoNotInline
  public static boolean dispatchNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return paramView.dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  @DoNotInline
  public static ColorStateList getBackgroundTintList(View paramView)
  {
    return paramView.getBackgroundTintList();
  }
  
  @DoNotInline
  public static PorterDuff.Mode getBackgroundTintMode(View paramView)
  {
    return paramView.getBackgroundTintMode();
  }
  
  @DoNotInline
  public static float getElevation(View paramView)
  {
    return paramView.getElevation();
  }
  
  @DoNotInline
  @Nullable
  public static WindowInsetsCompat getRootWindowInsets(@NonNull View paramView)
  {
    return WindowInsetsCompat.Api21ReflectionHolder.getRootWindowInsets(paramView);
  }
  
  @DoNotInline
  public static String getTransitionName(View paramView)
  {
    return paramView.getTransitionName();
  }
  
  @DoNotInline
  public static float getTranslationZ(View paramView)
  {
    return paramView.getTranslationZ();
  }
  
  @DoNotInline
  public static float getZ(@NonNull View paramView)
  {
    return paramView.getZ();
  }
  
  @DoNotInline
  public static boolean hasNestedScrollingParent(View paramView)
  {
    return paramView.hasNestedScrollingParent();
  }
  
  @DoNotInline
  public static boolean isImportantForAccessibility(View paramView)
  {
    return paramView.isImportantForAccessibility();
  }
  
  @DoNotInline
  public static boolean isNestedScrollingEnabled(View paramView)
  {
    return paramView.isNestedScrollingEnabled();
  }
  
  @DoNotInline
  public static void setBackgroundTintList(View paramView, ColorStateList paramColorStateList)
  {
    paramView.setBackgroundTintList(paramColorStateList);
  }
  
  @DoNotInline
  public static void setBackgroundTintMode(View paramView, PorterDuff.Mode paramMode)
  {
    paramView.setBackgroundTintMode(paramMode);
  }
  
  @DoNotInline
  public static void setElevation(View paramView, float paramFloat)
  {
    paramView.setElevation(paramFloat);
  }
  
  @DoNotInline
  public static void setNestedScrollingEnabled(View paramView, boolean paramBoolean)
  {
    paramView.setNestedScrollingEnabled(paramBoolean);
  }
  
  @DoNotInline
  public static void setOnApplyWindowInsetsListener(@NonNull View paramView, @Nullable final OnApplyWindowInsetsListener paramOnApplyWindowInsetsListener)
  {
    if (Build.VERSION.SDK_INT < 30) {
      paramView.setTag(R.id.tag_on_apply_window_listener, paramOnApplyWindowInsetsListener);
    }
    if (paramOnApplyWindowInsetsListener == null)
    {
      paramView.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)paramView.getTag(R.id.tag_window_insets_animation_callback));
      return;
    }
    paramView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener()
    {
      public WindowInsetsCompat mLastInsets = null;
      
      public WindowInsets onApplyWindowInsets(View paramAnonymousView, WindowInsets paramAnonymousWindowInsets)
      {
        WindowInsetsCompat localWindowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(paramAnonymousWindowInsets, paramAnonymousView);
        int i = Build.VERSION.SDK_INT;
        if (i < 30)
        {
          ViewCompat.Api21Impl.callCompatInsetAnimationCallback(paramAnonymousWindowInsets, ViewCompat.Api21Impl.this);
          if (localWindowInsetsCompat.equals(mLastInsets)) {
            return paramOnApplyWindowInsetsListener.onApplyWindowInsets(paramAnonymousView, localWindowInsetsCompat).toWindowInsets();
          }
        }
        mLastInsets = localWindowInsetsCompat;
        paramAnonymousWindowInsets = paramOnApplyWindowInsetsListener.onApplyWindowInsets(paramAnonymousView, localWindowInsetsCompat);
        if (i >= 30) {
          return paramAnonymousWindowInsets.toWindowInsets();
        }
        ViewCompat.requestApplyInsets(paramAnonymousView);
        return paramAnonymousWindowInsets.toWindowInsets();
      }
    });
  }
  
  @DoNotInline
  public static void setTransitionName(View paramView, String paramString)
  {
    paramView.setTransitionName(paramString);
  }
  
  @DoNotInline
  public static void setTranslationZ(View paramView, float paramFloat)
  {
    paramView.setTranslationZ(paramFloat);
  }
  
  @DoNotInline
  public static void setZ(@NonNull View paramView, float paramFloat)
  {
    paramView.setZ(paramFloat);
  }
  
  @DoNotInline
  public static boolean startNestedScroll(View paramView, int paramInt)
  {
    return paramView.startNestedScroll(paramInt);
  }
  
  @DoNotInline
  public static void stopNestedScroll(View paramView)
  {
    paramView.stopNestedScroll();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.List;
import o3;

@RequiresApi(29)
class ViewCompat$Api29Impl
{
  @DoNotInline
  public static View.AccessibilityDelegate getAccessibilityDelegate(View paramView)
  {
    return o3.h(paramView);
  }
  
  @DoNotInline
  public static List<Rect> getSystemGestureExclusionRects(View paramView)
  {
    return o3.k(paramView);
  }
  
  @DoNotInline
  public static void saveAttributeDataForStyleable(@NonNull View paramView, @NonNull Context paramContext, @NonNull int[] paramArrayOfInt, @Nullable AttributeSet paramAttributeSet, @NonNull TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    o3.w(paramView, paramContext, paramArrayOfInt, paramAttributeSet, paramTypedArray, paramInt1, paramInt2);
  }
  
  @DoNotInline
  public static void setSystemGestureExclusionRects(View paramView, List<Rect> paramList)
  {
    o3.x(paramView, paramList);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.Api29Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
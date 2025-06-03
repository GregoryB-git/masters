package I;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import androidx.annotation.NonNull;
import java.util.List;

public abstract class s$n
{
  public static View.AccessibilityDelegate a(View paramView)
  {
    return paramView.getAccessibilityDelegate();
  }
  
  public static List<Rect> b(View paramView)
  {
    return paramView.getSystemGestureExclusionRects();
  }
  
  public static void c(@NonNull View paramView, @NonNull Context paramContext, @NonNull int[] paramArrayOfInt, AttributeSet paramAttributeSet, @NonNull TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    paramView.saveAttributeDataForStyleable(paramContext, paramArrayOfInt, paramAttributeSet, paramTypedArray, paramInt1, paramInt2);
  }
  
  public static void d(View paramView, List<Rect> paramList)
  {
    paramView.setSystemGestureExclusionRects(paramList);
  }
}

/* Location:
 * Qualified Name:     I.s.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
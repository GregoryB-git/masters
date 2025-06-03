package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;

class SingleViewFakeWindowViewGroup
  extends ViewGroup
{
  private final Rect childRect = new Rect();
  private final Rect viewBounds = new Rect();
  
  public SingleViewFakeWindowViewGroup(Context paramContext)
  {
    super(paramContext);
  }
  
  private static int atMost(int paramInt)
  {
    return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt), Integer.MIN_VALUE);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    for (int i = 0; i < getChildCount(); i++)
    {
      View localView = getChildAt(i);
      Object localObject = (WindowManager.LayoutParams)localView.getLayoutParams();
      viewBounds.set(paramInt1, paramInt2, paramInt3, paramInt4);
      Gravity.apply(gravity, localView.getMeasuredWidth(), localView.getMeasuredHeight(), viewBounds, x, y, childRect);
      localObject = childRect;
      localView.layout(left, top, right, bottom);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < getChildCount(); i++) {
      getChildAt(i).measure(atMost(paramInt1), atMost(paramInt2));
    }
    super.onMeasure(paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.SingleViewFakeWindowViewGroup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
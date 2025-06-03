package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;

public class s
  extends ViewGroup
{
  public final Rect o = new Rect();
  public final Rect p = new Rect();
  
  public s(Context paramContext)
  {
    super(paramContext);
  }
  
  public static int a(int paramInt)
  {
    return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt), Integer.MIN_VALUE);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    for (int i = 0; i < getChildCount(); i++)
    {
      View localView = getChildAt(i);
      Object localObject = (WindowManager.LayoutParams)localView.getLayoutParams();
      o.set(paramInt1, paramInt2, paramInt3, paramInt4);
      Gravity.apply(gravity, localView.getMeasuredWidth(), localView.getMeasuredHeight(), o, x, y, p);
      localObject = p;
      localView.layout(left, top, right, bottom);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < getChildCount(); i++) {
      getChildAt(i).measure(a(paramInt1), a(paramInt2));
    }
    super.onMeasure(paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
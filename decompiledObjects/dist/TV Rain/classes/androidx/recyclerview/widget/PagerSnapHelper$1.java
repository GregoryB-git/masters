package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

class PagerSnapHelper$1
  extends LinearSmoothScroller
{
  public PagerSnapHelper$1(PagerSnapHelper paramPagerSnapHelper, Context paramContext)
  {
    super(paramContext);
  }
  
  public float calculateSpeedPerPixel(DisplayMetrics paramDisplayMetrics)
  {
    return 100.0F / densityDpi;
  }
  
  public int calculateTimeForScrolling(int paramInt)
  {
    return Math.min(100, super.calculateTimeForScrolling(paramInt));
  }
  
  public void onTargetFound(View paramView, RecyclerView.State paramState, RecyclerView.SmoothScroller.Action paramAction)
  {
    paramState = this$0;
    paramView = paramState.calculateDistanceToFinalSnap(mRecyclerView.getLayoutManager(), paramView);
    int i = paramView[0];
    int j = paramView[1];
    int k = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(j)));
    if (k > 0) {
      paramAction.update(i, j, k, mDecelerateInterpolator);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.PagerSnapHelper.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
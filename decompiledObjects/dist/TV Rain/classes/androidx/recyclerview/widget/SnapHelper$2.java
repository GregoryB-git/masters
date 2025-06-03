package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

class SnapHelper$2
  extends LinearSmoothScroller
{
  public SnapHelper$2(SnapHelper paramSnapHelper, Context paramContext)
  {
    super(paramContext);
  }
  
  public float calculateSpeedPerPixel(DisplayMetrics paramDisplayMetrics)
  {
    return 100.0F / densityDpi;
  }
  
  public void onTargetFound(View paramView, RecyclerView.State paramState, RecyclerView.SmoothScroller.Action paramAction)
  {
    SnapHelper localSnapHelper = this$0;
    paramState = mRecyclerView;
    if (paramState == null) {
      return;
    }
    paramView = localSnapHelper.calculateDistanceToFinalSnap(paramState.getLayoutManager(), paramView);
    int i = paramView[0];
    int j = paramView[1];
    int k = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(j)));
    if (k > 0) {
      paramAction.update(i, j, k, mDecelerateInterpolator);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.SnapHelper.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
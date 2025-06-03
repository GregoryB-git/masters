package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class LinearSnapHelper
  extends SnapHelper
{
  private static final float INVALID_DISTANCE = 1.0F;
  @Nullable
  private OrientationHelper mHorizontalHelper;
  @Nullable
  private OrientationHelper mVerticalHelper;
  
  private float computeDistancePerChild(RecyclerView.LayoutManager paramLayoutManager, OrientationHelper paramOrientationHelper)
  {
    int i = paramLayoutManager.getChildCount();
    if (i == 0) {
      return 1.0F;
    }
    int j = 0;
    Object localObject1 = null;
    int k = Integer.MIN_VALUE;
    int m = Integer.MAX_VALUE;
    Object localObject2 = null;
    int i2;
    while (j < i)
    {
      View localView = paramLayoutManager.getChildAt(j);
      int n = paramLayoutManager.getPosition(localView);
      Object localObject3;
      int i1;
      if (n == -1)
      {
        localObject3 = localObject1;
        i1 = k;
      }
      else
      {
        i2 = m;
        if (n < m)
        {
          localObject1 = localView;
          i2 = n;
        }
        localObject3 = localObject1;
        m = i2;
        i1 = k;
        if (n > k)
        {
          i1 = n;
          m = i2;
          localObject2 = localView;
          localObject3 = localObject1;
        }
      }
      j++;
      localObject1 = localObject3;
      k = i1;
    }
    if ((localObject1 != null) && (localObject2 != null))
    {
      i2 = Math.min(paramOrientationHelper.getDecoratedStart((View)localObject1), paramOrientationHelper.getDecoratedStart((View)localObject2));
      i2 = Math.max(paramOrientationHelper.getDecoratedEnd((View)localObject1), paramOrientationHelper.getDecoratedEnd((View)localObject2)) - i2;
      if (i2 == 0) {
        return 1.0F;
      }
      return i2 * 1.0F / (k - m + 1);
    }
    return 1.0F;
  }
  
  private int distanceToCenter(@NonNull View paramView, OrientationHelper paramOrientationHelper)
  {
    int i = paramOrientationHelper.getDecoratedStart(paramView);
    int j = paramOrientationHelper.getDecoratedMeasurement(paramView) / 2;
    int k = paramOrientationHelper.getStartAfterPadding();
    return j + i - (paramOrientationHelper.getTotalSpace() / 2 + k);
  }
  
  private int estimateNextPositionDiffForFling(RecyclerView.LayoutManager paramLayoutManager, OrientationHelper paramOrientationHelper, int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = calculateScrollDistance(paramInt1, paramInt2);
    float f = computeDistancePerChild(paramLayoutManager, paramOrientationHelper);
    if (f <= 0.0F) {
      return 0;
    }
    if (Math.abs(arrayOfInt[0]) > Math.abs(arrayOfInt[1])) {
      paramInt1 = arrayOfInt[0];
    } else {
      paramInt1 = arrayOfInt[1];
    }
    return Math.round(paramInt1 / f);
  }
  
  @Nullable
  private View findCenterView(RecyclerView.LayoutManager paramLayoutManager, OrientationHelper paramOrientationHelper)
  {
    int i = paramLayoutManager.getChildCount();
    Object localObject = null;
    if (i == 0) {
      return null;
    }
    int j = paramOrientationHelper.getStartAfterPadding();
    int k = paramOrientationHelper.getTotalSpace() / 2;
    int m = Integer.MAX_VALUE;
    int n = 0;
    while (n < i)
    {
      View localView = paramLayoutManager.getChildAt(n);
      int i1 = paramOrientationHelper.getDecoratedStart(localView);
      int i2 = Math.abs(paramOrientationHelper.getDecoratedMeasurement(localView) / 2 + i1 - (k + j));
      i1 = m;
      if (i2 < m)
      {
        localObject = localView;
        i1 = i2;
      }
      n++;
      m = i1;
    }
    return (View)localObject;
  }
  
  @NonNull
  private OrientationHelper getHorizontalHelper(@NonNull RecyclerView.LayoutManager paramLayoutManager)
  {
    OrientationHelper localOrientationHelper = mHorizontalHelper;
    if ((localOrientationHelper == null) || (mLayoutManager != paramLayoutManager)) {
      mHorizontalHelper = OrientationHelper.createHorizontalHelper(paramLayoutManager);
    }
    return mHorizontalHelper;
  }
  
  @NonNull
  private OrientationHelper getVerticalHelper(@NonNull RecyclerView.LayoutManager paramLayoutManager)
  {
    OrientationHelper localOrientationHelper = mVerticalHelper;
    if ((localOrientationHelper == null) || (mLayoutManager != paramLayoutManager)) {
      mVerticalHelper = OrientationHelper.createVerticalHelper(paramLayoutManager);
    }
    return mVerticalHelper;
  }
  
  public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager paramLayoutManager, @NonNull View paramView)
  {
    int[] arrayOfInt = new int[2];
    if (paramLayoutManager.canScrollHorizontally()) {
      arrayOfInt[0] = distanceToCenter(paramView, getHorizontalHelper(paramLayoutManager));
    } else {
      arrayOfInt[0] = 0;
    }
    if (paramLayoutManager.canScrollVertically()) {
      arrayOfInt[1] = distanceToCenter(paramView, getVerticalHelper(paramLayoutManager));
    } else {
      arrayOfInt[1] = 0;
    }
    return arrayOfInt;
  }
  
  public View findSnapView(RecyclerView.LayoutManager paramLayoutManager)
  {
    if (paramLayoutManager.canScrollVertically()) {
      return findCenterView(paramLayoutManager, getVerticalHelper(paramLayoutManager));
    }
    if (paramLayoutManager.canScrollHorizontally()) {
      return findCenterView(paramLayoutManager, getHorizontalHelper(paramLayoutManager));
    }
    return null;
  }
  
  public int findTargetSnapPosition(RecyclerView.LayoutManager paramLayoutManager, int paramInt1, int paramInt2)
  {
    if (!(paramLayoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider)) {
      return -1;
    }
    int i = paramLayoutManager.getItemCount();
    if (i == 0) {
      return -1;
    }
    Object localObject = findSnapView(paramLayoutManager);
    if (localObject == null) {
      return -1;
    }
    int j = paramLayoutManager.getPosition((View)localObject);
    if (j == -1) {
      return -1;
    }
    localObject = (RecyclerView.SmoothScroller.ScrollVectorProvider)paramLayoutManager;
    int k = i - 1;
    localObject = ((RecyclerView.SmoothScroller.ScrollVectorProvider)localObject).computeScrollVectorForPosition(k);
    if (localObject == null) {
      return -1;
    }
    boolean bool = paramLayoutManager.canScrollHorizontally();
    int m = 0;
    int n;
    if (bool)
    {
      n = estimateNextPositionDiffForFling(paramLayoutManager, getHorizontalHelper(paramLayoutManager), paramInt1, 0);
      paramInt1 = n;
      if (x < 0.0F) {
        paramInt1 = -n;
      }
    }
    else
    {
      paramInt1 = 0;
    }
    if (paramLayoutManager.canScrollVertically())
    {
      n = estimateNextPositionDiffForFling(paramLayoutManager, getVerticalHelper(paramLayoutManager), 0, paramInt2);
      paramInt2 = n;
      if (y < 0.0F) {
        paramInt2 = -n;
      }
    }
    else
    {
      paramInt2 = 0;
    }
    if (paramLayoutManager.canScrollVertically()) {
      paramInt1 = paramInt2;
    }
    if (paramInt1 == 0) {
      return -1;
    }
    paramInt1 = j + paramInt1;
    if (paramInt1 < 0) {
      paramInt1 = m;
    }
    if (paramInt1 >= i) {
      paramInt1 = k;
    }
    return paramInt1;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.LinearSnapHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class SnapHelper
  extends RecyclerView.OnFlingListener
{
  public static final float MILLISECONDS_PER_INCH = 100.0F;
  private Scroller mGravityScroller;
  public RecyclerView mRecyclerView;
  private final RecyclerView.OnScrollListener mScrollListener = new RecyclerView.OnScrollListener()
  {
    public boolean mScrolled = false;
    
    public void onScrollStateChanged(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt)
    {
      super.onScrollStateChanged(paramAnonymousRecyclerView, paramAnonymousInt);
      if ((paramAnonymousInt == 0) && (mScrolled))
      {
        mScrolled = false;
        snapToTargetExistingView();
      }
    }
    
    public void onScrolled(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0)) {
        mScrolled = true;
      }
    }
  };
  
  private void destroyCallbacks()
  {
    mRecyclerView.removeOnScrollListener(mScrollListener);
    mRecyclerView.setOnFlingListener(null);
  }
  
  private void setupCallbacks()
    throws IllegalStateException
  {
    if (mRecyclerView.getOnFlingListener() == null)
    {
      mRecyclerView.addOnScrollListener(mScrollListener);
      mRecyclerView.setOnFlingListener(this);
      return;
    }
    throw new IllegalStateException("An instance of OnFlingListener already set.");
  }
  
  private boolean snapFromFling(@NonNull RecyclerView.LayoutManager paramLayoutManager, int paramInt1, int paramInt2)
  {
    if (!(paramLayoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider)) {
      return false;
    }
    RecyclerView.SmoothScroller localSmoothScroller = createScroller(paramLayoutManager);
    if (localSmoothScroller == null) {
      return false;
    }
    paramInt1 = findTargetSnapPosition(paramLayoutManager, paramInt1, paramInt2);
    if (paramInt1 == -1) {
      return false;
    }
    localSmoothScroller.setTargetPosition(paramInt1);
    paramLayoutManager.startSmoothScroll(localSmoothScroller);
    return true;
  }
  
  public void attachToRecyclerView(@Nullable RecyclerView paramRecyclerView)
    throws IllegalStateException
  {
    RecyclerView localRecyclerView = mRecyclerView;
    if (localRecyclerView == paramRecyclerView) {
      return;
    }
    if (localRecyclerView != null) {
      destroyCallbacks();
    }
    mRecyclerView = paramRecyclerView;
    if (paramRecyclerView != null)
    {
      setupCallbacks();
      mGravityScroller = new Scroller(mRecyclerView.getContext(), new DecelerateInterpolator());
      snapToTargetExistingView();
    }
  }
  
  @Nullable
  public abstract int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager paramLayoutManager, @NonNull View paramView);
  
  public int[] calculateScrollDistance(int paramInt1, int paramInt2)
  {
    mGravityScroller.fling(0, 0, paramInt1, paramInt2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
    return new int[] { mGravityScroller.getFinalX(), mGravityScroller.getFinalY() };
  }
  
  @Nullable
  public RecyclerView.SmoothScroller createScroller(@NonNull RecyclerView.LayoutManager paramLayoutManager)
  {
    return createSnapScroller(paramLayoutManager);
  }
  
  @Deprecated
  @Nullable
  public LinearSmoothScroller createSnapScroller(@NonNull RecyclerView.LayoutManager paramLayoutManager)
  {
    if (!(paramLayoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider)) {
      return null;
    }
    new LinearSmoothScroller(mRecyclerView.getContext())
    {
      public float calculateSpeedPerPixel(DisplayMetrics paramAnonymousDisplayMetrics)
      {
        return 100.0F / densityDpi;
      }
      
      public void onTargetFound(View paramAnonymousView, RecyclerView.State paramAnonymousState, RecyclerView.SmoothScroller.Action paramAnonymousAction)
      {
        SnapHelper localSnapHelper = SnapHelper.this;
        paramAnonymousState = mRecyclerView;
        if (paramAnonymousState == null) {
          return;
        }
        paramAnonymousView = localSnapHelper.calculateDistanceToFinalSnap(paramAnonymousState.getLayoutManager(), paramAnonymousView);
        int i = paramAnonymousView[0];
        int j = paramAnonymousView[1];
        int k = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(j)));
        if (k > 0) {
          paramAnonymousAction.update(i, j, k, mDecelerateInterpolator);
        }
      }
    };
  }
  
  @Nullable
  public abstract View findSnapView(RecyclerView.LayoutManager paramLayoutManager);
  
  public abstract int findTargetSnapPosition(RecyclerView.LayoutManager paramLayoutManager, int paramInt1, int paramInt2);
  
  public boolean onFling(int paramInt1, int paramInt2)
  {
    RecyclerView.LayoutManager localLayoutManager = mRecyclerView.getLayoutManager();
    boolean bool1 = false;
    if (localLayoutManager == null) {
      return false;
    }
    if (mRecyclerView.getAdapter() == null) {
      return false;
    }
    int i = mRecyclerView.getMinFlingVelocity();
    boolean bool2;
    if (Math.abs(paramInt2) <= i)
    {
      bool2 = bool1;
      if (Math.abs(paramInt1) <= i) {}
    }
    else
    {
      bool2 = bool1;
      if (snapFromFling(localLayoutManager, paramInt1, paramInt2)) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public void snapToTargetExistingView()
  {
    Object localObject = mRecyclerView;
    if (localObject == null) {
      return;
    }
    localObject = ((RecyclerView)localObject).getLayoutManager();
    if (localObject == null) {
      return;
    }
    View localView = findSnapView((RecyclerView.LayoutManager)localObject);
    if (localView == null) {
      return;
    }
    localObject = calculateDistanceToFinalSnap((RecyclerView.LayoutManager)localObject, localView);
    int i = localObject[0];
    if ((i != 0) || (localObject[1] != 0)) {
      mRecyclerView.smoothScrollBy(i, localObject[1]);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.SnapHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
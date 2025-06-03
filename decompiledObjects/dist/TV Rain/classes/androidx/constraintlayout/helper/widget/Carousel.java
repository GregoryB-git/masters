package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene.Transition;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.R.styleable;
import h0;
import java.util.ArrayList;
import java.util.Iterator;

public class Carousel
  extends MotionHelper
{
  private static final boolean DEBUG = false;
  private static final String TAG = "Carousel";
  public static final int TOUCH_UP_CARRY_ON = 2;
  public static final int TOUCH_UP_IMMEDIATE_STOP = 1;
  private int backwardTransition = -1;
  private float dampening = 0.9F;
  private int emptyViewBehavior = 4;
  private int firstViewReference = -1;
  private int forwardTransition = -1;
  private boolean infiniteCarousel = false;
  private Adapter mAdapter = null;
  private int mAnimateTargetDelay = 200;
  private int mIndex = 0;
  public int mLastStartId = -1;
  private final ArrayList<View> mList = new ArrayList();
  private MotionLayout mMotionLayout;
  private int mPreviousIndex = 0;
  private int mTargetIndex = -1;
  public Runnable mUpdateRunnable = new Runnable()
  {
    public void run()
    {
      Carousel.access$000(Carousel.this).setProgress(0.0F);
      Carousel.access$100(Carousel.this);
      Carousel.access$300(Carousel.this).onNewItem(Carousel.access$200(Carousel.this));
      float f1 = Carousel.access$000(Carousel.this).getVelocity();
      if ((Carousel.access$400(Carousel.this) == 2) && (f1 > Carousel.access$500(Carousel.this)) && (Carousel.access$200(Carousel.this) < Carousel.access$300(Carousel.this).count() - 1))
      {
        float f2 = Carousel.access$600(Carousel.this);
        if ((Carousel.access$200(Carousel.this) == 0) && (Carousel.access$700(Carousel.this) > Carousel.access$200(Carousel.this))) {
          return;
        }
        if ((Carousel.access$200(Carousel.this) == Carousel.access$300(Carousel.this).count() - 1) && (Carousel.access$700(Carousel.this) < Carousel.access$200(Carousel.this))) {
          return;
        }
        Carousel.access$000(Carousel.this).post(new Runnable()
        {
          public void run()
          {
            Carousel.access$000(Carousel.this).touchAnimateTo(5, 1.0F, val$v);
          }
        });
      }
    }
  };
  private int nextState = -1;
  private int previousState = -1;
  private int startIndex = 0;
  private int touchUpMode = 1;
  private float velocityThreshold = 2.0F;
  
  public Carousel(Context paramContext)
  {
    super(paramContext);
  }
  
  public Carousel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext, paramAttributeSet);
  }
  
  public Carousel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext, paramAttributeSet);
  }
  
  private void enableAllTransitions(boolean paramBoolean)
  {
    Iterator localIterator = mMotionLayout.getDefinedTransitions().iterator();
    while (localIterator.hasNext()) {
      ((MotionScene.Transition)localIterator.next()).setEnabled(paramBoolean);
    }
  }
  
  private boolean enableTransition(int paramInt, boolean paramBoolean)
  {
    if (paramInt == -1) {
      return false;
    }
    Object localObject = mMotionLayout;
    if (localObject == null) {
      return false;
    }
    localObject = ((MotionLayout)localObject).getTransition(paramInt);
    if (localObject == null) {
      return false;
    }
    if (paramBoolean == ((MotionScene.Transition)localObject).isEnabled()) {
      return false;
    }
    ((MotionScene.Transition)localObject).setEnabled(paramBoolean);
    return true;
  }
  
  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet != null)
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.Carousel);
      int i = paramContext.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramContext.getIndex(j);
        if (k == R.styleable.Carousel_carousel_firstView) {
          firstViewReference = paramContext.getResourceId(k, firstViewReference);
        } else if (k == R.styleable.Carousel_carousel_backwardTransition) {
          backwardTransition = paramContext.getResourceId(k, backwardTransition);
        } else if (k == R.styleable.Carousel_carousel_forwardTransition) {
          forwardTransition = paramContext.getResourceId(k, forwardTransition);
        } else if (k == R.styleable.Carousel_carousel_emptyViewsBehavior) {
          emptyViewBehavior = paramContext.getInt(k, emptyViewBehavior);
        } else if (k == R.styleable.Carousel_carousel_previousState) {
          previousState = paramContext.getResourceId(k, previousState);
        } else if (k == R.styleable.Carousel_carousel_nextState) {
          nextState = paramContext.getResourceId(k, nextState);
        } else if (k == R.styleable.Carousel_carousel_touchUp_dampeningFactor) {
          dampening = paramContext.getFloat(k, dampening);
        } else if (k == R.styleable.Carousel_carousel_touchUpMode) {
          touchUpMode = paramContext.getInt(k, touchUpMode);
        } else if (k == R.styleable.Carousel_carousel_touchUp_velocityThreshold) {
          velocityThreshold = paramContext.getFloat(k, velocityThreshold);
        } else if (k == R.styleable.Carousel_carousel_infinite) {
          infiniteCarousel = paramContext.getBoolean(k, infiniteCarousel);
        }
      }
      paramContext.recycle();
    }
  }
  
  private void updateItems()
  {
    Object localObject = mAdapter;
    if (localObject == null) {
      return;
    }
    if (mMotionLayout == null) {
      return;
    }
    if (((Adapter)localObject).count() == 0) {
      return;
    }
    int i = mList.size();
    for (int j = 0; j < i; j++)
    {
      localObject = (View)mList.get(j);
      int k = mIndex + j - startIndex;
      if (infiniteCarousel)
      {
        if (k < 0)
        {
          m = emptyViewBehavior;
          if (m != 4) {
            updateViewVisibility((View)localObject, m);
          } else {
            updateViewVisibility((View)localObject, 0);
          }
          if (k % mAdapter.count() == 0)
          {
            mAdapter.populate((View)localObject, 0);
          }
          else
          {
            Adapter localAdapter = mAdapter;
            m = localAdapter.count();
            localAdapter.populate((View)localObject, k % mAdapter.count() + m);
          }
        }
        else if (k >= mAdapter.count())
        {
          if (k == mAdapter.count())
          {
            m = 0;
          }
          else
          {
            m = k;
            if (k > mAdapter.count()) {
              m = k % mAdapter.count();
            }
          }
          k = emptyViewBehavior;
          if (k != 4) {
            updateViewVisibility((View)localObject, k);
          } else {
            updateViewVisibility((View)localObject, 0);
          }
          mAdapter.populate((View)localObject, m);
        }
        else
        {
          updateViewVisibility((View)localObject, 0);
          mAdapter.populate((View)localObject, k);
        }
      }
      else if (k < 0)
      {
        updateViewVisibility((View)localObject, emptyViewBehavior);
      }
      else if (k >= mAdapter.count())
      {
        updateViewVisibility((View)localObject, emptyViewBehavior);
      }
      else
      {
        updateViewVisibility((View)localObject, 0);
        mAdapter.populate((View)localObject, k);
      }
    }
    int m = mTargetIndex;
    if ((m != -1) && (m != mIndex)) {
      mMotionLayout.post(new h0(this, 2));
    } else if (m == mIndex) {
      mTargetIndex = -1;
    }
    if ((backwardTransition != -1) && (forwardTransition != -1))
    {
      if (infiniteCarousel) {
        return;
      }
      m = mAdapter.count();
      if (mIndex == 0)
      {
        enableTransition(backwardTransition, false);
      }
      else
      {
        enableTransition(backwardTransition, true);
        mMotionLayout.setTransition(backwardTransition);
      }
      if (mIndex == m - 1)
      {
        enableTransition(forwardTransition, false);
      }
      else
      {
        enableTransition(forwardTransition, true);
        mMotionLayout.setTransition(forwardTransition);
      }
      return;
    }
    Log.w("Carousel", "No backward or forward transitions defined for Carousel!");
  }
  
  private boolean updateViewVisibility(int paramInt1, View paramView, int paramInt2)
  {
    Object localObject = mMotionLayout.getConstraintSet(paramInt1);
    if (localObject == null) {
      return false;
    }
    localObject = ((ConstraintSet)localObject).getConstraint(paramView.getId());
    if (localObject == null) {
      return false;
    }
    propertySet.mVisibilityMode = 1;
    paramView.setVisibility(paramInt2);
    return true;
  }
  
  private boolean updateViewVisibility(View paramView, int paramInt)
  {
    Object localObject = mMotionLayout;
    int i = 0;
    if (localObject == null) {
      return false;
    }
    localObject = ((MotionLayout)localObject).getConstraintSetIds();
    boolean bool = false;
    while (i < localObject.length)
    {
      bool |= updateViewVisibility(localObject[i], paramView, paramInt);
      i++;
    }
    return bool;
  }
  
  public int getCount()
  {
    Adapter localAdapter = mAdapter;
    if (localAdapter != null) {
      return localAdapter.count();
    }
    return 0;
  }
  
  public int getCurrentIndex()
  {
    return mIndex;
  }
  
  public void jumpToIndex(int paramInt)
  {
    mIndex = Math.max(0, Math.min(getCount() - 1, paramInt));
    refresh();
  }
  
  @RequiresApi(api=17)
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if ((getParent() instanceof MotionLayout))
    {
      Object localObject = (MotionLayout)getParent();
      for (int i = 0; i < mCount; i++)
      {
        int j = mIds[i];
        View localView = ((ConstraintLayout)localObject).getViewById(j);
        if (firstViewReference == j) {
          startIndex = i;
        }
        mList.add(localView);
      }
      mMotionLayout = ((MotionLayout)localObject);
      if (touchUpMode == 2)
      {
        localObject = ((MotionLayout)localObject).getTransition(forwardTransition);
        if (localObject != null) {
          ((MotionScene.Transition)localObject).setOnTouchUp(5);
        }
        localObject = mMotionLayout.getTransition(backwardTransition);
        if (localObject != null) {
          ((MotionScene.Transition)localObject).setOnTouchUp(5);
        }
      }
      updateItems();
    }
  }
  
  public void onTransitionChange(MotionLayout paramMotionLayout, int paramInt1, int paramInt2, float paramFloat)
  {
    mLastStartId = paramInt1;
  }
  
  public void onTransitionCompleted(MotionLayout paramMotionLayout, int paramInt)
  {
    int i = mIndex;
    mPreviousIndex = i;
    if (paramInt == nextState) {
      mIndex = (i + 1);
    } else if (paramInt == previousState) {
      mIndex = (i - 1);
    }
    if (infiniteCarousel)
    {
      if (mIndex >= mAdapter.count()) {
        mIndex = 0;
      }
      if (mIndex < 0) {
        mIndex = (mAdapter.count() - 1);
      }
    }
    else
    {
      if (mIndex >= mAdapter.count()) {
        mIndex = (mAdapter.count() - 1);
      }
      if (mIndex < 0) {
        mIndex = 0;
      }
    }
    if (mPreviousIndex != mIndex) {
      mMotionLayout.post(mUpdateRunnable);
    }
  }
  
  public void refresh()
  {
    int i = mList.size();
    for (int j = 0; j < i; j++)
    {
      View localView = (View)mList.get(j);
      if (mAdapter.count() == 0) {
        updateViewVisibility(localView, emptyViewBehavior);
      } else {
        updateViewVisibility(localView, 0);
      }
    }
    mMotionLayout.rebuildScene();
    updateItems();
  }
  
  public void setAdapter(Adapter paramAdapter)
  {
    mAdapter = paramAdapter;
  }
  
  public void transitionToIndex(int paramInt1, int paramInt2)
  {
    mTargetIndex = Math.max(0, Math.min(getCount() - 1, paramInt1));
    paramInt2 = Math.max(0, paramInt2);
    mAnimateTargetDelay = paramInt2;
    mMotionLayout.setTransitionDuration(paramInt2);
    if (paramInt1 < mIndex) {
      mMotionLayout.transitionToState(previousState, mAnimateTargetDelay);
    } else {
      mMotionLayout.transitionToState(nextState, mAnimateTargetDelay);
    }
  }
  
  public static abstract interface Adapter
  {
    public abstract int count();
    
    public abstract void onNewItem(int paramInt);
    
    public abstract void populate(View paramView, int paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.helper.widget.Carousel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
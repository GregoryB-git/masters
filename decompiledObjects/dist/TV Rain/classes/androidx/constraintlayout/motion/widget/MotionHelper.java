package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R.styleable;
import java.util.HashMap;

public class MotionHelper
  extends ConstraintHelper
  implements MotionHelperInterface
{
  private float mProgress;
  private boolean mUseOnHide = false;
  private boolean mUseOnShow = false;
  public View[] views;
  
  public MotionHelper(Context paramContext)
  {
    super(paramContext);
  }
  
  public MotionHelper(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramAttributeSet);
  }
  
  public MotionHelper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramAttributeSet);
  }
  
  public float getProgress()
  {
    return mProgress;
  }
  
  public void init(AttributeSet paramAttributeSet)
  {
    super.init(paramAttributeSet);
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.MotionHelper);
      int i = paramAttributeSet.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramAttributeSet.getIndex(j);
        if (k == R.styleable.MotionHelper_onShow) {
          mUseOnShow = paramAttributeSet.getBoolean(k, mUseOnShow);
        } else if (k == R.styleable.MotionHelper_onHide) {
          mUseOnHide = paramAttributeSet.getBoolean(k, mUseOnHide);
        }
      }
      paramAttributeSet.recycle();
    }
  }
  
  public boolean isDecorator()
  {
    return false;
  }
  
  public boolean isUseOnHide()
  {
    return mUseOnHide;
  }
  
  public boolean isUsedOnShow()
  {
    return mUseOnShow;
  }
  
  public void onFinishedMotionScene(MotionLayout paramMotionLayout) {}
  
  public void onPostDraw(Canvas paramCanvas) {}
  
  public void onPreDraw(Canvas paramCanvas) {}
  
  public void onPreSetup(MotionLayout paramMotionLayout, HashMap<View, MotionController> paramHashMap) {}
  
  public void onTransitionChange(MotionLayout paramMotionLayout, int paramInt1, int paramInt2, float paramFloat) {}
  
  public void onTransitionCompleted(MotionLayout paramMotionLayout, int paramInt) {}
  
  public void onTransitionStarted(MotionLayout paramMotionLayout, int paramInt1, int paramInt2) {}
  
  public void onTransitionTrigger(MotionLayout paramMotionLayout, int paramInt, boolean paramBoolean, float paramFloat) {}
  
  public void setProgress(float paramFloat)
  {
    mProgress = paramFloat;
    int i = mCount;
    int j = 0;
    int k = 0;
    if (i > 0)
    {
      views = getViews((ConstraintLayout)getParent());
      for (j = k; j < mCount; j++) {
        setProgress(views[j], paramFloat);
      }
    }
    ViewGroup localViewGroup = (ViewGroup)getParent();
    k = localViewGroup.getChildCount();
    while (j < k)
    {
      View localView = localViewGroup.getChildAt(j);
      if (!(localView instanceof MotionHelper)) {
        setProgress(localView, paramFloat);
      }
      j++;
    }
  }
  
  public void setProgress(View paramView, float paramFloat) {}
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
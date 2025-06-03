package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;

public class ReactiveGuide
  extends View
  implements SharedValues.SharedValuesListener
{
  private boolean mAnimateChange = false;
  private boolean mApplyToAllConstraintSets = true;
  private int mApplyToConstraintSetId = 0;
  private int mAttributeId = -1;
  
  public ReactiveGuide(Context paramContext)
  {
    super(paramContext);
    super.setVisibility(8);
    init(null);
  }
  
  public ReactiveGuide(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    super.setVisibility(8);
    init(paramAttributeSet);
  }
  
  public ReactiveGuide(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    super.setVisibility(8);
    init(paramAttributeSet);
  }
  
  public ReactiveGuide(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    super.setVisibility(8);
    init(paramAttributeSet);
  }
  
  private void changeValue(int paramInt1, int paramInt2, MotionLayout paramMotionLayout, int paramInt3)
  {
    ConstraintSet localConstraintSet = paramMotionLayout.getConstraintSet(paramInt3);
    localConstraintSet.setGuidelineEnd(paramInt2, paramInt1);
    paramMotionLayout.updateState(paramInt3, localConstraintSet);
  }
  
  private void init(AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.ConstraintLayout_ReactiveGuide);
      int i = paramAttributeSet.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramAttributeSet.getIndex(j);
        if (k == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
          mAttributeId = paramAttributeSet.getResourceId(k, mAttributeId);
        } else if (k == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
          mAnimateChange = paramAttributeSet.getBoolean(k, mAnimateChange);
        } else if (k == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
          mApplyToConstraintSetId = paramAttributeSet.getResourceId(k, mApplyToConstraintSetId);
        } else if (k == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
          mApplyToAllConstraintSets = paramAttributeSet.getBoolean(k, mApplyToAllConstraintSets);
        }
      }
      paramAttributeSet.recycle();
    }
    if (mAttributeId != -1) {
      ConstraintLayout.getSharedValues().addListener(mAttributeId, this);
    }
  }
  
  @SuppressLint({"MissingSuperCall"})
  public void draw(Canvas paramCanvas) {}
  
  public int getApplyToConstraintSetId()
  {
    return mApplyToConstraintSetId;
  }
  
  public int getAttributeId()
  {
    return mAttributeId;
  }
  
  public boolean isAnimatingChange()
  {
    return mAnimateChange;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(0, 0);
  }
  
  public void onNewValue(int paramInt1, int paramInt2, int paramInt3)
  {
    setGuidelineBegin(paramInt2);
    int i = getId();
    if (i <= 0) {
      return;
    }
    if ((getParent() instanceof MotionLayout))
    {
      MotionLayout localMotionLayout = (MotionLayout)getParent();
      paramInt1 = localMotionLayout.getCurrentState();
      paramInt3 = mApplyToConstraintSetId;
      if (paramInt3 != 0) {
        paramInt1 = paramInt3;
      }
      boolean bool = mAnimateChange;
      int j = 0;
      paramInt3 = 0;
      Object localObject;
      if (bool)
      {
        if (mApplyToAllConstraintSets)
        {
          localObject = localMotionLayout.getConstraintSetIds();
          while (paramInt3 < localObject.length)
          {
            j = localObject[paramInt3];
            if (j != paramInt1) {
              changeValue(paramInt2, i, localMotionLayout, j);
            }
            paramInt3++;
          }
        }
        localObject = localMotionLayout.cloneConstraintSet(paramInt1);
        ((ConstraintSet)localObject).setGuidelineEnd(i, paramInt2);
        localMotionLayout.updateStateAnimate(paramInt1, (ConstraintSet)localObject, 1000);
      }
      else
      {
        if (mApplyToAllConstraintSets)
        {
          localObject = localMotionLayout.getConstraintSetIds();
          for (paramInt1 = j; paramInt1 < localObject.length; paramInt1++) {
            changeValue(paramInt2, i, localMotionLayout, localObject[paramInt1]);
          }
        }
        changeValue(paramInt2, i, localMotionLayout, paramInt1);
      }
    }
  }
  
  public void setAnimateChange(boolean paramBoolean)
  {
    mAnimateChange = paramBoolean;
  }
  
  public void setApplyToConstraintSetId(int paramInt)
  {
    mApplyToConstraintSetId = paramInt;
  }
  
  public void setAttributeId(int paramInt)
  {
    SharedValues localSharedValues = ConstraintLayout.getSharedValues();
    int i = mAttributeId;
    if (i != -1) {
      localSharedValues.removeListener(i, this);
    }
    mAttributeId = paramInt;
    if (paramInt != -1) {
      localSharedValues.addListener(paramInt, this);
    }
  }
  
  public void setGuidelineBegin(int paramInt)
  {
    ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)getLayoutParams();
    guideBegin = paramInt;
    setLayoutParams(localLayoutParams);
  }
  
  public void setGuidelineEnd(int paramInt)
  {
    ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)getLayoutParams();
    guideEnd = paramInt;
    setLayoutParams(localLayoutParams);
  }
  
  public void setGuidelinePercent(float paramFloat)
  {
    ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)getLayoutParams();
    guidePercent = paramFloat;
    setLayoutParams(localLayoutParams);
  }
  
  public void setVisibility(int paramInt) {}
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.ReactiveGuide
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
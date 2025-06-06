package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class Guideline
  extends View
{
  private boolean mFilterRedundantCalls = true;
  
  public Guideline(Context paramContext)
  {
    super(paramContext);
    super.setVisibility(8);
  }
  
  public Guideline(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    super.setVisibility(8);
  }
  
  public Guideline(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    super.setVisibility(8);
  }
  
  public Guideline(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    super.setVisibility(8);
  }
  
  @SuppressLint({"MissingSuperCall"})
  public void draw(Canvas paramCanvas) {}
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(0, 0);
  }
  
  public void setFilterRedundantCalls(boolean paramBoolean)
  {
    mFilterRedundantCalls = paramBoolean;
  }
  
  public void setGuidelineBegin(int paramInt)
  {
    ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)getLayoutParams();
    if ((mFilterRedundantCalls) && (guideBegin == paramInt)) {
      return;
    }
    guideBegin = paramInt;
    setLayoutParams(localLayoutParams);
  }
  
  public void setGuidelineEnd(int paramInt)
  {
    ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)getLayoutParams();
    if ((mFilterRedundantCalls) && (guideEnd == paramInt)) {
      return;
    }
    guideEnd = paramInt;
    setLayoutParams(localLayoutParams);
  }
  
  public void setGuidelinePercent(float paramFloat)
  {
    ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)getLayoutParams();
    if ((mFilterRedundantCalls) && (guidePercent == paramFloat)) {
      return;
    }
    guidePercent = paramFloat;
    setLayoutParams(localLayoutParams);
  }
  
  public void setVisibility(int paramInt) {}
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.Guideline
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
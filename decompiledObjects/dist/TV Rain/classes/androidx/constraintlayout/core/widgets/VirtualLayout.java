package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer;
import java.util.HashSet;

public class VirtualLayout
  extends HelperWidget
{
  public BasicMeasure.Measure mMeasure = new BasicMeasure.Measure();
  private int mMeasuredHeight = 0;
  private int mMeasuredWidth = 0;
  public BasicMeasure.Measurer mMeasurer = null;
  private boolean mNeedsCallFromSolver = false;
  private int mPaddingBottom = 0;
  private int mPaddingEnd = 0;
  private int mPaddingLeft = 0;
  private int mPaddingRight = 0;
  private int mPaddingStart = 0;
  private int mPaddingTop = 0;
  private int mResolvedPaddingLeft = 0;
  private int mResolvedPaddingRight = 0;
  
  public void applyRtl(boolean paramBoolean)
  {
    int i = mPaddingStart;
    if ((i > 0) || (mPaddingEnd > 0)) {
      if (paramBoolean)
      {
        mResolvedPaddingLeft = mPaddingEnd;
        mResolvedPaddingRight = i;
      }
      else
      {
        mResolvedPaddingLeft = i;
        mResolvedPaddingRight = mPaddingEnd;
      }
    }
  }
  
  public void captureWidgets()
  {
    for (int i = 0; i < mWidgetsCount; i++)
    {
      ConstraintWidget localConstraintWidget = mWidgets[i];
      if (localConstraintWidget != null) {
        localConstraintWidget.setInVirtualLayout(true);
      }
    }
  }
  
  public boolean contains(HashSet<ConstraintWidget> paramHashSet)
  {
    for (int i = 0; i < mWidgetsCount; i++) {
      if (paramHashSet.contains(mWidgets[i])) {
        return true;
      }
    }
    return false;
  }
  
  public int getMeasuredHeight()
  {
    return mMeasuredHeight;
  }
  
  public int getMeasuredWidth()
  {
    return mMeasuredWidth;
  }
  
  public int getPaddingBottom()
  {
    return mPaddingBottom;
  }
  
  public int getPaddingLeft()
  {
    return mResolvedPaddingLeft;
  }
  
  public int getPaddingRight()
  {
    return mResolvedPaddingRight;
  }
  
  public int getPaddingTop()
  {
    return mPaddingTop;
  }
  
  public void measure(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void measure(ConstraintWidget paramConstraintWidget, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour1, int paramInt1, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour2, int paramInt2)
  {
    while ((mMeasurer == null) && (getParent() != null)) {
      mMeasurer = ((ConstraintWidgetContainer)getParent()).getMeasurer();
    }
    BasicMeasure.Measure localMeasure = mMeasure;
    horizontalBehavior = paramDimensionBehaviour1;
    verticalBehavior = paramDimensionBehaviour2;
    horizontalDimension = paramInt1;
    verticalDimension = paramInt2;
    mMeasurer.measure(paramConstraintWidget, localMeasure);
    paramConstraintWidget.setWidth(mMeasure.measuredWidth);
    paramConstraintWidget.setHeight(mMeasure.measuredHeight);
    paramConstraintWidget.setHasBaseline(mMeasure.measuredHasBaseline);
    paramConstraintWidget.setBaselineDistance(mMeasure.measuredBaseline);
  }
  
  public boolean measureChildren()
  {
    Object localObject1 = mParent;
    if (localObject1 != null) {
      localObject1 = ((ConstraintWidgetContainer)localObject1).getMeasurer();
    } else {
      localObject1 = null;
    }
    if (localObject1 == null) {
      return false;
    }
    for (int i = 0;; i++)
    {
      int j = mWidgetsCount;
      int k = 1;
      if (i >= j) {
        break;
      }
      ConstraintWidget localConstraintWidget = mWidgets[i];
      if ((localConstraintWidget != null) && (!(localConstraintWidget instanceof Guideline)))
      {
        Object localObject2 = localConstraintWidget.getDimensionBehaviour(0);
        Object localObject3 = localConstraintWidget.getDimensionBehaviour(1);
        ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if ((localObject2 != localDimensionBehaviour) || (mMatchConstraintDefaultWidth == 1) || (localObject3 != localDimensionBehaviour) || (mMatchConstraintDefaultHeight == 1)) {
          k = 0;
        }
        if (k == 0)
        {
          Object localObject4 = localObject2;
          if (localObject2 == localDimensionBehaviour) {
            localObject4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
          }
          localObject2 = localObject3;
          if (localObject3 == localDimensionBehaviour) {
            localObject2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
          }
          localObject3 = mMeasure;
          horizontalBehavior = ((ConstraintWidget.DimensionBehaviour)localObject4);
          verticalBehavior = ((ConstraintWidget.DimensionBehaviour)localObject2);
          horizontalDimension = localConstraintWidget.getWidth();
          mMeasure.verticalDimension = localConstraintWidget.getHeight();
          ((BasicMeasure.Measurer)localObject1).measure(localConstraintWidget, mMeasure);
          localConstraintWidget.setWidth(mMeasure.measuredWidth);
          localConstraintWidget.setHeight(mMeasure.measuredHeight);
          localConstraintWidget.setBaselineDistance(mMeasure.measuredBaseline);
        }
      }
    }
    return true;
  }
  
  public boolean needSolverPass()
  {
    return mNeedsCallFromSolver;
  }
  
  public void needsCallbackFromSolver(boolean paramBoolean)
  {
    mNeedsCallFromSolver = paramBoolean;
  }
  
  public void setMeasure(int paramInt1, int paramInt2)
  {
    mMeasuredWidth = paramInt1;
    mMeasuredHeight = paramInt2;
  }
  
  public void setPadding(int paramInt)
  {
    mPaddingLeft = paramInt;
    mPaddingTop = paramInt;
    mPaddingRight = paramInt;
    mPaddingBottom = paramInt;
    mPaddingStart = paramInt;
    mPaddingEnd = paramInt;
  }
  
  public void setPaddingBottom(int paramInt)
  {
    mPaddingBottom = paramInt;
  }
  
  public void setPaddingEnd(int paramInt)
  {
    mPaddingEnd = paramInt;
  }
  
  public void setPaddingLeft(int paramInt)
  {
    mPaddingLeft = paramInt;
    mResolvedPaddingLeft = paramInt;
  }
  
  public void setPaddingRight(int paramInt)
  {
    mPaddingRight = paramInt;
    mResolvedPaddingRight = paramInt;
  }
  
  public void setPaddingStart(int paramInt)
  {
    mPaddingStart = paramInt;
    mResolvedPaddingLeft = paramInt;
    mResolvedPaddingRight = paramInt;
  }
  
  public void setPaddingTop(int paramInt)
  {
    mPaddingTop = paramInt;
  }
  
  public void updateConstraints(ConstraintWidgetContainer paramConstraintWidgetContainer)
  {
    captureWidgets();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.VirtualLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
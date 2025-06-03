package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer;
import java.util.ArrayList;

class ConstraintLayout$Measurer
  implements BasicMeasure.Measurer
{
  public ConstraintLayout layout;
  public int layoutHeightSpec;
  public int layoutWidthSpec;
  public int paddingBottom;
  public int paddingHeight;
  public int paddingTop;
  public int paddingWidth;
  
  public ConstraintLayout$Measurer(ConstraintLayout paramConstraintLayout1, ConstraintLayout paramConstraintLayout2)
  {
    layout = paramConstraintLayout2;
  }
  
  private boolean isSimilarSpec(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 == paramInt2) {
      return true;
    }
    int i = View.MeasureSpec.getMode(paramInt1);
    View.MeasureSpec.getSize(paramInt1);
    paramInt1 = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    return (paramInt1 == 1073741824) && ((i == Integer.MIN_VALUE) || (i == 0)) && (paramInt3 == paramInt2);
  }
  
  public void captureLayoutInfo(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    paddingTop = paramInt3;
    paddingBottom = paramInt4;
    paddingWidth = paramInt5;
    paddingHeight = paramInt6;
    layoutWidthSpec = paramInt1;
    layoutHeightSpec = paramInt2;
  }
  
  public final void didMeasures()
  {
    int i = layout.getChildCount();
    int j = 0;
    for (int k = 0; k < i; k++)
    {
      View localView = layout.getChildAt(k);
      if ((localView instanceof Placeholder)) {
        ((Placeholder)localView).updatePostMeasure(layout);
      }
    }
    i = ConstraintLayout.access$100(layout).size();
    if (i > 0) {
      for (k = j; k < i; k++) {
        ((ConstraintHelper)ConstraintLayout.access$100(layout).get(k)).updatePostMeasure(layout);
      }
    }
  }
  
  @SuppressLint({"WrongCall"})
  public final void measure(ConstraintWidget paramConstraintWidget, BasicMeasure.Measure paramMeasure)
  {
    if (paramConstraintWidget == null) {
      return;
    }
    if ((paramConstraintWidget.getVisibility() == 8) && (!paramConstraintWidget.isInPlaceholder()))
    {
      measuredWidth = 0;
      measuredHeight = 0;
      measuredBaseline = 0;
      return;
    }
    if (paramConstraintWidget.getParent() == null) {
      return;
    }
    Object localObject1 = horizontalBehavior;
    Object localObject2 = verticalBehavior;
    int i = horizontalDimension;
    int j = verticalDimension;
    int k = paddingTop + paddingBottom;
    int m = paddingWidth;
    View localView = (View)paramConstraintWidget.getCompanionWidget();
    Object localObject3 = ConstraintLayout.1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour;
    int n = localObject3[localObject1.ordinal()];
    int i1;
    if (n != 1)
    {
      if (n != 2)
      {
        if (n != 3)
        {
          if (n != 4)
          {
            m = 0;
          }
          else
          {
            n = ViewGroup.getChildMeasureSpec(layoutWidthSpec, m, -2);
            if (mMatchConstraintDefaultWidth == 1) {
              i = 1;
            } else {
              i = 0;
            }
            i1 = measureStrategy;
            if (i1 != BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS)
            {
              m = n;
              if (i1 != BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) {}
            }
            else
            {
              if (localView.getMeasuredHeight() == paramConstraintWidget.getHeight()) {
                m = 1;
              } else {
                m = 0;
              }
              if ((measureStrategy != BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) && (i != 0) && ((i == 0) || (m == 0)) && (!(localView instanceof Placeholder)) && (!paramConstraintWidget.isResolvedHorizontally())) {
                i = 0;
              } else {
                i = 1;
              }
              m = n;
              if (i != 0) {
                m = View.MeasureSpec.makeMeasureSpec(paramConstraintWidget.getWidth(), 1073741824);
              }
            }
          }
        }
        else {
          m = ViewGroup.getChildMeasureSpec(layoutWidthSpec, paramConstraintWidget.getHorizontalMargin() + m, -1);
        }
      }
      else {
        m = ViewGroup.getChildMeasureSpec(layoutWidthSpec, m, -2);
      }
    }
    else {
      m = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }
    i = localObject3[localObject2.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            i = 0;
          }
          else
          {
            j = ViewGroup.getChildMeasureSpec(layoutHeightSpec, k, -2);
            if (mMatchConstraintDefaultHeight == 1) {
              n = 1;
            } else {
              n = 0;
            }
            k = measureStrategy;
            if (k != BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS)
            {
              i = j;
              if (k != BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) {}
            }
            else
            {
              if (localView.getMeasuredWidth() == paramConstraintWidget.getWidth()) {
                i = 1;
              } else {
                i = 0;
              }
              if ((measureStrategy != BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) && (n != 0) && ((n == 0) || (i == 0)) && (!(localView instanceof Placeholder)) && (!paramConstraintWidget.isResolvedVertically())) {
                n = 0;
              } else {
                n = 1;
              }
              i = j;
              if (n != 0) {
                i = View.MeasureSpec.makeMeasureSpec(paramConstraintWidget.getHeight(), 1073741824);
              }
            }
          }
        }
        else {
          i = ViewGroup.getChildMeasureSpec(layoutHeightSpec, paramConstraintWidget.getVerticalMargin() + k, -1);
        }
      }
      else {
        i = ViewGroup.getChildMeasureSpec(layoutHeightSpec, k, -2);
      }
    }
    else {
      i = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
    }
    localObject3 = (ConstraintWidgetContainer)paramConstraintWidget.getParent();
    if ((localObject3 != null) && (Optimizer.enabled(ConstraintLayout.access$000(this$0), 256)) && (localView.getMeasuredWidth() == paramConstraintWidget.getWidth()) && (localView.getMeasuredWidth() < ((ConstraintWidget)localObject3).getWidth()) && (localView.getMeasuredHeight() == paramConstraintWidget.getHeight()) && (localView.getMeasuredHeight() < ((ConstraintWidget)localObject3).getHeight()) && (localView.getBaseline() == paramConstraintWidget.getBaselineDistance()) && (!paramConstraintWidget.isMeasureRequested()))
    {
      if ((isSimilarSpec(paramConstraintWidget.getLastHorizontalMeasureSpec(), m, paramConstraintWidget.getWidth())) && (isSimilarSpec(paramConstraintWidget.getLastVerticalMeasureSpec(), i, paramConstraintWidget.getHeight()))) {
        n = 1;
      } else {
        n = 0;
      }
      if (n != 0)
      {
        measuredWidth = paramConstraintWidget.getWidth();
        measuredHeight = paramConstraintWidget.getHeight();
        measuredBaseline = paramConstraintWidget.getBaselineDistance();
        return;
      }
    }
    localObject3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
    if (localObject1 == localObject3) {
      n = 1;
    } else {
      n = 0;
    }
    if (localObject2 == localObject3) {
      j = 1;
    } else {
      j = 0;
    }
    localObject3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
    int i2;
    if ((localObject2 != localObject3) && (localObject2 != ConstraintWidget.DimensionBehaviour.FIXED)) {
      i2 = 0;
    } else {
      i2 = 1;
    }
    int i3;
    if ((localObject1 != localObject3) && (localObject1 != ConstraintWidget.DimensionBehaviour.FIXED)) {
      i3 = 0;
    } else {
      i3 = 1;
    }
    int i4;
    if ((n != 0) && (mDimensionRatio > 0.0F)) {
      i4 = 1;
    } else {
      i4 = 0;
    }
    int i5;
    if ((j != 0) && (mDimensionRatio > 0.0F)) {
      i5 = 1;
    } else {
      i5 = 0;
    }
    if (localView == null) {
      return;
    }
    localObject1 = (ConstraintLayout.LayoutParams)localView.getLayoutParams();
    k = measureStrategy;
    if ((k != BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS) && (k != BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) && (n != 0) && (mMatchConstraintDefaultWidth == 0) && (j != 0) && (mMatchConstraintDefaultHeight == 0))
    {
      n = 0;
      i2 = 0;
      i1 = 0;
    }
    else
    {
      if (((localView instanceof VirtualLayout)) && ((paramConstraintWidget instanceof androidx.constraintlayout.core.widgets.VirtualLayout)))
      {
        localObject2 = (androidx.constraintlayout.core.widgets.VirtualLayout)paramConstraintWidget;
        ((VirtualLayout)localView).onMeasure((androidx.constraintlayout.core.widgets.VirtualLayout)localObject2, m, i);
      }
      else
      {
        localView.measure(m, i);
      }
      paramConstraintWidget.setLastMeasureSpec(m, i);
      int i6 = localView.getMeasuredWidth();
      int i7 = localView.getMeasuredHeight();
      int i8 = localView.getBaseline();
      n = mMatchConstraintMinWidth;
      if (n > 0) {
        j = Math.max(n, i6);
      } else {
        j = i6;
      }
      k = mMatchConstraintMaxWidth;
      n = j;
      if (k > 0) {
        n = Math.min(k, j);
      }
      j = mMatchConstraintMinHeight;
      if (j > 0) {
        j = Math.max(j, i7);
      } else {
        j = i7;
      }
      k = mMatchConstraintMaxHeight;
      i1 = j;
      if (k > 0) {
        i1 = Math.min(k, j);
      }
      j = i1;
      k = n;
      if (!Optimizer.enabled(ConstraintLayout.access$000(this$0), 1))
      {
        float f;
        if ((i4 != 0) && (i2 != 0))
        {
          f = mDimensionRatio;
          k = (int)(i1 * f + 0.5F);
          j = i1;
        }
        else
        {
          j = i1;
          k = n;
          if (i5 != 0)
          {
            j = i1;
            k = n;
            if (i3 != 0)
            {
              f = mDimensionRatio;
              j = (int)(n / f + 0.5F);
              k = n;
            }
          }
        }
      }
      if (i6 == k)
      {
        n = j;
        i2 = i8;
        i1 = k;
        if (i7 != j) {}
      }
      for (;;)
      {
        break;
        if (i6 != k) {
          m = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
        }
        if (i7 != j) {
          i = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
        }
        localView.measure(m, i);
        paramConstraintWidget.setLastMeasureSpec(m, i);
        i1 = localView.getMeasuredWidth();
        n = localView.getMeasuredHeight();
        i2 = localView.getBaseline();
      }
    }
    boolean bool1;
    if (i2 != -1) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    boolean bool2;
    if ((i1 == horizontalDimension) && (n == verticalDimension)) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    measuredNeedsSolverPass = bool2;
    if (needsBaseline) {
      bool1 = true;
    }
    if ((bool1) && (i2 != -1) && (paramConstraintWidget.getBaselineDistance() != i2)) {
      measuredNeedsSolverPass = true;
    }
    measuredWidth = i1;
    measuredHeight = n;
    measuredHasBaseline = bool1;
    measuredBaseline = i2;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintLayout.Measurer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
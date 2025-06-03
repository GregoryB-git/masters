package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.WidgetContainer;
import java.util.ArrayList;

public class BasicMeasure
{
  public static final int AT_MOST = Integer.MIN_VALUE;
  private static final boolean DEBUG = false;
  public static final int EXACTLY = 1073741824;
  public static final int FIXED = -3;
  public static final int MATCH_PARENT = -1;
  private static final int MODE_SHIFT = 30;
  public static final int UNSPECIFIED = 0;
  public static final int WRAP_CONTENT = -2;
  private ConstraintWidgetContainer constraintWidgetContainer;
  private Measure mMeasure = new Measure();
  private final ArrayList<ConstraintWidget> mVariableDimensionsWidgets = new ArrayList();
  
  public BasicMeasure(ConstraintWidgetContainer paramConstraintWidgetContainer)
  {
    constraintWidgetContainer = paramConstraintWidgetContainer;
  }
  
  private boolean measure(Measurer paramMeasurer, ConstraintWidget paramConstraintWidget, int paramInt)
  {
    mMeasure.horizontalBehavior = paramConstraintWidget.getHorizontalDimensionBehaviour();
    mMeasure.verticalBehavior = paramConstraintWidget.getVerticalDimensionBehaviour();
    mMeasure.horizontalDimension = paramConstraintWidget.getWidth();
    mMeasure.verticalDimension = paramConstraintWidget.getHeight();
    Measure localMeasure = mMeasure;
    measuredNeedsSolverPass = false;
    measureStrategy = paramInt;
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = horizontalBehavior;
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
    int i;
    if (localDimensionBehaviour1 == localDimensionBehaviour2) {
      i = 1;
    } else {
      i = 0;
    }
    if (verticalBehavior == localDimensionBehaviour2) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if ((i != 0) && (mDimensionRatio > 0.0F)) {
      i = 1;
    } else {
      i = 0;
    }
    if ((paramInt != 0) && (mDimensionRatio > 0.0F)) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if ((i != 0) && (mResolvedMatchConstraintDefault[0] == 4)) {
      horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
    }
    if ((paramInt != 0) && (mResolvedMatchConstraintDefault[1] == 4)) {
      verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
    }
    paramMeasurer.measure(paramConstraintWidget, localMeasure);
    paramConstraintWidget.setWidth(mMeasure.measuredWidth);
    paramConstraintWidget.setHeight(mMeasure.measuredHeight);
    paramConstraintWidget.setHasBaseline(mMeasure.measuredHasBaseline);
    paramConstraintWidget.setBaselineDistance(mMeasure.measuredBaseline);
    paramMeasurer = mMeasure;
    measureStrategy = Measure.SELF_DIMENSIONS;
    return measuredNeedsSolverPass;
  }
  
  private void measureChildren(ConstraintWidgetContainer paramConstraintWidgetContainer)
  {
    int i = mChildren.size();
    boolean bool = paramConstraintWidgetContainer.optimizeFor(64);
    Measurer localMeasurer = paramConstraintWidgetContainer.getMeasurer();
    for (int j = 0; j < i; j++)
    {
      Object localObject1 = (ConstraintWidget)mChildren.get(j);
      if ((!(localObject1 instanceof Guideline)) && (!(localObject1 instanceof Barrier)) && (!((ConstraintWidget)localObject1).isInVirtualLayout()))
      {
        if (bool)
        {
          localObject2 = horizontalRun;
          if (localObject2 != null)
          {
            localObject3 = verticalRun;
            if ((localObject3 != null) && (dimension.resolved) && (dimension.resolved)) {
              continue;
            }
          }
        }
        Object localObject3 = ((ConstraintWidget)localObject1).getDimensionBehaviour(0);
        int k = 1;
        ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ((ConstraintWidget)localObject1).getDimensionBehaviour(1);
        Object localObject2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if ((localObject3 == localObject2) && (mMatchConstraintDefaultWidth != 1) && (localDimensionBehaviour == localObject2) && (mMatchConstraintDefaultHeight != 1)) {
          m = 1;
        } else {
          m = 0;
        }
        int n = m;
        if (m == 0)
        {
          n = m;
          if (paramConstraintWidgetContainer.optimizeFor(1))
          {
            n = m;
            if (!(localObject1 instanceof VirtualLayout))
            {
              n = m;
              if (localObject3 == localObject2)
              {
                n = m;
                if (mMatchConstraintDefaultWidth == 0)
                {
                  n = m;
                  if (localDimensionBehaviour != localObject2)
                  {
                    n = m;
                    if (!((ConstraintWidget)localObject1).isInHorizontalChain()) {
                      n = 1;
                    }
                  }
                }
              }
              m = n;
              if (localDimensionBehaviour == localObject2)
              {
                m = n;
                if (mMatchConstraintDefaultHeight == 0)
                {
                  m = n;
                  if (localObject3 != localObject2)
                  {
                    m = n;
                    if (!((ConstraintWidget)localObject1).isInHorizontalChain()) {
                      m = 1;
                    }
                  }
                }
              }
              if (localObject3 != localObject2)
              {
                n = m;
                if (localDimensionBehaviour != localObject2) {}
              }
              else
              {
                n = m;
                if (mDimensionRatio > 0.0F)
                {
                  m = k;
                  break label369;
                }
              }
            }
          }
        }
        int m = n;
        label369:
        if (m == 0)
        {
          measure(localMeasurer, (ConstraintWidget)localObject1, Measure.SELF_DIMENSIONS);
          localObject1 = mMetrics;
          if (localObject1 != null) {
            measuredWidgets += 1L;
          }
        }
      }
    }
    localMeasurer.didMeasures();
  }
  
  private void solveLinearSystem(ConstraintWidgetContainer paramConstraintWidgetContainer, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramConstraintWidgetContainer.getMinWidth();
    int j = paramConstraintWidgetContainer.getMinHeight();
    paramConstraintWidgetContainer.setMinWidth(0);
    paramConstraintWidgetContainer.setMinHeight(0);
    paramConstraintWidgetContainer.setWidth(paramInt2);
    paramConstraintWidgetContainer.setHeight(paramInt3);
    paramConstraintWidgetContainer.setMinWidth(i);
    paramConstraintWidgetContainer.setMinHeight(j);
    constraintWidgetContainer.setPass(paramInt1);
    constraintWidgetContainer.layout();
  }
  
  public long solverMeasure(ConstraintWidgetContainer paramConstraintWidgetContainer, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
  {
    Measurer localMeasurer = paramConstraintWidgetContainer.getMeasurer();
    paramInt9 = mChildren.size();
    int i = paramConstraintWidgetContainer.getWidth();
    int j = paramConstraintWidgetContainer.getHeight();
    int k = Optimizer.enabled(paramInt1, 128);
    if ((k == 0) && (!Optimizer.enabled(paramInt1, 64))) {
      paramInt1 = 0;
    } else {
      paramInt1 = 1;
    }
    paramInt3 = paramInt1;
    Object localObject1;
    Object localObject2;
    if (paramInt1 != 0) {
      for (paramInt2 = 0;; paramInt2++)
      {
        paramInt3 = paramInt1;
        if (paramInt2 >= paramInt9) {
          break;
        }
        localObject1 = (ConstraintWidget)mChildren.get(paramInt2);
        ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ((ConstraintWidget)localObject1).getHorizontalDimensionBehaviour();
        localObject2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (localDimensionBehaviour == localObject2) {
          paramInt3 = 1;
        } else {
          paramInt3 = 0;
        }
        if (((ConstraintWidget)localObject1).getVerticalDimensionBehaviour() == localObject2) {
          paramInt8 = 1;
        } else {
          paramInt8 = 0;
        }
        if ((paramInt3 != 0) && (paramInt8 != 0) && (((ConstraintWidget)localObject1).getDimensionRatio() > 0.0F)) {
          paramInt3 = 1;
        } else {
          paramInt3 = 0;
        }
        if ((((ConstraintWidget)localObject1).isInHorizontalChain()) && (paramInt3 != 0)) {}
        while (((((ConstraintWidget)localObject1).isInVerticalChain()) && (paramInt3 != 0)) || ((localObject1 instanceof VirtualLayout)) || (((ConstraintWidget)localObject1).isInHorizontalChain()) || (((ConstraintWidget)localObject1).isInVerticalChain()))
        {
          paramInt3 = 0;
          break;
        }
      }
    }
    if (paramInt3 != 0)
    {
      localObject1 = LinearSystem.sMetrics;
      if (localObject1 != null) {
        measures += 1L;
      }
    }
    if (((paramInt4 == 1073741824) && (paramInt6 == 1073741824)) || (k != 0)) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    int m = paramInt3 & paramInt1;
    if (m != 0)
    {
      paramInt1 = Math.min(paramConstraintWidgetContainer.getMaxWidth(), paramInt5);
      paramInt2 = Math.min(paramConstraintWidgetContainer.getMaxHeight(), paramInt7);
      if ((paramInt4 == 1073741824) && (paramConstraintWidgetContainer.getWidth() != paramInt1))
      {
        paramConstraintWidgetContainer.setWidth(paramInt1);
        paramConstraintWidgetContainer.invalidateGraph();
      }
      if ((paramInt6 == 1073741824) && (paramConstraintWidgetContainer.getHeight() != paramInt2))
      {
        paramConstraintWidgetContainer.setHeight(paramInt2);
        paramConstraintWidgetContainer.invalidateGraph();
      }
      if ((paramInt4 == 1073741824) && (paramInt6 == 1073741824))
      {
        paramInt1 = paramConstraintWidgetContainer.directMeasure(k);
        paramInt2 = 2;
      }
      else
      {
        paramInt1 = paramConstraintWidgetContainer.directMeasureSetup(k);
        if (paramInt4 == 1073741824)
        {
          paramInt1 &= paramConstraintWidgetContainer.directMeasureWithOrientation(k, 0);
          paramInt2 = 1;
        }
        else
        {
          paramInt2 = 0;
        }
        if (paramInt6 == 1073741824)
        {
          paramInt1 = paramConstraintWidgetContainer.directMeasureWithOrientation(k, 1) & paramInt1;
          paramInt2++;
        }
      }
      paramInt5 = paramInt1;
      paramInt3 = paramInt2;
      if (paramInt1 != 0)
      {
        if (paramInt4 == 1073741824) {
          k = 1;
        } else {
          k = 0;
        }
        boolean bool;
        if (paramInt6 == 1073741824) {
          bool = true;
        } else {
          bool = false;
        }
        paramConstraintWidgetContainer.updateFromRuns(k, bool);
        paramInt5 = paramInt1;
        paramInt3 = paramInt2;
      }
    }
    else
    {
      paramInt5 = 0;
      paramInt3 = paramInt5;
    }
    if ((paramInt5 == 0) || (paramInt3 != 2))
    {
      paramInt3 = paramConstraintWidgetContainer.getOptimizationLevel();
      if (paramInt9 > 0) {
        measureChildren(paramConstraintWidgetContainer);
      }
      updateHierarchy(paramConstraintWidgetContainer);
      int n = mVariableDimensionsWidgets.size();
      if (paramInt9 > 0) {
        solveLinearSystem(paramConstraintWidgetContainer, "First pass", 0, i, j);
      }
      if (n > 0)
      {
        localObject1 = paramConstraintWidgetContainer.getHorizontalDimensionBehaviour();
        localObject2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (localObject1 == localObject2) {
          paramInt8 = 1;
        } else {
          paramInt8 = 0;
        }
        if (paramConstraintWidgetContainer.getVerticalDimensionBehaviour() == localObject2) {
          paramInt9 = 1;
        } else {
          paramInt9 = 0;
        }
        paramInt2 = Math.max(paramConstraintWidgetContainer.getWidth(), constraintWidgetContainer.getMinWidth());
        paramInt1 = Math.max(paramConstraintWidgetContainer.getHeight(), constraintWidgetContainer.getMinHeight());
        paramInt6 = 0;
        int i1;
        int i2;
        for (paramInt4 = paramInt6; paramInt6 < n; paramInt4 = paramInt5)
        {
          localObject2 = (ConstraintWidget)mVariableDimensionsWidgets.get(paramInt6);
          if (!(localObject2 instanceof VirtualLayout))
          {
            paramInt5 = paramInt4;
          }
          else
          {
            paramInt5 = ((ConstraintWidget)localObject2).getWidth();
            i1 = ((ConstraintWidget)localObject2).getHeight();
            k = measure(localMeasurer, (ConstraintWidget)localObject2, Measure.TRY_GIVEN_DIMENSIONS);
            localObject1 = mMetrics;
            if (localObject1 != null) {
              measuredMatchWidgets += 1L;
            }
            i2 = ((ConstraintWidget)localObject2).getWidth();
            paramInt7 = ((ConstraintWidget)localObject2).getHeight();
            if (i2 != paramInt5)
            {
              ((ConstraintWidget)localObject2).setWidth(i2);
              paramInt4 = paramInt2;
              if (paramInt8 != 0)
              {
                paramInt4 = paramInt2;
                if (((ConstraintWidget)localObject2).getRight() > paramInt2)
                {
                  paramInt4 = ((ConstraintWidget)localObject2).getRight();
                  paramInt4 = Math.max(paramInt2, ((ConstraintWidget)localObject2).getAnchor(ConstraintAnchor.Type.RIGHT).getMargin() + paramInt4);
                }
              }
              paramInt5 = 1;
              paramInt2 = paramInt4;
            }
            else
            {
              paramInt5 = k | paramInt4;
            }
            paramInt4 = paramInt1;
            if (paramInt7 != i1)
            {
              ((ConstraintWidget)localObject2).setHeight(paramInt7);
              paramInt4 = paramInt1;
              if (paramInt9 != 0)
              {
                paramInt4 = paramInt1;
                if (((ConstraintWidget)localObject2).getBottom() > paramInt1)
                {
                  paramInt4 = ((ConstraintWidget)localObject2).getBottom();
                  paramInt4 = Math.max(paramInt1, ((ConstraintWidget)localObject2).getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin() + paramInt4);
                }
              }
              paramInt5 = 1;
            }
            paramInt5 |= ((VirtualLayout)localObject2).needSolverPass();
            paramInt1 = paramInt4;
          }
          paramInt6++;
        }
        paramInt7 = 2;
        paramInt5 = 0;
        paramInt6 = paramInt4;
        paramInt4 = n;
        n = paramInt5;
        paramInt5 = m;
        while (n < paramInt7)
        {
          m = 0;
          while (m < paramInt4)
          {
            localObject2 = (ConstraintWidget)mVariableDimensionsWidgets.get(m);
            if ((((localObject2 instanceof Helper)) && (!(localObject2 instanceof VirtualLayout))) || ((localObject2 instanceof Guideline)) || (((ConstraintWidget)localObject2).getVisibility() == 8) || ((paramInt5 != 0) && (horizontalRun.dimension.resolved) && (verticalRun.dimension.resolved)) || ((localObject2 instanceof VirtualLayout)))
            {
              i1 = paramInt2;
              paramInt7 = paramInt6;
            }
            else
            {
              int i3 = ((ConstraintWidget)localObject2).getWidth();
              i2 = ((ConstraintWidget)localObject2).getHeight();
              i1 = ((ConstraintWidget)localObject2).getBaselineDistance();
              paramInt7 = Measure.TRY_GIVEN_DIMENSIONS;
              if (n == 1) {
                paramInt7 = Measure.USE_GIVEN_DIMENSIONS;
              }
              paramInt7 = measure(localMeasurer, (ConstraintWidget)localObject2, paramInt7) | paramInt6;
              localObject1 = mMetrics;
              if (localObject1 != null) {
                measuredMatchWidgets += 1L;
              }
              int i4 = ((ConstraintWidget)localObject2).getWidth();
              int i5 = ((ConstraintWidget)localObject2).getHeight();
              paramInt6 = paramInt2;
              if (i4 != i3)
              {
                ((ConstraintWidget)localObject2).setWidth(i4);
                paramInt6 = paramInt2;
                if (paramInt8 != 0)
                {
                  paramInt6 = paramInt2;
                  if (((ConstraintWidget)localObject2).getRight() > paramInt2)
                  {
                    paramInt6 = ((ConstraintWidget)localObject2).getRight();
                    paramInt6 = Math.max(paramInt2, ((ConstraintWidget)localObject2).getAnchor(ConstraintAnchor.Type.RIGHT).getMargin() + paramInt6);
                  }
                }
                paramInt7 = 1;
              }
              paramInt2 = paramInt1;
              if (i5 != i2)
              {
                ((ConstraintWidget)localObject2).setHeight(i5);
                paramInt2 = paramInt1;
                if (paramInt9 != 0)
                {
                  paramInt2 = paramInt1;
                  if (((ConstraintWidget)localObject2).getBottom() > paramInt1)
                  {
                    paramInt2 = ((ConstraintWidget)localObject2).getBottom();
                    paramInt2 = Math.max(paramInt1, ((ConstraintWidget)localObject2).getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin() + paramInt2);
                  }
                }
                paramInt7 = 1;
              }
              if ((((ConstraintWidget)localObject2).hasBaseline()) && (i1 != ((ConstraintWidget)localObject2).getBaselineDistance()))
              {
                paramInt7 = 1;
                i1 = paramInt6;
                paramInt1 = paramInt2;
              }
              else
              {
                paramInt1 = paramInt2;
                i1 = paramInt6;
              }
            }
            m++;
            paramInt2 = i1;
            paramInt6 = paramInt7;
          }
          if (paramInt6 == 0) {
            break;
          }
          n++;
          solveLinearSystem(paramConstraintWidgetContainer, "intermediate pass", n, i, j);
          paramInt7 = 2;
          paramInt6 = 0;
        }
      }
      paramConstraintWidgetContainer.setOptimizationLevel(paramInt3);
    }
    return 0L;
  }
  
  public void updateHierarchy(ConstraintWidgetContainer paramConstraintWidgetContainer)
  {
    mVariableDimensionsWidgets.clear();
    int i = mChildren.size();
    for (int j = 0; j < i; j++)
    {
      ConstraintWidget localConstraintWidget = (ConstraintWidget)mChildren.get(j);
      ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = localConstraintWidget.getHorizontalDimensionBehaviour();
      ConstraintWidget.DimensionBehaviour localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
      if ((localDimensionBehaviour1 == localDimensionBehaviour2) || (localConstraintWidget.getVerticalDimensionBehaviour() == localDimensionBehaviour2)) {
        mVariableDimensionsWidgets.add(localConstraintWidget);
      }
    }
    paramConstraintWidgetContainer.invalidateGraph();
  }
  
  public static class Measure
  {
    public static int SELF_DIMENSIONS = 0;
    public static int TRY_GIVEN_DIMENSIONS = 1;
    public static int USE_GIVEN_DIMENSIONS = 2;
    public ConstraintWidget.DimensionBehaviour horizontalBehavior;
    public int horizontalDimension;
    public int measureStrategy;
    public int measuredBaseline;
    public boolean measuredHasBaseline;
    public int measuredHeight;
    public boolean measuredNeedsSolverPass;
    public int measuredWidth;
    public ConstraintWidget.DimensionBehaviour verticalBehavior;
    public int verticalDimension;
  }
  
  public static abstract interface Measurer
  {
    public abstract void didMeasures();
    
    public abstract void measure(ConstraintWidget paramConstraintWidget, BasicMeasure.Measure paramMeasure);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.BasicMeasure
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.Helper;
import java.util.List;
import z2;

public class HorizontalWidgetRun
  extends WidgetRun
{
  private static int[] tempDimensions = new int[2];
  
  public HorizontalWidgetRun(ConstraintWidget paramConstraintWidget)
  {
    super(paramConstraintWidget);
    start.type = DependencyNode.Type.LEFT;
    end.type = DependencyNode.Type.RIGHT;
    orientation = 0;
  }
  
  private void computeInsetRatio(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
  {
    paramInt1 = paramInt2 - paramInt1;
    paramInt2 = paramInt4 - paramInt3;
    if (paramInt5 != -1)
    {
      if (paramInt5 != 0)
      {
        if (paramInt5 == 1)
        {
          paramInt2 = (int)(paramInt1 * paramFloat + 0.5F);
          paramArrayOfInt[0] = paramInt1;
          paramArrayOfInt[1] = paramInt2;
        }
      }
      else
      {
        paramArrayOfInt[0] = ((int)(paramInt2 * paramFloat + 0.5F));
        paramArrayOfInt[1] = paramInt2;
      }
    }
    else
    {
      paramInt4 = (int)(paramInt2 * paramFloat + 0.5F);
      paramInt3 = (int)(paramInt1 / paramFloat + 0.5F);
      if (paramInt4 <= paramInt1)
      {
        paramArrayOfInt[0] = paramInt4;
        paramArrayOfInt[1] = paramInt2;
      }
      else if (paramInt3 <= paramInt2)
      {
        paramArrayOfInt[0] = paramInt1;
        paramArrayOfInt[1] = paramInt3;
      }
    }
  }
  
  public void apply()
  {
    Object localObject1 = widget;
    if (measured) {
      dimension.resolve(((ConstraintWidget)localObject1).getWidth());
    }
    int i;
    if (!dimension.resolved)
    {
      localObject2 = widget.getHorizontalDimensionBehaviour();
      dimensionBehavior = ((ConstraintWidget.DimensionBehaviour)localObject2);
      if (localObject2 != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
      {
        localObject1 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        if (localObject2 == localObject1)
        {
          localObject2 = widget.getParent();
          if ((localObject2 != null) && ((((ConstraintWidget)localObject2).getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED) || (((ConstraintWidget)localObject2).getHorizontalDimensionBehaviour() == localObject1)))
          {
            i = ((ConstraintWidget)localObject2).getWidth();
            int j = widget.mLeft.getMargin();
            int k = widget.mRight.getMargin();
            addTarget(start, horizontalRun.start, widget.mLeft.getMargin());
            addTarget(end, horizontalRun.end, -widget.mRight.getMargin());
            dimension.resolve(i - j - k);
            return;
          }
        }
        if (dimensionBehavior == ConstraintWidget.DimensionBehaviour.FIXED) {
          dimension.resolve(widget.getWidth());
        }
      }
    }
    else
    {
      localObject2 = dimensionBehavior;
      localObject1 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
      if (localObject2 == localObject1)
      {
        localObject2 = widget.getParent();
        if ((localObject2 != null) && ((((ConstraintWidget)localObject2).getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED) || (((ConstraintWidget)localObject2).getHorizontalDimensionBehaviour() == localObject1)))
        {
          addTarget(start, horizontalRun.start, widget.mLeft.getMargin());
          addTarget(end, horizontalRun.end, -widget.mRight.getMargin());
          return;
        }
      }
    }
    Object localObject2 = dimension;
    if (resolved)
    {
      localObject1 = widget;
      if (measured)
      {
        localObject2 = mListAnchors;
        localConstraintAnchor = localObject2[0];
        localObject3 = mTarget;
        if ((localObject3 != null) && (1mTarget != null))
        {
          if (((ConstraintWidget)localObject1).isInHorizontalChain())
          {
            start.margin = widget.mListAnchors[0].getMargin();
            end.margin = (-widget.mListAnchors[1].getMargin());
            return;
          }
          localObject1 = getTarget(widget.mListAnchors[0]);
          if (localObject1 != null) {
            addTarget(start, (DependencyNode)localObject1, widget.mListAnchors[0].getMargin());
          }
          localObject1 = getTarget(widget.mListAnchors[1]);
          if (localObject1 != null) {
            addTarget(end, (DependencyNode)localObject1, -widget.mListAnchors[1].getMargin());
          }
          start.delegateToWidgetRun = true;
          end.delegateToWidgetRun = true;
          return;
        }
        if (localObject3 != null)
        {
          localObject1 = getTarget(localConstraintAnchor);
          if (localObject1 == null) {
            return;
          }
          addTarget(start, (DependencyNode)localObject1, widget.mListAnchors[0].getMargin());
          addTarget(end, start, dimension.value);
          return;
        }
        localObject2 = localObject2[1];
        if (mTarget != null)
        {
          localObject1 = getTarget((ConstraintAnchor)localObject2);
          if (localObject1 == null) {
            return;
          }
          addTarget(end, (DependencyNode)localObject1, -widget.mListAnchors[1].getMargin());
          addTarget(start, end, -dimension.value);
          return;
        }
        if (((localObject1 instanceof Helper)) || (((ConstraintWidget)localObject1).getParent() == null) || (widget.getAnchor(ConstraintAnchor.Type.CENTER).mTarget != null)) {
          return;
        }
        localObject1 = widget.getParent().horizontalRun.start;
        addTarget(start, (DependencyNode)localObject1, widget.getX());
        addTarget(end, start, dimension.value);
        return;
      }
    }
    if (dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
    {
      localObject3 = widget;
      i = mMatchConstraintDefaultWidth;
      if (i != 2)
      {
        if (i == 3) {
          if (mMatchConstraintDefaultHeight == 3)
          {
            start.updateDelegate = this;
            end.updateDelegate = this;
            localObject1 = verticalRun;
            start.updateDelegate = this;
            end.updateDelegate = this;
            updateDelegate = this;
            if (((ConstraintWidget)localObject3).isInVerticalChain())
            {
              dimension.targets.add(widget.verticalRun.dimension);
              widget.verticalRun.dimension.dependencies.add(dimension);
              localObject1 = widget.verticalRun;
              dimension.updateDelegate = this;
              dimension.targets.add(start);
              dimension.targets.add(widget.verticalRun.end);
              widget.verticalRun.start.dependencies.add(dimension);
              widget.verticalRun.end.dependencies.add(dimension);
            }
            else if (widget.isInHorizontalChain())
            {
              widget.verticalRun.dimension.targets.add(dimension);
              dimension.dependencies.add(widget.verticalRun.dimension);
            }
            else
            {
              widget.verticalRun.dimension.targets.add(dimension);
            }
          }
          else
          {
            localObject1 = verticalRun.dimension;
            targets.add(localObject1);
            dependencies.add(dimension);
            widget.verticalRun.start.dependencies.add(dimension);
            widget.verticalRun.end.dependencies.add(dimension);
            localObject1 = dimension;
            delegateToWidgetRun = true;
            dependencies.add(start);
            dimension.dependencies.add(end);
            start.targets.add(dimension);
            end.targets.add(dimension);
          }
        }
      }
      else
      {
        localObject1 = ((ConstraintWidget)localObject3).getParent();
        if (localObject1 != null)
        {
          localObject1 = verticalRun.dimension;
          dimension.targets.add(localObject1);
          dependencies.add(dimension);
          localObject1 = dimension;
          delegateToWidgetRun = true;
          dependencies.add(start);
          dimension.dependencies.add(end);
        }
      }
    }
    localObject1 = widget;
    Object localObject3 = mListAnchors;
    localObject2 = localObject3[0];
    ConstraintAnchor localConstraintAnchor = mTarget;
    if ((localConstraintAnchor != null) && (1mTarget != null))
    {
      if (((ConstraintWidget)localObject1).isInHorizontalChain())
      {
        start.margin = widget.mListAnchors[0].getMargin();
        end.margin = (-widget.mListAnchors[1].getMargin());
      }
      else
      {
        localObject1 = getTarget(widget.mListAnchors[0]);
        localObject2 = getTarget(widget.mListAnchors[1]);
        if (localObject1 != null) {
          ((DependencyNode)localObject1).addDependency(this);
        }
        if (localObject2 != null) {
          ((DependencyNode)localObject2).addDependency(this);
        }
        mRunType = WidgetRun.RunType.CENTER;
      }
    }
    else if (localConstraintAnchor != null)
    {
      localObject1 = getTarget((ConstraintAnchor)localObject2);
      if (localObject1 != null)
      {
        addTarget(start, (DependencyNode)localObject1, widget.mListAnchors[0].getMargin());
        addTarget(end, start, 1, dimension);
      }
    }
    else
    {
      localObject2 = localObject3[1];
      if (mTarget != null)
      {
        localObject1 = getTarget((ConstraintAnchor)localObject2);
        if (localObject1 != null)
        {
          addTarget(end, (DependencyNode)localObject1, -widget.mListAnchors[1].getMargin());
          addTarget(start, end, -1, dimension);
        }
      }
      else if ((!(localObject1 instanceof Helper)) && (((ConstraintWidget)localObject1).getParent() != null))
      {
        localObject1 = widget.getParent().horizontalRun.start;
        addTarget(start, (DependencyNode)localObject1, widget.getX());
        addTarget(end, start, 1, dimension);
      }
    }
  }
  
  public void applyToWidget()
  {
    DependencyNode localDependencyNode = start;
    if (resolved) {
      widget.setX(value);
    }
  }
  
  public void clear()
  {
    runGroup = null;
    start.clear();
    end.clear();
    dimension.clear();
    resolved = false;
  }
  
  public void reset()
  {
    resolved = false;
    start.clear();
    start.resolved = false;
    end.clear();
    end.resolved = false;
    dimension.resolved = false;
  }
  
  public boolean supportsWrapComputation()
  {
    if (dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
      return widget.mMatchConstraintDefaultWidth == 0;
    }
    return true;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("HorizontalRun ");
    localStringBuilder.append(widget.getDebugName());
    return localStringBuilder.toString();
  }
  
  public void update(Dependency paramDependency)
  {
    int i = 1.$SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType[mRunType.ordinal()];
    Object localObject1;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3)
        {
          localObject1 = widget;
          updateRunCenter(paramDependency, mLeft, mRight, 0);
        }
      }
      else {
        updateRunEnd(paramDependency);
      }
    }
    else {
      updateRunStart(paramDependency);
    }
    float f1;
    float f2;
    label241:
    int j;
    int k;
    if ((!dimension.resolved) && (dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT))
    {
      Object localObject2 = widget;
      i = mMatchConstraintDefaultWidth;
      if (i != 2)
      {
        if (i == 3)
        {
          i = mMatchConstraintDefaultHeight;
          if ((i != 0) && (i != 3))
          {
            i = ((ConstraintWidget)localObject2).getDimensionRatioSide();
            if (i != -1)
            {
              if (i != 0)
              {
                if (i != 1)
                {
                  i = 0;
                  break label241;
                }
                paramDependency = widget;
                f1 = verticalRun.dimension.value;
                f2 = paramDependency.getDimensionRatio();
              }
              else
              {
                paramDependency = widget;
                i = (int)(verticalRun.dimension.value / paramDependency.getDimensionRatio() + 0.5F);
                break label241;
              }
            }
            else
            {
              paramDependency = widget;
              f1 = verticalRun.dimension.value;
              f2 = paramDependency.getDimensionRatio();
            }
            i = (int)(f2 * f1 + 0.5F);
            dimension.resolve(i);
          }
          else
          {
            localObject1 = verticalRun;
            paramDependency = start;
            localObject1 = end;
            if (mLeft.mTarget != null) {
              i = 1;
            } else {
              i = 0;
            }
            if (mTop.mTarget != null) {
              j = 1;
            } else {
              j = 0;
            }
            if (mRight.mTarget != null) {
              k = 1;
            } else {
              k = 0;
            }
            int m;
            if (mBottom.mTarget != null) {
              m = 1;
            } else {
              m = 0;
            }
            int n = ((ConstraintWidget)localObject2).getDimensionRatioSide();
            if ((i != 0) && (j != 0) && (k != 0) && (m != 0))
            {
              f1 = widget.getDimensionRatio();
              int i1;
              int i2;
              int i3;
              int i4;
              if ((resolved) && (resolved))
              {
                localObject2 = start;
                if ((readyToSolve) && (end.readyToSolve))
                {
                  i1 = targets.get(0)).value;
                  j = start.margin;
                  m = end.targets.get(0)).value;
                  k = end.margin;
                  i2 = value;
                  i = margin;
                  i3 = value;
                  i4 = margin;
                  computeInsetRatio(tempDimensions, i1 + j, m - k, i2 + i, i3 - i4, f1, n);
                  dimension.resolve(tempDimensions[0]);
                  widget.verticalRun.dimension.resolve(tempDimensions[1]);
                }
                return;
              }
              localObject2 = start;
              if (resolved)
              {
                DependencyNode localDependencyNode = end;
                if (resolved) {
                  if ((readyToSolve) && (readyToSolve))
                  {
                    m = value;
                    k = margin;
                    i = value;
                    j = margin;
                    i2 = targets.get(0)).value;
                    i3 = margin;
                    i4 = targets.get(0)).value;
                    i1 = margin;
                    computeInsetRatio(tempDimensions, m + k, i - j, i2 + i3, i4 - i1, f1, n);
                    dimension.resolve(tempDimensions[0]);
                    widget.verticalRun.dimension.resolve(tempDimensions[1]);
                  }
                  else
                  {
                    return;
                  }
                }
              }
              localObject2 = start;
              if ((readyToSolve) && (end.readyToSolve) && (readyToSolve) && (readyToSolve))
              {
                j = targets.get(0)).value;
                i = start.margin;
                i3 = end.targets.get(0)).value;
                k = end.margin;
                m = targets.get(0)).value;
                i1 = margin;
                i4 = targets.get(0)).value;
                i2 = margin;
                computeInsetRatio(tempDimensions, j + i, i3 - k, m + i1, i4 - i2, f1, n);
                dimension.resolve(tempDimensions[0]);
                widget.verticalRun.dimension.resolve(tempDimensions[1]);
              }
            }
            else if ((i != 0) && (k != 0))
            {
              if ((start.readyToSolve) && (end.readyToSolve))
              {
                f1 = widget.getDimensionRatio();
                i = start.targets.get(0)).value + start.margin;
                j = end.targets.get(0)).value - end.margin;
                if ((n != -1) && (n != 0))
                {
                  if (n == 1)
                  {
                    i = getLimitedDimension(j - i, 0);
                    k = (int)(i / f1 + 0.5F);
                    j = getLimitedDimension(k, 1);
                    if (k != j) {
                      i = (int)(j * f1 + 0.5F);
                    }
                    dimension.resolve(i);
                    widget.verticalRun.dimension.resolve(j);
                  }
                }
                else
                {
                  i = getLimitedDimension(j - i, 0);
                  k = (int)(i * f1 + 0.5F);
                  j = getLimitedDimension(k, 1);
                  if (k != j) {
                    i = (int)(j / f1 + 0.5F);
                  }
                  dimension.resolve(i);
                  widget.verticalRun.dimension.resolve(j);
                }
              }
            }
            else if ((j != 0) && (m != 0))
            {
              if ((readyToSolve) && (readyToSolve))
              {
                f1 = widget.getDimensionRatio();
                i = targets.get(0)).value + margin;
                j = targets.get(0)).value - margin;
                if (n != -1) {
                  if (n != 0)
                  {
                    if (n != 1) {
                      break label1530;
                    }
                  }
                  else
                  {
                    i = getLimitedDimension(j - i, 1);
                    k = (int)(i * f1 + 0.5F);
                    j = getLimitedDimension(k, 0);
                    if (k != j) {
                      i = (int)(j / f1 + 0.5F);
                    }
                    dimension.resolve(j);
                    widget.verticalRun.dimension.resolve(i);
                    break label1530;
                  }
                }
                i = getLimitedDimension(j - i, 1);
                k = (int)(i / f1 + 0.5F);
                j = getLimitedDimension(k, 0);
                if (k != j) {
                  i = (int)(j * f1 + 0.5F);
                }
                dimension.resolve(j);
                widget.verticalRun.dimension.resolve(i);
              }
            }
          }
        }
      }
      else
      {
        paramDependency = ((ConstraintWidget)localObject2).getParent();
        if (paramDependency != null)
        {
          paramDependency = horizontalRun.dimension;
          if (resolved)
          {
            f1 = widget.mMatchConstraintPercentWidth;
            i = (int)(value * f1 + 0.5F);
            dimension.resolve(i);
          }
        }
      }
    }
    label1530:
    paramDependency = start;
    if (readyToSolve)
    {
      localObject1 = end;
      if (readyToSolve)
      {
        if ((resolved) && (resolved) && (dimension.resolved)) {
          return;
        }
        if ((!dimension.resolved) && (dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT))
        {
          paramDependency = widget;
          if ((mMatchConstraintDefaultWidth == 0) && (!paramDependency.isInHorizontalChain()))
          {
            localObject1 = (DependencyNode)start.targets.get(0);
            paramDependency = (DependencyNode)end.targets.get(0);
            i = value;
            localObject1 = start;
            i += margin;
            j = value + end.margin;
            ((DependencyNode)localObject1).resolve(i);
            end.resolve(j);
            dimension.resolve(j - i);
            return;
          }
        }
        if ((!dimension.resolved) && (dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && (matchConstraintsType == 1) && (start.targets.size() > 0) && (end.targets.size() > 0))
        {
          localObject1 = (DependencyNode)start.targets.get(0);
          paramDependency = (DependencyNode)end.targets.get(0);
          i = value;
          j = start.margin;
          i = Math.min(value + end.margin - (i + j), dimension.wrapValue);
          paramDependency = widget;
          k = mMatchConstraintMaxWidth;
          j = Math.max(mMatchConstraintMinWidth, i);
          i = j;
          if (k > 0) {
            i = Math.min(k, j);
          }
          dimension.resolve(i);
        }
        if (!dimension.resolved) {
          return;
        }
        localObject1 = (DependencyNode)start.targets.get(0);
        paramDependency = (DependencyNode)end.targets.get(0);
        j = value + start.margin;
        i = value + end.margin;
        f1 = widget.getHorizontalBiasPercent();
        if (localObject1 == paramDependency)
        {
          j = value;
          i = value;
          f1 = 0.5F;
        }
        k = dimension.value;
        paramDependency = start;
        f2 = j;
        paramDependency.resolve((int)((i - j - k) * f1 + (f2 + 0.5F)));
        end.resolve(start.value + dimension.value);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
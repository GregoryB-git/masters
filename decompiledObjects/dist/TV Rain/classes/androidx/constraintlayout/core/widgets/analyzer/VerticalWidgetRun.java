package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.Helper;
import java.util.List;
import z2;

public class VerticalWidgetRun
  extends WidgetRun
{
  public DependencyNode baseline;
  public DimensionDependency baselineDimension;
  
  public VerticalWidgetRun(ConstraintWidget paramConstraintWidget)
  {
    super(paramConstraintWidget);
    paramConstraintWidget = new DependencyNode(this);
    baseline = paramConstraintWidget;
    baselineDimension = null;
    start.type = DependencyNode.Type.TOP;
    end.type = DependencyNode.Type.BOTTOM;
    type = DependencyNode.Type.BASELINE;
    orientation = 1;
  }
  
  public void apply()
  {
    Object localObject1 = widget;
    if (measured) {
      dimension.resolve(((ConstraintWidget)localObject1).getHeight());
    }
    int i;
    if (!dimension.resolved)
    {
      dimensionBehavior = widget.getVerticalDimensionBehaviour();
      if (widget.hasBaseline()) {
        baselineDimension = new BaselineDimensionDependency(this);
      }
      localObject1 = dimensionBehavior;
      if (localObject1 != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
      {
        if (localObject1 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT)
        {
          localObject1 = widget.getParent();
          if ((localObject1 != null) && (((ConstraintWidget)localObject1).getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED))
          {
            i = ((ConstraintWidget)localObject1).getHeight();
            int j = widget.mTop.getMargin();
            int k = widget.mBottom.getMargin();
            addTarget(start, verticalRun.start, widget.mTop.getMargin());
            addTarget(end, verticalRun.end, -widget.mBottom.getMargin());
            dimension.resolve(i - j - k);
            return;
          }
        }
        if (dimensionBehavior == ConstraintWidget.DimensionBehaviour.FIXED) {
          dimension.resolve(widget.getHeight());
        }
      }
    }
    else if (dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_PARENT)
    {
      localObject1 = widget.getParent();
      if ((localObject1 != null) && (((ConstraintWidget)localObject1).getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED))
      {
        addTarget(start, verticalRun.start, widget.mTop.getMargin());
        addTarget(end, verticalRun.end, -widget.mBottom.getMargin());
        return;
      }
    }
    Object localObject2 = dimension;
    boolean bool = resolved;
    if (bool)
    {
      localObject1 = widget;
      if (measured)
      {
        localObject2 = mListAnchors;
        localConstraintAnchor1 = localObject2[2];
        localConstraintAnchor2 = mTarget;
        if ((localConstraintAnchor2 != null) && (3mTarget != null))
        {
          if (((ConstraintWidget)localObject1).isInVerticalChain())
          {
            start.margin = widget.mListAnchors[2].getMargin();
            end.margin = (-widget.mListAnchors[3].getMargin());
          }
          else
          {
            localObject1 = getTarget(widget.mListAnchors[2]);
            if (localObject1 != null) {
              addTarget(start, (DependencyNode)localObject1, widget.mListAnchors[2].getMargin());
            }
            localObject1 = getTarget(widget.mListAnchors[3]);
            if (localObject1 != null) {
              addTarget(end, (DependencyNode)localObject1, -widget.mListAnchors[3].getMargin());
            }
            start.delegateToWidgetRun = true;
            end.delegateToWidgetRun = true;
          }
          if (!widget.hasBaseline()) {
            return;
          }
          addTarget(baseline, start, widget.getBaselineDistance());
          return;
        }
        if (localConstraintAnchor2 != null)
        {
          localObject1 = getTarget(localConstraintAnchor1);
          if (localObject1 == null) {
            return;
          }
          addTarget(start, (DependencyNode)localObject1, widget.mListAnchors[2].getMargin());
          addTarget(end, start, dimension.value);
          if (!widget.hasBaseline()) {
            return;
          }
          addTarget(baseline, start, widget.getBaselineDistance());
          return;
        }
        localConstraintAnchor2 = localObject2[3];
        if (mTarget != null)
        {
          localObject1 = getTarget(localConstraintAnchor2);
          if (localObject1 != null)
          {
            addTarget(end, (DependencyNode)localObject1, -widget.mListAnchors[3].getMargin());
            addTarget(start, end, -dimension.value);
          }
          if (!widget.hasBaseline()) {
            return;
          }
          addTarget(baseline, start, widget.getBaselineDistance());
          return;
        }
        localObject2 = localObject2[4];
        if (mTarget != null)
        {
          localObject1 = getTarget((ConstraintAnchor)localObject2);
          if (localObject1 == null) {
            return;
          }
          addTarget(baseline, (DependencyNode)localObject1, 0);
          addTarget(start, baseline, -widget.getBaselineDistance());
          addTarget(end, start, dimension.value);
          return;
        }
        if (((localObject1 instanceof Helper)) || (((ConstraintWidget)localObject1).getParent() == null) || (widget.getAnchor(ConstraintAnchor.Type.CENTER).mTarget != null)) {
          return;
        }
        localObject1 = widget.getParent().verticalRun.start;
        addTarget(start, (DependencyNode)localObject1, widget.getY());
        addTarget(end, start, dimension.value);
        if (!widget.hasBaseline()) {
          return;
        }
        addTarget(baseline, start, widget.getBaselineDistance());
        return;
      }
    }
    if ((!bool) && (dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT))
    {
      localObject1 = widget;
      i = mMatchConstraintDefaultHeight;
      if (i != 2)
      {
        if ((i == 3) && (!((ConstraintWidget)localObject1).isInVerticalChain()))
        {
          localObject1 = widget;
          if (mMatchConstraintDefaultWidth != 3)
          {
            localObject1 = horizontalRun.dimension;
            dimension.targets.add(localObject1);
            dependencies.add(dimension);
            localObject1 = dimension;
            delegateToWidgetRun = true;
            dependencies.add(start);
            dimension.dependencies.add(end);
          }
        }
      }
      else
      {
        localObject1 = ((ConstraintWidget)localObject1).getParent();
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
    else
    {
      ((DependencyNode)localObject2).addDependency(this);
    }
    localObject1 = widget;
    localObject2 = mListAnchors;
    ConstraintAnchor localConstraintAnchor2 = localObject2[2];
    ConstraintAnchor localConstraintAnchor1 = mTarget;
    if ((localConstraintAnchor1 != null) && (3mTarget != null))
    {
      if (((ConstraintWidget)localObject1).isInVerticalChain())
      {
        start.margin = widget.mListAnchors[2].getMargin();
        end.margin = (-widget.mListAnchors[3].getMargin());
      }
      else
      {
        localObject1 = getTarget(widget.mListAnchors[2]);
        localObject2 = getTarget(widget.mListAnchors[3]);
        if (localObject1 != null) {
          ((DependencyNode)localObject1).addDependency(this);
        }
        if (localObject2 != null) {
          ((DependencyNode)localObject2).addDependency(this);
        }
        mRunType = WidgetRun.RunType.CENTER;
      }
      if (widget.hasBaseline()) {
        addTarget(baseline, start, 1, baselineDimension);
      }
    }
    else if (localConstraintAnchor1 != null)
    {
      localObject1 = getTarget(localConstraintAnchor2);
      if (localObject1 != null)
      {
        addTarget(start, (DependencyNode)localObject1, widget.mListAnchors[2].getMargin());
        addTarget(end, start, 1, dimension);
        if (widget.hasBaseline()) {
          addTarget(baseline, start, 1, baselineDimension);
        }
        localObject2 = dimensionBehavior;
        localObject1 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if ((localObject2 == localObject1) && (widget.getDimensionRatio() > 0.0F))
        {
          localObject2 = widget.horizontalRun;
          if (dimensionBehavior == localObject1)
          {
            dimension.dependencies.add(dimension);
            dimension.targets.add(widget.horizontalRun.dimension);
            dimension.updateDelegate = this;
          }
        }
      }
    }
    else
    {
      localConstraintAnchor2 = localObject2[3];
      if (mTarget != null)
      {
        localObject1 = getTarget(localConstraintAnchor2);
        if (localObject1 != null)
        {
          addTarget(end, (DependencyNode)localObject1, -widget.mListAnchors[3].getMargin());
          addTarget(start, end, -1, dimension);
          if (widget.hasBaseline()) {
            addTarget(baseline, start, 1, baselineDimension);
          }
        }
      }
      else
      {
        localObject2 = localObject2[4];
        if (mTarget != null)
        {
          localObject1 = getTarget((ConstraintAnchor)localObject2);
          if (localObject1 != null)
          {
            addTarget(baseline, (DependencyNode)localObject1, 0);
            addTarget(start, baseline, -1, baselineDimension);
            addTarget(end, start, 1, dimension);
          }
        }
        else if ((!(localObject1 instanceof Helper)) && (((ConstraintWidget)localObject1).getParent() != null))
        {
          localObject1 = widget.getParent().verticalRun.start;
          addTarget(start, (DependencyNode)localObject1, widget.getY());
          addTarget(end, start, 1, dimension);
          if (widget.hasBaseline()) {
            addTarget(baseline, start, 1, baselineDimension);
          }
          localObject2 = dimensionBehavior;
          localObject1 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
          if ((localObject2 == localObject1) && (widget.getDimensionRatio() > 0.0F))
          {
            localObject2 = widget.horizontalRun;
            if (dimensionBehavior == localObject1)
            {
              dimension.dependencies.add(dimension);
              dimension.targets.add(widget.horizontalRun.dimension);
              dimension.updateDelegate = this;
            }
          }
        }
      }
    }
    if (dimension.targets.size() == 0) {
      dimension.readyToSolve = true;
    }
  }
  
  public void applyToWidget()
  {
    DependencyNode localDependencyNode = start;
    if (resolved) {
      widget.setY(value);
    }
  }
  
  public void clear()
  {
    runGroup = null;
    start.clear();
    end.clear();
    baseline.clear();
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
    baseline.clear();
    baseline.resolved = false;
    dimension.resolved = false;
  }
  
  public boolean supportsWrapComputation()
  {
    if (dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
      return widget.mMatchConstraintDefaultHeight == 0;
    }
    return true;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("VerticalRun ");
    localStringBuilder.append(widget.getDebugName());
    return localStringBuilder.toString();
  }
  
  public void update(Dependency paramDependency)
  {
    int i = 1.$SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType[mRunType.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3)
        {
          localObject = widget;
          updateRunCenter(paramDependency, mTop, mBottom, 1);
        }
      }
      else {
        updateRunEnd(paramDependency);
      }
    }
    else {
      updateRunStart(paramDependency);
    }
    paramDependency = dimension;
    float f1;
    float f2;
    if ((readyToSolve) && (!resolved) && (dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT))
    {
      paramDependency = widget;
      i = mMatchConstraintDefaultHeight;
      if (i != 2)
      {
        if ((i == 3) && (horizontalRun.dimension.resolved))
        {
          i = paramDependency.getDimensionRatioSide();
          if (i != -1)
          {
            if (i != 0)
            {
              if (i != 1)
              {
                i = 0;
                break label248;
              }
              paramDependency = widget;
              f1 = horizontalRun.dimension.value;
              f2 = paramDependency.getDimensionRatio();
            }
            else
            {
              paramDependency = widget;
              f1 = horizontalRun.dimension.value;
              i = (int)(paramDependency.getDimensionRatio() * f1 + 0.5F);
              break label248;
            }
          }
          else
          {
            paramDependency = widget;
            f1 = horizontalRun.dimension.value;
            f2 = paramDependency.getDimensionRatio();
          }
          i = (int)(f1 / f2 + 0.5F);
          label248:
          dimension.resolve(i);
        }
      }
      else
      {
        paramDependency = paramDependency.getParent();
        if (paramDependency != null)
        {
          paramDependency = verticalRun.dimension;
          if (resolved)
          {
            f1 = widget.mMatchConstraintPercentHeight;
            i = (int)(value * f1 + 0.5F);
            dimension.resolve(i);
          }
        }
      }
    }
    Object localObject = start;
    if (readyToSolve)
    {
      paramDependency = end;
      if (readyToSolve)
      {
        if ((resolved) && (resolved) && (dimension.resolved)) {
          return;
        }
        int j;
        if ((!dimension.resolved) && (dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT))
        {
          paramDependency = widget;
          if ((mMatchConstraintDefaultWidth == 0) && (!paramDependency.isInVerticalChain()))
          {
            localObject = (DependencyNode)start.targets.get(0);
            paramDependency = (DependencyNode)end.targets.get(0);
            i = value;
            localObject = start;
            i += margin;
            j = value + end.margin;
            ((DependencyNode)localObject).resolve(i);
            end.resolve(j);
            dimension.resolve(j - i);
            return;
          }
        }
        if ((!dimension.resolved) && (dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && (matchConstraintsType == 1) && (start.targets.size() > 0) && (end.targets.size() > 0))
        {
          paramDependency = (DependencyNode)start.targets.get(0);
          localObject = (DependencyNode)end.targets.get(0);
          i = value;
          j = start.margin;
          j = value + end.margin - (i + j);
          paramDependency = dimension;
          i = wrapValue;
          if (j < i) {
            paramDependency.resolve(j);
          } else {
            paramDependency.resolve(i);
          }
        }
        if (!dimension.resolved) {
          return;
        }
        if ((start.targets.size() > 0) && (end.targets.size() > 0))
        {
          paramDependency = (DependencyNode)start.targets.get(0);
          localObject = (DependencyNode)end.targets.get(0);
          j = value + start.margin;
          i = value + end.margin;
          f1 = widget.getVerticalBiasPercent();
          if (paramDependency == localObject)
          {
            j = value;
            i = value;
            f1 = 0.5F;
          }
          int k = dimension.value;
          paramDependency = start;
          f2 = j;
          paramDependency.resolve((int)((i - j - k) * f1 + (f2 + 0.5F)));
          end.resolve(start.value + dimension.value);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
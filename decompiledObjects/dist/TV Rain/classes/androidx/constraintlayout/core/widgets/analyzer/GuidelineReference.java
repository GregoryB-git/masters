package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;
import java.util.List;

class GuidelineReference
  extends WidgetRun
{
  public GuidelineReference(ConstraintWidget paramConstraintWidget)
  {
    super(paramConstraintWidget);
    horizontalRun.clear();
    verticalRun.clear();
    orientation = ((Guideline)paramConstraintWidget).getOrientation();
  }
  
  private void addDependency(DependencyNode paramDependencyNode)
  {
    start.dependencies.add(paramDependencyNode);
    targets.add(start);
  }
  
  public void apply()
  {
    Object localObject = (Guideline)widget;
    int i = ((Guideline)localObject).getRelativeBegin();
    int j = ((Guideline)localObject).getRelativeEnd();
    ((Guideline)localObject).getRelativePercent();
    if (((Guideline)localObject).getOrientation() == 1)
    {
      if (i != -1)
      {
        start.targets.add(widget.mParent.horizontalRun.start);
        widget.mParent.horizontalRun.start.dependencies.add(start);
        start.margin = i;
      }
      else if (j != -1)
      {
        start.targets.add(widget.mParent.horizontalRun.end);
        widget.mParent.horizontalRun.end.dependencies.add(start);
        start.margin = (-j);
      }
      else
      {
        localObject = start;
        delegateToWidgetRun = true;
        targets.add(widget.mParent.horizontalRun.end);
        widget.mParent.horizontalRun.end.dependencies.add(start);
      }
      addDependency(widget.horizontalRun.start);
      addDependency(widget.horizontalRun.end);
    }
    else
    {
      if (i != -1)
      {
        start.targets.add(widget.mParent.verticalRun.start);
        widget.mParent.verticalRun.start.dependencies.add(start);
        start.margin = i;
      }
      else if (j != -1)
      {
        start.targets.add(widget.mParent.verticalRun.end);
        widget.mParent.verticalRun.end.dependencies.add(start);
        start.margin = (-j);
      }
      else
      {
        localObject = start;
        delegateToWidgetRun = true;
        targets.add(widget.mParent.verticalRun.end);
        widget.mParent.verticalRun.end.dependencies.add(start);
      }
      addDependency(widget.verticalRun.start);
      addDependency(widget.verticalRun.end);
    }
  }
  
  public void applyToWidget()
  {
    if (((Guideline)widget).getOrientation() == 1) {
      widget.setX(start.value);
    } else {
      widget.setY(start.value);
    }
  }
  
  public void clear()
  {
    start.clear();
  }
  
  public void reset()
  {
    start.resolved = false;
    end.resolved = false;
  }
  
  public boolean supportsWrapComputation()
  {
    return false;
  }
  
  public void update(Dependency paramDependency)
  {
    paramDependency = start;
    if (!readyToSolve) {
      return;
    }
    if (resolved) {
      return;
    }
    paramDependency = (DependencyNode)targets.get(0);
    Guideline localGuideline = (Guideline)widget;
    float f = value;
    int i = (int)(localGuideline.getRelativePercent() * f + 0.5F);
    start.resolve(i);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.GuidelineReference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
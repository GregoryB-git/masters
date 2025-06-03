package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

class BaselineDimensionDependency
  extends DimensionDependency
{
  public BaselineDimensionDependency(WidgetRun paramWidgetRun)
  {
    super(paramWidgetRun);
  }
  
  public void update(DependencyNode paramDependencyNode)
  {
    paramDependencyNode = run;
    baseline.margin = widget.getBaselineDistance();
    resolved = true;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.BaselineDimensionDependency
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.Iterator;
import java.util.List;

class HelperReferences
  extends WidgetRun
{
  public HelperReferences(ConstraintWidget paramConstraintWidget)
  {
    super(paramConstraintWidget);
  }
  
  private void addDependency(DependencyNode paramDependencyNode)
  {
    start.dependencies.add(paramDependencyNode);
    targets.add(start);
  }
  
  public void apply()
  {
    Object localObject1 = widget;
    if ((localObject1 instanceof Barrier))
    {
      start.delegateToWidgetRun = true;
      localObject1 = (Barrier)localObject1;
      int i = ((Barrier)localObject1).getBarrierType();
      boolean bool = ((Barrier)localObject1).getAllowsGoneWidget();
      int j = 0;
      int k = 0;
      int m = 0;
      int n = 0;
      Object localObject2;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i == 3)
            {
              start.type = DependencyNode.Type.BOTTOM;
              while (n < mWidgetsCount)
              {
                localObject2 = mWidgets[n];
                if ((bool) || (((ConstraintWidget)localObject2).getVisibility() != 8))
                {
                  localObject2 = verticalRun.end;
                  dependencies.add(start);
                  start.targets.add(localObject2);
                }
                n++;
              }
              addDependency(widget.verticalRun.start);
              addDependency(widget.verticalRun.end);
            }
          }
          else
          {
            start.type = DependencyNode.Type.TOP;
            for (n = j; n < mWidgetsCount; n++)
            {
              localObject2 = mWidgets[n];
              if ((bool) || (((ConstraintWidget)localObject2).getVisibility() != 8))
              {
                localObject2 = verticalRun.start;
                dependencies.add(start);
                start.targets.add(localObject2);
              }
            }
            addDependency(widget.verticalRun.start);
            addDependency(widget.verticalRun.end);
          }
        }
        else
        {
          start.type = DependencyNode.Type.RIGHT;
          for (n = k; n < mWidgetsCount; n++)
          {
            localObject2 = mWidgets[n];
            if ((bool) || (((ConstraintWidget)localObject2).getVisibility() != 8))
            {
              localObject2 = horizontalRun.end;
              dependencies.add(start);
              start.targets.add(localObject2);
            }
          }
          addDependency(widget.horizontalRun.start);
          addDependency(widget.horizontalRun.end);
        }
      }
      else
      {
        start.type = DependencyNode.Type.LEFT;
        for (n = m; n < mWidgetsCount; n++)
        {
          localObject2 = mWidgets[n];
          if ((bool) || (((ConstraintWidget)localObject2).getVisibility() != 8))
          {
            localObject2 = horizontalRun.start;
            dependencies.add(start);
            start.targets.add(localObject2);
          }
        }
        addDependency(widget.horizontalRun.start);
        addDependency(widget.horizontalRun.end);
      }
    }
  }
  
  public void applyToWidget()
  {
    ConstraintWidget localConstraintWidget = widget;
    if ((localConstraintWidget instanceof Barrier))
    {
      int i = ((Barrier)localConstraintWidget).getBarrierType();
      if ((i != 0) && (i != 1)) {
        widget.setY(start.value);
      } else {
        widget.setX(start.value);
      }
    }
  }
  
  public void clear()
  {
    runGroup = null;
    start.clear();
  }
  
  public void reset()
  {
    start.resolved = false;
  }
  
  public boolean supportsWrapComputation()
  {
    return false;
  }
  
  public void update(Dependency paramDependency)
  {
    Barrier localBarrier = (Barrier)widget;
    int i = localBarrier.getBarrierType();
    paramDependency = start.targets.iterator();
    int j = 0;
    int k = -1;
    while (paramDependency.hasNext())
    {
      int m = nextvalue;
      int n;
      if (k != -1)
      {
        n = k;
        if (m >= k) {}
      }
      else
      {
        n = m;
      }
      k = n;
      if (j < m)
      {
        j = m;
        k = n;
      }
    }
    if ((i != 0) && (i != 2)) {
      start.resolve(localBarrier.getMargin() + j);
    } else {
      start.resolve(localBarrier.getMargin() + k);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.HelperReferences
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
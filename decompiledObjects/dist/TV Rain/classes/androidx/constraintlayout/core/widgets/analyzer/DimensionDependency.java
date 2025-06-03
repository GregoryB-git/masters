package androidx.constraintlayout.core.widgets.analyzer;

import java.util.Iterator;
import java.util.List;

class DimensionDependency
  extends DependencyNode
{
  public int wrapValue;
  
  public DimensionDependency(WidgetRun paramWidgetRun)
  {
    super(paramWidgetRun);
    if ((paramWidgetRun instanceof HorizontalWidgetRun)) {
      type = DependencyNode.Type.HORIZONTAL_DIMENSION;
    } else {
      type = DependencyNode.Type.VERTICAL_DIMENSION;
    }
  }
  
  public void resolve(int paramInt)
  {
    if (resolved) {
      return;
    }
    resolved = true;
    value = paramInt;
    Iterator localIterator = dependencies.iterator();
    while (localIterator.hasNext())
    {
      Dependency localDependency = (Dependency)localIterator.next();
      localDependency.update(localDependency);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.DimensionDependency
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
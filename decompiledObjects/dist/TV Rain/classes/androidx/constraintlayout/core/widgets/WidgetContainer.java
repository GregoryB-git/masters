package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import java.util.ArrayList;

public class WidgetContainer
  extends ConstraintWidget
{
  public ArrayList<ConstraintWidget> mChildren = new ArrayList();
  
  public WidgetContainer() {}
  
  public WidgetContainer(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public WidgetContainer(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void add(ConstraintWidget paramConstraintWidget)
  {
    mChildren.add(paramConstraintWidget);
    if (paramConstraintWidget.getParent() != null) {
      ((WidgetContainer)paramConstraintWidget.getParent()).remove(paramConstraintWidget);
    }
    paramConstraintWidget.setParent(this);
  }
  
  public void add(ConstraintWidget... paramVarArgs)
  {
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++) {
      add(paramVarArgs[j]);
    }
  }
  
  public ArrayList<ConstraintWidget> getChildren()
  {
    return mChildren;
  }
  
  public ConstraintWidgetContainer getRootConstraintContainer()
  {
    Object localObject = getParent();
    ConstraintWidgetContainer localConstraintWidgetContainer;
    if ((this instanceof ConstraintWidgetContainer)) {
      localConstraintWidgetContainer = (ConstraintWidgetContainer)this;
    } else {
      localConstraintWidgetContainer = null;
    }
    while (localObject != null)
    {
      ConstraintWidget localConstraintWidget = ((ConstraintWidget)localObject).getParent();
      if ((localObject instanceof ConstraintWidgetContainer)) {
        localConstraintWidgetContainer = (ConstraintWidgetContainer)localObject;
      }
      localObject = localConstraintWidget;
    }
    return localConstraintWidgetContainer;
  }
  
  public void layout()
  {
    Object localObject = mChildren;
    if (localObject == null) {
      return;
    }
    int i = ((ArrayList)localObject).size();
    for (int j = 0; j < i; j++)
    {
      localObject = (ConstraintWidget)mChildren.get(j);
      if ((localObject instanceof WidgetContainer)) {
        ((WidgetContainer)localObject).layout();
      }
    }
  }
  
  public void remove(ConstraintWidget paramConstraintWidget)
  {
    mChildren.remove(paramConstraintWidget);
    paramConstraintWidget.reset();
  }
  
  public void removeAllChildren()
  {
    mChildren.clear();
  }
  
  public void reset()
  {
    mChildren.clear();
    super.reset();
  }
  
  public void resetSolverVariables(Cache paramCache)
  {
    super.resetSolverVariables(paramCache);
    int i = mChildren.size();
    for (int j = 0; j < i; j++) {
      ((ConstraintWidget)mChildren.get(j)).resetSolverVariables(paramCache);
    }
  }
  
  public void setOffset(int paramInt1, int paramInt2)
  {
    super.setOffset(paramInt1, paramInt2);
    paramInt2 = mChildren.size();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
      ((ConstraintWidget)mChildren.get(paramInt1)).setOffset(getRootX(), getRootY());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.WidgetContainer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
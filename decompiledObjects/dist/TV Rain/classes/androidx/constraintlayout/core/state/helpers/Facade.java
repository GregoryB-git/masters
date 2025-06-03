package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

public abstract interface Facade
{
  public abstract void apply();
  
  public abstract ConstraintWidget getConstraintWidget();
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.helpers.Facade
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
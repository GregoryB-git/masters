package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.Collections;

public class HelperReference
  extends ConstraintReference
  implements Facade
{
  private HelperWidget mHelperWidget;
  public ArrayList<Object> mReferences = new ArrayList();
  public final State mState;
  public final State.Helper mType;
  
  public HelperReference(State paramState, State.Helper paramHelper)
  {
    super(paramState);
    mState = paramState;
    mType = paramHelper;
  }
  
  public HelperReference add(Object... paramVarArgs)
  {
    Collections.addAll(mReferences, paramVarArgs);
    return this;
  }
  
  public void apply() {}
  
  public ConstraintWidget getConstraintWidget()
  {
    return getHelperWidget();
  }
  
  public HelperWidget getHelperWidget()
  {
    return mHelperWidget;
  }
  
  public State.Helper getType()
  {
    return mType;
  }
  
  public void setHelperWidget(HelperWidget paramHelperWidget)
  {
    mHelperWidget = paramHelperWidget;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.HelperReference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.State.Direction;
import androidx.constraintlayout.core.state.State.Helper;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.HelperWidget;

public class BarrierReference
  extends HelperReference
{
  private Barrier mBarrierWidget;
  private State.Direction mDirection;
  private int mMargin;
  
  public BarrierReference(State paramState)
  {
    super(paramState, State.Helper.BARRIER);
  }
  
  public void apply()
  {
    getHelperWidget();
    int i = 1.$SwitchMap$androidx$constraintlayout$core$state$State$Direction[mDirection.ordinal()];
    int j = 3;
    if ((i != 3) && (i != 4))
    {
      if (i != 5)
      {
        if (i != 6) {
          j = 0;
        }
      }
      else {
        j = 2;
      }
    }
    else {
      j = 1;
    }
    mBarrierWidget.setBarrierType(j);
    mBarrierWidget.setMargin(mMargin);
  }
  
  public HelperWidget getHelperWidget()
  {
    if (mBarrierWidget == null) {
      mBarrierWidget = new Barrier();
    }
    return mBarrierWidget;
  }
  
  public ConstraintReference margin(int paramInt)
  {
    mMargin = paramInt;
    return this;
  }
  
  public ConstraintReference margin(Object paramObject)
  {
    margin(mState.convertDimension(paramObject));
    return this;
  }
  
  public void setBarrierDirection(State.Direction paramDirection)
  {
    mDirection = paramDirection;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.helpers.BarrierReference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
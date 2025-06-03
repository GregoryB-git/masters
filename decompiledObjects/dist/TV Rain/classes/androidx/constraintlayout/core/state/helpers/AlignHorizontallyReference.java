package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.State.Helper;
import java.util.ArrayList;
import java.util.Iterator;

public class AlignHorizontallyReference
  extends HelperReference
{
  private float mBias = 0.5F;
  
  public AlignHorizontallyReference(State paramState)
  {
    super(paramState, State.Helper.ALIGN_VERTICALLY);
  }
  
  public void apply()
  {
    Iterator localIterator = mReferences.iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = localIterator.next();
      localObject1 = mState.constraints(localObject1);
      ((ConstraintReference)localObject1).clearHorizontal();
      Object localObject2 = mStartToStart;
      if (localObject2 != null)
      {
        ((ConstraintReference)localObject1).startToStart(localObject2);
      }
      else
      {
        localObject2 = mStartToEnd;
        if (localObject2 != null) {
          ((ConstraintReference)localObject1).startToEnd(localObject2);
        } else {
          ((ConstraintReference)localObject1).startToStart(State.PARENT);
        }
      }
      localObject2 = mEndToStart;
      if (localObject2 != null)
      {
        ((ConstraintReference)localObject1).endToStart(localObject2);
      }
      else
      {
        localObject2 = mEndToEnd;
        if (localObject2 != null) {
          ((ConstraintReference)localObject1).endToEnd(localObject2);
        } else {
          ((ConstraintReference)localObject1).endToEnd(State.PARENT);
        }
      }
      float f = mBias;
      if (f != 0.5F) {
        ((ConstraintReference)localObject1).horizontalBias(f);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
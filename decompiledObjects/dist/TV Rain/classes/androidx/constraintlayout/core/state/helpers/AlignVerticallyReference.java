package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.State.Helper;
import java.util.ArrayList;
import java.util.Iterator;

public class AlignVerticallyReference
  extends HelperReference
{
  private float mBias = 0.5F;
  
  public AlignVerticallyReference(State paramState)
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
      ((ConstraintReference)localObject1).clearVertical();
      Object localObject2 = mTopToTop;
      if (localObject2 != null)
      {
        ((ConstraintReference)localObject1).topToTop(localObject2);
      }
      else
      {
        localObject2 = mTopToBottom;
        if (localObject2 != null) {
          ((ConstraintReference)localObject1).topToBottom(localObject2);
        } else {
          ((ConstraintReference)localObject1).topToTop(State.PARENT);
        }
      }
      localObject2 = mBottomToTop;
      if (localObject2 != null)
      {
        ((ConstraintReference)localObject1).bottomToTop(localObject2);
      }
      else
      {
        localObject2 = mBottomToBottom;
        if (localObject2 != null) {
          ((ConstraintReference)localObject1).bottomToBottom(localObject2);
        } else {
          ((ConstraintReference)localObject1).bottomToBottom(State.PARENT);
        }
      }
      float f = mBias;
      if (f != 0.5F) {
        ((ConstraintReference)localObject1).verticalBias(f);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.helpers.AlignVerticallyReference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
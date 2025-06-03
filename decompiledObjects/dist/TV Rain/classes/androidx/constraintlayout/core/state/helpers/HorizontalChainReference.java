package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.State.Helper;
import java.util.ArrayList;
import java.util.Iterator;

public class HorizontalChainReference
  extends ChainReference
{
  public HorizontalChainReference(State paramState)
  {
    super(paramState, State.Helper.HORIZONTAL_CHAIN);
  }
  
  public void apply()
  {
    Object localObject1 = mReferences.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      mState.constraints(localObject2).clearHorizontal();
    }
    Iterator localIterator = mReferences.iterator();
    localObject1 = null;
    Object localObject3;
    Object localObject4;
    for (Object localObject2 = null; localIterator.hasNext(); localObject2 = localObject4)
    {
      localObject3 = localIterator.next();
      localObject3 = mState.constraints(localObject3);
      localObject4 = localObject2;
      if (localObject2 == null)
      {
        localObject2 = mStartToStart;
        if (localObject2 != null)
        {
          ((ConstraintReference)localObject3).startToStart(localObject2).margin(mMarginStart).marginGone(mMarginStartGone);
        }
        else
        {
          localObject2 = mStartToEnd;
          if (localObject2 != null)
          {
            ((ConstraintReference)localObject3).startToEnd(localObject2).margin(mMarginStart).marginGone(mMarginStartGone);
          }
          else
          {
            localObject2 = mLeftToLeft;
            if (localObject2 != null)
            {
              ((ConstraintReference)localObject3).startToStart(localObject2).margin(mMarginLeft).marginGone(mMarginLeftGone);
            }
            else
            {
              localObject2 = mLeftToRight;
              if (localObject2 != null) {
                ((ConstraintReference)localObject3).startToEnd(localObject2).margin(mMarginLeft).marginGone(mMarginLeftGone);
              } else {
                ((ConstraintReference)localObject3).startToStart(State.PARENT);
              }
            }
          }
        }
        localObject4 = localObject3;
      }
      if (localObject1 != null)
      {
        ((ConstraintReference)localObject1).endToStart(((ConstraintReference)localObject3).getKey());
        ((ConstraintReference)localObject3).startToEnd(((ConstraintReference)localObject1).getKey());
      }
      localObject1 = localObject3;
    }
    if (localObject1 != null)
    {
      localObject3 = mEndToStart;
      if (localObject3 != null)
      {
        ((ConstraintReference)localObject1).endToStart(localObject3).margin(mMarginEnd).marginGone(mMarginEndGone);
      }
      else
      {
        localObject3 = mEndToEnd;
        if (localObject3 != null)
        {
          ((ConstraintReference)localObject1).endToEnd(localObject3).margin(mMarginEnd).marginGone(mMarginEndGone);
        }
        else
        {
          localObject3 = mRightToLeft;
          if (localObject3 != null)
          {
            ((ConstraintReference)localObject1).endToStart(localObject3).margin(mMarginRight).marginGone(mMarginRightGone);
          }
          else
          {
            localObject3 = mRightToRight;
            if (localObject3 != null) {
              ((ConstraintReference)localObject1).endToEnd(localObject3).margin(mMarginRight).marginGone(mMarginRightGone);
            } else {
              ((ConstraintReference)localObject1).endToEnd(State.PARENT);
            }
          }
        }
      }
    }
    if (localObject2 == null) {
      return;
    }
    float f = mBias;
    if (f != 0.5F) {
      ((ConstraintReference)localObject2).horizontalBias(f);
    }
    int i = 1.$SwitchMap$androidx$constraintlayout$core$state$State$Chain[mStyle.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          ((ConstraintReference)localObject2).setHorizontalChainStyle(2);
        }
      }
      else {
        ((ConstraintReference)localObject2).setHorizontalChainStyle(1);
      }
    }
    else {
      ((ConstraintReference)localObject2).setHorizontalChainStyle(0);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.helpers.HorizontalChainReference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
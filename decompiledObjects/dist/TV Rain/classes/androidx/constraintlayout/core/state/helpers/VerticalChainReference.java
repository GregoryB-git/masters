package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.State.Helper;
import java.util.ArrayList;
import java.util.Iterator;

public class VerticalChainReference
  extends ChainReference
{
  public VerticalChainReference(State paramState)
  {
    super(paramState, State.Helper.VERTICAL_CHAIN);
  }
  
  public void apply()
  {
    Object localObject1 = mReferences.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      mState.constraints(localObject2).clearVertical();
    }
    Iterator localIterator = mReferences.iterator();
    Object localObject2 = null;
    Object localObject3;
    Object localObject4;
    for (localObject1 = null; localIterator.hasNext(); localObject1 = localObject4)
    {
      localObject3 = localIterator.next();
      localObject3 = mState.constraints(localObject3);
      localObject4 = localObject1;
      if (localObject1 == null)
      {
        localObject1 = mTopToTop;
        if (localObject1 != null)
        {
          ((ConstraintReference)localObject3).topToTop(localObject1).margin(mMarginTop).marginGone(mMarginTopGone);
        }
        else
        {
          localObject1 = mTopToBottom;
          if (localObject1 != null) {
            ((ConstraintReference)localObject3).topToBottom(localObject1).margin(mMarginTop).marginGone(mMarginTopGone);
          } else {
            ((ConstraintReference)localObject3).topToTop(State.PARENT);
          }
        }
        localObject4 = localObject3;
      }
      if (localObject2 != null)
      {
        ((ConstraintReference)localObject2).bottomToTop(((ConstraintReference)localObject3).getKey());
        ((ConstraintReference)localObject3).topToBottom(((ConstraintReference)localObject2).getKey());
      }
      localObject2 = localObject3;
    }
    if (localObject2 != null)
    {
      localObject3 = mBottomToTop;
      if (localObject3 != null)
      {
        ((ConstraintReference)localObject2).bottomToTop(localObject3).margin(mMarginBottom).marginGone(mMarginBottomGone);
      }
      else
      {
        localObject3 = mBottomToBottom;
        if (localObject3 != null) {
          ((ConstraintReference)localObject2).bottomToBottom(localObject3).margin(mMarginBottom).marginGone(mMarginBottomGone);
        } else {
          ((ConstraintReference)localObject2).bottomToBottom(State.PARENT);
        }
      }
    }
    if (localObject1 == null) {
      return;
    }
    float f = mBias;
    if (f != 0.5F) {
      ((ConstraintReference)localObject1).verticalBias(f);
    }
    int i = 1.$SwitchMap$androidx$constraintlayout$core$state$State$Chain[mStyle.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          ((ConstraintReference)localObject1).setVerticalChainStyle(2);
        }
      }
      else {
        ((ConstraintReference)localObject1).setVerticalChainStyle(1);
      }
    }
    else {
      ((ConstraintReference)localObject1).setVerticalChainStyle(0);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.helpers.VerticalChainReference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
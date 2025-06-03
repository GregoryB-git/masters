package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.State.Chain;
import androidx.constraintlayout.core.state.State.Helper;

public class ChainReference
  extends HelperReference
{
  public float mBias = 0.5F;
  public State.Chain mStyle = State.Chain.SPREAD;
  
  public ChainReference(State paramState, State.Helper paramHelper)
  {
    super(paramState, paramHelper);
  }
  
  public ChainReference bias(float paramFloat)
  {
    mBias = paramFloat;
    return this;
  }
  
  public float getBias()
  {
    return mBias;
  }
  
  public State.Chain getStyle()
  {
    return State.Chain.SPREAD;
  }
  
  public ChainReference style(State.Chain paramChain)
  {
    mStyle = paramChain;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.helpers.ChainReference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
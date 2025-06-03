package androidx.transition;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

class TransitionManager$MultiListener$1
  extends TransitionListenerAdapter
{
  public TransitionManager$MultiListener$1(TransitionManager.MultiListener paramMultiListener, ArrayMap paramArrayMap) {}
  
  public void onTransitionEnd(@NonNull Transition paramTransition)
  {
    ((ArrayList)val$runningTransitions.get(this$0.mSceneRoot)).remove(paramTransition);
    paramTransition.removeListener(this);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.TransitionManager.MultiListener.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
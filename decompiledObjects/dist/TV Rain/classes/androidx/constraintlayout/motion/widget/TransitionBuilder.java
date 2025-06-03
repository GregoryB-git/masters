package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.widget.ConstraintSet;
import java.util.ArrayList;

public class TransitionBuilder
{
  private static final String TAG = "TransitionBuilder";
  
  public static MotionScene.Transition buildTransition(MotionScene paramMotionScene, int paramInt1, int paramInt2, ConstraintSet paramConstraintSet1, int paramInt3, ConstraintSet paramConstraintSet2)
  {
    MotionScene.Transition localTransition = new MotionScene.Transition(paramInt1, paramMotionScene, paramInt2, paramInt3);
    updateConstraintSetInMotionScene(paramMotionScene, localTransition, paramConstraintSet1, paramConstraintSet2);
    return localTransition;
  }
  
  private static void updateConstraintSetInMotionScene(MotionScene paramMotionScene, MotionScene.Transition paramTransition, ConstraintSet paramConstraintSet1, ConstraintSet paramConstraintSet2)
  {
    int i = paramTransition.getStartConstraintSetId();
    int j = paramTransition.getEndConstraintSetId();
    paramMotionScene.setConstraintSet(i, paramConstraintSet1);
    paramMotionScene.setConstraintSet(j, paramConstraintSet2);
  }
  
  public static void validate(MotionLayout paramMotionLayout)
  {
    MotionScene localMotionScene = mScene;
    if (localMotionScene != null)
    {
      if (localMotionScene.validateLayout(paramMotionLayout))
      {
        if ((mCurrentTransition != null) && (!localMotionScene.getDefinedTransitions().isEmpty())) {
          return;
        }
        throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
      }
      throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
    }
    throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.TransitionBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.SharedValues.SharedValuesListener;

class ViewTransitionController$1
  implements SharedValues.SharedValuesListener
{
  public ViewTransitionController$1(ViewTransitionController paramViewTransitionController, ViewTransition paramViewTransition, int paramInt1, boolean paramBoolean, int paramInt2) {}
  
  public void onNewValue(int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt3 = val$viewTransition.getSharedValueCurrent();
    val$viewTransition.setSharedValueCurrent(paramInt2);
    if ((val$listen_for_id == paramInt1) && (paramInt3 != paramInt2))
    {
      Object localObject1;
      Object localObject2;
      Object localObject3;
      ViewTransitionController localViewTransitionController;
      if (val$isSet)
      {
        if (val$listen_for_value == paramInt2)
        {
          paramInt2 = ViewTransitionController.access$000(this$0).getChildCount();
          for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
          {
            localObject1 = ViewTransitionController.access$000(this$0).getChildAt(paramInt1);
            if (val$viewTransition.matchesView((View)localObject1))
            {
              paramInt3 = ViewTransitionController.access$000(this$0).getCurrentState();
              localObject2 = ViewTransitionController.access$000(this$0).getConstraintSet(paramInt3);
              localObject3 = val$viewTransition;
              localViewTransitionController = this$0;
              ((ViewTransition)localObject3).applyTransition(localViewTransitionController, ViewTransitionController.access$000(localViewTransitionController), paramInt3, (ConstraintSet)localObject2, new View[] { localObject1 });
            }
          }
        }
      }
      else if (val$listen_for_value != paramInt2)
      {
        paramInt2 = ViewTransitionController.access$000(this$0).getChildCount();
        for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
        {
          localObject3 = ViewTransitionController.access$000(this$0).getChildAt(paramInt1);
          if (val$viewTransition.matchesView((View)localObject3))
          {
            paramInt3 = ViewTransitionController.access$000(this$0).getCurrentState();
            localObject1 = ViewTransitionController.access$000(this$0).getConstraintSet(paramInt3);
            localObject2 = val$viewTransition;
            localViewTransitionController = this$0;
            ((ViewTransition)localObject2).applyTransition(localViewTransitionController, ViewTransitionController.access$000(localViewTransitionController), paramInt3, (ConstraintSet)localObject1, new View[] { localObject3 });
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.ViewTransitionController.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.fragment.app;

import a;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

 enum SpecialEffectsController$Operation$State
{
  static
  {
    State localState1 = new State("REMOVED", 0);
    REMOVED = localState1;
    State localState2 = new State("VISIBLE", 1);
    VISIBLE = localState2;
    State localState3 = new State("GONE", 2);
    GONE = localState3;
    State localState4 = new State("INVISIBLE", 3);
    INVISIBLE = localState4;
    $VALUES = new State[] { localState1, localState2, localState3, localState4 };
  }
  
  private SpecialEffectsController$Operation$State() {}
  
  @NonNull
  public static State from(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 4)
      {
        if (paramInt == 8) {
          return GONE;
        }
        throw new IllegalArgumentException(a.f("Unknown visibility ", paramInt));
      }
      return INVISIBLE;
    }
    return VISIBLE;
  }
  
  @NonNull
  public static State from(@NonNull View paramView)
  {
    if ((paramView.getAlpha() == 0.0F) && (paramView.getVisibility() == 0)) {
      return INVISIBLE;
    }
    return from(paramView.getVisibility());
  }
  
  public void applyState(@NonNull View paramView)
  {
    int i = SpecialEffectsController.3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[ordinal()];
    StringBuilder localStringBuilder;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i == 4)
          {
            if (FragmentManager.isLoggingEnabled(2))
            {
              localStringBuilder = new StringBuilder();
              localStringBuilder.append("SpecialEffectsController: Setting view ");
              localStringBuilder.append(paramView);
              localStringBuilder.append(" to INVISIBLE");
              Log.v("FragmentManager", localStringBuilder.toString());
            }
            paramView.setVisibility(4);
          }
        }
        else
        {
          if (FragmentManager.isLoggingEnabled(2))
          {
            localStringBuilder = new StringBuilder();
            localStringBuilder.append("SpecialEffectsController: Setting view ");
            localStringBuilder.append(paramView);
            localStringBuilder.append(" to GONE");
            Log.v("FragmentManager", localStringBuilder.toString());
          }
          paramView.setVisibility(8);
        }
      }
      else
      {
        if (FragmentManager.isLoggingEnabled(2))
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("SpecialEffectsController: Setting view ");
          localStringBuilder.append(paramView);
          localStringBuilder.append(" to VISIBLE");
          Log.v("FragmentManager", localStringBuilder.toString());
        }
        paramView.setVisibility(0);
      }
    }
    else
    {
      ViewGroup localViewGroup = (ViewGroup)paramView.getParent();
      if (localViewGroup != null)
      {
        if (FragmentManager.isLoggingEnabled(2))
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("SpecialEffectsController: Removing view ");
          localStringBuilder.append(paramView);
          localStringBuilder.append(" from container ");
          localStringBuilder.append(localViewGroup);
          Log.v("FragmentManager", localStringBuilder.toString());
        }
        localViewGroup.removeView(paramView);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.SpecialEffectsController.Operation.State
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
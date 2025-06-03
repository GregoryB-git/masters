package androidx.core.view.accessibility;

import android.os.BaseBundle;

public final class AccessibilityViewCommand$SetSelectionArguments
  extends AccessibilityViewCommand.CommandArguments
{
  public int getEnd()
  {
    return mBundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
  }
  
  public int getStart()
  {
    return mBundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT");
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityViewCommand.SetSelectionArguments
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.core.view.accessibility;

import android.os.BaseBundle;

public final class AccessibilityViewCommand$MoveAtGranularityArguments
  extends AccessibilityViewCommand.CommandArguments
{
  public boolean getExtendSelection()
  {
    return mBundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
  }
  
  public int getGranularity()
  {
    return mBundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityViewCommand.MoveAtGranularityArguments
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
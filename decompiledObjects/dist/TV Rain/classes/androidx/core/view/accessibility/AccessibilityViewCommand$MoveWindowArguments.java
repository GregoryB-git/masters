package androidx.core.view.accessibility;

import android.os.BaseBundle;

public final class AccessibilityViewCommand$MoveWindowArguments
  extends AccessibilityViewCommand.CommandArguments
{
  public int getX()
  {
    return mBundle.getInt("ACTION_ARGUMENT_MOVE_WINDOW_X");
  }
  
  public int getY()
  {
    return mBundle.getInt("ACTION_ARGUMENT_MOVE_WINDOW_Y");
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityViewCommand.MoveWindowArguments
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
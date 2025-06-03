package androidx.core.view.accessibility;

import android.os.BaseBundle;

public final class AccessibilityViewCommand$ScrollToPositionArguments
  extends AccessibilityViewCommand.CommandArguments
{
  public int getColumn()
  {
    return mBundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT");
  }
  
  public int getRow()
  {
    return mBundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT");
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityViewCommand.ScrollToPositionArguments
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
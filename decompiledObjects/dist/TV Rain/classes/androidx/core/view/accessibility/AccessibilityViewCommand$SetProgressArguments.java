package androidx.core.view.accessibility;

import android.os.Bundle;

public final class AccessibilityViewCommand$SetProgressArguments
  extends AccessibilityViewCommand.CommandArguments
{
  public float getProgress()
  {
    return mBundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityViewCommand.SetProgressArguments
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
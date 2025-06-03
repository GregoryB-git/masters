package androidx.core.view.accessibility;

import android.os.Bundle;
import androidx.annotation.Nullable;

public final class AccessibilityViewCommand$SetTextArguments
  extends AccessibilityViewCommand.CommandArguments
{
  @Nullable
  public CharSequence getText()
  {
    return mBundle.getCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityViewCommand.SetTextArguments
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.core.view.inputmethod;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

class InputConnectionCompat$2
  extends InputConnectionWrapper
{
  public InputConnectionCompat$2(InputConnection paramInputConnection, boolean paramBoolean, InputConnectionCompat.OnCommitContentListener paramOnCommitContentListener)
  {
    super(paramInputConnection, paramBoolean);
  }
  
  public boolean performPrivateCommand(String paramString, Bundle paramBundle)
  {
    if (InputConnectionCompat.handlePerformPrivateCommand(paramString, paramBundle, val$listener)) {
      return true;
    }
    return super.performPrivateCommand(paramString, paramBundle);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.inputmethod.InputConnectionCompat.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
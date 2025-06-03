package androidx.core.view.inputmethod;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

class InputConnectionCompat$1
  extends InputConnectionWrapper
{
  public InputConnectionCompat$1(InputConnection paramInputConnection, boolean paramBoolean, InputConnectionCompat.OnCommitContentListener paramOnCommitContentListener)
  {
    super(paramInputConnection, paramBoolean);
  }
  
  public boolean commitContent(InputContentInfo paramInputContentInfo, int paramInt, Bundle paramBundle)
  {
    if (val$listener.onCommitContent(InputContentInfoCompat.wrap(paramInputContentInfo), paramInt, paramBundle)) {
      return true;
    }
    return super.commitContent(paramInputContentInfo, paramInt, paramBundle);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.inputmethod.InputConnectionCompat.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
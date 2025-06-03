package androidx.core.view.inputmethod;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import g2;

@RequiresApi(25)
class InputConnectionCompat$Api25Impl
{
  @DoNotInline
  public static boolean commitContent(InputConnection paramInputConnection, InputContentInfo paramInputContentInfo, int paramInt, Bundle paramBundle)
  {
    return g2.a(paramInputConnection, paramInputContentInfo, paramInt, paramBundle);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.inputmethod.InputConnectionCompat.Api25Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package i0;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

public final class b
  extends InputConnectionWrapper
{
  public b(InputConnection paramInputConnection, d paramd)
  {
    super(paramInputConnection, false);
  }
  
  public final boolean commitContent(InputContentInfo paramInputContentInfo, int paramInt, Bundle paramBundle)
  {
    d locald = a;
    e locale;
    if ((paramInputContentInfo == null) || (Build.VERSION.SDK_INT < 25)) {
      locale = null;
    } else {
      locale = new e(new e.a(paramInputContentInfo));
    }
    if (((d)locald).b(locale, paramInt, paramBundle)) {
      return true;
    }
    return super.commitContent(paramInputContentInfo, paramInt, paramBundle);
  }
}

/* Location:
 * Qualified Name:     i0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.core.app;

import android.app.Dialog;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import c;

@RequiresApi(28)
class DialogCompat$Api28Impl
{
  @DoNotInline
  public static <T> T requireViewById(Dialog paramDialog, int paramInt)
  {
    return c.j(paramDialog, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.DialogCompat.Api28Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
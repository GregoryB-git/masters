package x0;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

public final class h$c
  implements DialogInterface.OnDismissListener
{
  public h$c(h paramh) {}
  
  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    paramDialogInterface = a;
    Dialog localDialog = r;
    if (localDialog != null) {
      paramDialogInterface.onDismiss(localDialog);
    }
  }
}

/* Location:
 * Qualified Name:     x0.h.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
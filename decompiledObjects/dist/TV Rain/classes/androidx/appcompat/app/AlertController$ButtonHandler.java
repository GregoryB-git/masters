package androidx.appcompat.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class AlertController$ButtonHandler
  extends Handler
{
  private static final int MSG_DISMISS_DIALOG = 1;
  private WeakReference<DialogInterface> mDialog;
  
  public AlertController$ButtonHandler(DialogInterface paramDialogInterface)
  {
    mDialog = new WeakReference(paramDialogInterface);
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = what;
    if ((i != -3) && (i != -2) && (i != -1))
    {
      if (i == 1) {
        ((DialogInterface)obj).dismiss();
      }
    }
    else {
      ((DialogInterface.OnClickListener)obj).onClick((DialogInterface)mDialog.get(), what);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AlertController.ButtonHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
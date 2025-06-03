package j6;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import m6.j;
import x0.h;
import x0.i;

public class l
  extends h
{
  public Dialog w;
  public DialogInterface.OnCancelListener x;
  public AlertDialog y;
  
  public final Dialog e()
  {
    Dialog localDialog = w;
    Object localObject = localDialog;
    if (localDialog == null)
    {
      f = false;
      if (y == null)
      {
        localObject = getContext();
        j.i(localObject);
        y = new AlertDialog.Builder((Context)localObject).create();
      }
      localObject = y;
    }
    return (Dialog)localObject;
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    DialogInterface.OnCancelListener localOnCancelListener = x;
    if (localOnCancelListener != null) {
      localOnCancelListener.onCancel(paramDialogInterface);
    }
  }
}

/* Location:
 * Qualified Name:     j6.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
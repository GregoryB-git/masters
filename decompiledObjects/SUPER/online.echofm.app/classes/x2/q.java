package x2;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;

public class q
  extends d
{
  public Dialog E0;
  public DialogInterface.OnCancelListener F0;
  public Dialog G0;
  
  public static q U1(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    q localq = new q();
    paramDialog = (Dialog)A2.n.j(paramDialog, "Cannot display null dialog");
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    E0 = paramDialog;
    if (paramOnCancelListener != null) {
      F0 = paramOnCancelListener;
    }
    return localq;
  }
  
  public Dialog N1(Bundle paramBundle)
  {
    Dialog localDialog = E0;
    paramBundle = localDialog;
    if (localDialog == null)
    {
      R1(false);
      if (G0 == null) {
        G0 = new AlertDialog.Builder((Context)A2.n.i(t())).create();
      }
      paramBundle = G0;
    }
    return paramBundle;
  }
  
  public void T1(androidx.fragment.app.n paramn, String paramString)
  {
    super.T1(paramn, paramString);
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    DialogInterface.OnCancelListener localOnCancelListener = F0;
    if (localOnCancelListener != null) {
      localOnCancelListener.onCancel(paramDialogInterface);
    }
  }
}

/* Location:
 * Qualified Name:     x2.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
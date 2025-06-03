package x2;

import A2.n;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

public class c
  extends DialogFragment
{
  public Dialog o;
  public DialogInterface.OnCancelListener p;
  public Dialog q;
  
  public static c a(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    c localc = new c();
    paramDialog = (Dialog)n.j(paramDialog, "Cannot display null dialog");
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    o = paramDialog;
    if (paramOnCancelListener != null) {
      p = paramOnCancelListener;
    }
    return localc;
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    DialogInterface.OnCancelListener localOnCancelListener = p;
    if (localOnCancelListener != null) {
      localOnCancelListener.onCancel(paramDialogInterface);
    }
  }
  
  public Dialog onCreateDialog(Bundle paramBundle)
  {
    Dialog localDialog = o;
    paramBundle = localDialog;
    if (localDialog == null)
    {
      setShowsDialog(false);
      if (q == null) {
        q = new AlertDialog.Builder((Context)n.i(getActivity())).create();
      }
      paramBundle = q;
    }
    return paramBundle;
  }
  
  public void show(FragmentManager paramFragmentManager, String paramString)
  {
    super.show(paramFragmentManager, paramString);
  }
}

/* Location:
 * Qualified Name:     x2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
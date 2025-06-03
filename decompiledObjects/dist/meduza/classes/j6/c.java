package j6;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import m6.j;

public final class c
  extends DialogFragment
{
  public Dialog a;
  public DialogInterface.OnCancelListener b;
  public AlertDialog c;
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    DialogInterface.OnCancelListener localOnCancelListener = b;
    if (localOnCancelListener != null) {
      localOnCancelListener.onCancel(paramDialogInterface);
    }
  }
  
  public final Dialog onCreateDialog(Bundle paramBundle)
  {
    Dialog localDialog = a;
    paramBundle = localDialog;
    if (localDialog == null)
    {
      setShowsDialog(false);
      if (c == null)
      {
        paramBundle = getActivity();
        j.i(paramBundle);
        c = new AlertDialog.Builder(paramBundle).create();
      }
      paramBundle = c;
    }
    return paramBundle;
  }
  
  public final void show(FragmentManager paramFragmentManager, String paramString)
  {
    super.show(paramFragmentManager, paramString);
  }
}

/* Location:
 * Qualified Name:     j6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
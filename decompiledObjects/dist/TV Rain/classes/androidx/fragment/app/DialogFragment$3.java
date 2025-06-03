package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import androidx.annotation.Nullable;

class DialogFragment$3
  implements DialogInterface.OnDismissListener
{
  public DialogFragment$3(DialogFragment paramDialogFragment) {}
  
  @SuppressLint({"SyntheticAccessor"})
  public void onDismiss(@Nullable DialogInterface paramDialogInterface)
  {
    if (DialogFragment.access$000(this$0) != null)
    {
      paramDialogInterface = this$0;
      paramDialogInterface.onDismiss(DialogFragment.access$000(paramDialogInterface));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.DialogFragment.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
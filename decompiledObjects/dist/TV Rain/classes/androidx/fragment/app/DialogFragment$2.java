package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import androidx.annotation.Nullable;

class DialogFragment$2
  implements DialogInterface.OnCancelListener
{
  public DialogFragment$2(DialogFragment paramDialogFragment) {}
  
  @SuppressLint({"SyntheticAccessor"})
  public void onCancel(@Nullable DialogInterface paramDialogInterface)
  {
    if (DialogFragment.access$000(this$0) != null)
    {
      paramDialogInterface = this$0;
      paramDialogInterface.onCancel(DialogFragment.access$000(paramDialogInterface));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.DialogFragment.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
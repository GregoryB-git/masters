package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.DialogInterface.OnDismissListener;

class DialogFragment$1
  implements Runnable
{
  public DialogFragment$1(DialogFragment paramDialogFragment) {}
  
  @SuppressLint({"SyntheticAccessor"})
  public void run()
  {
    DialogFragment.access$100(this$0).onDismiss(DialogFragment.access$000(this$0));
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.DialogFragment.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

class DialogFragment$4
  implements Observer<LifecycleOwner>
{
  public DialogFragment$4(DialogFragment paramDialogFragment) {}
  
  @SuppressLint({"SyntheticAccessor"})
  public void onChanged(LifecycleOwner paramLifecycleOwner)
  {
    if ((paramLifecycleOwner != null) && (DialogFragment.access$200(this$0)))
    {
      View localView = this$0.requireView();
      if (localView.getParent() == null)
      {
        if (DialogFragment.access$000(this$0) != null)
        {
          if (FragmentManager.isLoggingEnabled(3))
          {
            paramLifecycleOwner = new StringBuilder();
            paramLifecycleOwner.append("DialogFragment ");
            paramLifecycleOwner.append(this);
            paramLifecycleOwner.append(" setting the content view on ");
            paramLifecycleOwner.append(DialogFragment.access$000(this$0));
            Log.d("FragmentManager", paramLifecycleOwner.toString());
          }
          DialogFragment.access$000(this$0).setContentView(localView);
        }
      }
      else {
        throw new IllegalStateException("DialogFragment can not be attached to a container view");
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.DialogFragment.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.fragment.app;

import android.view.View;
import androidx.annotation.Nullable;

class DialogFragment$5
  extends FragmentContainer
{
  public DialogFragment$5(DialogFragment paramDialogFragment, FragmentContainer paramFragmentContainer) {}
  
  @Nullable
  public View onFindViewById(int paramInt)
  {
    if (val$fragmentContainer.onHasView()) {
      return val$fragmentContainer.onFindViewById(paramInt);
    }
    return this$0.onFindViewById(paramInt);
  }
  
  public boolean onHasView()
  {
    boolean bool;
    if ((!val$fragmentContainer.onHasView()) && (!this$0.onHasView())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.DialogFragment.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
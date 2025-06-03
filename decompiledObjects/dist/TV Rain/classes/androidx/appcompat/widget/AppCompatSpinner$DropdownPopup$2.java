package androidx.appcompat.widget;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class AppCompatSpinner$DropdownPopup$2
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public AppCompatSpinner$DropdownPopup$2(AppCompatSpinner.DropdownPopup paramDropdownPopup) {}
  
  public void onGlobalLayout()
  {
    AppCompatSpinner.DropdownPopup localDropdownPopup = this$1;
    if (!localDropdownPopup.isVisibleToUser(this$0))
    {
      this$1.dismiss();
    }
    else
    {
      this$1.computeContentWidth();
      AppCompatSpinner.DropdownPopup.access$001(this$1);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.appcompat.widget;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class AppCompatSpinner$DropdownPopup$1
  implements AdapterView.OnItemClickListener
{
  public AppCompatSpinner$DropdownPopup$1(AppCompatSpinner.DropdownPopup paramDropdownPopup, AppCompatSpinner paramAppCompatSpinner) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this$1.this$0.setSelection(paramInt);
    if (this$1.this$0.getOnItemClickListener() != null)
    {
      paramAdapterView = this$1;
      this$0.performItemClick(paramView, paramInt, mAdapter.getItemId(paramInt));
    }
    this$1.dismiss();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
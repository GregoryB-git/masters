package androidx.appcompat.app;

import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class AlertController$AlertParams$4
  implements AdapterView.OnItemClickListener
{
  public AlertController$AlertParams$4(AlertController.AlertParams paramAlertParams, AlertController.RecycleListView paramRecycleListView, AlertController paramAlertController) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this$0.mCheckedItems;
    if (paramAdapterView != null) {
      paramAdapterView[paramInt] = val$listView.isItemChecked(paramInt);
    }
    this$0.mOnCheckboxClickListener.onClick(val$dialog.mDialog, paramInt, val$listView.isItemChecked(paramInt));
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AlertController.AlertParams.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */